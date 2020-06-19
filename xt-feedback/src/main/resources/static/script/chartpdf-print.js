$(function() {
	var dpi=350;
	var scale=1;
	
	function transformToA4(width,height){
		let imgWidth = 841.89 / height * width ;
        let imgHeight = 841.89;
        // 固定宽度缩放	
        if(841.89 / height  > 592.28/ width){
        	imgWidth = 595.28;
            imgHeight = 595.28 / width * height;
        }
        return {width:imgWidth,height:imgHeight};
	}
	
	
	function canvasRotate (canvas){
		let contentWidth = canvas.width;
        let contentHeight = canvas.height;

        var img = new Image();
        img.src=canvas.toDataURL('image/jpeg', 1.0);
        return new Promise(function(resolve, reject) {
        	img.onload = function () {
        	canvas.height=contentWidth;
        	canvas.width=contentHeight;
        	var context = canvas.getContext("2d");
        	
            context.rotate(90 * Math.PI / 180);
            context.drawImage(img, 0, -contentHeight);
            resolve(canvas);
          }        
        });
	}
	
	function chart2canvas(chartId){
		return new Promise(function(resolve, reject) {
			 html2canvas(document.getElementById(chartId), {
			    	dpi: dpi,
			        scale: scale, // 添加的scale 参数
			        onrendered: function (canvas) {
			        	canvasRotate(canvas).then(function(canvas2){
			        		resolve(canvas2);
			        	});
			        },
			        // 背景设为白色（默认为黑色）
			        background: "#fff"
			    });
          });
	}
	
	$(document).on("click", "#download", function () {
		// 第一层
		chart2canvas("card1").then(function (canvas) {
			// 第二层
			chart2canvas("card2").then(function (canvas2) {
				// 第三层
				chart2canvas("card3").then(function (canvas3) {
					let pdf = new jsPDF('', 'pt', 'a4');
					let size=transformToA4(canvas.width,canvas.height);
	 	            pdf.addImage(canvas.toDataURL('image/jpeg', 1.0), 'JPEG', 40, 0, size.width, size.height);
	 	            
	 	            pdf.addPage('a4')
	 	            size=transformToA4(canvas2.width,canvas2.height);
	 	            pdf.addImage(canvas2.toDataURL('image/jpeg', 1.0), 'JPEG', 40, 0, size.width, size.height);
	 	            
	 	            pdf.addPage('a4')
	 	            size=transformToA4(canvas3.width,canvas3.height);
	 	            pdf.addImage(canvas3.toDataURL('image/jpeg', 1.0), 'JPEG', 40, 0, size.width, size.height);
	 	            pdf.save('学生体验调查问卷统计结果.pdf');
				});
			});
		});
	});
	
	$(document).on("click", "#download1", function () {
	
	    html2canvas(document.getElementById("card1"), {
	    	dpi: dpi,
	        scale: scale, // 添加的scale 参数
	        onrendered: function (canvas) {
	        	canvasRotate(canvas).then(function(canvas2){
	        		let size=transformToA4(canvas2.width,canvas2.height);
		        	let pdf = new jsPDF('', 'pt', 'a4');
		    	 	
	 	            pdf.addImage(canvas2.toDataURL('image/jpeg', 1.0), 'JPEG', 40, 0, size.width, size.height);
	 	            pdf.save('必选题选项占比.pdf');
	        	});
	            },
	        // 背景设为白色（默认为黑色）
	        background: "#fff"
	    })
	});

	$(document).on("click", "#download2", function () {
	
	    html2canvas(document.getElementById("card2"), {
	    	dpi: dpi,
	        scale: scale, // 添加的scale 参数
	        onrendered: function (canvas) {
	        	canvasRotate(canvas).then(function(canvas2){
	        		let size=transformToA4(canvas2.width,canvas2.height);
		        	let pdf = new jsPDF('', 'pt', 'a4');
		    	 	
	 	            pdf.addImage(canvas2.toDataURL('image/jpeg', 1.0), 'JPEG', 40, 0, size.width, size.height);
	 	            pdf.save('必选题认同选项占比.pdf');
	        	});
	            },
	        // 背景设为白色（默认为黑色）
	        background: "#fff"
	    })
	});
	
	$(document).on("click", "#download3", function () {
	
	    html2canvas(document.getElementById("card3"), {
	    	dpi: dpi,
	        scale: scale, // 添加的scale 参数
	        onrendered: function (canvas) {
	        	canvasRotate(canvas).then(function(canvas2){
	        		let size=transformToA4(canvas2.width,canvas2.height);
		        	let pdf = new jsPDF('', 'pt', 'a4');
		    	 	
	 	            pdf.addImage(canvas2.toDataURL('image/jpeg', 1.0), 'JPEG', 40, 0, size.width, size.height);
	 	            pdf.save('任选题选项占比.pdf');
	        	});
	        },
	        // 背景设为白色（默认为黑色）
	        background: "#fff"
	    })
	});
	
	


});
