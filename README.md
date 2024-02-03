## system-design
Explore practical examples of System Design implemented in Java. From design patterns to scalability, this repository provides concise, hands-on illustrations for building robust systems in Java. Dive in and elevate your understanding of system architecture.


# Git's Important command  to add a local project to git hub

A. To add a project from a local computer to git-hub

    FIRST DOWNLOAD git on your local machine [https://git-scm.com/downloads](https://git-scm.com/downloads)

    1 Initialize Git in your local project directory:
      Open your terminal(in any IDE) or command prompt. -> Navigate to the root directory of your project.
       "git init"
    
    2. Add your project files to the Git repository:
       "git add ."
       
    3. Commit your changes:
        git commit -m "Your commit message here"

    4. Add your username and email on you local git
       git config --global user.name "Your Name"
       git config --global user.email "your.email@example.com"
     
    5. Connect your local repository to the GitHub repository:
        In the GitHub repository you created, you will find the URL for your remote repository.
        Copy it (should look something like https://github.com/your- username/your-repo.git). 
        Now, in your terminal, link your local repository to the remote GitHub repository using the following command:
        
        "git remote add origin https://github.com/your-username/your-repo.git"
        
          # # git frequently used commands 
        
    1st - checkout command 
    "git checkout 'branch name'"
    
    2nd - pulling code from  origin 
    "git pull origin 'current branch name ' "
    
    3rd- commands for pushing the code
    
        A -> command to check the status = "git status"
        B -> command to add the changes on local = "git add ."
        C -> command to commit the changes on  local with commit message = 'git commit -m "any message" '
        D -> command to pull existing code from origin (gitHub) = "git pull origin 'current branch name' " 
        E -> command to push the commit to origin (gitHUb) = "git push origin 'current brach name' "
    
     4th- command to create new branch from current branch 
        
        step1 -> "git pull origin 'current branch name ' "
        step2 -> "git checkout -b 'new branch name' "
    
     5th- command to checkout(switch) to other branch 
    
         "git checkout 'other branch name' 

 # B. Database-connection -MY Sql
 
    spring.datasource.url=jdbc:mysql://localhost:3306/databse_name
    spring.datasource.username=root(username)
    spring.datasource.password=root(password)
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# C. JPA Setting

    spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
    spring.jpa.hibernate.ddl-auto=none   
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true







     


