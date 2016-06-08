
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object connexion_Scope0 {
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

class connexion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Connexion")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<body>

	    

</body>
</html>
    
""")))}),format.raw/*14.2*/("""
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
object connexion extends connexion_Scope0.connexion
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 18:53:38 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/connexion.scala.html
                  HASH: 7a9fac0086578166f2c318ebff089edc3cae6014
                  MATRIX: 753->1|865->18|895->23|920->40|959->42|989->46|1088->115
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|45->14
                  -- GENERATED --
              */
          