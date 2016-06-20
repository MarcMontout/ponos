
package views.html.questions

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object q1_Scope0 {
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

class q1 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Question")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
	
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<head></head>
<script type="text/javascript" src=""""),_display_(/*8.38*/routes/*8.44*/.Assets.at("javascripts/qcm.js")),format.raw/*8.76*/(""""></script>

</head>
<body>
<form>

<div class="container" style="margin: 40px">
	<p>
	<h2> Répondez à ce QCM sans tricher ! Plusieurs réponses sont possibles </h2><br>
	</p>
	<div>
		<b><i>Parmi les types d’outils cités ci-dessous, lesquels sont les plus adaptés pour consulter des pages HTML ?</i></b><br>
		<input type="checkbox" /> un butineur <br>
		<input type="checkbox" /> un client HTTP <br>
		<input type="checkbox" /> un serveur de page HTML <br>
		<input type="checkbox" /> un éditeur d’images <br><br>

		<i><b>Quels sont les langages de programmations ?</b> </i> <br>
		<input type="checkbox" /> Java <br>
		<input type="checkbox" /> HTML <br>
		<input type="checkbox" /> Eclipse <br>
		<input type="checkbox" /> Netbeans <br>
		<input type="checkbox"/> Github <br><br>

		<i><b>HTTP est  </b></i><br>
		<input type="checkbox" /> le langage générique pour écrire des pages HTML <br>
		<input type="checkbox"/> un protocole <br>
		<input type="checkbox"/> un éditeur de document HTML <br>
		<input type="checkbox" /> un moteur de recherches <br><br>

		<i><b>Il est nécessaire d’avoir une connexion Internet pour consulter des pages HTML</b> </i><br>
		<input type="checkbox" /> Vrai <br>
		<input type="checkbox" /> Faux <br><br>

	</div>
	<div>
		<form class="navbar-form navbar-left" role="search">
		  <div class="form-group">
		  	<input type=button class="btn btn-info" value="Valider" onclick="qcm(0,'110011000100001')"/>
			<input type="text" name="t" size="20" ></input>
			<input type="reset" class="btn btn-danger" value="Annuler" />
			<input type="button" class="btn btn-success" onclick="solution(0,'110011000100001')" value="Solution" />
		  </div>
		</form>
	</div>
</div>

</form>
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
object q1 extends q1_Scope0.q1
              /*
                  -- GENERATED --
                  DATE: Mon Jun 20 23:49:23 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/questions/q1.scala.html
                  HASH: e462da13417a9fee8c065984e24235f6b2a5f71e
                  MATRIX: 749->1|861->18|891->23|915->39|954->41|985->46|1088->123|1102->129|1154->161|2968->1945
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|39->8|90->59
                  -- GENERATED --
              */
          