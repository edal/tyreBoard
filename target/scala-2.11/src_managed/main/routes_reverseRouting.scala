// @SOURCE:/Users/ealcala/Documents/SoftwareDev/playFramework/workspace/tyreBoard/conf/routes
// @HASH:70dde5108e641097a7d770c5b869f570dac285b8
// @DATE:Sat Jun 14 18:50:35 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:17
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        
    
}
                          

// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def forgotPassword(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "forgotPassword")
}
                        

// @LINE:13
def dashboard(username:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("username", dynamicString(username)) + "/dashboard/")
}
                        

// @LINE:7
// @LINE:6
def showLogin(): Call = {
   () match {
// @LINE:7
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "login")
                                         
   }
}
                                                

// @LINE:10
def newUser(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "newUser")
}
                        

// @LINE:8
def login(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        
    
}
                          
}
                  


// @LINE:17
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def forgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.forgotPassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forgotPassword"})
      }
   """
)
                        

// @LINE:13
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.dashboard",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username)) + "/dashboard/"})
      }
   """
)
                        

// @LINE:7
// @LINE:6
def showLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showLogin",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
      }
   """
)
                        

// @LINE:10
def newUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newUser"})
      }
   """
)
                        

// @LINE:8
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:17
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def forgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.forgotPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "forgotPassword", Seq(), "GET", """""", _prefix + """forgotPassword""")
)
                      

// @LINE:13
def dashboard(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.dashboard(username), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "dashboard", Seq(classOf[String]), "GET", """ Escritorio""", _prefix + """$username<[^/]+>/dashboard/""")
)
                      

// @LINE:6
def showLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showLogin", Seq(), "GET", """ Acceso""", _prefix + """""")
)
                      

// @LINE:10
def newUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newUser", Seq(), "GET", """""", _prefix + """newUser""")
)
                      

// @LINE:8
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    