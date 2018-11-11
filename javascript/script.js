// . The Magic Code using Javascript which allows the meun button
// to appear and enabling the nav bar to be responsive
function myFunction() {
    var x = document.getElementById("mynav1");
    if (x.className === "nav1") {
        x.className += " responsive";
    } else {
        x.className = "nav1";
    }
}
//

var slider = document.getElementById("myRange");
var output = document.getElementById("demo");
output.innerHTML = slider.value; // Display the default slider value

// Update the current slider value (each time you drag the slider handle)
slider.oninput = function() {
    output.innerHTML = this.value;
}


$(document).ready(function($) {

	$('.card__share > a').on('click', function(e){ 
		e.preventDefault() // prevent default action - hash doesn't appear in url
   		$(this).parent().find( 'div' ).toggleClass( 'card__social--active' );
		$(this).toggleClass('share-expanded');
    });
  
});

var progressBar = {
    Bar : $('#progress-bar'),
    Reset : function(){
      if (this.Bar){
        this.Bar.find('li').removeClass('active'); 
      }
    },
    Next: function(){
      $('#progress-bar li:not(.active):first').addClass('active');
    },
    Back: function(){
      $('#progress-bar li.active:last').removeClass('active');
    }
  }
  
  progressBar.Reset();
  
  ////
  $("#Next").on('click', function(){
    progressBar.Next();
  })
  $("#Back").on('click', function(){
    progressBar.Back();
  })
  $("#Reset").on('click', function(){
    progressBar.Reset();
  })
