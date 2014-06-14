
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>"""),_display_(/*6.13*/Messages("main.pageTitle")),format.raw/*6.39*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <meta name="description" content="">
    <meta name="author" content="">

        <!-- Le styles -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.at("css/style.css")),format.raw/*13.51*/("""" rel="stylesheet">
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.at("css/bootstrap.css")),format.raw/*14.55*/("""" rel="stylesheet">

    <link rel="stylesheet" href=""""),_display_(/*16.35*/routes/*16.41*/.Assets.at("css/jquery-ui-1.8.16.custom.css")),format.raw/*16.86*/("""" media="screen"  />
    <link rel="stylesheet" href=""""),_display_(/*17.35*/routes/*17.41*/.Assets.at("css/fullcalendar.css")),format.raw/*17.75*/("""" media="screen" />
    <link rel="stylesheet" href=""""),_display_(/*18.35*/routes/*18.41*/.Assets.at("css/chosen.css")),format.raw/*18.69*/("""" media="screen"/>
    <link rel="stylesheet" href=""""),_display_(/*19.35*/routes/*19.41*/.Assets.at("css/glisse.css?1.css")),format.raw/*19.75*/("""">
    <link rel="stylesheet" href=""""),_display_(/*20.35*/routes/*20.41*/.Assets.at("css/jquery.jgrowl.css")),format.raw/*20.76*/("""">
    <link rel="stylesheet" href=""""),_display_(/*21.35*/routes/*21.41*/.Assets.at("css/demo_table.css")),format.raw/*21.73*/("""">
    <link rel="stylesheet" href=""""),_display_(/*22.35*/routes/*22.41*/.Assets.at("css/jquery.fancybox.css?v=2.1.4")),format.raw/*22.86*/("""" media="screen"/>

    <link rel="stylesheet" href=""""),_display_(/*24.35*/routes/*24.41*/.Assets.at("css/icon/font-awesome.css")),format.raw/*24.80*/("""">
    <link rel="stylesheet" href=""""),_display_(/*25.35*/routes/*25.41*/.Assets.at("css/bootstrap-responsive.css")),format.raw/*25.83*/("""">
    <script src=""""),_display_(/*26.19*/routes/*26.25*/.Assets.at("js/main.js")),format.raw/*26.49*/(""""/>
        <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <script language="JavaScript">
    Firefox = navigator.userAgent.indexOf("Firefox") >= 0;
    if(Firefox) document.write("<link rel='stylesheet' href='"""),_display_(/*33.63*/routes/*33.69*/.Assets.at("css/moz.css")),format.raw/*33.94*/("""' type='text/css'>");
    </script>

        <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href=""""),_display_(/*37.38*/routes/*37.44*/.Assets.at("favicon.ico")),format.raw/*37.69*/("""">

</head>

    <body>
        """),_display_(/*42.10*/header/*42.16*/.render(user)),format.raw/*42.29*/("""
        """),format.raw/*43.9*/("""<div id="wrap">
            """),_display_(/*44.14*/sidebar/*44.21*/.render()),format.raw/*44.30*/("""
            """),_display_(/*45.14*/content),format.raw/*45.21*/("""
        """),format.raw/*46.9*/("""</div>

        <!-- Placed at the end of the document so the pages load faster -->
         <script src=""""),_display_(/*49.24*/routes/*49.30*/.Assets.at("js/jquery.min.js")),format.raw/*49.60*/(""""></script>
        <script src=""""),_display_(/*50.23*/routes/*50.29*/.Assets.at("js/jquery-ui.min.js")),format.raw/*50.62*/(""""></script>
        <script src=""""),_display_(/*51.23*/routes/*51.29*/.Assets.at("js/bootstrap.min.js")),format.raw/*51.62*/(""""></script>
        <script src=""""),_display_(/*52.23*/routes/*52.29*/.Assets.at("js/google-code-prettify/prettify.js")),format.raw/*52.78*/(""""></script>
        <script src=""""),_display_(/*53.23*/routes/*53.29*/.Assets.at("js/jquery.flot.js")),format.raw/*53.60*/(""""></script>
        <script src=""""),_display_(/*54.23*/routes/*54.29*/.Assets.at("js/jquery.flot.pie.js")),format.raw/*54.64*/(""""></script>
        <script src=""""),_display_(/*55.23*/routes/*55.29*/.Assets.at("js/jquery.flot.orderBars.js")),format.raw/*55.70*/(""""></script>
        <script src=""""),_display_(/*56.23*/routes/*56.29*/.Assets.at("js/jquery.flot.resize.js")),format.raw/*56.67*/(""""></script>
        <script src=""""),_display_(/*57.23*/routes/*57.29*/.Assets.at("js/jquery.flot.categories.js")),format.raw/*57.71*/(""""></script>
        <script src=""""),_display_(/*58.23*/routes/*58.29*/.Assets.at("js/graphtable.js")),format.raw/*58.59*/(""""></script>
        <script src=""""),_display_(/*59.23*/routes/*59.29*/.Assets.at("js/fullcalendar.min.js")),format.raw/*59.65*/(""""></script>
        <script src=""""),_display_(/*60.23*/routes/*60.29*/.Assets.at("js/chosen.jquery.min.js")),format.raw/*60.66*/(""""></script>
        <script src=""""),_display_(/*61.23*/routes/*61.29*/.Assets.at("js/autoresize.jquery.min.js")),format.raw/*61.70*/(""""></script>
        <script src=""""),_display_(/*62.23*/routes/*62.29*/.Assets.at("js/jquery.autotab.js")),format.raw/*62.63*/(""""></script>
        <script src=""""),_display_(/*63.23*/routes/*63.29*/.Assets.at("js/jquery.jgrowl_minimized.js")),format.raw/*63.72*/(""""></script>
        <script src=""""),_display_(/*64.23*/routes/*64.29*/.Assets.at("js/jquery.dataTables.min.js")),format.raw/*64.70*/(""""></script>
        <script src=""""),_display_(/*65.23*/routes/*65.29*/.Assets.at("js/jquery.stepy.min.js")),format.raw/*65.65*/(""""></script>
        <script src=""""),_display_(/*66.23*/routes/*66.29*/.Assets.at("js/jquery.validate.min.js")),format.raw/*66.68*/(""""></script>
        <script src=""""),_display_(/*67.23*/routes/*67.29*/.Assets.at("js/raphael.2.1.0.min.js")),format.raw/*67.66*/(""""></script>
        <script src=""""),_display_(/*68.23*/routes/*68.29*/.Assets.at("js/justgage.1.0.1.min.js")),format.raw/*68.67*/(""""></script>
        <script src=""""),_display_(/*69.23*/routes/*69.29*/.Assets.at("js/glisse.js")),format.raw/*69.55*/(""""></script>
        <script src=""""),_display_(/*70.23*/routes/*70.29*/.Assets.at("js/styleswitcher.js")),format.raw/*70.62*/(""""></script>
        <script src=""""),_display_(/*71.23*/routes/*71.29*/.Assets.at("js/moderniz.js")),format.raw/*71.57*/(""""></script>
        <script src=""""),_display_(/*72.23*/routes/*72.29*/.Assets.at("js/jquery.sparkline.min.js")),format.raw/*72.69*/(""""></script>
        <script src=""""),_display_(/*73.23*/routes/*73.29*/.Assets.at("js/slidernav-min.js")),format.raw/*73.62*/(""""></script>
        <script src=""""),_display_(/*74.23*/routes/*74.29*/.Assets.at("js/jquery.fancybox.js?v=2.1.4")),format.raw/*74.72*/("""" type="text/javascript"></script>
    <script>
    Modernizr.load([
    """),format.raw/*77.5*/("""{"""),format.raw/*77.6*/("""
    """),format.raw/*78.5*/("""load: [
    '"""),_display_(/*79.7*/routes/*79.13*/.Assets.at("js/main.js")),format.raw/*79.37*/("""'
    ],
    complete: function()
    """),format.raw/*82.5*/("""{"""),format.raw/*82.6*/("""
    """),format.raw/*83.5*/("""$.fn.ready(function()
    """),format.raw/*84.5*/("""{"""),format.raw/*84.6*/("""
    """),format.raw/*85.5*/("""window.App.init();
    """),format.raw/*86.5*/("""}"""),format.raw/*86.6*/(""");
    """),format.raw/*87.5*/("""}"""),format.raw/*87.6*/("""
    """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/("""
    """),format.raw/*89.5*/("""]);
    </script>
        <script src=""""),_display_(/*91.23*/routes/*91.29*/.Assets.at("js/application.js")),format.raw/*91.60*/(""""></script>
        <script src=""""),_display_(/*92.23*/routes/*92.29*/.Assets.at("js/float.settings.infobox.js")),format.raw/*92.71*/(""""></script>
    </body>
</html>
"""))}
  }

  def render(user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(user)(content)

  def f:((User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user) => (content) => apply(user)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 15 00:08:58 CEST 2014
                  SOURCE: /Users/ealcala/Documents/SoftwareDev/playFramework/workspace/tyreBoard/app/views/main.scala.html
                  HASH: db3715895cc78f7e5eef8f948e5f4ebbead9a300
                  MATRIX: 725->1|840->28|868->30|972->108|1018->134|1252->341|1267->347|1315->374|1379->411|1394->417|1446->448|1528->503|1543->509|1609->554|1691->609|1706->615|1761->649|1842->703|1857->709|1906->737|1986->790|2001->796|2056->830|2120->867|2135->873|2191->908|2255->945|2270->951|2323->983|2387->1020|2402->1026|2468->1071|2549->1125|2564->1131|2624->1170|2688->1207|2703->1213|2766->1255|2814->1276|2829->1282|2874->1306|3253->1658|3268->1664|3314->1689|3455->1803|3470->1809|3516->1834|3576->1867|3591->1873|3625->1886|3661->1895|3717->1924|3733->1931|3763->1940|3804->1954|3832->1961|3868->1970|4002->2077|4017->2083|4068->2113|4129->2147|4144->2153|4198->2186|4259->2220|4274->2226|4328->2259|4389->2293|4404->2299|4474->2348|4535->2382|4550->2388|4602->2419|4663->2453|4678->2459|4734->2494|4795->2528|4810->2534|4872->2575|4933->2609|4948->2615|5007->2653|5068->2687|5083->2693|5146->2735|5207->2769|5222->2775|5273->2805|5334->2839|5349->2845|5406->2881|5467->2915|5482->2921|5540->2958|5601->2992|5616->2998|5678->3039|5739->3073|5754->3079|5809->3113|5870->3147|5885->3153|5949->3196|6010->3230|6025->3236|6087->3277|6148->3311|6163->3317|6220->3353|6281->3387|6296->3393|6356->3432|6417->3466|6432->3472|6490->3509|6551->3543|6566->3549|6625->3587|6686->3621|6701->3627|6748->3653|6809->3687|6824->3693|6878->3726|6939->3760|6954->3766|7003->3794|7064->3828|7079->3834|7140->3874|7201->3908|7216->3914|7270->3947|7331->3981|7346->3987|7410->4030|7510->4103|7538->4104|7570->4109|7610->4123|7625->4129|7670->4153|7735->4191|7763->4192|7795->4197|7848->4223|7876->4224|7908->4229|7958->4252|7986->4253|8020->4260|8048->4261|8080->4266|8108->4267|8140->4272|8207->4312|8222->4318|8274->4349|8335->4383|8350->4389|8413->4431
                  LINES: 26->1|29->1|31->3|34->6|34->6|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|61->33|61->33|61->33|65->37|65->37|65->37|70->42|70->42|70->42|71->43|72->44|72->44|72->44|73->45|73->45|74->46|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73|102->74|102->74|102->74|105->77|105->77|106->78|107->79|107->79|107->79|110->82|110->82|111->83|112->84|112->84|113->85|114->86|114->86|115->87|115->87|116->88|116->88|117->89|119->91|119->91|119->91|120->92|120->92|120->92
                  -- GENERATED --
              */
          