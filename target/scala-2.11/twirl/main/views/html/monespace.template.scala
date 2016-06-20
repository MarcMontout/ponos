
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object monespace_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class monespace extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Mon espace")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

	"""),format.raw/*5.2*/("""<!DOCTYPE html>
<html>
<head>
<title>Mon Espace Elève</title>

    <link href=""""),_display_(/*10.18*/routes/*10.24*/.Assets.at("Stylesheets/monespace.css")),format.raw/*10.63*/("""" rel="stylesheet" type='text/css'>
    
    <link href=""""),_display_(/*12.18*/routes/*12.24*/.Assets.at("Stylesheets/monespace-responsive.css")),format.raw/*12.74*/("""" rel="stylesheet" type='text/css'>
    
</head>

<body>
    <div class="container">
      <div class="page-header">
        <h2>Mon espace personnel</h2>
      </div>
      <div class="row-fluid pricing-table pricing-three-column">
        <div class="span4 plan">
          <div class="plan-name">
            <h2>Mes anciens QCM</h2>
            <span></span>
          </div>
          <ul>
            <li class="plan-feature">Mathématiques</li>
            <li class="plan-feature">Sciences Fondamentales</li>
            <li class="plan-feature">Informatique</li>
            <li class="plan-feature">Electronique</li>
            <li class="plan-feature">Réseaux (Cisco)</li>
            <li class="plan-feature">Télécommunications</li>
            <li class="plan-feature"><a href=""""),_display_(/*34.48*/routes/*34.54*/.Application.ancienqcm()),format.raw/*34.78*/("""" class="btn btn-success btn-plan-select">Select</a></li>
          </ul>
        </div><br>
   
        <div class="span4 plan">
          <div class="plan-name">
            <h2>S'entrainer</h2>
            <span>Générer des nouveaux QCM</span>
          </div>
          <ul>
            <li class="plan-feature">Mathématiques</li>
            <li class="plan-feature">Sciences Fondamentales</li>
            <li class="plan-feature">Informatique</li>
            <li class="plan-feature">Electronique</li>
            <li class="plan-feature">Réseaux (Cisco)</li>
            <li class="plan-feature">Télécommunications</li>
            <li class="plan-feature"><a href=""""),_display_(/*50.48*/routes/*50.54*/.Application.entrainer()),format.raw/*50.78*/("""" class="btn btn-success btn-plan-select">Select</a></li>
          </ul>
        </div>
      </div>
	</div><br>
   	
</body>
</html>
    
""")))}),format.raw/*59.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object monespace extends monespace_Scope0.monespace
              /*
                  -- GENERATED --
                  DATE: Tue Jun 21 00:43:08 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/monespace.scala.html
                  HASH: d4f771fb7ede6339644a53fc79a5f30be229c741
                  MATRIX: 753->1|865->18|895->23|921->41|960->43|991->48|1103->133|1118->139|1178->178|1265->238|1280->244|1351->294|2192->1108|2207->1114|2252->1138|2971->1830|2986->1836|3031->1860|3211->2010
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|41->10|41->10|41->10|43->12|43->12|43->12|65->34|65->34|65->34|81->50|81->50|81->50|90->59
                  -- GENERATED --
              */
          