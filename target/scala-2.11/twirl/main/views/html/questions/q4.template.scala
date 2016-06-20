
package views.html.questions

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object q4_Scope0 {
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

class q4 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Question4")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	
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
		<b><i>Quelle couche OSI gère les segments de données ? </i></b><br>
		<input type="checkbox" /> Application <br>
		<input type="checkbox" /> Présentation <br>
		<input type="checkbox" /> Session <br>
		<input type="checkbox" /> transport <br><br>

		<i> <b>Quel type de renseignement l'en-tête de la couche 4 contient-il pour contribuer au transfert des données ?</b> </i> <br>
		<input type="checkbox" /> Numéro de port du service <br>
		<input type="checkbox" /> Adresse logique de l'hôte <br>
		<input type="checkbox" /> Adresse physique du périphérique <br>
		<input type="checkbox" /> Identifiant de la connexion virtuelle <br><br>

		<i><b>Quelle couche OSI offre des services de communication de données orientées connexion et faibles ?</b> </i> <br>
		<input type="checkbox" /> Application <br>
		<input type="checkbox" /> Présentation <br>
		<input type="checkbox" /> Session <br>
		<input type="checkbox" /> transport <br><br>

		<i> <b> Quelles sont les fonctions principales d’un routeur</b> </i><br>
		<input type="checkbox" /> La commutation de paquets <br>
		<input type="checkbox" /> La microsegmentation <br>
		<input type="checkbox" />  La résolution de noms de domaine <br>
		<input type="checkbox" />  Le choix des chemins <br><br>

	</div>
	<div>
		<form class="navbar-form navbar-left" role="search">
		  <div class="form-group">
		  	<input type=button class="btn btn-info" value="Valider" onclick="qcm(0,'0001100000011001')"/>
			<input type="text" name="t" size="20" ></input>
			<input type="reset" class="btn btn-danger" value="Annuler" />
			<input type="button" class="btn btn-success" onclick="solution(0,'0001100000011001')" value="Solution" />
		  </div>
		</form>
	</div>
</div>

</form>
</body>
</html>
    
""")))}),format.raw/*60.2*/("""


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
object q4 extends q4_Scope0.q4
              /*
                  -- GENERATED --
                  DATE: Mon Jun 20 23:49:23 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/questions/q4.scala.html
                  HASH: b64f43ed31d6d6fdeb236a28ceee0d3d790e5cd4
                  MATRIX: 749->1|861->18|891->23|916->40|955->42|986->47|1089->124|1103->130|1155->162|3164->2141
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|39->8|91->60
                  -- GENERATED --
              */
          