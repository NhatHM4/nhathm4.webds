$(document).ready(function(){

    var bar1Counter=0;
    var bar2Counter=0;
    var totalCount =0;
    
$("#option1").click(function(){  
    $("#bar1Count").text(
    bar1Counter=bar1Counter+1
    );
     
}); 
    
$("#option2").click(function(){  
    $("#bar2Count").text(
    bar2Counter=bar2Counter+1
    );  
}); 
    
    
$(".options").click(function(){
 
    totalCount = bar1Counter + bar2Counter;
    
    $("#totalCount").text(
       totalCount
    );
    
    
    
var bar1Perc = ((bar1Counter/totalCount)*100).toFixed(0);
    
$("#bar1perc").text(bar1Perc+"%");
  
var bar2Perc = ((bar2Counter/totalCount)*100).toFixed(0);    
    
$("#bar2perc  ").text(bar2Perc+"%");
  
    
$("#bar1").width((300*bar1Counter)/totalCount);
    
$("#bar2").width((300*bar2Counter)/totalCount);
   
    
});  
    
});