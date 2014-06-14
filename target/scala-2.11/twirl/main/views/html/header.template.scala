
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

                <div class="notice-title">"""),_display_(/*25.44*/Messages("header.gotMessages", 1)),format.raw/*25.77*/("""</div>
                    <!--message #1-->
                <div class="notice-message">
                    <a href="#" class="box">
                        <div class="avatar"><img src=""""),_display_(/*29.56*/routes/*29.62*/.Assets.at("images/avatar-2.png")),format.raw/*29.95*/("""" alt=""></div>
                        <div class="info">
                            <div class="author">Csaba Gyulai</div>
                            <div class="date">Jun 14, 2014</div>
                            <div class="clearfix"></div>
                            <div class="text">This is Premium version  of RoadMapperX. Proin gravida nibh vel velit.</div>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>


                <a href="#" class="notice-more">"""),_display_(/*41.50*/Messages("header.viewMessages")),format.raw/*41.81*/("""</a>
            </div>
        </div>
            <!--message box end-->

            <!--notification box-->
        <div class="dropdown left">
            <a class="dropdown-toggle head-button-link notification" data-toggle="dropdown" href="#"><span class="notice-new">2</span></a>

            <div class="dropdown-menu pull-right messages-list">
                <div class="triangle"></div>

                <div class="notice-title">"""),_display_(/*53.44*/Messages("header.gotNotifications", 2)),format.raw/*53.82*/("""</div>
                    <!--message #1-->
                <div class="notice-message">
                    <a href="#" class="box">
                        <div class="avatar"><img src=""""),_display_(/*57.56*/routes/*57.62*/.Assets.at("images/avatar-5.png")),format.raw/*57.95*/("""" alt=""></div>
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
                        <div class="avatar"><img src=""""),_display_(/*70.56*/routes/*70.62*/.Assets.at("images/avatar-6.png")),format.raw/*70.95*/("""" alt=""></div>
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
                        <div class="avatar"><img src=""""),_display_(/*83.56*/routes/*83.62*/.Assets.at("images/avatar-7.png")),format.raw/*83.95*/("""" alt=""></div>
                        <div class="info">
                            <div class="author">Erin Hunting</div>
                            <div class="date">19 hours ago</div>
                            <div class="clearfix"></div>
                            <div class="text">Liked <span class="like-link">Overnight work</span></div>
                        </div>
                        <div class="clearfix"></div>
                    </a>
                </div>

                <a href="#" class="notice-more">"""),_display_(/*94.50*/Messages("header.viewNotifications")),format.raw/*94.86*/("""</a>
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
                <div class="profile-avatar"><img src=""""),_display_(/*120.56*/routes/*120.62*/.Assets.at("images/avatar.png")),format.raw/*120.93*/("""" alt=""></div>
                <div class="profile-username"><span>"""),_display_(/*121.54*/Messages("header.welcome")),format.raw/*121.80*/("""</span> """),_display_(/*121.89*/user/*121.93*/.username),format.raw/*121.102*/(""" """),format.raw/*121.103*/("""("""),_display_(/*121.105*/user/*121.109*/.name),format.raw/*121.114*/(""")</div>
                <div class="profile-caret"> <span class="caret"></span></div>
                <span class="double-spacer"></span>
            </a>
            <div class="dropdown-menu pull-right profile-box">
                <div class="triangle-3"></div>

                <ul class="profile-navigation">
                    <li><a href="#"><i class="icon-user"></i> """),_display_(/*129.64*/Messages("header.profile")),format.raw/*129.90*/("""</a></li>
                    <li><a href="#"><i class="icon-cog"></i> """),_display_(/*130.63*/Messages("header.settings")),format.raw/*130.90*/("""</a></li>
                    <li><a href="#"><i class="icon-info-sign"></i> """),_display_(/*131.69*/Messages("header.help")),format.raw/*131.92*/("""</a></li>
                    <li><a href="index.html"><i class="icon-off"></i> """),_display_(/*132.72*/Messages("header.logout")),format.raw/*132.97*/("""</a></li>
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
                  DATE: Sat Jun 14 23:00:15 CEST 2014
                  SOURCE: /Users/ealcala/Documents/SoftwareDev/playFramework/workspace/tyreBoard/app/views/header.scala.html
                  HASH: 59e54dcffe242779b6aa09c490fd5af107fe58f9
                  MATRIX: 722->1|822->13|850->15|1543->681|1597->714|1814->904|1829->910|1883->943|2464->1497|2516->1528|2984->1969|3043->2007|3260->2197|3275->2203|3329->2236|4031->2911|4046->2917|4100->2950|4801->3624|4816->3630|4870->3663|5431->4197|5488->4233|6833->5550|6849->5556|6902->5587|6999->5656|7047->5682|7084->5691|7098->5695|7130->5704|7161->5705|7192->5707|7207->5711|7235->5716|7640->6093|7688->6119|7788->6191|7837->6218|7943->6296|7988->6319|8097->6400|8144->6425
                  LINES: 26->1|29->1|31->3|53->25|53->25|57->29|57->29|57->29|69->41|69->41|81->53|81->53|85->57|85->57|85->57|98->70|98->70|98->70|111->83|111->83|111->83|122->94|122->94|148->120|148->120|148->120|149->121|149->121|149->121|149->121|149->121|149->121|149->121|149->121|149->121|157->129|157->129|158->130|158->130|159->131|159->131|160->132|160->132
                  -- GENERATED --
              */
          