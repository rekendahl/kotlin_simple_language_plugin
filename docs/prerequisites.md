# Prerequisites:
 
 * Follow the the steps on JetBrain's [Prerequisites Page](http://www.jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support/prerequisites.html)
 * Install the [intellij-plugin-with-gradle-wizard](https://github.com/shiraji/intellij-plugin-with-gradle-wizard)
 
Create a new project called `kotlin_simple_language_plugin` using the following steps
 
![New Project Settings](images/new_gradle_project.png)
 
![Project Settings](images/new_gradle_project_settings.png)

![Extended Project Settings](images/new_gradle_project_extended_settings.png)

![Project Plugin Description](images/new_gradle_project_plugin_description.png)

![Project Name and Path](images/new_gradle_project_naming.png)

Once the project is created you will see the following pop-up telling you your project is unlinked. Click the link to import the project!

![Import Gradle Project PopUp](images/new_gradle_project_unlinked.png)

Then pick the following settings:

![Import Settings](images/new_gradle_project_import.png)

Once imported you should see the new Gradle Build Targets in the top right corner like this:

![Gradle Build Targets](images/new_gradle_project_build_targets.png)

At this point you are ready to start reading chapter [2: Language & File Types](language_and_filetype.md)
