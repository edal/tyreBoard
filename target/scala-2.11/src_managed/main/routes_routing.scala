// @SOURCE:/Users/ealcala/Documents/SoftwareDev/playFramework/workspace/tyreBoard/conf/routes
// @HASH:70dde5108e641097a7d770c5b869f570dac285b8
// @DATE:Sat Jun 14 18:50:35 CEST 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_showLogin0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_showLogin0_invoker = createInvoker(
controllers.Application.showLogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showLogin", Nil,"GET", """ Acceso""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_showLogin1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_showLogin1_invoker = createInvoker(
controllers.Application.showLogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showLogin", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:8
private[this] lazy val controllers_Application_login2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login2_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:9
private[this] lazy val controllers_Application_forgotPassword3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forgotPassword"))))
private[this] lazy val controllers_Application_forgotPassword3_invoker = createInvoker(
controllers.Application.forgotPassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "forgotPassword", Nil,"GET", """""", Routes.prefix + """forgotPassword"""))
        

// @LINE:10
private[this] lazy val controllers_Application_newUser4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newUser"))))
private[this] lazy val controllers_Application_newUser4_invoker = createInvoker(
controllers.Application.newUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newUser", Nil,"GET", """""", Routes.prefix + """newUser"""))
        

// @LINE:13
private[this] lazy val controllers_Application_dashboard5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("username", """[^/]+""",true),StaticPart("/dashboard/"))))
private[this] lazy val controllers_Application_dashboard5_invoker = createInvoker(
controllers.Application.dashboard(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "dashboard", Seq(classOf[String]),"GET", """ Escritorio""", Routes.prefix + """$username<[^/]+>/dashboard/"""))
        

// @LINE:17
private[this] lazy val controllers_Assets_at6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.showLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.showLogin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forgotPassword""","""controllers.Application.forgotPassword()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newUser""","""controllers.Application.newUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$username<[^/]+>/dashboard/""","""controllers.Application.dashboard(username:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_showLogin0_route(params) => {
   call { 
        controllers_Application_showLogin0_invoker.call(controllers.Application.showLogin())
   }
}
        

// @LINE:7
case controllers_Application_showLogin1_route(params) => {
   call { 
        controllers_Application_showLogin1_invoker.call(controllers.Application.showLogin())
   }
}
        

// @LINE:8
case controllers_Application_login2_route(params) => {
   call { 
        controllers_Application_login2_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:9
case controllers_Application_forgotPassword3_route(params) => {
   call { 
        controllers_Application_forgotPassword3_invoker.call(controllers.Application.forgotPassword())
   }
}
        

// @LINE:10
case controllers_Application_newUser4_route(params) => {
   call { 
        controllers_Application_newUser4_invoker.call(controllers.Application.newUser())
   }
}
        

// @LINE:13
case controllers_Application_dashboard5_route(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        controllers_Application_dashboard5_invoker.call(controllers.Application.dashboard(username))
   }
}
        

// @LINE:17
case controllers_Assets_at6_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     