package org.nh.blackbird.taglibs

class BlackbirdTagLib
{
     static namespace = "blackbird"

     def resources = { attrs ->
         out <<  render(template:"/templates/blackbirdJs")
         out << render(template:"/templates/blackbirdCSS")
     }
}
