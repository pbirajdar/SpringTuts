# SpringTuts
Learned concept will be implemented in this repository

Till now below concepts are covered:

-- Tutorial 1: In this tutorial, I learned IoC(Inversion Of Control Spring Container).
In this tutorial I created different beans which can be configurable in our code.
IoC brings object responsibility out from main application.

-- Tutorial 2: 
In this tutorial we learned about Dependency Injection Using ApplicationConfiguration.XML file.
In this Tutorial we learned below dependencies:
1. Constructor Dependency.
	Setting value to parameters of the constructors.
2. Setter Dependency.
	Setting value to parameters of the setter methods in the class.
3. Literal Dependency.
	Setting value to parameters of the setter methods in the class.
5. Add a value into properties by getting values from properties file.
	Create a properties file and use this file to provide the default values of parameters.
	
-- Tutorial 3:
In this tutorial I learned about the beans scope and its lifecycle.
I learned the below scopes related to the beans:
1. Singleton(Where single object is shared along the whole app or code) that means whenever we request for create the object then already created object instance is assigned.

2. Prototype(where new instance is created whenever user requested for object or creates the new object).

There are more scopes supported by the Spring but those scopes are supported or used in only web apps.
e.g 1. Request, 2.Session, 3. Global Session etc.

Those scopes will be covered in in-coming sessions.

To add the scope in beans we can use 'scope' attribute in bean tag.

After that I learned about the beans LifeCycle.
i.e. whole flow of beans. See the below:

INITIALIZATION Of Bean --> doing some internal bean processing --> using this bean --> Destroying the Bean.

We can add our own logic or business logic into the INIT of Beans & Destroying of the beans.
e.g. : We can initialize required DB or file in init method of bean and we can also destroy the DB connection or file in destroy method of the Bean.

To add the init method in bean 'init-method' attribute is used in bean tag.
And to add the destroy method in bean 'destroy-method' attribute is used in bean tag.	