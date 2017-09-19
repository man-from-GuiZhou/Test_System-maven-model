/**
 * 
 */
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

