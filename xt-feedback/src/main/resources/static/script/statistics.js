function getPercentage(dividend,divisor ){
	let value=math.eval(dividend+' / '+divisor);
	 var precision = 4;
     return math.format(value*100, precision);
}

function getPercentageFromArray(array,divisor ){
	let a=new Array();
	for (let i = 0; i < array.length; i++) {
		a[i]=getPercentage(array[i],divisor);
	}
     return a;
}

$(document).ready(function() {
	if(resultData.code!=1){
		alert(resultData.message);
		return;
	}
	let dataVO=resultData.data;
	let stuTotal=resultData.data.total;
	//必选题完整选项统计
	let singleFull=dataVO.singleChartForFull;
	let chartData1={
		labels: singleFull.labels,
		datasets: [{
			label: '非常认同',
			data: [40,32,50,46,36,54,23,86,20,58],
			backgroundColor: "rgba(59, 89, 152, 0.25)",
			borderColor: "#3b5998",
			borderWidth: 2,
		}, {
			label: '比较认同',
			data: [18,13,26,18,23,25,19,10,15,15,],
			backgroundColor: "rgba(85, 172, 238, 0.25)",
			borderColor: "#55acee",
			borderWidth: 2
		}, {
			label: '一般认同',
			data: [15,16,14,24,16,18,20,19,26,23],
			backgroundColor: "rgba(238,63,77,0.25)",
			borderColor: "#EE3F4D",
			borderWidth: 2
		}, {
			label: '基本不认同',
			data: [8,5,14,14,6,12,6,9,6,15],
			backgroundColor: "rgba(66,134,117, 0.25)",
			borderColor: "#428675",
			borderWidth: 2
		}, {
			label: '非常不认同',
			data: [9,15,6,15,9,15,6,15,13,8],
			backgroundColor: "rgba(242,142,22, 0.25)",
			borderColor: "#F28E16",
			borderWidth: 2
		}, ]
	};

	let singleTable = "";
	for (let i = 0; i < singleFull.datasets.length; i++) {
		const dataset = singleFull.datasets[i];
		chartData1.datasets[i].label = dataset.label;
		chartData1.datasets[i].data = getPercentageFromArray(dataset.data,stuTotal);
		
		//必选题表格统计
		let tds = "";
		for (let j = 0; j < dataset.data.length; j++) {
			const element = dataset.data[j];
			tds = tds+"<td>" + element + "</td>"  ;
		}
		singleTable = singleTable+"<tr>" + "<td>" + dataset.label + "（个）</td>" + tds + "</tr>";
	}

	$('#singleTable').html(singleTable);
	
	if ($('#xx-barChart').length) {
		let ctx = document.getElementById("xx-barChart").getContext('2d');
		let myChart = new Chart(ctx, {
			type: 'bar',
			data: chartData1,
			options: {
				legend: {
					position: "right",
					display: true,
					labels: {
						fontColor: '#585757',
						boxWidth: 20
					}
				},
				tooltips: {
					enabled: true
				},
				scales: {
					xAxes: [{
						barPercentage: .8,
						ticks: {
							beginAtZero: true,
							fontColor: '#585757'
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}],
					yAxes: [{
						ticks: {
							beginAtZero: true,
							fontColor: '#585757',
							max:100,
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}]
				},

			}
		});
	}
	
	//必选题认同选项统计
	let singleAgree = dataVO.singleChartForAgree;
	let chartData2 = {
			labels: ['必选1', '必选2', '必选3', '必选4', '必选5', '必选6', '必选7', '必选8', '必选9', '必选10'],
			datasets: [{
				label: '非常认同',
				data: [50, 30, 25, 43, 25, 45, 46, 25, 70, 58],
				backgroundColor: "rgba(238,63,77,0.5)",
			}, {
				label: '比较认同',
				data: [8, 20, 11, 20, 5, 4, 5, 40, 4, 13, ],
				backgroundColor: "rgba(242,142,22, 0.5)",
			}, {
				label: '一般认同',
				data: [15, 16, 4, 4, 2, 4, 14, 12, 17, 25],
				backgroundColor: "rgba(85, 172, 238, 0.5)",
			}]
		};

	for (let i = 0; i < singleAgree.datasets.length; i++) {
		const dataset = singleAgree.datasets[i];
		chartData2.datasets[i].label = dataset.label;
		chartData2.datasets[i].data = getPercentageFromArray(dataset.data,stuTotal);
	}
	
	if ($('#xx-longbar').length) {
		let ctx = document.getElementById("xx-longbar").getContext('2d');
		let myChart = new Chart(ctx, {
			type: 'bar',
			data: chartData2,
			options: {
				// backgroundColor: 'white',
				legend: {
					display: true,
					position: 'bottom',
					labels: {
						fontColor: '#3e3e3e',
						boxWidth: 13
					}
				},
				tooltips: {
					enabled: true,
					displayColors: false,
				},

				scales: {
					xAxes: [{
						stacked: true,
						barPercentage: .3,
						display: true
					}],
					yAxes: [{
						stacked: true,
						display: true,
						ticks: {
							max:100,
						},
					}]
				}

			},

		});
		
	}
	
	
	//任选题统计
	let multipleCharts = dataVO.multipleCharts;

	let multipleTableHead = "";
	let multipleTableBody = "";
	let multipleOptionMax = 0;

	for (let i = 0; i < multipleCharts.length; i++) {
		const multipleChart = multipleCharts[i];
		multipleOptionMax = multipleCharts[0].labels.length > multipleOptionMax ? multipleCharts[0].labels.length : multipleOptionMax;
		
		let tds = "";
		for (let j = 0; j < multipleChart.datasets[0].data.length; j++) {
			const element = multipleChart.datasets[0].data[j];
			tds = tds+"<td>" + element + "</td>"  ;
			
		}
		multipleTableBody = multipleTableBody + "<tr>" + "<td>任选题" + String.fromCharCode(i + 65)+ "（个）</td>" + tds + "</tr>";
	}

	for (let i = 0; i < multipleOptionMax; i++) {
		multipleTableHead = multipleTableHead + "<td>任选" + (i+1) + "</td>"
	}
	multipleTableHead = "<tr><td></td>"+multipleTableHead+"</tr>";

	$("#multipleTableHead").html(multipleTableHead);
	$("#multipleTableBody").html(multipleTableBody);
	
	
	if ($('#xx-chosebarChartA').length) {
		let ctx = document.getElementById("xx-chosebarChartA").getContext('2d');
		let myChart = new Chart(ctx, {
			type: 'bar',
			data: {
				labels: multipleCharts[0].labels,
				datasets: [{
					data: getPercentageFromArray(multipleCharts[0].datasets[0].data,stuTotal),
					backgroundColor: "rgba(59, 89, 152, 0.75)",
					borderColor: "#3b5998",
					borderWidth: 0,
				} ]
			},
			options: {
				legend: {
					position: "right",
					display: false,
				},
				tooltips: {
					enabled: true
				},
				scales: {
					xAxes: [{
						barPercentage: .7,
						ticks: {
							beginAtZero: true,
							fontColor: '#585757'
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}],
					yAxes: [{
						ticks: {
							beginAtZero: true,
							fontColor: '#585757',
							max:100,
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}]
				}
	
			}
		});
	}
	
	if ($('#xx-chosebarChartB').length) {
		let ctx = document.getElementById("xx-chosebarChartB").getContext('2d');
		let myChart = new Chart(ctx, {
			type: 'bar',
			data: {
				labels: multipleCharts[1].labels,
				datasets: [{
					data: getPercentageFromArray(multipleCharts[1].datasets[0].data,stuTotal),
					backgroundColor: "rgba(85, 172, 238, 0.7)",
					borderColor: "#55acee",
					borderWidth: 0,
				} ]
			},
			options: {
				legend: {
					position: "right",
					display: false,
				},
				tooltips: {
					enabled: true
				},
				scales: {
					xAxes: [{
						barPercentage: .7,
						ticks: {
							beginAtZero: true,
							fontColor: '#585757'
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}],
					yAxes: [{
						ticks: {
							beginAtZero: true,
							fontColor: '#585757',
							max:100,
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}]
				}
	
			}
		});
			
	}
		
	if ($('#xx-chosebarChartC').length) {
		let ctx = document.getElementById("xx-chosebarChartC").getContext('2d');
		let myChart = new Chart(ctx, {
			type: 'bar',
			data: {
				labels: multipleCharts[2].labels,
				datasets: [{
					data: getPercentageFromArray(multipleCharts[2].datasets[0].data,stuTotal),
					backgroundColor: "rgba(238,63,77,0.7)",
					borderColor: "#EE3F4D",
					borderWidth: 0,
				} ]
			},
			options: {
				legend: {
					position: "right",
					display: false,
				},
				tooltips: {
					enabled: true
				},
				scales: {
					xAxes: [{
						barPercentage: .7,
						ticks: {
							beginAtZero: true,
							fontColor: '#585757'
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}],
					yAxes: [{
						ticks: {
							beginAtZero: true,
							fontColor: '#585757',
							max:100,
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}]
				}
	
			}
		});
		
	}

	if ($('#xx-chosebarChartD').length) {
		let ctx = document.getElementById("xx-chosebarChartD").getContext('2d');
		let myChart = new Chart(ctx, {
			type: 'bar',
			data: {
				labels: multipleCharts[3].labels,
				datasets: [{
					data: getPercentageFromArray(multipleCharts[3].datasets[0].data,stuTotal),
					backgroundColor: "rgba(66,134,117, 0.7)",
					borderColor: "#428675",
					borderWidth: 0,
				} ]
			},
			options: {
				legend: {
					position: "right",
					display: false,
				},
				tooltips: {
					enabled: true
				},
				scales: {
					xAxes: [{
						barPercentage: .7,
						ticks: {
							beginAtZero: true,
							fontColor: '#585757'
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}],
					yAxes: [{
						ticks: {
							beginAtZero: true,
							fontColor: '#585757',
							max:100,
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}]
				}
	
			}
		});
			
	}
	
	if ($('#xx-chosebarChartE').length) {
		let ctx = document.getElementById("xx-chosebarChartE").getContext('2d');
		let myChart = new Chart(ctx, {
			type: 'bar',
			data: {
				labels: multipleCharts[4].labels,
				datasets: [{
					data: getPercentageFromArray(multipleCharts[4].datasets[0].data,stuTotal),
					backgroundColor: "rgba(242,142,22, 0.7)",
					borderColor: "#F28E16",
					borderWidth: 0,
				} ]
			},
			options: {
				legend: {
					position: "right",
					display: false,
				},
				tooltips: {
					enabled: true
				},
				scales: {
					xAxes: [{
						barPercentage: .7,
						ticks: {
							beginAtZero: true,
							fontColor: '#585757'
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}],
					yAxes: [{
						ticks: {
							beginAtZero: true,
							fontColor: '#585757',
							max:100,
						},
						gridLines: {
							display: true,
							color: "rgba(0, 0, 0, 0.07)"
						},
					}]
				}
	
			}
		});
			
	}
	
	
	
});


