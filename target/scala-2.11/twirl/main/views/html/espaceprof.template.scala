
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
<head>
<title>Espace Professeur</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta property="og:title" content="Vide" />
<meta name="keywords" content="Eduma Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*15.78*/("""{"""),format.raw/*15.79*/(""" """),format.raw/*15.80*/("""setTimeout(hideURLbar, 0); """),format.raw/*15.107*/("""}"""),format.raw/*15.108*/(""", false);
function hideURLbar()"""),format.raw/*16.22*/("""{"""),format.raw/*16.23*/(""" """),format.raw/*16.24*/("""window.scrollTo(0,1); """),format.raw/*16.46*/("""}"""),format.raw/*16.47*/(""" """),format.raw/*16.48*/("""</script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="css/nav.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/hover_pack.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- js -->
   <script src="js/jquery-1.11.1.min.js"></script>
<!-- //js -->
<!-- dropdown -->
<script src="js/hover_pack.js"></script>
<!-- //dropdown -->
<!--webfont-->
<link href='//fonts.googleapis.com/css?family=Nunito:400,300,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) """),format.raw/*36.37*/("""{"""),format.raw/*36.38*/("""
		"""),format.raw/*37.3*/("""$(".scroll").click(function(event)"""),format.raw/*37.37*/("""{"""),format.raw/*37.38*/("""		
			"""),format.raw/*38.4*/("""event.preventDefault();
			$('html,body').animate("""),format.raw/*39.27*/("""{"""),format.raw/*39.28*/("""scrollTop:$(this.hash).offset().top"""),format.raw/*39.63*/("""}"""),format.raw/*39.64*/(""",1000);
		"""),format.raw/*40.3*/("""}"""),format.raw/*40.4*/(""");
	"""),format.raw/*41.2*/("""}"""),format.raw/*41.3*/(""");
</script>
<!-- start-smoth-scrolling -->
<!--animate-->
<link href="css/animate.css" rel="stylesheet" type="text/css" media="all">
<script src="js/wow.min.js"></script>
	<script>
		 new WOW().init();
	</script>
<!--//end-animate-->

</head>
<body>
<!-- page-head -->
    <div class="page-head">
			<div class="header-nav">
				<div class="logo wow fadeInUp animated" data-wow-delay=".5s">
					<h1>
						<a class="link link--kumya" href="index.html"><i></i><span data-letters="PONOS-ISEP">PONOS ISEP</span></a>
					</h1>
				</div>
				<div class="top-nav wow fadeInUp animated" data-wow-delay=".5s">										 
						<label class="mobile_menu" for="mobile_menu">
						<span>Menu</span>
						</label>
						<input id="mobile_menu" type="checkbox">
					   <ul class="nav">
						 <li><a href="index.html">Accueil</a></li>
						 <li><a class="active" href="#">Mon Espace</a></li>
						 <li><a href="sentrainer.html">S'entraîner</a></li>
						 <li><a href="http://educ.isep.fr">Moodle</a></li>
                           <li><a href="http://www.isep.fr/parcours/">Parcours</a></li>
						 <li><a href="#" data-toggle="modal" data-target="#myModal">Se connecter</a></li>
					  </ul>
				 </div>
				<div class="clearfix"></div>
			</div>
    </div>
   
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
												<input type="text" value="Nom d'utilisateur" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*153.115*/("""{"""),format.raw/*153.116*/("""this.value = 'Nom d'utilisateur;"""),format.raw/*153.148*/("""}"""),format.raw/*153.149*/("""" required="">	
												<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*154.110*/("""{"""),format.raw/*154.111*/("""this.value = 'Password';"""),format.raw/*154.135*/("""}"""),format.raw/*154.136*/("""" required="">	
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
		$(document).ready(function() """),format.raw/*174.32*/("""{"""),format.raw/*174.33*/("""
		"""),format.raw/*175.3*/("""/*
			var defaults = """),format.raw/*176.19*/("""{"""),format.raw/*176.20*/("""
			"""),format.raw/*177.4*/("""containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			"""),format.raw/*181.4*/("""}"""),format.raw/*181.5*/(""";
		*/								
		$().UItoTop("""),format.raw/*183.15*/("""{"""),format.raw/*183.16*/(""" """),format.raw/*183.17*/("""easingType: 'easeOutQuart' """),format.raw/*183.44*/("""}"""),format.raw/*183.45*/(""");
		"""),format.raw/*184.3*/("""}"""),format.raw/*184.4*/(""");
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<!-- for bootstrap working -->
		<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
</body>
</html>
    
""")))}),format.raw/*194.2*/("""
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
                  DATE: Wed Jun 08 15:37:45 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/espaceprof.scala.html
                  HASH: 3a7ad4bf08bcc2e577fc334c2c66c29bd58d37f1
                  MATRIX: 755->1|867->18|897->23|930->48|969->50|999->54|1640->667|1669->668|1698->669|1754->696|1784->697|1844->729|1873->730|1902->731|1952->753|1981->754|2010->755|3046->1763|3075->1764|3106->1768|3168->1802|3197->1803|3231->1810|3310->1861|3339->1862|3402->1897|3431->1898|3469->1909|3497->1910|3529->1915|3557->1916|7935->6264|7966->6265|8028->6297|8059->6298|8215->6424|8246->6425|8300->6449|8331->6450|9051->7141|9081->7142|9113->7146|9164->7168|9194->7169|9227->7174|9414->7333|9443->7334|9503->7365|9533->7366|9563->7367|9619->7394|9649->7395|9683->7401|9712->7402|10027->7686
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|70->39|70->39|71->40|71->40|72->41|72->41|184->153|184->153|184->153|184->153|185->154|185->154|185->154|185->154|205->174|205->174|206->175|207->176|207->176|208->177|212->181|212->181|214->183|214->183|214->183|214->183|214->183|215->184|215->184|225->194
                  -- GENERATED --
              */
          