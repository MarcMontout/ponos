
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Ponos")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
	
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<body>

<div style="background-image:url("""),_display_(/*9.35*/routes/*9.41*/.Assets.at("images/training.jpg")),format.raw/*9.74*/(""")">
 <!--<div data-vide-bg="video/training">-->
    <div class="center-container">
		<div class="ban-shade">
			<div class="header-nav">
				<div class="logo wow fadeInUp animated" data-wow-delay=".5s">
					<h1>
						<a class="link link--kumya" href=""""),_display_(/*16.42*/routes/*16.48*/.Application.index()),format.raw/*16.68*/(""""><i></i><span data-letters="PONOS-ISEP">PONOS ISEP</span></a>
					</h1>
				</div>
				<div class="top-nav wow fadeInUp animated" data-wow-delay=".5s">										 
						<label class="mobile_menu" for="mobile_menu">
						<span>Menu</span>
						</label>
						<input id="mobile_menu" type="checkbox">
					   <ul class="nav">
						 <li><a class="active" href=""""),_display_(/*25.37*/routes/*25.43*/.Application.index()),format.raw/*25.63*/("""">Accueil</a></li>
						 <li><a href=""""),_display_(/*26.22*/routes/*26.28*/.Application.monespace()),format.raw/*26.52*/("""">Mon Espace</a></li>
						 <li><a href=""""),_display_(/*27.22*/routes/*27.28*/.Application.entrainer()),format.raw/*27.52*/("""">S'entraîner</a></li>
						 <li><a href="http://educ.isep.fr">Moodle</a></li>
                           <li><a href="http://www.isep.fr/parcours/">Parcours</a></li>
						 <li class="rectangle"><a href="#" data-toggle="modal" data-target="#myModal">Se connecter</a></li>
					  </ul>
				 </div>
				<div class="clearfix"></div>
				
			</div>
            <div class="socials">
                <script type="text/javascript" src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-4dd797b06396480a"></script>
            </div>
			<div class="box_1-top">
				<div class="banner-info wow fadeInLeft animated" data-wow-delay=".5s">
					<h3>Bienvenue sur PONOS ISEP la plateforme d'entraînement de l'ISEP école du numérique</h3>
					<h2>Commencer à vous entraîner, connectez-vous !</h2>
					
					<a class="scroll" href="#" class="hvr-shutter-in-vertical button" data-toggle="modal" data-target="#myModal">Connexion</a>
				</div>
			</div>
		</div>
    </div>
</div>

    <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.1.min.js"><\/script>')</script>
    <script src="js/jquery.vide.min.js"></script>

<!--banner bottom-->
<div class="about">
	<div class="col-md-6 about-left wow fadeInRight animated" data-wow-delay=".5s">
		<h3>Bienvenue sur Ponos-ISEP</h3>
		<p>Cette plateforme permettra aux élèves comme aux professeurs de lieux d'échange et d'entraînement pour les cours.
        Les valeurs que nous pronons sur la plateforme sont à l'images de nos élèves, ce sont les suivantes :</p>
	</div>
	<div class="col-md-6 about-right wow fadeInLeft animated" data-wow-delay=".5s">
		<div class="hi-icon-wrap hi-icon-effect-4 hi-icon-effect-4b">
			<div class="abt-icon">
				<a href="#" class="hi-icon icon1"></a>
				<h4>Travailler</h4>
			</div>
			<div class="abt-icon">
				<a href="#" class="hi-icon icon2"></a>
				<h4>Développer</h4>
			</div>
			<div class="abt-icon">
				<a href="#" class="hi-icon icon3"></a>
				<h4>Apprendre</h4>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<div class="clearfix"></div>
</div>
<div id="faculty" class="footer-top wow fadeInLeft animated" data-wow-delay=".5s">
	<div class="container">
		<h3>Témoignages des élèves du mois</h3>
		<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
			
			<div id="myTabContent" class="tab-content">
				<div role="tabpanel" class="tabs-para tab-pane fade in active" id="home" aria-labelledby="home-tab">
					<h5><span class="quote1"></span>PONOS ISEP ça tue sa race, j'ai pu m'entraîner sur des notions que je 
                        maîtrisais approximativement et en apprendre de nouvelles, un grand merci à l'équipe de développement.
                        <span class="quote2"></span></h5>
					<div class="team-right">
												<div class="bar">
													<p>Physique (99.9%)</p>
												</div>
												<div class="skills">
														<div class="skill1" style="width:98%"> </div>							
												</div>
												<div class="bar">
													<p>Français (95%)</p>
												</div>
												<div class="skills">
														<div class="skill2" style="width:95%"> </div>							
												</div>
												<div class="bar">
													<p>Mathématiques (80%)</p>
												</div>
												<div class="skills">
														<div class="skill3" style="width:80%"> </div>							
												</div>
												<div class="bar">
													<p>Génie Logiciel (45%)</p>
												</div>
												<div class="skills">
														<div class="skill4" style="width:45%"> </div>							
												</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div role="tabpanel" class="tabs-para tab-pane fade" id="profile" aria-labelledby="profile-tab">
					<h5><span class="quote1"></span>PONOS ISEP ça tue sa race, j'ai pu m'entraîner sur des notions que je 
                        maîtrisais approximativement et en apprendre de nouvelles, un grand merci à l'équipe de développement.<span class="quote2"></span></h5>
					<div class="team-right">
												<div class="bar">
													<p>Physique (99.9%)</p>
												</div>
												<div class="skills">
														<div class="skill1" style="width:98%"> </div>							
												</div>
												<div class="bar">
													<p>Français (95%)</p>
												</div>
												<div class="skills">
														<div class="skill2" style="width:95%"> </div>							
												</div>
												<div class="bar">
													<p>Mathématiques (80%)</p>
												</div>
												<div class="skills">
														<div class="skill3" style="width:80%"> </div>							
												</div>
												<div class="bar">
													<p>Génie Logiciel (45%)</p>
												</div>
												<div class="skills">
														<div class="skill4" style="width:45%"> </div>							
												</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div role="tabpanel" class="tabs-para tab-pane fade" id="return" aria-labelledby="return-tab">
					<h5><span class="quote1"></span>PONOS ISEP ça tue sa race, j'ai pu m'entraîner sur des notions que je 
                        maîtrisais approximativement et en apprendre de nouvelles, un grand merci à l'équipe de développement.<span class="quote2"></span></h5>		
					<div class="team-right">
												<div class="bar">
													<p>Physique (99.9%)</p>
												</div>
												<div class="skills">
														<div class="skill1" style="width:98%"> </div>							
												</div>
												<div class="bar">
													<p>Français (95%)</p>
												</div>
												<div class="skills">
														<div class="skill2" style="width:95%"> </div>							
												</div>
												<div class="bar">
													<p>Mathématiques (80%)</p>
												</div>
												<div class="skills">
														<div class="skill3" style="width:80%"> </div>							
												</div>
												<div class="bar">
													<p>Génie Logiciel (45%)</p>
												</div>
												<div class="skills">
														<div class="skill4" style="width:45%"> </div>							
												</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div role="tabpanel" class="tabs-para tab-pane fade" id="team4" aria-labelledby="team4-tab">
					<h5><span class="quote1"></span>PONOS ISEP ça tue sa race, j'ai pu m'entraîner sur des notions que je 
                        maîtrisais approximativement et en apprendre de nouvelles, un grand merci à l'équipe de développement.<span class="quote2"></span></h5>
					<div class="team-right">
												<div class="bar">
													<p>Physique (99.9%)</p>
												</div>
												<div class="skills">
														<div class="skill1" style="width:98%"> </div>							
												</div>
												<div class="bar">
													<p>Français (95%)</p>
												</div>
												<div class="skills">
														<div class="skill2" style="width:95%"> </div>							
												</div>
												<div class="bar">
													<p>Mathématiques (80%)</p>
												</div>
												<div class="skills">
														<div class="skill3" style="width:80%"> </div>							
												</div>
												<div class="bar">
													<p>Génie Logiciel (45%)</p>
												</div>
												<div class="skills">
														<div class="skill4" style="width:45%"> </div>							
												</div>
					</div>
					<div class="clearfix"></div>
				</div>
                <div role="tabpanel" class="tabs-para tab-pane fade" id="team5" aria-labelledby="team5-tab">
					<h5><span class="quote1"></span>PONOS ISEP ça tue sa race, j'ai pu m'entraîner sur des notions que je 
                        maîtrisais approximativement et en apprendre de nouvelles, un grand merci à l'équipe de développement.<span class="quote2"></span></h5>
					<div class="team-right">
												<div class="bar">
													<p>Physique (99.9%)</p>
												</div>
												<div class="skills">
														<div class="skill1" style="width:98%"> </div>							
												</div>
												<div class="bar">
													<p>Français (95%)</p>
												</div>
												<div class="skills">
														<div class="skill2" style="width:95%"> </div>							
												</div>
												<div class="bar">
													<p>Mathématiques (80%)</p>
												</div>
												<div class="skills">
														<div class="skill3" style="width:80%"> </div>							
												</div>
												<div class="bar">
													<p>Génie Logiciel (45%)</p>
												</div>
												<div class="skills">
														<div class="skill4" style="width:45%"> </div>							
												</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<ul id="myTab" class="nav nav-tabs text-center" role="tablist">
			    <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true"><img src="images/team1.jpg" alt=" " /></a></li>
				<li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile"><img src="images/team2.jpg" alt=" " /></a></li>
				<li role="presentation"><a href="#return" role="tab" id="return-tab" data-toggle="tab" aria-controls="return"><img src="images/team3.jpg" alt=" " /></a></li>
				<li role="presentation"><a href="#team4" role="tab" id="team4-tab" data-toggle="tab" aria-controls="team4"><img src="images/team4.jpg" alt=" " /></a></li>
                <li role="presentation"><a href="#team5" role="tab" id="team5-tab" data-toggle="tab" aria-controls="team5"><img src="images/team5.jpg" alt=" " /></a></li>
				<div class="clearfix"></div>
			</ul>
		</div>
	</div>
</div>
<!--//footer-top-->
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
				<li>Email : </a></li>
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
						<input type="text" value="Nom d'utilisateur" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*311.109*/("""{"""),format.raw/*311.110*/("""this.value = 'Nom d'utilisateur;"""),format.raw/*311.142*/("""}"""),format.raw/*311.143*/("""" required="">	
						<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*312.104*/("""{"""),format.raw/*312.105*/("""this.value = 'Password';"""),format.raw/*312.129*/("""}"""),format.raw/*312.130*/("""" required="">	
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
		$(document).ready(function() """),format.raw/*332.32*/("""{"""),format.raw/*332.33*/("""
		"""),format.raw/*333.3*/("""/*
			var defaults = """),format.raw/*334.19*/("""{"""),format.raw/*334.20*/("""
			"""),format.raw/*335.4*/("""containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			"""),format.raw/*339.4*/("""}"""),format.raw/*339.5*/(""";
		*/								
		$().UItoTop("""),format.raw/*341.15*/("""{"""),format.raw/*341.16*/(""" """),format.raw/*341.17*/("""easingType: 'easeOutQuart' """),format.raw/*341.44*/("""}"""),format.raw/*341.45*/(""");
		"""),format.raw/*342.3*/("""}"""),format.raw/*342.4*/(""");
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<!-- for bootstrap working -->
		<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
</body>
</html>
    
""")))}),format.raw/*352.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 16:43:01 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/index.scala.html
                  HASH: 77dc8247d594af333c059b1eaffb58ad15dbaba0
                  MATRIX: 745->1|857->18|885->21|906->34|945->36|974->39|1065->104|1079->110|1132->143|1413->397|1428->403|1469->423|1860->787|1875->793|1916->813|1983->853|1998->859|2043->883|2113->926|2128->932|2173->956|14053->12806|14084->12807|14146->12839|14177->12840|14326->12959|14357->12960|14411->12984|14442->12985|15088->13602|15118->13603|15149->13606|15199->13627|15229->13628|15261->13632|15444->13787|15473->13788|15531->13817|15561->13818|15591->13819|15647->13846|15677->13847|15710->13852|15739->13853|16044->14127
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|47->16|47->16|47->16|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|342->311|342->311|342->311|342->311|343->312|343->312|343->312|343->312|363->332|363->332|364->333|365->334|365->334|366->335|370->339|370->339|372->341|372->341|372->341|372->341|372->341|373->342|373->342|383->352
                  -- GENERATED --
              */
          