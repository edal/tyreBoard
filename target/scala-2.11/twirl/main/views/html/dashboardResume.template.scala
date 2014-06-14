
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
import java.util.Calendar
/**/
object dashboardResume extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.1*/("""<!--BEGIN MAIN CONTENT-->
<div id="main" role="main">
    <div class="block">
        <div class="clearfix"></div>

            <!--page title-->
        <div class="pagetitle">
            <h1>Dashboard.</h1>
            <div class="btn-group">
                <button class="btn">Day</button>
                <button class="btn">Week</button>
                <button class="btn">Month</button>
            </div>
            <div class="clearfix"></div>
        </div>
            <!--page title end-->

            <!-- info-box -->
        <div class="info-box">
            <div class="row-fluid stats-box">
                <div class="span4">
                    <div class="stats-box-title">Contacts</div>
                    <div class="stats-box-all-info"><img src=""""),_display_(/*25.64*/routes/*25.70*/.Assets.at("images/icon/icon_vizitors_stats.png")),format.raw/*25.119*/("""" alt=""> 532</div>
                    <div class="wrap-chart"><div id="visitor-stat" class="chart"></div></div>
                </div>

                <div class="span4">
                    <div class="stats-box-title">Sales</div>
                    <div class="stats-box-all-info"><img src=""""),_display_(/*31.64*/routes/*31.70*/.Assets.at("images/icon/icon_like_stats.png")),format.raw/*31.115*/("""" alt=""> 35</div>
                    <div class="wrap-chart"><div id="order-stat" class="chart"></div></div>
                </div>

                <div class="span4">
                    <div class="stats-box-title">Sold Units</div>
                    <div class="stats-box-all-info"><img src=""""),_display_(/*37.64*/routes/*37.70*/.Assets.at("images/icon/icon_orders_stats.png")),format.raw/*37.117*/("""" alt=""> 5.400</div>
                    <div class="wrap-chart"><div id="user-stat" class="chart"></div></div>
                </div>
            </div>

            <div class="information-data">
                <div class="data">
                    <p class="date-figures">$231k</p>
                    <p class="date-title">Incomings</p>
                </div>
                <div class="data">
                    <p class="date-figures">$2.500</p>
                    <p class="date-title">Earnings</p>
                </div>
                <div class="data">
                    <p class="date-figures">15</p>
                    <p class="date-title">Open Issues</p>
                </div>
                <div class="data data-last">
                    <p class="date-figures">15</p>
                    <p class="date-title">In Transit</p>
                </div>
            </div>
        </div>
            <!-- info-box end -->

            <!--quick stats box-->
        <div class="grid-transparent row-fluid quick-stats-box">
            <div class="span3">
                <span>10</span> Over Seas
            </div>
            <div class="span3 red">
                <span>3</span> Stopped
            </div>
            <div class="span3 orange">
                <span>2</span> Waiting
            </div>
            <div class="span3 green">
                <span>20</span> Successful
            </div>
        </div>
        <div class="clearfix"></div>
            <!--quick stats box END-->

            <!--active users-->
        <div class="grid">
            <div class="grid-title">
                <div class="pull-left">
                    <div class="icon-title"><i class="icon-bar-chart"></i></div>
                    <span>Market Trend</span>
                    <div class="clearfix"></div>
                </div>
                <div class="pull-right">
                    <div class="icon-title"><a href="#"><i class="icon-refresh"></i></a></div>
                    <div class="icon-title"><a href="#"><i class="icon-user"></i></a></div>
                    <div class="icon-title"><a href="#"><i class="icon-cog"></i></a></div>
                </div>
                <div class="clearfix"></div>
            </div>

            <div class="grid-content overflow">
                <div id="activeUsers" class="chart-active"></div>
                <div class="clear"></div>
            </div>

            <div class="information-data-2">
                <div class="data">
                    <p class="date-figures">345</p>
                    <p class="date-title">UD</p>
                </div>
                <div class="data">
                    <p class="date-figures">54.5C</p>
                    <p class="date-title">UC</p>
                </div>
                <div class="data">
                    <p class="date-figures">120R</p>
                    <p class="date-title">UR</p>
                </div>
            </div>

            <div class="grid-content">
                <div class="clear"></div>
                <div class="dates-active">
                    <div class="input-append date">
                        <input class="input-date" size="16" type="text" value="12-02-2013">
                        <span class="add-on"><i class="icon-calendar"></i></span>
                    </div>
                    <div class="def">-</div>
                    <div class="input-append date">
                        <input class="input-date" size="16" type="text" value="12-02-2014">
                        <span class="add-on"><i class="icon-calendar"></i></span>
                    </div>
                </div>
                <div class="select-active">
                    <select class="chzn-select chosen_select"  >
                        <option value=""></option>
                        <option value="China<">China</option>
                        <option value="Egypt">Egypt</option>
                        <option value="Panama">Panama</option>
                    </select>

                </div>

                <div class="clearfix"></div>
            </div>

        </div>
            <!--active users END-->

        <div class="row-fluid">
                <!--visitor statistics-->
            <div class="grid span6">

                <div class="grid-title">
                    <div class="pull-left">
                        <div class="icon-title"><i class="icon-file"></i></div>
                        <span>Contacts Statistics</span>
                        <div class="clearfix"></div>
                    </div>
                    <div class="pull-right">
                        <div class="icon-title"><a href="#"><i class="icon-refresh"></i></a></div>
                        <div class="icon-title"><a href="#"><i class="icon-cog"></i></a></div>
                    </div>
                    <div class="clearfix"></div>
                </div>

                <div class="grid-content overflow">
                    <ul class="list-visitor">
                        <li><span class="linecustom">5,1,9,11,10,13,22,19</span>
                            Contacts:
                            <span class="number">532</span>
                        </li>
                        <li><span class="linecustom">0,12,0,11,18,13,22,19</span>
                            Unique Deal Contacts:
                            <span class="number">24</span>
                        </li>
                        <li><span class="linecustom">5,120,700,1100,1150,1400,2000,2104</span>
                            Offers send:
                            <span class="number">2104</span>
                        </li>
                        <li><span class="linecustom">0,12,0,11,18,13,22,19</span>
                            Bounce Rate: <span class="number">35%</span>
                        </li>
                        <li><span class="linecustom">1,32,4,11,28,73,42,59</span>
                            New Deals:
                            <span class="number">53.5%</span>
                        </li>
                    </ul>
                </div>

            </div>
                <!--visitor statistics END-->

                <!--friends-->
            <div class="grid span6">

                <div class="grid-title">
                    <div class="pull-left">
                        <div class="icon-title"><i class="icon-user"></i></div>
                        <span>Contacts Notes</span>
                        <div class="clearfix"></div>
                    </div>
                    <div class="pull-right">
                        <div class="icon-title"><a href="#"><i class="icon-plus"></i></a></div>
                        <div class="icon-title"><a href="#"><i class="icon-refresh"></i></a></div>
                        <div class="icon-title"><a href="#"><i class="icon-cog"></i></a></div>
                    </div>
                    <div class="clearfix"></div>
                </div>

                <div class="grid-content overflow">
                    <div class="friends">
                        <div class="friend">
                            <img src=""""),_display_(/*210.40*/routes/*210.46*/.Assets.at("images/avatar-11.png")),format.raw/*210.80*/("""" alt="" class="f-avatar">
                            <div class="f-actions">
                                <a href="#">Edit</a>
                            </div>
                            <div class="f-info">
                                <div class="f-name">Bobby Ginn</div>
                                <div class="f-text">Wants the XXX model at $Y</div>
                            </div>
                            <div class="clearfix"></div>
                        </div>

                        <div class="friend">
                            <img src=""""),_display_(/*222.40*/routes/*222.46*/.Assets.at("images/avatar-10.png")),format.raw/*222.80*/("""" alt="" class="f-avatar">
                            <div class="f-actions">
                                <a href="#">Unfriend</a>
                            </div>
                            <div class="f-info">
                                <div class="f-name">Bluroon</div>
                                <div class="f-text">Dark Side Trader, interesting offers</div>
                            </div>
                            <div class="clearfix"></div>
                        </div>

                        <div class="friend">
                            <img src=""""),_display_(/*234.40*/routes/*234.46*/.Assets.at("images/avatar-9.png")),format.raw/*234.79*/("""" alt="" class="f-avatar">
                            <div class="f-actions">
                                <a href="#">Unfriend</a>
                            </div>
                            <div class="f-info">
                                <div class="f-name">Tom Brenn...</div>
                                <div class="f-text">Call him July 7</div>
                            </div>
                            <div class="clearfix"></div>
                        </div>

                        <div class="friend">
                            <img src=""""),_display_(/*246.40*/routes/*246.46*/.Assets.at("images/avatar-8.png")),format.raw/*246.79*/("""" alt="" class="f-avatar">
                            <div class="f-actions">
                                <a href="#">Unfriend</a>
                            </div>
                            <div class="f-info">
                                <div class="f-name">Fabio Basile</div>
                                <div class="f-text">Health Problem</div>
                            </div>
                            <div class="clearfix"></div>
                        </div>

                    </div>
                    <div class="clearfix"></div>
                </div>

            </div>
                <!--friends END-->
        </div>

            <!--Informatin BOX 3-->
        <div class="information-box-3">
            <div class="item">
                <div class="box-info">
                    <img src=""""),_display_(/*269.32*/routes/*269.38*/.Assets.at("images/icon/stats_1.png")),format.raw/*269.75*/("""" alt="">
                    <div class="box-figures">345.23K</div>
                    <div class="box-title">1 256, 00 $</div>
                </div>
            </div>
            <div class="item">
                <div class="box-info">
                    <img src=""""),_display_(/*276.32*/routes/*276.38*/.Assets.at("images/icon/stats_2.png")),format.raw/*276.75*/("""" alt="">
                    <div class="box-figures">345.23K</div>
                    <div class="box-title">1 256, 00 $</div>
                </div>
            </div>
            <div class="item">
                <div class="box-info">
                    <img src=""""),_display_(/*283.32*/routes/*283.38*/.Assets.at("images/icon/stats_3.png")),format.raw/*283.75*/("""" alt="">
                    <div class="box-figures">345.23K</div>
                    <div class="box-title">1 256, 00 $</div>
                </div>
            </div>
        </div>
            <!--Informatin BOX 3 END-->

        <div class="row-fluid">
                <!--Twitter Widget-->
            <div class="grid span6">

                <div class="grid-title">
                    <div class="pull-left">
                        <div class="icon-title"><i class="icon-comments"></i></div>
                        <span>Twitter Widget</span>
                        <div class="clearfix"></div>
                    </div>
                    <div class="pull-right">
                        <div class="icon-title"><a href="#"><i class="icon-refresh"></i></a></div>
                        <div class="icon-title"><a href="#"><i class="icon-cog"></i></a></div>
                    </div>
                    <div class="clearfix"></div>
                </div>

                <div class="grid-content overflow">
                    <div class="friends">

                        <div class="friend">
                            <img src=""""),_display_(/*312.40*/routes/*312.46*/.Assets.at("images/avatar-14.png")),format.raw/*312.80*/("""" alt="" class="f-avatar">
                            <div class="f-info">
                                <div class="f-name">Maykel Loomans</div>
                                <div class="f-text">Cras sit amet nibh libero, in gravida nulla.</div>
                            </div>
                            <div class="t-foot">
                                <div class="t-date">23 hour ago.</div>
                                <div class="t-retweet"><a href="#"><i class="icon-share-alt"></i></a></div>
                            </div>
                            <div class="clearfix"></div>
                        </div>

                        <div class="friend">
                            <img src=""""),_display_(/*325.40*/routes/*325.46*/.Assets.at("images/avatar-13.png")),format.raw/*325.80*/("""" alt="" class="f-avatar">
                            <div class="f-info">
                                <div class="f-name">Bobby Giangeruso</div>
                                <div class="f-text">Cras sit amet nibh libero, in gravida nulla.</div>
                            </div>
                            <div class="t-foot">
                                <div class="t-date">23 hour ago.</div>
                                <div class="t-retweet"><a href="#"><i class="icon-share-alt"></i></a></div>
                            </div>
                            <div class="clearfix"></div>
                        </div>

                        <div class="friend">
                            <img src=""""),_display_(/*338.40*/routes/*338.46*/.Assets.at("images/avatar-12.png")),format.raw/*338.80*/("""" alt="" class="f-avatar">
                            <div class="f-info">
                                <div class="f-name">Simon Gustavsson</div>
                                <div class="f-text">Cras sit amet nibh libero, in gravida nulla.</div>
                            </div>
                            <div class="t-foot">
                                <div class="t-date">23 hour ago.</div>
                                <div class="t-retweet"><a href="#"><i class="icon-share-alt"></i></a></div>
                            </div>
                            <div class="clearfix"></div>
                        </div>

                    </div>
                </div>

            </div>
                <!--Twitter Widget END-->

                <!--Take Notes-->
            <div class="grid span6">

                <div class="grid-title">
                    <div class="pull-left">
                        <div class="icon-title"><i class="icon-time"></i></div>
                        <span>Take Notes</span>
                        <div class="clearfix"></div>
                    </div>
                    <div class="pull-right">
                        <div class="icon-title"><a href="#"><i class="icon-plus"></i></a></div>
                        <div class="icon-title"><a href="#"><i class="icon-refresh"></i></a></div>
                        <div class="icon-title"><a href="#"><i class="icon-trash"></i></a></div>
                    </div>
                    <div class="clearfix"></div>
                </div>

                <div class="grid-content padding-none">
                    <div class="notes">

                            <!---->
                        <div class="note">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Clean the house</div>
                            <div class="note-date">Today</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note no-done">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Take out the trash</div>
                            <div class="note-date">5.00AM</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Do the dlishes</div>
                            <div class="note-date blue">12 May</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Feed the dog</div>
                            <div class="note-date blue">15 May</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note  no-done">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Mow the lawn</div>
                            <div class="note-date orange">21 May</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note  no-done">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Clean the pool</div>
                            <div class="note-date green">24 May</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note  no-done">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Take out the trash</div>
                            <div class="note-date green">28 May</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Clean the house</div>
                            <div class="note-date">Today</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note no-done">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Take out the trash</div>
                            <div class="note-date">5.00AM</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Do the dlishes</div>
                            <div class="note-date blue">12 May</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Feed the dog</div>
                            <div class="note-date blue">15 May</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note  no-done">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Mow the lawn</div>
                            <div class="note-date orange">21 May</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->
                        <div class="note  no-done">
                            <div class="note-status"><i class="note-done"></i></div>
                            <div class="note-name">Clean the pool</div>
                            <div class="note-date green">24 May</div>
                            <div class="clearfix"></div>
                        </div>
                            <!---->

                    </div>
                    <div class="clearfix"></div>
                </div>

            </div>
                <!--Take Notes END-->
        </div>

            <!--Process Box-->
        <div class="process-box">
            <div class="row-fluid">

                <div class="span3 process-name">
                    <i class="icon-upload-alt"></i> Stock Arrival
                </div>
                <div class="span6 info">
                  There are new Stock Units being introduced in the system
                    <div class="process-progress"> <div class="advance blue" style="width:46%"></div> </div>
                </div>
                <div class="span3">
                    <a href="#" class="process-action blue">View</a>
                </div>

            </div>
            <div class="clearfix"></div>
        </div>
            <!--Process Box END-->

            <!--Process Box
        <div class="process-box">
            <div class="row-fluid">

                <div class="span3 process-name">
                    <i class="icon-trash"></i> Delete.
                </div>
                <div class="span6 info">
                  This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet.
                    <div class="process-progress"> <div class="advance red" style="width:46%"></div> </div>
                </div>
                <div class="span3">
                    <a href="#" class="process-action red">Cancel</a>
                </div>

            </div>
            <div class="clearfix"></div>
        </div>-->
            <!--Process Box END-->

            <!--Process Box
        <div class="process-box">
            <div class="row-fluid">

                <div class="span3 process-name">
                    <i class="icon-globe"></i> Update.
                </div>
                <div class="span6 info">
                  This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet.
                    <div class="process-progress"> <div class="advance green" style="width:46%"></div> </div>
                </div>
                <div class="span3">
                    <a href="#" class="process-action green">Cancel</a>
                </div>

            </div>
            <div class="clearfix"></div>
        </div>-->
            <!--Process Box END-->

            <!--BEGIN FOOTER-->
        <div class="footer">
            <div class="left">TyreBoard &copy; """),_display_(/*539.49*/Calendar/*539.57*/.getInstance().get(Calendar.YEAR)),format.raw/*539.90*/("""</div>
            <div class="clearfix"></div>
        </div>
            <!--BEGIN FOOTER END-->

        <div class="clearfix"></div>
    </div><!--end .block-->
</div>
<!--MAIN CONTENT END-->
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 15 01:23:12 CEST 2014
                  SOURCE: /Users/ealcala/Documents/SoftwareDev/playFramework/workspace/tyreBoard/app/views/dashboardResume.scala.html
                  HASH: d8a410e77e0f50e8d7013fbc4570f18f36fdd3dd
                  MATRIX: 833->28|1636->804|1651->810|1722->859|2047->1157|2062->1163|2129->1208|2456->1508|2471->1514|2540->1561|9771->8764|9787->8770|9843->8804|10448->9381|10464->9387|10520->9421|11137->10010|11153->10016|11208->10049|11809->10622|11825->10628|11880->10661|12743->11496|12759->11502|12818->11539|13119->11812|13135->11818|13194->11855|13495->12128|13511->12134|13570->12171|14753->13326|14769->13332|14825->13366|15576->14089|15592->14095|15648->14129|16401->14854|16417->14860|16473->14894|25866->24259|25884->24267|25939->24300
                  LINES: 29->3|51->25|51->25|51->25|57->31|57->31|57->31|63->37|63->37|63->37|236->210|236->210|236->210|248->222|248->222|248->222|260->234|260->234|260->234|272->246|272->246|272->246|295->269|295->269|295->269|302->276|302->276|302->276|309->283|309->283|309->283|338->312|338->312|338->312|351->325|351->325|351->325|364->338|364->338|364->338|565->539|565->539|565->539
                  -- GENERATED --
              */
          