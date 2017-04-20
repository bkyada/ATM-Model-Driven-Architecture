# Project Title 
ATM-Model-Driven-Architecture

Design three kinds of ATMs with the following OO design patterns: 

* State pattern
* Strategy pattern
* Abstract factory pattern

There are three ATM components: 
* ATM-1 
* ATM-2 
* ATM-3. 

### ATM-1 component operations: 

* create(): ATM is created  
* card (int x, string y): ATM card is inserted where x is a balance and y is a pin 
* pin (string x): provides pin
* deposit (int d): deposit amount d
* withdraw (int w): withdraw amount w
* balance (): display the current balance
* lock(string x): lock the ATM,where x is a pin 
* unlock(string x): unlock the ATM, where x is pin 
* exit(): exit from the ATM 

### ATM-2 component operations: 

* create(): ATM is created
* CARD (float x, int y): ATM card is inserted where x is a balance and y is a pin 
* PIN (int x): provides pin 
* DEPOSIT (float d): deposit amount d 
* WITHDRAW (float w): withdraw amount w 
* BALANCE (): display the current balance 
* EXIT (): exit from the ATM 

### ATM-3  component operations: 

* create(): ATM is created
* card (int x, int y): ATM card is inserted where x is a balance and y is a pin
* pin (int x): provides pin 
* deposit (int d): deposit amount d 
* withdraw (int w): withdraw amount w 
* balance (): display the current balance
* lock(): lock the ATM
* unlock(): unlock the ATM
* exit():exit from the ATM  

### Aspects that vary between three ATM components 
a. Maximum number of times incorrect pin can be entered b. Minimum balance c. Display menu(s) d. Messages, e.g., error messages, etc. e. Penalties f. Operation names and signatures g. Data types h. etc. The goal of this project is to design three ATM components using a Model-Driven Architecture (MDA). An executable meta-model, referred to as MDA-EFSM, of ATM components should capture the “generic behavior” of all three ATM components and should be de-coupled from data and implementation details. Notice that in your design there should be ONLY one MDA-EFSM for all three ATM components.In addition, in the Model-Driven Architecture coupling between components should be minimized and cohesion of components should be maximized (components with high cohesion and low coupling between components). The meta-model (MDA-EFSM) used in the Model-Driven architecture should be expressed as an EFSM (Extended Finite State Machine) model.

