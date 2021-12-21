
# FriendlyPatterns

FriendlyPatterns is a repo that uses common design patterns in a simple way to explain how each one works.

The app will take you on a tour where design patterns reside.

Each activity will have its own design pattern, except MainActivity which works as the main gate.

I read a few articles that really helped me understand the patterns better, so I will include everything that has been useful as well.


## 🧐 What is MVVM?


First, let’s talk about what the MVVM pattern is. The MVVM pattern is a pattern derived from the MVP pattern defined by Martin Fowler in the 1990s. The MVVM (Model-View-ViewModel) pattern helps to completely separate the business and presentation logic from the UI, and the business logic and UI can be clearly separated for easier testing and easier maintenance. Let’s take a look at View, ViewModel and Model
![MvvM](https://raw.githubusercontent.com/allefsousa/BooksMvvm/master/mvv.png)





### View
View is responsible for the layout structure displayed on the screen. You can also execute UI logic.

### ViewModel
The ViewModel implements the data and commands connected to the View to notify the View of state changes via change notification events. Then, the View that receives the state change notification determines whether to apply the change.

### Model
Model is a non-visual class that has the data to use. Examples include DTO (Data Transfer Objects), POJO (Plain Old Java Objects) and entity objects. It is commonly used service or repository that need to access or cache data.

![MvvM](https://miro.medium.com/max/624/0*Qw-h-PYmfW2aajb_.png)
As you can see from the figure above, ViewModel knows Model but does not know View and View can know ViewModel but does not know Model.
## 🧐 What is MVP?

![MvP](https://miro.medium.com/max/778/0*8ps4RHy13puZY4dK.png)


MVP (Model View Presenter) pattern is a derivative from the well known MVC (Model View Controller), and one of the most popular patterns to organize the presentation layer in Android Applications.


The MVP pattern allows separating the presentation layer from the logic so that everything about how the UI works is agnostic from how we represent it on screen. Ideally, the MVP pattern would achieve that the same logic might have completely different and interchangeable views.



### Model
In an application with a good layered architecture, this model would only be the gateway to the domain layer or business logic. See it as the provider of the data we want to display in the view. 
[Model’s responsibilities include using APIs, caching data, managing databases and so on.](https://medium.com/cr8resume/make-you-hand-dirty-with-mvp-model-view-presenter-eab5b5c16e42)



### View
The View, usually implemented by an Activity, will contain a reference to the presenter. The only thing that the view will do is to call a method from the Presenter every time there is an interface action.


### Presenter
The Presenter is responsible to act as the middle man between View and Model. It retrieves data from the Model and returns it formatted to the View. But unlike the typical MVC, it also decides what happens when you interact with the View.

## 🧐 What is MVC?

![MvC](https://user.oc-static.com/upload/2017/09/23/15061210216859_MVC%20Flow%20Diagram.jpeg)

MVC is known as an architectural pattern, which embodies three parts Model, View and Controller, or to be more exact it divides the application into three logical parts: the model part, the view and the controller. It was used for desktop graphical user interfaces but nowadays is used in designing mobile apps and web apps.


### MVC Architecture
MVC is an architectural pattern which means it rules the whole architecture of the applications. Even though often it is known as design pattern but we may be wrong if we refer it only as a design pattern because design patterns are used to solve a specific technical problem, whereas architecture pattern is used for solving architectural problems, so it affects the entire architecture of our application.
It has three main components:

-Model

-View

-Controller

and each of them has specific responsibilities


### Model
It is known as the lowest level which means it is responsible for maintaining data. Handle data logically so it basically deals with data. The model is actually connected to the database so anything you do with data. Adding or retrieving data is done in the model component. It responds to the controller requests because the controller never talks to the database by itself. The model talks to the database back and forth and then it gives the needed data to the controller. Note: the model never communicated with the view directly.


### View
Data representation is done by the view component. It actually generates UI or user interface for the user.

Views are created by the data which is collected by the model component but these data aren’t taken directly but through the controller, so the view only speaks to the controller.


### Controller
It’s known as the main man because the controller is the component that enables the interconnection between the views and the model so it acts as an intermediary. The controller doesn’t have to worry about handling data logic, it just tells the model what to do.

After receiving data from the model it processes it and then it takes all that information it sends it to the view and explains how to represent to the user. Note: Views and models can not talk directly.
## Conclusion

#### I hope you enjoyed reading and hopefully the code wasn't hard to read. For sure everything can be improved and refactored to a better shape of it.
![Meme](https://imgflip.com/s/meme/Leonardo-Dicaprio-Cheers.jpg)


![Meme](https://www.freecodecamp.org/news/content/images/size/w2000/2019/07/design-patterns-everywhere.jpg)

## Documentation

[Everything you need to know about MVC architecture](https://towardsdatascience.com/everything-you-need-to-know-about-mvc-architecture-3c827930b4c1)

[MVC (Model View Controller) Architecture Pattern in Android (GeeksForGeeks)](https://www.geeksforgeeks.org/mvc-model-view-controller-architecture-pattern-in-android-with-example/)

[Model View Presenter(MVP) in Android](https://medium.com/cr8resume/make-you-hand-dirty-with-mvp-model-view-presenter-eab5b5c16e42)

[Create Android app with MVVM pattern](https://medium.com/hongbeomi-dev/create-android-app-with-mvvm-pattern-simply-using-android-architecture-component-529d983eaabe)

[Databinding in Android using Kotlin](https://www.section.io/engineering-education/how-to-use-databinding-in-android-using-kotlin/)

[Difference Between MVP vs MVVM](https://www.educba.com/mvp-vs-mvvm/)

[MVP (Model View Presenter) Architecture Pattern (GeeksForGeeks)](https://www.geeksforgeeks.org/mvp-model-view-presenter-architecture-pattern-in-android-with-example/)

[Difference Between MVC, MVP and MVVM Architecture Pattern in Android](https://www.geeksforgeeks.org/difference-between-mvc-mvp-and-mvvm-architecture-pattern-in-android/)

[Implementing MVVM architecture in Android using Kotlin](https://www.section.io/engineering-education/implementing-mvvm-architecture-in-android-using-kotlin/)

[Android ViewBinding (YouTube)](https://www.youtube.com/watch?v=z0F2QTAKsWU)

[How to Use Data Binding Library with Kotlin](https://www.moveoapps.com/blog/how-to-use-data-binding-library-with-kotlin-a-step-by-step-guide/)

[LiveData Clean Code using MVVM and Android Architecture Components](https://medium.com/android-news/lets-keep-activity-dumb-using-livedata-53468ed0dc1f)

[Architecture Presentation Patterns: MVC vs MVP vs MVVM](https://www.thirdrocktechkno.com/blog/architecture-presentation-patterns-mvc-vs-mvp-vs-mvvm/)

