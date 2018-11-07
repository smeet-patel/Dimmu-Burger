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

  (function () {

    var wall = new Wall('#wall');
    console.log(wall);
  
    document.getElementById('Back').addEventListener('click', function () { wall.prevSection(); });
    document.getElementById('Next').addEventListener('click', function () { wall.nextSection(); });
    document.querySelector('.prev-slide').addEventListener('click', function () { wall.prevSlide(); });
    document.querySelector('.next-slide').addEventListener('click', function () { wall.nextSlide(); });
  }());
  
 