
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ancienqcm_Scope0 {
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

class ancienqcm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Mes anciens QCM")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<head>
<title>Anciens QCM</title>
	
	<link href=""""),_display_(/*10.15*/routes/*10.21*/.Assets.at("Stylesheets/ancienqcm.css")),format.raw/*10.60*/("""" rel="stylesheet" type='text/css'>

</head>

<body>

	<article>
    <h1>En développement</h1><br>
    <div>
        <p>Désolé mais cette page est en cours de développement donc il n'est pas possible de voir son contenu avant un certain moment mais si vous êtes très intéressé, merci de nous <a href="mailto:contact&#64;ponosisep.com<">contacter</a>, sinon nous ne saurons jamais que vous êtes intéressé!</p>
        <p>&mdash; Le Groupe ROSE de Génie Logiciel</p>
    </div>
</article>
	
</body>
</html>
""")))}),format.raw/*26.2*/("""
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
object ancienqcm extends ancienqcm_Scope0.ancienqcm
              /*
                  -- GENERATED --
                  DATE: Tue Jun 21 00:44:45 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/ancienqcm.scala.html
                  HASH: 8d4e4173810d1d7f43e863288cc3872942a3794d
                  MATRIX: 753->1|865->18|895->23|926->46|965->48|995->52|1100->130|1115->136|1175->175|1727->697
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|41->10|41->10|41->10|57->26
                  -- GENERATED --
              */
          