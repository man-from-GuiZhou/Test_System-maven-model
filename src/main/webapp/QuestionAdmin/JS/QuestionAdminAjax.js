/**
 * 
 */
/*
$(document).ready(function(){
	$("#removeButton").click(remove(id));
})

function remove(id){ 
	  $.post("QuestionLib.do",
	  {
		  operate:'remove',
		  questionlib_id:id
	  },
	  function(data,status){
	    alert("Data: " + data + "\nStatus: " + status);
	  });
	}
	*/

$(document).ready(function(){
    $(".removeButton").click(function(){
        $.post("QuestionLibCenter",{
                operate:"remove",//在这里使用this，直接指定到所选定的元素
                testpage_lib_id:$(this).attr("name")
            },
            function(){
                alert("ajax");
            });
    });
});

