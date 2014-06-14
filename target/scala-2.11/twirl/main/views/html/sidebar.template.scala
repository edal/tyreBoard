
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
object sidebar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!--BEGIN SIDEBAR-->
<div id="menu" role="navigation">

    <ul class="main-menu">
        <li class="active"><a href="dashboard.html"><i class="general"></i> General</a></li>
        <li><a href="ui.html"><i class="components"></i> Worklog</a></li>
        <li><a href="forms.html"><i class="forms"></i> Forms</a></li>
        <li><a href="typo.html"><i class="pages"></i> Pages</a></li>
        <li><a href="charts.html"><i class="statistics"></i> Statistics</a></li>
        <li><a href="tables.html"><i class="tables"></i> Reports</a></li>
        <li><a href="contacts.html"><i class="bonus"></i> Bonus</a></li>
    </ul>

    <ul class="additional-menu">
        <li class="active"><a href="dashboard.html"><i class="icon-home"></i> Dashboard</a></li>
        <li><a href="gallery.html"><i class="icon-picture"></i> Product gallery</a></li>
        <li><a href="icons.html"><i class="icon-star"></i> Favorites</a></li>
        <li><a href="calendar.html"><i class="icon-calendar"></i> Calendar</a></li>
    </ul>

        <!--New Files-->
    <div class="new-files">
        <div class="title">New Files</div>

        <div class="files">
            <div class="file">
                <div class="file-format"><img src=""""),_display_(/*27.53*/routes/*27.59*/.Assets.at("images/icon/file_pdf.png")),format.raw/*27.97*/("""" alt=""></div>
                <div class="file-info">
                    <div class="file-name">Offer.pdf <a href="#"><i class="icon-remove"></i></a></div>
                    <div class="file-date">Juny 14, 2014</div>
                </div>
            </div>
            <div class="file">
                <div class="file-format"><img src=""""),_display_(/*34.53*/routes/*34.59*/.Assets.at("images/icon/file_doc.png")),format.raw/*34.97*/("""" alt=""></div>
                <div class="file-info">
                    <div class="file-name">Indications.doc <a href="#"><i class="icon-remove"></i></a></div>
                    <div class="file-date">Juny 14, 2014</div>
                </div>
            </div>
            <div class="file">
                <div class="file-format"><img src=""""),_display_(/*41.53*/routes/*41.59*/.Assets.at("images/icon/file_jpg.png")),format.raw/*41.97*/("""" alt=""></div>
                <div class="file-info">
                    <div class="file-name">TyreFailure.jpg <a href="#"><i class="icon-remove"></i></a></div>
                    <div class="file-date">Juny 12, 2014</div>
                </div>
            </div>
            <div class="file">
                <div class="file-format"><img src=""""),_display_(/*48.53*/routes/*48.59*/.Assets.at("images/icon/file_xls.png")),format.raw/*48.97*/("""" alt=""></div>
                <div class="file-info">
                    <div class="file-name">New units.xls <a href="#"><i class="icon-remove"></i></a></div>
                    <div class="file-date">Juny 11, 2014</div>
                </div>
            </div>
            <div class="file">
                <div class="file-format"><img src=""""),_display_(/*55.53*/routes/*55.59*/.Assets.at("images/icon/file_zip.png")),format.raw/*55.97*/("""" alt=""></div>
                <div class="file-info">
                    <div class="file-name">Catalogue.zip <a href="#"><i class="icon-remove"></i></a></div>
                    <div class="file-date">Juny 10, 2014</div>
                </div>
            </div>
            <div class="file">
                <div class="file-format"><img src=""""),_display_(/*62.53*/routes/*62.59*/.Assets.at("images/icon/file_txt.png")),format.raw/*62.97*/("""" alt=""></div>
                <div class="file-info">
                    <div class="file-name">MeetingNotes.txt <a href="#"><i class="icon-remove"></i></a></div>
                    <div class="file-date">Juny 05, 2014</div>
                </div>
            </div>

        </div>
    </div>
        <!--New Files END-->

        <!--Upload Box-->
    <div class="upload-box">Drop files <br> here to upload</div>
        <!--Upload Box END-->

        <!--Media Files
    <div class="media-files">
        <div class="title">Media Files</div>
        <p>This is Photoshop's version  of Lorem Ipsum.</p>

        <div class="media-files-info-box">
            <i class="icon-picture"></i> Photo <strong>35%</strong>
            <div class="process-progress"> <div class="advance red" style="width:35%"></div> </div>
        </div>
        <div class="media-files-info-box">
            <i class="icon-facetime-video"></i> Video <strong>43%</strong>
            <div class="process-progress"> <div class="advance blue" style="width:43%"></div> </div>
        </div>
        <div class="media-files-info-box">
            <i class="icon-music"></i> Audio <strong>23%</strong>
            <div class="process-progress"> <div class="advance green" style="width:23%"></div> </div>
        </div>
    </div>
    -->
        <!--Media Files END-->

        <!--Add New Widget
    <a href="#" class="add-widget-link">Add New Widget</a>
    -->
        <!--Add New Widget END-->

    <div class="clearfix"></div>


</div>
<!--SIDEBAR END-->"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 15 01:29:33 CEST 2014
                  SOURCE: /Users/ealcala/Documents/SoftwareDev/playFramework/workspace/tyreBoard/app/views/sidebar.scala.html
                  HASH: 01d7af52628efad47b65b9def7f0ceaeef9361d5
                  MATRIX: 800->0|2055->1228|2070->1234|2129->1272|2503->1619|2518->1625|2577->1663|2957->2016|2972->2022|3031->2060|3411->2413|3426->2419|3485->2457|3863->2808|3878->2814|3937->2852|4315->3203|4330->3209|4389->3247
                  LINES: 29->1|55->27|55->27|55->27|62->34|62->34|62->34|69->41|69->41|69->41|76->48|76->48|76->48|83->55|83->55|83->55|90->62|90->62|90->62
                  -- GENERATED --
              */
          