# Git/GitHub Cheat Sheet


## 1. Git configuration
    
**Git config**
Get and set configuration variables that control all facets of how Git looks and operates.

**Set the name:**
     
```bash
git config --global user.name "User name"
```

**Set the email:**

```bash
git config --global user.email "Email Address"
```

**Check the setting:**

```bash
git config -list
```


## 2. Starting a project

**Git init**
Create a local repository:

```bash
git init
```

**Git clone**
Make a local copy of the server repository.

```bash
git clone EnterRepositoryURL
```


## 3. Local Changes
    
**Git add**
Add a file to staging (Index) area:

```bash
git add "YourFilename"
```

**Add all files** of a repo to staging (Index) area:

```bash
git add*
```

**Git commit**
Record or snapshots the file permanently in the version history with a message.

```bash
git commit -m " Commit Message"
```


## 4. Track changes

**Git diff**
Track the changes that have not been staged:
    
```bash
git diff
```

Track the changes that have staged but not committed:

```bash
git diff --staged
```

Track the changes after committing a file:

```bash
git diff HEAD
```

**Git status**
Display the state of the working directory and the staging area.

```bash
git status
```


## 5. Commit History

**Git log**
Display the most recent commits and the status of the head:

```bash
git log
```

Display the output as one commit per line:

```bash
git log -oneline
```

Displays the files that have been modified:

```bash
git log -stat
```

Display the modified files with location:

```bash
git log -p
```


## 6. Branching

**Git branch Create branch:**

```bash
git branch Your-branch-name
```

**Switching to the specified branch and updates the working directory:**

```bash
git switch -c Your-branch-name
```

**Git Merge**
Combines the specified branch’s history into the current branch. This is usually done in pull requests, but is an important Git operation.

```bash
git merge branch-name
```

**Deleting a branch**
Deletes the specified branch:

```bash
git branch -d branch-name
```

**Create a new branch and switch to it:**

```bash
git checkout -b Branch-Name
```


## 7. Redo commits

**Undoes all commits after [commit], preserving changes locally**

```bash
git reset [commit]
```

**Discards all history and changes back to the specified commit**

```bash
git reset --hard [commit]
```


## 8. Pushing Updates

**Git push**
Transfer the commits from your local repository to a remote server. Push data to the remote server:

```bash
git push origin master
```

**Force push data:**

```bash
git push -f
```

**Delete a remote branch by push command:**

```bash
git push origin -delete edited
```


## 9. Pulling updates

**Git pull**
Pull the data from the server:

```bash
git pull origin master
```

**Pull a remote branch:**
git pull
```

**Git fetch**
Download branches and tags from one or more repositories. Fetch the remote repository:

```bash
git fetch <repository Url>
```

**Fetch a specific branch:**

```bash
git fetch
```

**Fetch all the branches simultaneously:**

```bash
git fetch -all
```

**Synchronize the local repository:**

```bash
git fetch origin
```


## 10. Removing files

**Git rm**
Remove the files from the working tree and from the index:

```bash
git rm <file Name>
```

Remove files from the Git But keep the files in your local repository:

```bash
git rm --cached
```