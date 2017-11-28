## 6441-project Doc for team members :two_men_holding_hands:

## What turtle :turtle: says 
 - Delete autogenerated code by IDE
 - What is variable p make it more sense like `player`
 - Unit tests should be structured as the project
 - Dont forget to do Unit Tests whenever anyone create a function, because do you remember what happend when that guy forgot to write break in switch. 


## Tasks to be done

- [x] Add startegaies input handler at UI side
- [x] Implement stratagies handling at model side
- [x] Implement Tournments at model side
- [ ] Implement Tournaments UI input 
- [ ] Resolve problem in Cards UI dialog
- [x] UI for human interface - Should follow MVC architecture
- [x] Strategies logic for aggressive, benevolent, random, cheater.

##SOEN 6441 Project conding standards

* `tmp` is name given to the local variables which are used for temporary purposes 6
* view package has view classes like WelcomeView, MapEditorView and GameView every view decoupled.
* Views are also decoupled from controllers by using dependecy injection.
* Class whose name starts with I is interface.
* `bootstrap.StartGame` is the class which bootstraps loads the entire program.
* controllers, views and models are decopuled, `bootstrap.StartGame` injects dependencies. 
* PhaseViewer, CardExchangeView and PlayersDomination View should be Observers.


##Coding Standards

* in `if-then-else` u should have braces if the `if` or `else` block has more than one statement, but the below one is not encouraged, u could make it better if you add braces for both if and else;
  
```
  if(/**some condition **/){
    //statement 1
    // statment 2
  } else
    //statement
```

* Use javadoc for every method and class
* If a method has complex functionalities, do inline comments.
* Method and variables should follow lowerCamelCase.
* Constants should be uppercase, words separated by `_`.
* Interfaces start with letter I. 
* booleans always should start with is or has.

## Below is the invalid map as example of disconnected maps

```
[Continents]
America=5
South=6

[Territories]
a,x,y,America,b
b,x,y,South,a,c
c,x,y,South,b,d
d,x,y,America,c
```
 But below one is valid
 
 ```
[Continents]
America=5
South=6

[Territories]
a,x,y,America,b,d
b,x,y,South,a,c
c,x,y,South,b,d
d,x,y,America,c,a
```
below is also an example of disconnected map -may be disconnected continent 

```
[Continents]
America=5
South=6

[Territories]
a,x,y,South,b
b,x,y,South,a,c
c,x,y,South,b

d,x,y,America,e
e,x,y,America,d
```

but below is valid one
```
[Continents]
America=5
South=6

[Territories]
a,x,y,South,b
b,x,y,South,a,c
c,x,y,South,b,d

d,x,y,America,e,c
e,x,y,America,d
```
below is the example of disconnected territories map which wont be accept by the game

```
[Continents]
America=5
South=6

[Territories]
a,x,y,South,b
b,x,y,South,a,c
c,x,y,South,b

d,x,y,South,e
e,x,y,South,d
```

but below is the valid one

```
[Continents]
America=5
South=6

[Territories]
a,x,y,South,b,d
b,x,y,South,a,c
c,x,y,South,b

d,x,y,South,e,a
e,x,y,South,d
```
