
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

	"""),format.raw/*5.2*/("""!DOCTYPE html>
<html>

<body>
<!-- page-head -->
    
    
<!--Corps de page-->
        <div class="container" style="margin:800px">

        </div>
<!--footer-->
<div class="footer">
	<div class="container">
		<div class="col-md-3 footer-grid wow fadeInRight animated" data-wow-delay=".5s">
			<h3>A propos</h3>
			<p>Ponos ISEP est un projet développé avec amour par l'équipe du groupe rose de l'ISEP.</p>
		</div>
		<div class="col-md-2 footer-grid wow fadeInRight animated" data-wow-delay=".5s">
			<h3>Navigation</h3>
			<ul>
				<li><a href="index.html">Accueil</a></li>
				<li><a href="about.html">Mon espace</a></li>
				<li><a href="courses.html">S'entraîner</a></li>
				<li><a href="shortcodes.html">Moodle</a></li>						 
			</ul>
		</div>
		<div class="col-md-3 footer-grid wow fadeInLeft animated" data-wow-delay=".5s">
			<h3>Contactez nous</h3>
			<h2>PONOS-ISEP</h2>
			<ul>
				<li>28, rue Notre-Dame des Champs</li>
				<li>75006</li>
				<li>PARIS</li>
				<li>Email : <a href="mailto:info&#64;example.com">contact&#64;ponosisep.com</a></li>
			</ul>
		</div>
		<div class="col-md-4 social-grid wow fadeInLeft animated" data-wow-delay=".5s">
			<h3>Contactez nous sur les réseaux sociaux</h3>
			<ul>
				<li><a class="fb1" href="#"></a></li>
				<li><a class="fb2" href="#"></a></li>
				<li><a class="fb3" href="#"></a></li>
				<li><a class="fb4" href="#"></a></li>
			</ul>
		</div>
		<div class="clearfix"></div>
		<div class="copy-right">
			<p> &copy; 2016 PONOS ISEP. Tous droit réservés | L'équipe du groupe rose</p>
		</div>
	</div>
<!-- //footer-->
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
												<input type="text" value="Nom d'utilisateur" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*71.115*/("""{"""),format.raw/*71.116*/("""this.value = 'Nom d'utilisateur;"""),format.raw/*71.148*/("""}"""),format.raw/*71.149*/("""" required="">	
												<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*72.110*/("""{"""),format.raw/*72.111*/("""this.value = 'Password';"""),format.raw/*72.135*/("""}"""),format.raw/*72.136*/("""" required="">	
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
		$(document).ready(function() """),format.raw/*92.32*/("""{"""),format.raw/*92.33*/("""
		"""),format.raw/*93.3*/("""/*
			var defaults = """),format.raw/*94.19*/("""{"""),format.raw/*94.20*/("""
			"""),format.raw/*95.4*/("""containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			"""),format.raw/*99.4*/("""}"""),format.raw/*99.5*/(""";
		*/								
		$().UItoTop("""),format.raw/*101.15*/("""{"""),format.raw/*101.16*/(""" """),format.raw/*101.17*/("""easingType: 'easeOutQuart' """),format.raw/*101.44*/("""}"""),format.raw/*101.45*/(""");
		"""),format.raw/*102.3*/("""}"""),format.raw/*102.4*/(""");
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<!-- for bootstrap working -->
		<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
</body>
</html>
    
""")))}),format.raw/*112.2*/("""
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
                  DATE: Wed Jun 08 16:43:01 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/monespace.scala.html
                  HASH: c95ebc3b1f2cb8049816ab468aaffd6b7202c82c
                  MATRIX: 753->1|865->18|895->23|921->41|960->43|991->48|3352->2380|3382->2381|3443->2413|3473->2414|3628->2540|3658->2541|3711->2565|3741->2566|4460->3257|4489->3258|4520->3262|4570->3284|4599->3285|4631->3290|4817->3449|4845->3450|4905->3481|4935->3482|4965->3483|5021->3510|5051->3511|5085->3517|5114->3518|5429->3802
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|123->92|123->92|124->93|125->94|125->94|126->95|130->99|130->99|132->101|132->101|132->101|132->101|132->101|133->102|133->102|143->112
                  -- GENERATED --
              */
          