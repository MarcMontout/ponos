
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object question_Scope0 {
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

class question extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Question")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
	
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<head></head>

<script type="text/javascript" src=""""),_display_(/*9.38*/routes/*9.44*/.Assets.at("javascript/qcm.js")),format.raw/*9.75*/(""""></script>


</head>
<body>
<form>

<div class="container" style="margin: 40px">
	<p>
	<b> Répondez à ce QCM sans tricher ! Plusieurs réponses sont possibles </b>
	</p>
	<div>
		<b><i>8*7 = : </i></b><br>
		<input type="checkbox" /> 62 <br>
		<input type="checkbox" /> 56 <br>
		<input type="checkbox" /> 43 <br>
		<i> <b>Un langage de programmation:</b> </i> <br>
		<input type="checkbox" /> Java <br>
		<input type="checkbox" /> HTML <br>
		<input type="checkbox"/> C++ <br>

		<i><b>(8*7+9)(4-(3+1)= </b> </i> <br>
		<input type="checkbox" /> 2 <br>
		<input type="checkbox"/> 1<br>
		<input type="checkbox" /> 0<br>

		<i> <b>Un Système d'exploitation : </b> </i><br>
		<input type="checkbox" /> Windows <br>
		<input type="checkbox" /> Apple <br>
		<input type="checkbox" /> Linux <br>

	</div>
	<div>
		<form class="navbar-form navbar-left" role="search">
		  <div class="form-group">
		  	<input type=button class="btn btn-info" value="Valider" onclick="qcm(0,'010101001111')"/>
			<input type="text" name="t" size="20" ></input>
			<input type="reset" class="btn btn-danger" value="Annuler" />
			<input type="button" class="btn btn-success" onclick="solution(0,'010101001111')" value="Solution" />
		  </div>
		</form>
	</div>
</div>

</form>
</body>
</html>
    
""")))}),format.raw/*57.2*/("""


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
object question extends question_Scope0.question
              /*
                  -- GENERATED --
                  DATE: Mon Jun 20 18:15:38 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/question.scala.html
                  HASH: ebb131e643e3156d1e0d27844889b39d62721d18
                  MATRIX: 751->1|863->18|893->23|917->39|956->41|987->46|1092->125|1106->131|1157->162|2510->1485
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|88->57
                  -- GENERATED --
              */
          