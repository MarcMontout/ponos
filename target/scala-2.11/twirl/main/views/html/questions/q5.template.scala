
package views.html.questions

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object q5_Scope0 {
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

class q5 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Question5")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
	
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
		<b><i>Quelles sont les tâches à remplir avant que deux routeurs puissent utiliser le protocole OSPF pour établir une contigu</i></b><br>
		<input type="checkbox" />  Les routeurs doivent sélectionner un routeur désigné <br>
		<input type="checkbox" />   Les routeurs doivent s’accorder sur le type de réseau <br>
		<input type="checkbox" />  Les routeurs doivent utiliser le même intervalle des paquets Dead  <br>
		<input type="checkbox" /> Les routeurs doivent échanger des demandes d’état des liaisons <br>
		<input type="checkbox" />  Les routeurs doivent échanger des paquets de description de base de données <br><br>

		<i> <b>Quelles affirmations sont vraies à propos des protocoles de routage à état de liens ? </b> </i> <br>
		<input type="checkbox" /> Ils connaissent l’intégralité de la topologie de réseau <br>
		<input type="checkbox" /> Ils garantissent des délais de convergence rapides sur les grands réseaux <br>
		<input type="checkbox" /> Ils n’incluent pas les masques de sous-réseaux dans leurs mises à jour de routage <br>
		<input type="checkbox" /> Ils comptent sur la diminution du nombre de sauts pour déterminer le meilleur chemin <br>
		<input type="checkbox" /> Ils ne fonctionnent pas bien sur les réseaux qui nécessitent des conceptions hiérarchiques spéciales <br><br>

		<i><b>Que signifie l'acronyme DNS ?</b></i> <br>
		<input type="checkbox" /> Domain Name System <br>
		<input type="checkbox" /> Domain Name Server <br>
		<input type="checkbox" /> Data Name Server <br><br>

		<i> <b>Qu'est ce qu'un SWITCH ?</b> </i><br>
		<input type="checkbox" /> Un concentrateur <br>
		<input type="checkbox" /> Un commutateur <br>
		<input type="checkbox" /> Un modulateur <br>
		<input type="checkbox" /> Un calculateur <br><br>

	</div>
	<div>
		<form class="navbar-form navbar-left" role="search">
		  <div class="form-group">
		  	<input type=button class="btn btn-info" value="Valider" onclick="qcm(0,'01100110001000100')"/>
			<input type="text" name="t" size="20" ></input>
			<input type="reset" class="btn btn-danger" value="Annuler" />
			<input type="button" class="btn btn-success" onclick="solution(0,'01100110001000100')" value="Solution" />
		  </div>
		</form>
	</div>
</div>

</form>
</body>
</html>
    
""")))}),format.raw/*63.2*/("""


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
object q5 extends q5_Scope0.q5
              /*
                  -- GENERATED --
                  DATE: Mon Jun 20 21:38:24 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/questions/q5.scala.html
                  HASH: 592a0c6cd8deb28aad00dfe41437c18cf2695826
                  MATRIX: 749->1|861->18|891->23|916->40|955->42|986->47|1091->126|1105->132|1157->164|3676->2653
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|94->63
                  -- GENERATED --
              */
          