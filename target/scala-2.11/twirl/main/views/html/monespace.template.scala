
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
</head>

<body>
    
</body>
</html>
    
""")))}),format.raw/*16.2*/("""
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
                  DATE: Wed Jun 15 21:31:12 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/monespace.scala.html
                  HASH: d44b5f2553132c64030a05e1b87feb568a995f15
                  MATRIX: 753->1|865->18|895->23|921->41|960->43|991->48|1137->164
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|47->16
                  -- GENERATED --
              */
          