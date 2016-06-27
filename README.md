# orderapp-client

cd ~/YourProjectsDirectory
git clone https://github.com/douglas-man/orderapp.git

mvn generate-sources
mvn compile
mvn exec:java -Dexec.mainClass="com.demo.App"



echo "# orderapp-client" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/douglas-man/orderapp-client.git
git push -u origin master