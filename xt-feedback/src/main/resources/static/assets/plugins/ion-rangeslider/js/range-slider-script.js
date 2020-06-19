$(function () {

            $("#range_01").ionRangeSlider();


            $("#range_02").ionRangeSlider({
                min: 100,
                max: 1000,
                from: 550
            });

              $("#range_03").ionRangeSlider({
                type: "double",
                grid: true,
                min: 0,
                max: 1000,
                from: 200,
                to: 800,
                prefix: "$"
            });

               $("#range_04").ionRangeSlider({
                type: "double",
                grid: true,
                min: -1000,
                max: 1000,
                from: -500,
                to: 500
            });

                $("#range_05").ionRangeSlider({
                type: "double",
                grid: true,
                min: -1000,
                max: 1000,
                from: -500,
                to: 500,
                step: 250
            });

                $("#range_06").ionRangeSlider({
                type: "double",
                grid: true,
                min: -12.8,
                max: 12.8,
                from: -3.2,
                to: 3.2,
                step: 0.1
            });

                $("#range_07").ionRangeSlider({
                type: "double",
                grid: true,
                from: 1,
                to: 5,
                values: [0, 10, 100, 1000, 10000, 100000, 1000000]
            });
                $("#range_08").ionRangeSlider({
                grid: true,
                from: 1,
                values: [
                    "0", "10",
                    "20", "30",
                    "40", "50",
                    "60", "70",
                    "80", "90",
                    "100"
                ]
            });
				$("#range_09").ionRangeSlider({
			    grid: true,
			    from: 2,
			    values: [
			        "0", "10",
			        "20", "30",
			        "40", "50",
			        "60", "70",
			        "80", "90",
			        "100"
			    ]
			});
				$("#range_10").ionRangeSlider({
				    grid: true,
				    from: 3,
				    values: [
				        "0", "10",
				        "20", "30",
				        "40", "50",
				        "60", "70",
				        "80", "90",
				        "100"
				    ]
				});
				$("#range_11").ionRangeSlider({
				    grid: true,
				    from: 4,
				    values: [
				        "0", "10",
				        "20", "30",
				        "40", "50",
				        "60", "70",
				        "80", "90",
				        "100"
				    ]
				});
				$("#range_12").ionRangeSlider({
				    grid: true,
				    from: 5,
				    values: [
				        "0", "10",
				        "20", "30",
				        "40", "50",
				        "60", "70",
				        "80", "90",
				        "100"
				    ]
				});
				$("#range_13").ionRangeSlider({
				    grid: true,
				    from: 6,
				    values: [
				        "0", "10",
				        "20", "30",
				        "40", "50",
				        "60", "70",
				        "80", "90",
				        "100"
				    ]
				});
				$("#range_14").ionRangeSlider({
				    grid: true,
				    from: 7,
				    values: [
				        "0", "10",
				        "20", "30",
				        "40", "50",
				        "60", "70",
				        "80", "90",
				        "100"
				    ]
				});
				$("#range_15").ionRangeSlider({
				    grid: true,
				    from: 8,
				    values: [
				        "0", "10",
				        "20", "30",
				        "40", "50",
				        "60", "70",
				        "80", "90",
				        "100"
				    ]
				});
				$("#range_16").ionRangeSlider({
				    grid: true,
				    from: 9,
				    values: [
				        "0", "10",
				        "20", "30",
				        "40", "50",
				        "60", "70",
				        "80", "90",
				        "100"
				    ]
				});
				$("#range_17").ionRangeSlider({
				    grid: true,
				    from: 10,
				    values: [
				        "0", "10",
				        "20", "30",
				        "40", "50",
				        "60", "70",
				        "80", "90",
				        "100"
				    ]
				});

            });