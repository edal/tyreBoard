
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.pojos.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[controllers.pojos.Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en"  class="body-error"><head>
    <meta charset="utf-8">
    <title>"""),_display_(/*6.13*/Messages("login.pageTitle")),format.raw/*6.40*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

        <!-- Le styles -->
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.at("css/login.css")),format.raw/*12.83*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*13.50*/routes/*13.56*/.Assets.at("css/bootstrap.css")),format.raw/*13.87*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*14.50*/routes/*14.56*/.Assets.at("css/icon/font-awesome.css")),format.raw/*14.95*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*15.50*/routes/*15.56*/.Assets.at("css/bootstrap-responsive.css")),format.raw/*15.98*/("""">
        <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

        <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href=""""),_display_(/*22.38*/routes/*22.44*/.Assets.at("favicon.ico")),format.raw/*22.69*/("""">

</head>

    <body>

        <div id="header" role="banner">
            <!--Logo--><a href="#" class="logo"><h1>TyreBoard</h1></a><!--Logo END-->
        </div>
        <div id="wrapper">

            <div id="login" class="animate form position">
                    <!--<form action="dashboard.html" class="form-login">-->
                """),_display_(/*35.18*/helper/*35.24*/.form(routes.Application.login)/*35.55*/ {_display_(Seq[Any](format.raw/*35.57*/("""
                    """),format.raw/*36.21*/("""<div class="content-login">
                        <div class="header">"""),_display_(/*37.46*/Messages("login.formTitle")),format.raw/*37.73*/("""</div>

                        <div class="inputs">
                            """),_display_(/*40.30*/if(form.hasGlobalErrors)/*40.54*/ {_display_(Seq[Any](format.raw/*40.56*/("""
                                """),format.raw/*41.33*/("""<div class="alert alert-danger">
                                """),_display_(/*42.34*/Messages(form.globalError.message)),format.raw/*42.68*/("""
                                """),format.raw/*43.33*/("""</div>
                            """)))}),format.raw/*44.30*/("""
                            """),format.raw/*45.29*/("""<input name="username" type="text" placeholder=""""),_display_(/*45.78*/Messages("login.formField.username")),format.raw/*45.114*/("""" value=""""),_display_(/*45.124*/form("username")/*45.140*/.value),format.raw/*45.146*/(""""/>
                            <input name="password" type="password"  placeholder=""""),_display_(/*46.83*/Messages("login.formField.password")),format.raw/*46.119*/("""" />
                        </div>

                        <div class="link-1"><a href=""""),_display_(/*49.55*/routes/*49.61*/.Application.newUser()),format.raw/*49.83*/("""">"""),_display_(/*49.86*/Messages("login.button.newAccount")),format.raw/*49.121*/("""</a></div>
                        <div class="link-2"><a href=""""),_display_(/*50.55*/routes/*50.61*/.Application.forgotPassword()),format.raw/*50.90*/("""">"""),_display_(/*50.93*/Messages("login.button.forgotPassword")),format.raw/*50.132*/("""</a></div>
                        <div class="clear"></div>
                        <div class="button-login"><input type="submit" class="" value=""""),_display_(/*52.89*/Messages("login.button.signIn")),format.raw/*52.120*/(""""></div>
                    </div>

                        <!--
                    <div class="footer-login">
                            <div class="pull-left">Sing In With</div>
                <div class="pull-right">
                    <ul class="social-links">
                        <li class="facebook"><a href="#"><span>facebook</span></a></li>
                        <li class="twitter"><a href="#"><span>twitter</span></a></li>
                        <li class="google-plus"><a href="#"><span>google</span></a></li>
                    </ul>
                </div>

                        <div class="clear"></div>
                    </div>
                    -->
                """)))}),format.raw/*69.18*/("""

            """),format.raw/*71.13*/("""</div>


        </div>





            <!-- Le javascript
================================================== -->
            <!-- Placed at the end of the document so the pages load faster -->
        <script src=""""),_display_(/*83.23*/routes/*83.29*/.Assets.at("js/jquery.min.js")),format.raw/*83.59*/(""""></script>


    </body>
</html>

"""))}
  }

  def render(form:Form[controllers.pojos.Login]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[controllers.pojos.Login]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jun 14 18:59:32 CEST 2014
                  SOURCE: /Users/ealcala/Documents/SoftwareDev/playFramework/workspace/tyreBoard/app/views/login.scala.html
                  HASH: d9c9088225f7c6527f3bac586f9a82d2c2db9b1e
                  MATRIX: 746->1|871->38|899->40|1023->138|1070->165|1335->403|1350->409|1398->436|1477->488|1492->494|1544->525|1623->577|1638->583|1698->622|1777->674|1792->680|1855->722|2155->995|2170->1001|2216->1026|2590->1373|2605->1379|2645->1410|2685->1412|2734->1433|2834->1506|2882->1533|2991->1615|3024->1639|3064->1641|3125->1674|3218->1740|3273->1774|3334->1807|3401->1843|3458->1872|3534->1921|3592->1957|3630->1967|3656->1983|3684->1989|3797->2075|3855->2111|3973->2202|3988->2208|4031->2230|4061->2233|4118->2268|4210->2333|4225->2339|4275->2368|4305->2371|4366->2410|4542->2559|4595->2590|5327->3291|5369->3305|5613->3522|5628->3528|5679->3558
                  LINES: 26->1|29->1|31->3|34->6|34->6|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|50->22|50->22|50->22|63->35|63->35|63->35|63->35|64->36|65->37|65->37|68->40|68->40|68->40|69->41|70->42|70->42|71->43|72->44|73->45|73->45|73->45|73->45|73->45|73->45|74->46|74->46|77->49|77->49|77->49|77->49|77->49|78->50|78->50|78->50|78->50|78->50|80->52|80->52|97->69|99->71|111->83|111->83|111->83
                  -- GENERATED --
              */
          