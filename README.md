# Welcome to Java programming!

In this lab, you'll learn the basics of java programming by implementing the most basic calculator ever made. 

## Tools necessary

* A Github account
* Access to the terminal of your choice. Personally, I like [iTerm2](https://iterm2.com/) for Mac. Powershell works just fine for Windows. Linux users -- you're all set.
  * git must be installed on your machine. ([Windows](https://git-scm.com/download/win), with Mac install [homebrew](https://brew.sh/) and then install git with `brew install git`)
* [IntelliJ](https://www.jetbrains.com/idea/) (or your code editor of choice)
  * The community edition will suit this class' needs
* Java ([download here](https://adoptium.net/temurin/releases/); any version 17+ will be fine)
* Maven (comes with IntelliJ)

## Setting up

After creating your Github account, **fork** this repository by clicking the Fork button on this repo:

![](/Users/cody/workplace/intro-java-todo-app/src/main/resources/static/img/fork-screenshot.png "Fork a repository")

Then, navigate to the page where this repo now exists and check out the code to your local machine.
(For the purposes of simplicity, commands here will run as the user `iamauser`.)

```
gh repo clone codyzwief/java-intro-todo-app
```
**OR**
```
git clone https://github.com/codyzwief/java-intro-todo-app.git
```

Then, open up the project in IntelliJ. Choose **File** >> **New** >> **Project from existing sources**.

Select the directory where the files were installed to (`java-intro-todo-app`). For the other screens, you can accept the defaults.

After the IntelliJ project imports, you'll need to choose this project as a **Maven** project.
Right-click the `pom.xml` file and select the **Add as Maven project** selection. This will then make
IntelliJ load all the java code it needs to run this program.

## Assignment Objective

Get the tests to pass!

This lab has an extremely basic calculator application. Right now, the tests fail. It is your job to get the tests to pass.

To test, open up **src** >> **test** >> **java** >> **org.czwief.lab01** >> **CalculatorTest.java**

Right click, and `Run CalculatorTest.java`:

![](/Users/cody/workplace/intro-java-todo-app/src/main/resources/static/img/run-calculator-test.png "Run CalculatorTest.java")

You should see the tests fail with a wrong value:

![](/Users/cody/workplace/intro-java-todo-app/src/main/resources/static/img/failed-test-results.png "Failed test results expected")

Make the tests pass by fixing the code!

## Once you've fixed the tests

Once you have fixed the tests and have them running, turn in your assignment by committing the changes you've made to the 
repository and committing them to your fork.

In a terminal, from the root directory (`intro-java-todo-app`), add the files to your repo and commit them:

```
# The . in the below command is just to add all files. You can also individually add files you want, or also directories.
git add .

# Feel free to choose your own commit message
git commit -m "Got the calculator working!"

# Push the changes to github.com so it can become aware of your local changes
git push
```

Email me a link to your forked repo when complete!