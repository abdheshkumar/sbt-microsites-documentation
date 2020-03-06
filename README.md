## How to Install Jekyll in Ubuntu
`sudo apt-get install ruby-full -y`

`gem install jekyll`

`jekyll -v`

## Build website
`sbt makeMicrosite`

## View the microsite in your browser
- In a shell, navigate to the generated site directory in target/site.

- Start Jekyll with jekyll serve. Bear in mind that depending on your micrositeBaseUrl setting, you might need to serve the site setting the base url. Execute Jekyll appending that value jekyll serve -b /yourbase_url

- Navigate to http://localhost:4000/ or http://localhost:4000/yourbase_url/ in your browser, where yourbase_url depends on your own preferences (see micrositeBaseUrl setting). Note, if you haven’t specified any micrositeBaseUrl setting, it’ll be empty by default.