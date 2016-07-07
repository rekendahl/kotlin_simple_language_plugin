# Language and FileType

It's time to start adding files! In the [the last chapter](prerequisites.md) a barebones project was created. We cannot yet compile the project as there are no files.

We will store all source code under `src/main/kotlin/com.simpleplugin`. So right click on the `main` directory and choose create Directory. Name the new Directory kotlin.
Right click on the kotlin directory and choose new package and name it `com.simpleplugin`. With these structures in place we can now go ahead a create the files needed.

## Define a language

[SimpleLanguage.kt](../src/main/kotlin/com/simpleplugin/SimpleLanguage.kt)

## Define an icon

In this project the graphics are stored under the `/src/main/resources` directory. Right click on it and choose add package. Name the package `com.simpleplugin.icons`.
Copy the ![icon](../src/main/resources/com/simpleplugin/icons/jar-gray.png) [icon](../src/main/resources/com/simpleplugin/icons/jar-gray.png) into the new directory.

The link to the icon is in [SimpleIcons.kt](../src/main/kotlin/com/simpleplugin/SimpleIcons.kt)

## Define a file type

[SimpleFileType.kt](../src/main/kotlin/com/simpleplugin/SimpleFileType.kt)

## Define a file type factory

[SimpleFileTypeFactory.kt](../src/main/kotlin/com/simpleplugin/SimpleFileTypeFactory.kt)

## Register the file type factory
 
 Add the following line to [`../src/main/resources/META-INF/plugin.xml`](../src/main/resources/META-INF/plugin.xml)
 
`<fileTypeFactory implementation="com.simpleplugin.SimpleFileTypeFactory"/>`

##  Run the project

Now you should be able to run the project. Details here are a little fuzzy but here is the gist

1. Choose the Gradle build target called `Kotlin Simple Language Plugin [buildPlugin]` from the top right corner.
2. Make sure it builds cleanly
3. Confirm you have a `../build/distributions/Kotlin Simple Language Plugin-0.1.zip` file
4. Add this Plugin to your loaded plugins through Preferences -> Plugins -> Install Plugin from Disk.
5. Restart Intellij
6. The [../src/tests/first_test.simple](../src/tests/first_test.simple) file should now have the correct ![icon](../src/main/resources/com/simpleplugin/icons/jar-gray.png) [icon](../src/main/resources/com/simpleplugin/icons/jar-gray.png)

