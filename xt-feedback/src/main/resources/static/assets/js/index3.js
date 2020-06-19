$(function() {
	"use strict";

	// 某课程必修
	var ctx = document.getElementById("xx-longbar").getContext('2d');
	var myChart = new Chart(ctx, {
		type: 'bar',
		data: {
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
		},
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
	
});
