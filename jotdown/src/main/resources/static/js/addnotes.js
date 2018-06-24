/**
 * 
 */

 $(function() {
    $("#savenotesbutton").click(function(e) {
      // validate and process form here
    	e.preventDefault();
    	var formArr = $('form').serializeArray();
    	var str="{";
    	$.each(formArr, function(i, field){
    		str+='"'+field.name + '":"' + field.value +'",';
    	});
    	str = str.slice(0,-1);
    	str+="}";
    	$.ajax({
    		  cache: false,
    		  type: "POST",
    		  url: '/addnotes',
    		  data: str,    		  
    		  contentType: "application/json",
    		  dataType: 'json',
    		  success: function(data) {
    			  $('#notesafter').html("<strong>Notes saved with Id: </strong>").append(data.notesId)
    			  $('#notesafter').show();
    		  }
    		});
    });
  });