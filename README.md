# Cell Division Explorer

Mục tiêu của chương trình: Đưa cho người dùng một cách nhìn khái quát về các bộ phận của tế bào và cơ chế phân chia tế bào trên 2 loại tế bào: Nhân sơ, và nhân thực

The goal of the Application: Helps the User explore how Cell Division works and what are the components of 2 types of Cell: Prokaryotic Cell, and Eukaryotic Cell

## Installation guide:

This application runs on JavaFX, so please download the JavaFX .jar file. Depends on the platform, please install the application as per these instructions:

### Visual Studio Code
- Delete the .project and the .classpath in the Sourcecode/CellDivisionExplorer folder </br></br>
- Add a launch.json file, within a configuration, add a vmArgs line like below:
  ```
   --module-path "path_to_JavaFX_lib_jar" --add-modules javafx.controls,javafx.fxml,javafx.media,javafx.base,javafx.graphics,javafx.swing,javafx.web
  ```
It should look something like this:
![image](https://github.com/DuongDH03/Cell-Division-Explorer/assets/146160191/9032bce5-38b3-4e64-b1c2-131a6593fb4f)

### Eclipse
Right now, Eclipse is in a really bad spot, since it's old and the User Interface isn't exactly welcoming.</br>
Regarless, this Application was build on Eclipse. Let me show you how it's done</br>

- First when you have imported the project, go to Window > Preference > Search for "User Libraries" and add all the JavaFX .jar files you have downloaded, save that as JavaFX
- ![image](https://github.com/DuongDH03/Cell-Division-Explorer/assets/146160191/426749a5-9b68-47b9-8471-a9491288a8b2)
- After that, right click on the Project, then Build Path > Configure Build Path
- ![image](https://github.com/DuongDH03/Cell-Division-Explorer/assets/146160191/09125dab-0178-483e-a0ff-1da6864bb909)
- Add JavaFX to the Class Path by clicking "Add Library > User Library > JavaFX (Created above)"
- ![image](https://github.com/DuongDH03/Cell-Division-Explorer/assets/146160191/9b33a887-27f9-4135-8235-03d083a98458)
- Go to Run > Run Configuration:</br>
- ![image](https://github.com/DuongDH03/Cell-Division-Explorer/assets/146160191/17b2510b-5b01-43b4-b5ba-018ed0b8fb55)
- In the Arguments tab, add the line below to the VM Arguments box:
    ```
    --module-path "path_to_JavaFX_lib_jar" --add-modules javafx.controls,javafx.fxml,javafx.media,javafx.base,javafx.graphics,javafx.swing,javafx.web
    ```
- It should look like this: </br>
- ![image](https://github.com/DuongDH03/Cell-Division-Explorer/assets/146160191/3a624c18-d9d7-4b7c-8788-2f975c88b482) </br></br>
  __Hit "Run" and you're ready to go!__

## Video Demonstration:

https://www.youtube.com/watch?v=Gjz6_wjBKRc

## Application Preview:

### Main Menu
- ![image](https://github.com/DuongDH03/Cell-Division-Explorer/assets/146160191/013069ba-e394-4d56-837a-3fa4ebee3d18)

### Cell Component View
- ![image](https://github.com/DuongDH03/Cell-Division-Explorer/assets/146160191/b6bfb065-66b7-4bad-9c5b-529d4542e6ad)

### Cell Division View 

- ![image](https://github.com/DuongDH03/Cell-Division-Explorer/assets/146160191/de736ba1-73b4-4d95-b0ab-81537028546f)

### Help Menu

- ![image](https://github.com/DuongDH03/Cell-Division-Explorer/assets/146160191/7e29357e-c556-4945-9a58-39a1f560debc)







