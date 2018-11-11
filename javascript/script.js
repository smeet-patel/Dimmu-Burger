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


var sauce$ = .2;
var jrburger$ = 2.5;
var wrap$ = 3;
var burger$ = 4;

var progressBar = {
  Bar: $('#progress-bar'),
  Reset: function () {
    if (this.Bar) {
      this.Bar.find('li').removeClass('active');
    }
  },
  Next: function () {
    $('#progress-bar li:not(.active):first').addClass('active');
  },
  Back: function () {
    $('#progress-bar li.active:last').removeClass('active');
  }
}

progressBar.Reset();

////
$("#Next").on('click', function () {
  progressBar.Next();
})
$("#Back").on('click', function () {
  progressBar.Back();
})
$("#Reset").on('click', function () {
  progressBar.Reset();
})

var radio1 = document.getElementById("radio1");
var radio2 = document.getElementById("radio2");
var radio3 = document.getElementById("radio3");
var price18 = document.getElementById("pbur");var pp18 = 0;
var price19 = document.getElementById("pjrbur");var pp19 = 0;
var price20 = document.getElementById("pwra");var pp20 = 0;

function mybread() {
  if (radio1.checked == true) {
    price18.innerHTML = "$" + (burger$).toFixed(2);
    pp18=(burger$);
    price19.innerHTML = "";pp19=0;
    price20.innerHTML = "";pp20=0;
  }
  else if (radio2.checked == true) {
    price19.innerHTML = "$" + (jrburger$).toFixed(2);
    pp19=(jrburger$);
    price18.innerHTML = "";pp18=0;
    price20.innerHTML = "";pp20=0;
  }
  else if (radio3.checked == true) {
    price20.innerHTML = "$" + (wrap$).toFixed(2);
    pp20=(wrap$);
    price18.innerHTML = "";pp18=0;
    price19.innerHTML = "";pp19=0;
  }
  totalp();
}

var checkBox1 = document.getElementById("mayo");
var price13 = document.getElementById("pmayo");
var pp13 = 0;

function mayoT() {
  if (checkBox1.checked == true) {
    price13.innerHTML = "$" + (sauce$).toFixed(2);
    pp13 = (sauce$);
  } else {
    price13.innerHTML = "";
    pp13 = 0;
  }
  totalp();
}

var slider1 = document.getElementById("myche");
var output1 = document.getElementById("che");
var price1 = document.getElementById("pche");
var pp1 = 0;
output1.innerHTML = slider1.value; // Display the default slider value
// Update the current slider value (each time you drag the slider handle)
slider1.oninput = function () {
  output1.innerHTML = this.value;
  if (this.value > 0) {
    price1.innerHTML = (this.value * 1.5 - .5).toFixed(2);
    pp1 = this.value * 1.5 - .5.toFixed(2);
  } else {
    price1.innerHTML = 0;
    pp1 = 0
  }
  totalp();
}

var slider2 = document.getElementById("myswi");
var output2 = document.getElementById("swi");
var price2 = document.getElementById("pswi");
var pp2 = 0;
output2.innerHTML = slider2.value;
slider2.oninput = function () {
  output2.innerHTML = this.value;
  if (this.value > 0) {
    price2.innerHTML = (this.value * 1.5 - .5).toFixed(2);
    pp2 = this.value * 1.5 - .5.toFixed(2);
  } else {
    price2.innerHTML = 0;
    pp1 = 0;
  }
  totalp();
}

var slider3 = document.getElementById("myhal");
var output3 = document.getElementById("hal");
var price3 = document.getElementById("phal");
var pp3 = 0;
output3.innerHTML = slider3.value;
slider3.oninput = function () {
  output3.innerHTML = this.value;
  if (this.value > 0) {
    price3.innerHTML = (this.value * 1.5 - .5);
    pp3 = this.value * 1.5 - .5.toFixed(2);
  } else {
    price3.innerHTML = 0;
    pp3 = 0;
  }
  totalp();
}

var slider4 = document.getElementById("mypan");
var output4 = document.getElementById("pan");
var price4 = document.getElementById("ppan");
var pp4 = 0;
output4.innerHTML = slider4.value;
slider4.oninput = function () {
  output4.innerHTML = this.value;
  if (this.value > 0) {
    price4.innerHTML = (this.value * 1.5 - .5).toFixed(2);
    pp4 = this.value * 1.5 - .5.toFixed(2);
  } else {
    price4.innerHTML = 0;
    pp1 = 0;
  }
  totalp();
}

var slider5 = document.getElementById("myTomato");
var output5 = document.getElementById("Tomato");
output5.innerHTML = slider5.value;
slider5.oninput = function () {
  output5.innerHTML = this.value;
}

var slider6 = document.getElementById("myLettuce");
var output6 = document.getElementById("Lettuce");
output6.innerHTML = slider6.value;
slider6.oninput = function () {
  output6.innerHTML = this.value;
}

var slider7 = document.getElementById("myCapsicum");
var output7 = document.getElementById("Capsicum");
output7.innerHTML = slider7.value;
slider7.oninput = function () {
  output7.innerHTML = this.value;
}

var slider8 = document.getElementById("myOnion");
var output8 = document.getElementById("Onion");
output8.innerHTML = slider8.value;
slider8.oninput = function () {
  output8.innerHTML = this.value;
}

var slider9 = document.getElementById("myPineapple");
var output9 = document.getElementById("Pineapple");
output9.innerHTML = slider9.value;
slider9.oninput = function () {
  output9.innerHTML = this.value;
}

var slider10 = document.getElementById("myAvocado");
var output10 = document.getElementById("Avocado");
output10.innerHTML = slider10.value;
slider10.oninput = function () {
  output10.innerHTML = this.value;
}

var slider11 = document.getElementById("myPickles");
var output11 = document.getElementById("Pickles");
output11.innerHTML = slider11.value;
slider11.oninput = function () {
  output11.innerHTML = this.value;
}

var slider12 = document.getElementById("myCarrot");
var output12 = document.getElementById("Carrot");
output12.innerHTML = slider12.value;
slider12.oninput = function () {
  output12.innerHTML = this.value;
}
var totalid = document.getElementById("totalPrice");

function totalp() {
  var total = pp1 + pp2 + pp3 + pp4 + pp13+ pp18+pp19+pp20;
  totalid.innerHTML = "$" + total.toFixed(2);
}