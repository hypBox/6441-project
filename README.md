# 6441-project

##SOEN 6441 Project conding standards

* `tmp` is name given to the local variables which are used for temporary purposes 6
* view package has view classes like WelcomeView, MapEditorView and GameView every view decoupled.
* Views are also decoupled from controllers by using dependecy injection.
* Class whose name starts with I is interface.
* `bootstrap.StartGame` is the class which bootstraps loads the entire program.
* controllers, views and models are decopuled, `bootstrap.StartGame` injects dependencies. 
* PhaseViewer, CardExchangeView and PlayersDomination View should be Observers.


##Coding Standards

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
