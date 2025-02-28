def call(String url, String branch){
  echo "This is cloning the code"
  git url: "https://github.com/LondheShubham153/django-notes-app.git", branch:"main"     # Replace url with "${url}"
  echo "Code Cloning successful"
}
