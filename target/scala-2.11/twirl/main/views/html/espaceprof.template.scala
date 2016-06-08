
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

<!-- Modal -->

	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
		<div class="modal-content">
		  <div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		  </div>
		  <div class="modal-body modal-spa">
								<div class="login-grids">
									<div class="login">
										<div class="login-right">
											<form>
												<h3>Connectez-vous avec votre compte </h3>
												<input type="text" value="Nom d'utilisateur" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*43.115*/("""{"""),format.raw/*43.116*/("""this.value = 'Nom d'utilisateur;"""),format.raw/*43.148*/("""}"""),format.raw/*43.149*/("""" required="">	
												<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*44.110*/("""{"""),format.raw/*44.111*/("""this.value = 'Password';"""),format.raw/*44.135*/("""}"""),format.raw/*44.136*/("""" required="">	
												<h4><a href="https://moncompte.isep.fr/login.php">Mot de passe oublié</a> / <a href="https://moncompte.isep.fr/login.php">Nom d'utilisateur oublié</a></h4>
												<div class="single-bottom">
													<input type="checkbox"  id="brand" value="">
													<label for="brand"><span></span>Se souvenir de moi.</label>
												</div>
												<input type="submit" value="Connexion" >
											</form>
										</div>
										<div class="clearfix"></div>								
									</div>
								</div>
		  </div>

		</div>
	  </div>
	</div>

<!-- smooth scrolling -->
	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*64.32*/("""{"""),format.raw/*64.33*/("""
		"""),format.raw/*65.3*/("""/*
			var defaults = """),format.raw/*66.19*/("""{"""),format.raw/*66.20*/("""
			"""),format.raw/*67.4*/("""containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			"""),format.raw/*71.4*/("""}"""),format.raw/*71.5*/(""";
		*/								
		$().UItoTop("""),format.raw/*73.15*/("""{"""),format.raw/*73.16*/(""" """),format.raw/*73.17*/("""easingType: 'easeOutQuart' """),format.raw/*73.44*/("""}"""),format.raw/*73.45*/(""");
		"""),format.raw/*74.3*/("""}"""),format.raw/*74.4*/(""");
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<!-- for bootstrap working -->
		<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
</body>
</html>
    
""")))}),format.raw/*84.2*/("""
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
                  DATE: Wed Jun 08 18:10:25 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/espaceprof.scala.html
                  HASH: 79cda5315a279cbb9153f1ae47c3c1a22bc56ecc
                  MATRIX: 755->1|867->18|897->23|930->48|969->50|999->54|2658->1684|2688->1685|2749->1717|2779->1718|2934->1844|2964->1845|3017->1869|3047->1870|3766->2561|3795->2562|3826->2566|3876->2588|3905->2589|3937->2594|4123->2753|4151->2754|4210->2785|4239->2786|4268->2787|4323->2814|4352->2815|4385->2821|4413->2822|4727->3106
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|74->43|74->43|74->43|74->43|75->44|75->44|75->44|75->44|95->64|95->64|96->65|97->66|97->66|98->67|102->71|102->71|104->73|104->73|104->73|104->73|104->73|105->74|105->74|115->84
                  -- GENERATED --
              */
          