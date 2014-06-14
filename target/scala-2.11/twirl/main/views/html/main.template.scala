
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
        """),format.raw/*53.75*/("""
        """),format.raw/*54.79*/("""
        """),format.raw/*55.85*/("""
        """),format.raw/*56.82*/("""
        """),format.raw/*57.86*/("""
        """),format.raw/*58.9*/("""<script src=""""),_display_(/*58.23*/routes/*58.29*/.Assets.at("js/graphtable.js")),format.raw/*58.59*/(""""></script>
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
        """),format.raw/*75.75*/("""
        """),format.raw/*76.86*/("""
    """),format.raw/*77.5*/("""</body>
</html>
"""))}
  }

  def render(user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(user)(content)

  def f:((User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user) => (content) => apply(user)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jun 14 23:04:36 CEST 2014
                  SOURCE: /Users/ealcala/Documents/SoftwareDev/playFramework/workspace/tyreBoard/app/views/main.scala.html
                  HASH: 85973afdcf3b379b5b8c246276dffb92480e1a35
                  MATRIX: 725->1|840->28|868->30|972->108|1018->134|1252->341|1267->347|1315->374|1379->411|1394->417|1446->448|1528->503|1543->509|1609->554|1691->609|1706->615|1761->649|1842->703|1857->709|1906->737|1986->790|2001->796|2056->830|2120->867|2135->873|2191->908|2255->945|2270->951|2323->983|2387->1020|2402->1026|2468->1071|2549->1125|2564->1131|2624->1170|2688->1207|2703->1213|2766->1255|3145->1607|3160->1613|3206->1638|3347->1752|3362->1758|3408->1783|3468->1816|3483->1822|3517->1835|3553->1844|3609->1873|3625->1880|3655->1889|3696->1903|3724->1910|3760->1919|3894->2026|3909->2032|3960->2062|4021->2096|4036->2102|4090->2135|4151->2169|4166->2175|4220->2208|4281->2242|4296->2248|4366->2297|4414->2383|4451->2462|4488->2547|4525->2629|4562->2715|4598->2724|4639->2738|4654->2744|4705->2774|4766->2808|4781->2814|4838->2850|4899->2884|4914->2890|4972->2927|5033->2961|5048->2967|5110->3008|5171->3042|5186->3048|5241->3082|5302->3116|5317->3122|5381->3165|5442->3199|5457->3205|5519->3246|5580->3280|5595->3286|5652->3322|5713->3356|5728->3362|5788->3401|5849->3435|5864->3441|5922->3478|5983->3512|5998->3518|6057->3556|6118->3590|6133->3596|6180->3622|6241->3656|6256->3662|6310->3695|6371->3729|6386->3735|6435->3763|6496->3797|6511->3803|6572->3843|6633->3877|6648->3883|6702->3916|6763->3950|6778->3956|6842->3999|6913->4108|6950->4194|6982->4199
                  LINES: 26->1|29->1|31->3|34->6|34->6|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|61->33|61->33|61->33|65->37|65->37|65->37|70->42|70->42|70->42|71->43|72->44|72->44|72->44|73->45|73->45|74->46|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|81->53|82->54|83->55|84->56|85->57|86->58|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73|102->74|102->74|102->74|103->75|104->76|105->77
                  -- GENERATED --
              */
          