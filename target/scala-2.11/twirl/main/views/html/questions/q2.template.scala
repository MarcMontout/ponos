
package views.html.questions

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object q2_Scope0 {
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

class q2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Question2")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<head></head>

<script type="text/javascript" src=""""),_display_(/*9.38*/routes/*9.44*/.Assets.at("javascripts/qcm.js")),format.raw/*9.76*/(""""></script>


</head>
<body>
<form>

<div class="container" style="margin: 40px">
	<p>
	<h2> Répondez à ce QCM sans tricher ! Plusieurs réponses sont possibles </h2><br>
	</p>
	<div>
		<b><i>La balise SELECT…</i></b><br>
		<input type="checkbox" /> permet d’afficher une liste ouverte <br>
		<input type="checkbox" /> permet d’afficher une image <br>
		<input type="checkbox" /> permet d’afficher une liste déroulante <br>
		<input type="checkbox" /> n’existe pas <br><br>

		<i> <b>L’attribut CSS color</b> </i> <br>
		<input type="checkbox" /> permet de définir la couleur de l’arrière-plan <br>
		<input type="checkbox" /> peut recevoir la valeur #45ed8f <br>
		<input type="checkbox" /> permet de positionner les éléments <br>
		<input type="checkbox" /> est utilisé pour définir la couleur du texte <br><br>

		<i><b>Le langage Javascript…</b> </i> <br>
		<input type="checkbox" /> est un dérivé du langage Java <br>
		<input type="checkbox" /> s’exécute sur le navigateur <br>
		<input type="checkbox" /> s’exécute sur le serveur <br>
		<input type="checkbox" /> apporte du dynamisme à la page Web <br><br>

		<i> <b>La balise META </b> </i><br>
		<input type="checkbox" /> doit être positionnée dans la balise HEAD <br>
		<input type="checkbox" /> doit être positionnée dans la balise TITLE <br>
		<input type="checkbox" /> permet d’apporter des informations additionnelles à la page Web <br>
		<input type="checkbox" /> doit être positionnée dans la balise BODY <br><br>

		<b><i>En PHP la commande echo</i></b><br>
		<input type="checkbox" /> permet d’afficher un texte sur la page HTML <br>
		<input type="checkbox" /> est similaire à la commande print <br>
		<input type="checkbox" /> n’existe pas <br>
		<input type="checkbox" /> permet de réaliser une boucle <br><br>

		<i> <b>Le langage PHP </b> </i> <br>
		<input type="checkbox" /> est exécuté sur le client <br>
		<input type="checkbox" /> est exécuté sur le serveur WEB <br>
		<input type="checkbox" /> permet d'accéder à une base de données <br>
		<input type="checkbox" /> est exécuté sur la navigateur <br><br>

		<i><b>En HTML </b> </i> <br>
		<input type="checkbox" /> on utilise des balises <br>
		<input type="checkbox" /> la balise br permet de faire un saut de ligne <br>
		<input type="checkbox" /> l’ordre des paramètres n’est pas important <br>
		<input type="checkbox" /> une balise peut avoir plusieurs paramètres <br><br>

		<i> <b> Le langage PHP  </b> </i><br>
		<input type="checkbox" /> est un langage de programmation <br>
		<input type="checkbox" /> remplace le Javascript <br>
		<input type="checkbox" /> est exécuté avant le langage Javascript <br>
		<input type="checkbox" /> permet de se connecter à un SGBD <br><br>

	</div>
	<div>
		<form class="navbar-form navbar-left" role="search">
		  <div class="form-group">
		  	<input type=button class="btn btn-info" value="Valider" onclick="qcm(0,'10100101010110101100011011111011')"/>
			<input type="text" name="t" size="20" ></input>
			<input type="reset" class="btn btn-danger" value="Annuler" />
			<input type="button" class="btn btn-success" onclick="solution(0,'10100101010110101100011011111011')" value="Solution" />
		  </div>
		</form>
	</div>
</div>

</form>
</body>
</html>
    
""")))}),format.raw/*86.2*/("""


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
object q2 extends q2_Scope0.q2
              /*
                  -- GENERATED --
                  DATE: Mon Jun 20 22:18:19 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/questions/q2.scala.html
                  HASH: 78476d4c545803e4a3451a7e4668efc064badc05
                  MATRIX: 749->1|861->18|891->23|916->40|955->42|986->47|1091->126|1105->132|1157->164|4498->3475
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|117->86
                  -- GENERATED --
              */
          