<h1>Documentation for Oscars application</h1>

>- **Springboot_application_version2** is the official working coppy
>- Main function is to search by 4 fields: *name, category, year and oscar winning* and application will return one movie
>- Team: **Hell's Kitchen**

<h2>Project Files</h2>

Here is the basic overview of the files used for the API. It was created using **Springboot** and **Maven** and it displays to **localhost:8080**. The main classes where code has been added and edited are **WebController**, **SampleResponse** and **SimpleRestApiVersion2Application**. The JSON dataset file where all the oscar movies and actrs are stored is in the **resources** folder.
>![Project Folder](https://user-images.githubusercontent.com/31836580/118218908-3e7f7300-b42d-11eb-8306-5a76488ce1b9.png)

<h2>WebController class</h2>

Below this is the beginning of the **WebController** class. The mapping is set to */Oscars* so whenever the user types */Oscars?* in the URL, the program will then get the search value that is entered afterwards.The request parameter is set to *“search”* so when the user types this in the url it will take their input and then look through the json file for the matching string.
>![WebController class start](https://user-images.githubusercontent.com/31836580/118219031-81414b00-b42d-11eb-81d2-1e8b8299bbc8.png)

In the same class **WebController** and the same method, this next part is where the program searches for the requested movie or actor based on the string provided by the user. The for loop looks through all elements in the dataset and if the string *search* equals the entity, year, winner or category fields then it will return the information at that index. At this point, the program can only return one movie so if a specific name is searched, only the first result under the searched year will be returned.
>![WebController class end](https://user-images.githubusercontent.com/31836580/118217316-0cb8dd00-b42a-11eb-8539-c5cfbdee80c3.png)

However if no search parameter is specified, the program will pick and return a **random** movie or actor from the dataset.
>![random](https://user-images.githubusercontent.com/31836580/118219078-9e761980-b42d-11eb-818e-e4c087b7011f.png)

<h2>SampleResponse class</h2>

This part of the program is in the **SampleResponse** class and it sets up the fields that are going to be searched for and provided. For each field, there is a *get* and *set* method that will set the field to a specified value in the dataset and return it when called from the **WebController** class.
>![SampleResponse class](https://user-images.githubusercontent.com/31836580/118219188-d4b39900-b42d-11eb-91c6-51561822a58f.png)

These main two classes work together to produce the output that the user will see after their search. But in order to load the webpage on **localhost**, the program needs to be running from the command line. Below is a screenshot of the terminal and what needs to be entered in order to start the program that will allow for it to be viewed on **localhost:8080**. The user will be able to search for movies or actors as long as the program is running in the background.
>![application run](https://user-images.githubusercontent.com/31836580/118219426-4f7cb400-b42e-11eb-84bd-a6c835f8c940.png)

<h2>Testing</h2>

Next is a series of example searches and the output that is produced:

A. Search for the movie **Tangled**:
>![Tangled](https://user-images.githubusercontent.com/31836580/118219526-8357d980-b42e-11eb-8a5e-63ba305a0e4d.png)

B. Search for the actor **Leonardo DiCaprio**:
>![DiCaprio](https://user-images.githubusercontent.com/31836580/118219557-97034000-b42e-11eb-811b-a284f60dc0af.png)

C.Search for year **1930**:
>![year](https://user-images.githubusercontent.com/31836580/118219594-a7b3b600-b42e-11eb-96e0-0ecadcad1d33.png)

D.Search by category **best motion picture**:
>![best motion picture](https://user-images.githubusercontent.com/31836580/118219619-b4380e80-b42e-11eb-88d0-54198027f614.png)

E.Search for award **winner**:
>![true](https://user-images.githubusercontent.com/31836580/118219637-bf8b3a00-b42e-11eb-96ca-9d3f64445f59.png)

F.Example of a random movie provided when nothing is searched for. If the page is reloaded, a new random movie or actor will appear each time.
>![nothing searched](https://user-images.githubusercontent.com/31836580/118220361-5b697580-b430-11eb-8f1e-b96948a86b9f.png)
