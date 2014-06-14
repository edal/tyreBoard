
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
object header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*3.1*/("""<!--BEGIN HEADER-->
<div id="header" role="banner">
    <a id="menu-link" class="head-button-link menu-hide" href="#menu">
        <span>Menu</span>
    </a>
        <!--Logo--><a href="#" class="logo"><h1>TyreBoard</h1></a><!--Logo END-->



    <!--Search-->
    <form class="search" action="#">
        <input type="text" name="q" placeholder="Search...">
    </form>
        <!--Search END-->

    <div class="right">

            <!--message box-->
        <div class="dropdown left">

            <a class="dropdown-toggle head-button-link" data-toggle="dropdown" href="#"><span class="notice-new">1</span></a>

            <div class="dropdown-menu pull-right messages-list">
                <div class="triangle"></div>

                <div class="notice-title">"""),_display_(/*28.44*/Messages("header.gotMessages", 1)),format.raw/*28.77*/("""</div>
                    <!--message #1-->
                <div class="notice-message">
                    <a href="#" class="box">
                        <div class="avatar"><img src=""""),_display_(/*32.56*/routes/*32.62*/.Assets.at("images/avatar-2.png")),format.raw/*32.95*/("""" alt=""></div>
                        <div class="info">
                            <div class="author">Rash Tardin</div>
                            <div class="date">Jun 14, 2014</div>
                            <div class="clearfix"></div>
                            <div class="text">This is Premium version of RoadMapperX, 400units at $X. Proin gravida nibh vel velit.</div>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>


                <a href="#" class="notice-more">"""),_display_(/*44.50*/Messages("header.viewMessages")),format.raw/*44.81*/("""</a>
            </div>
        </div>
            <!--message box end-->

            <!--notification box-->
        <div class="dropdown left">
            <a class="dropdown-toggle head-button-link notification" data-toggle="dropdown" href="#"><span class="notice-new">2</span></a>

            <div class="dropdown-menu pull-right messages-list">
                <div class="triangle"></div>

                <div class="notice-title">"""),_display_(/*56.44*/Messages("header.gotNotifications", 2)),format.raw/*56.82*/("""</div>
                    <!--message #1-->
                <div class="notice-message">
                    <a href="#" class="box">
                        <div class="avatar"><img src=""""),_display_(/*60.56*/routes/*60.62*/.Assets.at("images/avatar-5.png")),format.raw/*60.95*/("""" alt=""></div>
                        <div class="info">
                            <div class="author">Jonas Anderson</div>
                            <div class="date">3 hours ago</div>
                            <div class="clearfix"></div>
                            <div class="text">Followed <span class="follow-link">Dennis Salvatier</span></div>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>
                    <!--message #2-->
                <div class="notice-message">
                    <a href="#" class="box">
                        <div class="avatar"><img src=""""),_display_(/*73.56*/routes/*73.62*/.Assets.at("images/avatar-6.png")),format.raw/*73.95*/("""" alt=""></div>
                        <div class="info">
                            <div class="author">Ilias Sounas</div>
                            <div class="date">19 hours ago</div>
                            <div class="clearfix"></div>
                            <div class="text">Commented on <span class="comment-link">Angry Cloud</span></div>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>
                    <!--message #3-->
                <div class="notice-message">
                    <a href="#" class="box">
                        <div class="avatar"><img src=""""),_display_(/*86.56*/routes/*86.62*/.Assets.at("images/avatar-7.png")),format.raw/*86.95*/("""" alt=""></div>
                        <div class="info">
                            <div class="author">Erin Hunting</div>
                            <div class="date">19 hours ago</div>
                            <div class="clearfix"></div>
                            <div class="text">Liked <span class="like-link">Overnight work</span></div>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>

                <a href="#" class="notice-more">"""),_display_(/*97.50*/Messages("header.viewNotifications")),format.raw/*97.86*/("""</a>
            </div>
        </div>
            <!--notification box end-->

            <!--config box
        <div class="dropdown left">
            <a class="dropdown-toggle head-button-link config" data-toggle="dropdown" href="#"></a>
            <div class="dropdown-menu pull-right settings-box">
                <div class="triangle-2"></div>

                <a href="javascript:chooseStyle('none', 30)" class="settings-link"></a>
                <a href="javascript:chooseStyle('blue-theme', 30)" class="settings-link blue"></a>
                <a href="javascript:chooseStyle('green-theme', 30)" class="settings-link green"></a>
                <a href="javascript:chooseStyle('purple-theme', 30)" class="settings-link purple"></a>
                <a href="javascript:chooseStyle('orange-theme', 30)" class="settings-link yellow"></a>
                <a href="javascript:chooseStyle('red-theme', 30)" class="settings-link red"></a>
                <div class="clearfix"></div>
            </div>
        </div>-->
            <!--config box end-->

            <!--profile box-->
        <div class="dropdown left profile">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <span class="double-spacer"></span>
                <div class="profile-avatar"><img src=""""),_display_(/*123.56*/routes/*123.62*/.Assets.at("images/avatar.png")),format.raw/*123.93*/("""" alt=""></div>
                <div class="profile-username"><span>"""),_display_(/*124.54*/Messages("header.welcome")),format.raw/*124.80*/("""</span> """),_display_(/*124.89*/user/*124.93*/.username),format.raw/*124.102*/(""" """),format.raw/*124.103*/("""("""),_display_(/*124.105*/user/*124.109*/.name),format.raw/*124.114*/(""")</div>
                <div class="profile-caret"> <span class="caret"></span></div>
                <span class="double-spacer"></span>
            </a>
            <div class="dropdown-menu pull-right profile-box">
                <div class="triangle-3"></div>

                <ul class="profile-navigation">
                    <li><a href="#"><i class="icon-user"></i> """),_display_(/*132.64*/Messages("header.profile")),format.raw/*132.90*/("""</a></li>
                    <li><a href="#"><i class="icon-cog"></i> """),_display_(/*133.63*/Messages("header.settings")),format.raw/*133.90*/("""</a></li>
                    <li><a href="#"><i class="icon-info-sign"></i> """),_display_(/*134.69*/Messages("header.help")),format.raw/*134.92*/("""</a></li>
                    <li><a href="index.html"><i class="icon-off"></i> """),_display_(/*135.72*/Messages("header.logout")),format.raw/*135.97*/("""</a></li>
                </ul>
            </div>
        </div>
        <div class="clearfix"></div>
            <!--profile box end-->

    </div>


</div>
<!--END HEADER-->"""))}
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 15 00:05:06 CEST 2014
                  SOURCE: /Users/ealcala/Documents/SoftwareDev/playFramework/workspace/tyreBoard/app/views/header.scala.html
                  HASH: 88ead42ccc1074742646353f61626df6e8592b42
                  MATRIX: 722->1|822->13|850->15|1649->787|1703->820|1920->1010|1935->1016|1989->1049|2584->1617|2636->1648|3104->2089|3163->2127|3380->2317|3395->2323|3449->2356|4151->3031|4166->3037|4220->3070|4921->3744|4936->3750|4990->3783|5551->4317|5608->4353|6953->5670|6969->5676|7022->5707|7119->5776|7167->5802|7204->5811|7218->5815|7250->5824|7281->5825|7312->5827|7327->5831|7355->5836|7760->6213|7808->6239|7908->6311|7957->6338|8063->6416|8108->6439|8217->6520|8264->6545
                  LINES: 26->1|29->1|31->3|56->28|56->28|60->32|60->32|60->32|72->44|72->44|84->56|84->56|88->60|88->60|88->60|101->73|101->73|101->73|114->86|114->86|114->86|125->97|125->97|151->123|151->123|151->123|152->124|152->124|152->124|152->124|152->124|152->124|152->124|152->124|152->124|160->132|160->132|161->133|161->133|162->134|162->134|163->135|163->135
                  -- GENERATED --
              */
          