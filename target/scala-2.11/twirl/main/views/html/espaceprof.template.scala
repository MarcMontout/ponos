
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object espaceprof_Scope0 {
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

class espaceprof extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Espace professeur")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<body>
   
<!--Corps de page-->

<div class="container" style="margin: 40px">
	<button type="button" class="btn btn-primary btn-lg">Ajouter</button>
	<button type="button" class="btn btn-primary btn-lg">Modifier</button>
	<button type="button" class="btn btn-primary btn-lg">Supprimer</button>
	</br>
	<div>
		<label for="form_control_1">Question</label>
		<input type="text" class="form-control" id="form_control_1" placeholder="Entrez votre question">
		<label for="form_control_1">Choix de réponse</label>
		<input type="text" class="form-control" id="form_control_1" placeholder="Option 1">
		<input type="text" class="form-control" id="form_control_1" placeholder="Option 2">
		<input type="text" class="form-control" id="form_control_1" placeholder="Option 3">
		<input type="text" class="form-control" id="form_control_1" placeholder="Option 4">
	</div>
</div>

<!--footer-->


</body>
</html>
    
""")))}),format.raw/*33.2*/("""
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
object espaceprof extends espaceprof_Scope0.espaceprof
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 18:25:19 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/espaceprof.scala.html
                  HASH: c8cdf27c593d4bfe8163d04a8e1c641838e29e50
                  MATRIX: 755->1|867->18|897->23|930->48|969->50|999->54|1987->1012
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|64->33
                  -- GENERATED --
              */
          