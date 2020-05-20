<H1>Welcome to testAlgho</H1>
  
<span>In this repository we use word model and Big O notation to analize algorithms.</span>

<span>The WORD Model considers:</span>

<ul>
  <li>Arithmetic operations (+, -, *, /) are considered to be simple operations that take constant time</li>
  <li>Assigments ( = ) are consider simple operations. They take constant time</li>
  <li>Logical Operations (if, else) take constant time</li>
  <li>Call functions take constant time</li>
  <li>Memory access takes one time</li>
  <li>Loops (for, while) are complex</li>
  <li>Recursions are complex</li>
</ul>

<span>In general, the size of the problem is called 'n'.</span>

<h2>Algho 1</h2>
<span>Let's say you have to display 100 numbers on the screen. The numbers are 0 to 99. A good approach would be use a 'for loop'! For instance: </span>

<ul>
  <li><b>for</b>( i=0 ; i<100 ; i++ )<b>System.out.println</b>(i);</li>
</ul>

<span>We are using a 'for loop' with the display function 'System.out.println'. Depending on the lenguage, the display function take constant time, which means, does not depends on the arguments. So, How many times do we call the display function? The answer is, 100 times! </span>
<span> 100 * display function = 100 * 1 = 100 = n, size of the problem!</span>
<span>This is a linear algorithm. The time depens in the amount of loops!  </span>

<span>Big O = O(n)</span>

