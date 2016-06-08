
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
						<input type="text" value="Nom d'utilisateur" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*245.109*/("""{"""),format.raw/*245.110*/("""this.value = 'Nom d'utilisateur;"""),format.raw/*245.142*/("""}"""),format.raw/*245.143*/("""" required="">	
						<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*246.104*/("""{"""),format.raw/*246.105*/("""this.value = 'Password';"""),format.raw/*246.129*/("""}"""),format.raw/*246.130*/("""" required="">	
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
		$(document).ready(function() """),format.raw/*266.32*/("""{"""),format.raw/*266.33*/("""
		"""),format.raw/*267.3*/("""/*
			var defaults = """),format.raw/*268.19*/("""{"""),format.raw/*268.20*/("""
			"""),format.raw/*269.4*/("""containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			"""),format.raw/*273.4*/("""}"""),format.raw/*273.5*/(""";
		*/								
		$().UItoTop("""),format.raw/*275.15*/("""{"""),format.raw/*275.16*/(""" """),format.raw/*275.17*/("""easingType: 'easeOutQuart' """),format.raw/*275.44*/("""}"""),format.raw/*275.45*/(""");
		"""),format.raw/*276.3*/("""}"""),format.raw/*276.4*/(""");
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<!-- for bootstrap working -->
		<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
</body>
</html>
    
""")))}),format.raw/*286.2*/("""
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
                  DATE: Wed Jun 08 16:57:36 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/index.scala.html
                  HASH: 20d5c52bae7ea963b884766ced17d784fa046524
                  MATRIX: 745->1|857->18|885->21|906->34|945->36|974->39|1065->104|1079->110|1132->143|11378->10359|11409->10360|11471->10392|11502->10393|11651->10512|11682->10513|11736->10537|11767->10538|12413->11155|12443->11156|12474->11159|12524->11180|12554->11181|12586->11185|12769->11340|12798->11341|12856->11370|12886->11371|12916->11372|12972->11399|13002->11400|13035->11405|13064->11406|13369->11680
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|276->245|276->245|276->245|276->245|277->246|277->246|277->246|277->246|297->266|297->266|298->267|299->268|299->268|300->269|304->273|304->273|306->275|306->275|306->275|306->275|306->275|307->276|307->276|317->286
                  -- GENERATED --
              */
          