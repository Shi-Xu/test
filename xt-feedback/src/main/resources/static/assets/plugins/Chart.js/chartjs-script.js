(function(window, document, $, undefined) {
	"use strict";
	$(function() {

		if ($('#xx-barChart').length) {
			var ctx = document.getElementById("xx-barChart").getContext('2d');
			var myChart = new Chart(ctx, {
				type: 'bar',
				data: {
					labels: ['必选1', '必选2', '必选3', '必选4', '必选5', '必选6', '必选7', '必选8', '必选9', '必选10'],
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
				},
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
		
		if ($('#xx-barChart1').length) {
			var ctx = document.getElementById("xx-barChart1").getContext('2d');
			var myChart = new Chart(ctx, {
				type: 'bar',
				data: {
					labels: ['必选1', '必选2', '必选3', '必选4', '必选5', '必选6', '必选7', '必选8', '必选9', '必选10'],
					datasets: [{
						label: '认同',
						data: [85,78,92,65,87,64,85,76,91,74],
						backgroundColor: "rgba(238,63,77,0.25)",
						borderColor: "#EE3F4D",
						borderWidth: 2
					}]
				},
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
							barPercentage: .3,
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
		
		if ($('#xx-chosebarChartA').length) {
			var ctx = document.getElementById("xx-chosebarChartA").getContext('2d');
			var myChart = new Chart(ctx, {
				type: 'bar',
				data: {
					labels: ['A.1', 'A.2', 'A.3', 'A.4', 'A.5', 'A.6', 'A.7', 'A.8', 'A.9', 'A.10', 'A.11', 'A.12', 'A.13', 'A.14'],
					datasets: [{
						data: [200,122,100,122,136,154,123,186,200,158,123,158,114,158],
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
			var ctx = document.getElementById("xx-chosebarChartB").getContext('2d');
			var myChart = new Chart(ctx, {
				type: 'bar',
				data: {
					labels: ['B.1', 'B.2', 'B.3', 'B.4', 'B.5', 'B.6', 'B.7', 'B.8'],
					datasets: [{
						data: [135,122,100,122,136,154,123,120],
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
								fontColor: '#585757'
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
			var ctx = document.getElementById("xx-chosebarChartC").getContext('2d');
			var myChart = new Chart(ctx, {
				type: 'bar',
				data: {
					labels: ['C.1', 'C.2', 'C.3', 'C.4', 'C.5', 'C.6', 'C.7'],
					datasets: [{
						data: [135,122,100,122,136,154,123],
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
								fontColor: '#585757'
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
			var ctx = document.getElementById("xx-chosebarChartD").getContext('2d');
			var myChart = new Chart(ctx, {
				type: 'bar',
				data: {
					labels: ['D.1', 'D.2', 'D.3', 'D.4', 'D.5', 'D.6', 'D.7', 'D.8'],
					datasets: [{
						data: [135,122,100,122,136,154,123,120],
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
								fontColor: '#585757'
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
			var ctx = document.getElementById("xx-chosebarChartE").getContext('2d');
			var myChart = new Chart(ctx, {
				type: 'bar',
				data: {
					labels: ['E.1', 'E.2', 'E.3'],
					datasets: [{
						data: [135,122,100,122,136,154,123,120],
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
								fontColor: '#585757'
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

})(window, document, window.jQuery);
