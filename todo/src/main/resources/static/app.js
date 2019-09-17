/*Animating HTML elements */
/* Animation for navigation */




/* listing the constants here to be selected */

const hero = document.querySelector('.hero');
const slider = document.querySelector('.slider');
const logo = document.querySelector('#logo');
const ham = document.querySelector('.hamburger');
const headline = document.querySelector('.headline');
const split = document.querySelector('.split');

/*Created the new constant t1, here will be the type of animation for 
how long what tag and properties are to change using gsap library for the index page*/

/* can be adopted for other pages throughout the website*/

const t1 = new TimelineMax();

/*---hero class-----*/
t1.fromTo(hero, 1, {
        height: "0%"
    }, {
        height: "80%",
        ease: Power2.easeInOut
    })
    .fromTo(hero, 1.2, {
        width: "100%"
    }, {
        width: "80%",
        ease: Power2.easeInOut
    })
	/*----end of hero class------*/
	
	/*----slider class-----------*/
    .fromTo(slider, 1.2, {
        x: "-100%"
    }, {
        x: "0%",
        ease: Power2.easeInOut
    })
	/*----end of slider---------*/
	
	/*---start of logo class----*/
    .fromTo(logo, 0.5, {
        opacity: 0,
        x: 30
    }, {
        opacity: 1,
        x: 0
    }, "-=0.5")
	/*----end of logo class-----*/
	

	
	/*-start of hamburger class--*/
    .fromTo(ham, 1.2, {
        opacity: 0,
        x: 30
    }, {
        opacity: 1,
        x: 0
    }, "-=0.2");
	
	
	
	/*-----remember here to close with " ; "-----*/
	
	/*---------end of hamburger class------------*/
	
	
	
	
	
	
	
	
	
	/*------End of index transitions------------*/