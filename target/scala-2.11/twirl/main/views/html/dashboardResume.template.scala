
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
object dashboardResume extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!--BEGIN MAIN CONTENT-->
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
                    <div class="stats-box-title">Vizitor</div>
                    <div class="stats-box-all-info"><img src="images/icon/icon_vizitors_stats.png" alt=""> 365K</div>
                    <div class="wrap-chart"><div id="visitor-stat" class="chart"></div></div>
                </div>

                <div class="span4">
                    <div class="stats-box-title">Likes</div>
                    <div class="stats-box-all-info"><img src="images/icon/icon_like_stats.png" alt=""> 35.00</div>
                    <div class="wrap-chart"><div id="order-stat" class="chart"></div></div>
                </div>

                <div class="span4">
                    <div class="stats-box-title">Orders</div>
                    <div class="stats-box-all-info"><img src="images/icon/icon_orders_stats.png" alt=""> 1.234</div>
                    <div class="wrap-chart"><div id="user-stat" class="chart"></div></div>
                </div>
            </div>

            <div class="information-data">
                <div class="data">
                    <p class="date-figures">935</p>
                    <p class="date-title">Tikets</p>
                </div>
                <div class="data">
                    <p class="date-figures">2316$</p>
                    <p class="date-title">Earnings</p>
                </div>
                <div class="data">
                    <p class="date-figures">165</p>
                    <p class="date-title">Comments</p>
                </div>
                <div class="data data-last">
                    <p class="date-figures">95%</p>
                    <p class="date-title">Updates</p>
                </div>
            </div>
        </div>
            <!-- info-box end -->

            <!--quick stats box-->
        <div class="grid-transparent row-fluid quick-stats-box">
            <div class="span3">
                <span>21</span> twetts
            </div>
            <div class="span3 red">
                <span>11</span> COMMENTS
            </div>
            <div class="span3 orange">
                <span>28</span> photos
            </div>
            <div class="span3 green">
                <span>51</span> followerss
            </div>
        </div>
        <div class="clearfix"></div>
            <!--quick stats box END-->

            <!--active users-->
        <div class="grid">
            <div class="grid-title">
                <div class="pull-left">
                    <div class="icon-title"><i class="icon-bar-chart"></i></div>
                    <span>Active Users</span>
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
                    <p class="date-title">User Download</p>
                </div>
                <div class="data">
                    <p class="date-figures">54.5C</p>
                    <p class="date-title">User Download</p>
                </div>
                <div class="data">
                    <p class="date-figures">120R</p>
                    <p class="date-title">User Download</p>
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
                        <option value="United States">United States</option>
                        <option value="United Kingdom">United Kingdom</option>
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
                        <span>Visitor Statistics</span>
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
                        <li><span class="linecustom">0,12,0,11,18,13,22,19</span>
                            Visits:
                            <span class="number">356</span>
                        </li>
                        <li><span class="linecustom">0,12,0,11,18,13,22,19</span>
                            Unique Visitors:
                            <span class="number">24</span>
                        </li>
                        <li><span class="linecustom">0,12,0,11,18,13,22,19</span>
                            Pageviews:
                            <span class="number">2104</span>
                        </li>
                        <li><span class="linecustom">0,12,0,11,18,13,22,19</span>
                            Bounce Rate: <span class="number">35%</span>
                        </li>
                        <li><span class="linecustom">0,12,0,11,18,13,22,19</span>
                            New Visits:
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
                        <span>Friends</span>
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
                            <img src="images/avatar-11.png" alt="" class="f-avatar">
                            <div class="f-actions">
                                <a href="#">Unfriend</a>
                            </div>
                            <div class="f-info">
                                <div class="f-name">Bobby Ginn</div>
                                <div class="f-text">Pro Cookies Eanter</div>
                            </div>
                            <div class="clearfix"></div>
                        </div>

                        <div class="friend">
                            <img src="images/avatar-10.png" alt="" class="f-avatar">
                            <div class="f-actions">
                                <a href="#">Unfriend</a>
                            </div>
                            <div class="f-info">
                                <div class="f-name">Bluroon</div>
                                <div class="f-text">Dark UI Kit</div>
                            </div>
                            <div class="clearfix"></div>
                        </div>

                        <div class="friend">
                            <img src="images/avatar-9.png" alt="" class="f-avatar">
                            <div class="f-actions">
                                <a href="#">Unfriend</a>
                            </div>
                            <div class="f-info">
                                <div class="f-name">Tom Brenn...</div>
                                <div class="f-text">Simple</div>
                            </div>
                            <div class="clearfix"></div>
                        </div>

                        <div class="friend">
                            <img src="images/avatar-8.png" alt="" class="f-avatar">
                            <div class="f-actions">
                                <a href="#">Unfriend</a>
                            </div>
                            <div class="f-info">
                                <div class="f-name">Fabio Basile</div>
                                <div class="f-text">Updated</div>
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
                    <img src="images/icon/stats_1.png" alt="">
                    <div class="box-figures">345.23K</div>
                    <div class="box-title">1 256, 00 $</div>
                </div>
            </div>
            <div class="item">
                <div class="box-info">
                    <img src="images/icon/stats_2.png" alt="">
                    <div class="box-figures">345.23K</div>
                    <div class="box-title">1 256, 00 $</div>
                </div>
            </div>
            <div class="item">
                <div class="box-info">
                    <img src="images/icon/stats_3.png" alt="">
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
                            <img src="images/avatar-14.png" alt="" class="f-avatar">
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
                            <img src="images/avatar-13.png" alt="" class="f-avatar">
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
                            <img src="images/avatar-12.png" alt="" class="f-avatar">
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
                            <div class="clearfix"></di"""),
format.raw("""v>
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
                    <i class="icon-upload-alt"></i> Download.
                </div>
                <div class="span6 info">
                  This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet.
                    <div class="process-progress"> <div class="advance blue" style="width:46%"></div> </div>
                </div>
                <div class="span3">
                    <a href="#" class="process-action blue">Cancel</a>
                </div>

            </div>
            <div class="clearfix"></div>
        </div>
            <!--Process Box END-->

            <!--Process Box-->
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
        </div>
            <!--Process Box END-->

            <!--Process Box-->
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
        </div>
            <!--Process Box END-->

            <!--BEGIN FOOTER-->
        <div class="footer">
            <div class="left">Copyright &copy; 2013</div>
            <div class="right"><a href="#">Buy Template</a></div>
            <div class="clearfix"></div>
        </div>
            <!--BEGIN FOOTER END-->

        <div class="clearfix"></div>
    </div><!--end .block-->
</div>
<!--MAIN CONTENT END-->"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jun 14 23:17:49 CEST 2014
                  SOURCE: /Users/ealcala/Documents/SoftwareDev/playFramework/workspace/tyreBoard/app/views/dashboardResume.scala.html
                  HASH: 70c94191fd66d174bc115af9c917d76b51d7389a
                  MATRIX: 808->0
                  LINES: 29->1
                  -- GENERATED --
              */
          