# uji-satu
1. log out user name
$ git config --global --unset user.name

2. log out user email
$ git config --global --unset user.email

3. cek status
$ git config --list

4. login kembali
$ git config --global user.name "RadBile2022"

5. login email
$ git config --global user.email "wahradar511@gmail.com"

6. check status kembali
$ git config --list

7. langkah selanjutnya klik folder filenya, lalu klik kanan Git Bash Here

8. buat git local
$ git init

9. check status
$ git status

10. menambahkan ke repository local
$ git add .idea/

11. check status kembali
$ git status

12. commit
$ git commit -m "upload pertama"

13. history
$ git log

14. coba, tetapi error kalau tidak ada perubahan
$ git commit -m "upload kedua"

15. status untuk meyakinkan
$ git status

16. menambahkan semua project yang belum ditambahkan
$ git add .

17. check status
$ git status

18. commit kedua
$ git commit -m "upload kedua"

19. check status kembali // untuk memastikan mana file yg udah di commit maupun di add
$ git status

20. history
$ git log

21. add remote
$ git remote add // kalau gini doang salah
$ git remote add origin https://github.com/RadBile2022/uji-dua.git

22. check nama remote (version)
$ git remote -v

23. push ke git hub
$ git push origin master

24. check history
$ git log

25. check nama branching
$ git branch

==========================================

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$ git remote -v
origin  https://github.com/RadBile2022/uji-satu.git (fetch)
origin  https://github.com/RadBile2022/uji-satu.git (push)

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$ git log
commit 906f56055c379976790f36a882c9e614f3ef78a7 (HEAD -> master, origin/master)
Author: PC-10 <myprmn>
Date:   Mon Apr 18 08:11:24 2022 +0700

    satu commit

commit f072021d2a1230e71b81abb4d369faeec8e30fed
Author: PC-10 <myprmn>
Date:   Tue Mar 1 11:21:08 2022 +0700

    Penambahan Overloading dan function

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$ alias graph="git log --oneline --decorate --graph --all"

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$ graph
* 906f560 (HEAD -> master, origin/master) satu commit
* f072021 Penambahan Overloading dan function

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$
Display all 4972 possibilities? (y or n)

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$ git status
On branch master
nothing to commit, working tree clean

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$ git fetch origin master
remote: Enumerating objects: 22, done.
remote: Counting objects: 100% (22/22), done.
remote: Compressing objects: 100% (21/21), done.
remote: Total 21 (delta 11), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (21/21), 4.95 KiB | 12.00 KiB/s, done.
From https://github.com/RadBile2022/uji-satu
 * branch            master     -> FETCH_HEAD
   906f560..83d05e0  master     -> origin/master

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$ git status
On branch master
nothing to commit, working tree clean

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$ graph
* 83d05e0 (origin/master) Update README.md
* aa9149c Update README.md
* a27868e Update README.md
* 6bc3a71 Update README.md
* 60fe8eb Update README.md
* 701fbfd Update README.md
* a568376 Create README.md
* 906f560 (HEAD -> master) satu commit
* f072021 Penambahan Overloading dan function

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$ git pull origin master
From https://github.com/RadBile2022/uji-satu
 * branch            master     -> FETCH_HEAD
Updating 906f560..83d05e0
Fast-forward
 README.md | 83 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 1 file changed, 83 insertions(+)
 create mode 100644 README.md

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$ graph
* 83d05e0 (HEAD -> master, origin/master) Update README.md
* aa9149c Update README.md
* a27868e Update README.md
* 6bc3a71 Update README.md
* 60fe8eb Update README.md
* 701fbfd Update README.md
* a568376 Create README.md
* 906f560 satu commit
* f072021 Penambahan Overloading dan function

PC-10@DESKTOP-CAETJLK MINGW64 /d/Kotlin/Dasar_Kotlin (master)
$ graph berapakali komit server dan local, git fech check dari local ke server apa ada perubahan, setelah itu check di folder local







