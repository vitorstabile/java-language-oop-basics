<h1 align="center"> Basic Template to Create Tutorials </h1>

# Content

1. [Project Status](#projectstatus)
2. [About the Project](#abouttheproject)
3. [Project Description](#projectdescription)
4. [Chapter 1: Programming Concepts](#chapter1)
    - [Chapter 1 - Part 1: Programmer's Career Starts](#chapter1part1)
    - [Chapter 1 - Part 2: Algorithm](#chapter1part2)
    - [Chapter 1 - Part 3: Automation](#chapter1part3)
    - [Chapter 1 - Part 4: Computer Program](#chapter1part4)
    - [Chapter 1 - Part 5: What Does it Take to Make a Computer Program?](#chapter1part5)
    - [Chapter 1 - Part 6: Programming Language](#chapter1part6)
    - [Chapter 1 - Part 7: IDE](#chapter1part7)
    - [Chapter 1 - Part 8: Compilation and Interpretation, Source Code and Object Code, Virtual machine](#chapter1part8)
5. [Chapter 2: BBBB](#chapter2)
    - [Chapter 2 - Part 1: aaaa](#chapter2part1)
    - [Chapter 2 - Part 2: bbbb](#chapter2part2)
    - [Chapter 2 - Part 3: cccc](#chapter2part3)
6. [Chapter 3: CCCC](#chapter3)
    - [Chapter 3 - Part 1: aaaa](#chapter3part1)
    - [Chapter 3 - Part 2: bbbb](#chapter3part2)
    - [Chapter 3 - Part 3: cccc](#chapter3part3)
7. [Usage](#usage)
8. [Contributors](#contributors)
9. [Contributing](#contributing)
10. [Roadmap](#roadmap)
11. [To Do](#todo)
12. [Contacts](#contacts)
13. [License](#license)

# Project Status <a name="projectstatus"></a>

Project Status: Under Development :warning:

Project Status: Concluded :heavy_check_mark:

# About the Project <a name="abouttheproject"></a>

This project have a propose to introduce the reader to basic concepts in (put the theme her)

[![Project][project-shield]][project-url] <!-- Put the link of the github page of the tutorial her -->

# Project Description <a name="projectdescription"></a>

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer accumsan id neque ut tempor. Nulla facilisi. Aliquam eu eros fermentum, commodo est sed, pharetra est. Curabitur
lacinia blandit turpis rhoncus varius. Proin vulputate orci nulla, nec porttitor nibh consequat in. Suspendisse ac neque ut massa commodo auctor in sed libero. Sed tincidunt
mauris eu tempor malesuada. Mauris feugiat vitae risus quis iaculis

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer accumsan id neque ut tempor. Nulla facilisi. Aliquam eu eros fermentum, commodo est sed, pharetra est. Curabitur
lacinia blandit turpis rhoncus varius. Proin vulputate orci nulla, nec porttitor nibh consequat in. Suspendisse ac neque ut massa commodo auctor in sed libero. Sed tincidunt
mauris eu tempor malesuada. Mauris feugiat vitae risus quis iaculis
  
## <a name="chapter1"></a>Chapter 1: Programming Concepts

#### <a name="chapter1part1"></a>Chapter 1 - Part 1: Programmer's Career Starts

The beginning of any programmer's career starts with solid fundamentals, such as:

1. Programming Logic
2. Algorithms
3. Data Structure (Arrays, Lists)
4. Object Oriented Programming
5. Relational Data Base
6. Systems Analysis and Design

#### <a name="chapter1part2"></a>Chapter 1 - Part 2: Algorithm

Algorithm is a process or set of rules to be followed as problem-solving operations.

Make a cake problem:

A Cake Recipe Algorithm

1. Preheat the oven.
2. Gather the ingredients.
3. Measure out the ingredients.
4. Mix the ingredients to make the batter.
5. Grease a pan.
6. Pour the batter into the pan.
7. Put the pan in the oven.
8. Set a timer.
9. When the timer goes off, take the pan out of the oven.
10. Enjoy!

#### <a name="chapter1part3"></a>Chapter 1 - Part 3: Automation

Consists of using machine (s) to perform the procedure automatically or semi-automatically.

In the cake recipe example, a food mixer can in the step four can be a example of automation.

#### <a name="chapter1part4"></a>Chapter 1 - Part 4: Computer Program

Computer have:

Hardware: Physical Parts (CPU, RAM, GPU, keyboard...)

Software: Logical Part (Program)
    - Operation System
    - Aplications (Spotify, Word, Web Browser)
    - Games
    - Utilities

Conclusion: Computer programs are algorithms executed by the computer. The computer is a machine that automates the execution of
algorithms.
Any algorithm? No. Only computational algorithms: Data processing and Calculation

#### <a name="chapter1part5"></a>Chapter 1 - Part 5: What Does it Take to Make a Computer Program?

To make a computer program, we need:

- A programming language: lexical and syntactic rules for write the program
- An IDE: software to edit and test the program
- A compiler: software for turning source code into code object
- A code generator or virtual machine: software that allows the program to run

#### <a name="chapter1part6"></a>Chapter 1 - Part 6: Programming Language

Programming languages have a lexical rules (orthography) and syntax rules (grammar) to write programs.

- Lexical

    Is about the correct words orthography.
    
    | Example English                                 | Example Programming Language  |
    |:------------------------------------------------|:------------------------------|
    | Dog (Correct)                                   | Main (Correct)                |
    | Dogo (Wrong)                                    | Maim (Wrong)                  |
    
- Syntax

   Is about the correct sentence’s grammar.
   
    | Example English                                 | Example Programming Language       |
    |:------------------------------------------------|:-----------------------------------|
    | He is a Daniel in judgment (Correct)            | x = 2 + y (Correct)                |
    | Daniel is a He in judgment (Wrong)              | x = + 2 y (Wrong)                  |
    

Example of program in Java:

```java

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        double x, y, media;
        
		System.out.print("Enter the First Number: ");
        x = sc.nextDouble();
        System.out.print("Enter the Second Number: ");
        y = sc.nextDouble();
        
        media = (x + y)/2.0;
        
        System.out.println("Media = " + media);
        sc.close();
	}

}

```

#### <a name="chapter1part7"></a>Chapter 1 - Part 7: IDE

It is a set of software used to build programs.

Ex:

- C / C ++: Code Blocks
- Java: Eclipse, NetBeans
- C#: Microsoft Visual Studio

Functions of an IDE

- Editing of source code (indentation, autocompletion, highlighting of words, etc.)
- Debugging and testing
- Construction of the final product (build)
- Suggestion of templates
- Assist in various tasks of your project

#### <a name="chapter1part8"></a>Chapter 1 - Part 8: Compilation and Interpretation, Source Code and Object Code, Virtual Machine

**Source Code**: is the code written by the programmer in a programming language

Ex:

```java

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        double x, y, media;
        
		System.out.print("Enter the First Number: ");
        x = sc.nextDouble();
        System.out.print("Enter the Second Number: ");
        y = sc.nextDouble();
        
        media = (x + y)/2.0;
        
        System.out.println("Media = " + media);
        sc.close();
	}

}

```

<div align="center"><img src="img/compilation-interpretation-w1353-h638.png" width=1000 height=500><br><sub>Fig 1 - Compilation and Interpretation Process</sub></div>



## <a name="chapter2"></a>Chapter 2: BBBB

#### <a name="chapter2part1"></a>Chapter 2 - Part 1: aaaa

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer accumsan id neque ut tempor. Nulla facilisi. Aliquam eu eros fermentum, commodo est sed, pharetra est. 
Curabitur lacinia blandit turpis rhoncus varius. Proin vulputate orci nulla, nec porttitor nibh consequat in. Suspendisse ac neque ut massa commodo auctor in sed libero. 
Sed tincidunt mauris eu tempor malesuada. Mauris feugiat vitae risus quis iaculis.

<div align="center"><img src="img/img-example-w5688-h3713.jpg" width=300 height=300><br><sub>Fig 1 - Aplication Deploy</sub></div>

# Usage <a name="usage"></a>

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more
resources.

_For more examples, please refer to the [Documentation](https://example.com)_

# Contributors <a name="contributors"></a>

| [<img src="https://github.com/vitorstabile.png" width=115 > <br> <sub> Vitor Garcia </sub>][github-url] | 
| :-----------------------------------------------------------------------------------------------------: |

# Contributing <a name="contributing"></a>

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

# Roadmap <a name="roadmap"></a>

See the [![Issues][issues-shield]][issues-url]  for a list of proposed features (and known issues).

# To Do <a name="todo"></a>

If so, list tasks / features that still need to be implemented in your application

:memo: To Do 1 

:memo: To Do 2

:memo: To Do 3 


# Contacts <a name="contacts"></a>

| Vitor Garcia                                     | Column 2                                   | Column 3     |
| :----------------------------------------------- | :-----------------------------------------:| -----------: |
| [![LinkedIn][linkedin-shield]][linkedin-url]     | More Stuff                                 | And Again    |
| [![Portfolio][portfolio-shield]][portfolio-url]  | Put Pipes In                               | Like this    |
| [![GitHub][github-shield]][github-url]           | Put Pipes In                               | Like this    |

# License <a name="License"></a>

- [![MIT License][license-shield]][license-url]

- Distributed under the MIT License. See `LICENSE` for more information.


<!-- README TUTORIALS -->

<!--

https://dev.to/reginadiana/como-escrever-um-readme-md-sensacional-no-github-4509

-->

<!-- 

Mark Down Guide - Readme Text Format Style

https://www.markdownguide.org/

-->

<!-- 

How to Create your Badges

https://gist.github.com/rupeshtiwari/8558ca0d8ec1c15619e4492dcd6aa81a

-->

<!-- USEFUL LINKS -->

<!--

Free Images Without Copyright

https://unsplash.com/


-->

<!-- MY BADGES -->

[project-shield]: https://img.shields.io/badge/link-project-green.svg
[project-url]: https://github.com/vitorstabile/tutorial-template-readme
[linkedin-shield]: https://img.shields.io/badge/my-linkedin-blue.svg 
[linkedin-url]: https://www.linkedin.com/in/vitor-stabile-garcia-5b151b67
[portfolio-shield]: https://img.shields.io/badge/my-portfolio-red.svg
[portfolio-url]: https://vitorstabile.github.io
[github-shield]: https://img.shields.io/badge/my-github-green.svg
[github-url]: https://github.com/vitorstabile
[issues-shield]: https://img.shields.io/badge/link-issues-green.svg
[issues-url]: https://github.com/vitorstabile/tutorial-template-readme/issues
[license-shield]: https://img.shields.io/badge/license-mit-blue.svg 
[license-url]: https://github.com/vitorstabile/tutorial-template-readme/blob/main/LICENSE.txt
