
package views.html.questions

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object q3_Scope0 {
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

class q3 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Question3")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	
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
		<b><i>8*7 = : </i></b><br>
		<input type="checkbox" /> 62 <br>
		<input type="checkbox" /> 56 <br>
		<input type="checkbox" /> 43 <br>
		<input type="checkbox" /> Pas de réponse <br><br>

		<i> <b></b>2x+5= 0 équivalent à </i> <br>
		<input type="checkbox" /> 2x= -5 <br>
		<input type="checkbox" /> 2x= 5 <br>
		<input type="checkbox" /> 2+x= -5 <br>
		<input type="checkbox" /> x+5= 2 <br><br>

		<i><b>(8*7+9)(4-(3+1))= </b> </i> <br>
		<input type="checkbox" /> 2 <br>
		<input type="checkbox" /> 1 <br>
		<input type="checkbox" /> 0 <br>
		<input type="checkbox" /> 90 <br><br>

		<i> <b></b>7x+5= 0 équivalent à </i> <br>
		<input type="checkbox" /> 7x= -4 <br>
		<input type="checkbox" /> 7x= 6 <br>
		<input type="checkbox" /> 7x+x= -5 <br>
		<input type="checkbox" /> x+5= 7x <br>
		<input type="checkbox" /> Pas de réponse <br><br>

	</div>
	<div>
		<form class="navbar-form navbar-left" role="search">
		  <div class="form-group">
		  	<input type=button class="btn btn-info" value="Valider" onclick="qcm(0,'01001000001000001')"/>
			<input type="text" name="t" size="20" ></input>
			<input type="reset" class="btn btn-danger" value="Annuler" />
			<input type="button" class="btn btn-success" onclick="solution(0,'01001000001000001')" value="Solution" />
		  </div>
		</form>
	</div>
</div>

</form>
</body>
</html>
    
""")))}),format.raw/*61.2*/("""


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
object q3 extends q3_Scope0.q3
              /*
                  -- GENERATED --
                  DATE: Mon Jun 20 23:49:23 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/questions/q3.scala.html
                  HASH: 3c72d9970eebd558823e9b5644924efa618cf989
                  MATRIX: 749->1|861->18|891->23|916->40|955->42|986->47|1089->124|1103->130|1155->162|2757->1734
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|39->8|92->61
                  -- GENERATED --
              */
          