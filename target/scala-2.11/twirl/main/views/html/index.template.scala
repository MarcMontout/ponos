
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
<head></head>
<body>

<div style="background-image:url("""),_display_(/*10.35*/routes/*10.41*/.Assets.at("images/training.jpg")),format.raw/*10.74*/(""")">
 <!--<div data-vide-bg="video/training">-->
    <div class="center-container">
		<div class="ban-shade">
			<div class="header-nav">
				<div class="logo wow fadeInUp animated" data-wow-delay=".5s">
					
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
					
					<a class="scroll" href=""""),_display_(/*29.31*/routes/*29.37*/.Application.login()),format.raw/*29.57*/("""" class="hvr-shutter-in-vertical button" data-toggle="modal" data-target="#myModal">Connexion</a>
				</div>
			</div>
		</div>
    </div>
</div>

    <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.1.min.js"><\/script>')</script>
    <script src=""""),_display_(/*37.19*/routes/*37.25*/.Assets.at("javascript/jquery.vide.min.js")),format.raw/*37.68*/(""""></script>

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
			    <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true"><img src=""""),_display_(/*229.159*/routes/*229.165*/.Assets.at("images/team.jpg")),format.raw/*229.194*/(""""  alt=" " /></a></li>
				<li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile"><img src=""""),_display_(/*230.129*/routes/*230.135*/.Assets.at("images/team2.jpg")),format.raw/*230.165*/("""" alt=" " /></a></li>
				<li role="presentation"><a href="#return" role="tab" id="return-tab" data-toggle="tab" aria-controls="return"><img src=""""),_display_(/*231.126*/routes/*231.132*/.Assets.at("images/team3.jpg")),format.raw/*231.162*/(""""  alt=" " /></a></li>
				<li role="presentation"><a href="#team4" role="tab" id="team4-tab" data-toggle="tab" aria-controls="team4"><img src=""""),_display_(/*232.123*/routes/*232.129*/.Assets.at("images/team4.jpg")),format.raw/*232.159*/(""""  alt=" " /></a></li>
                <li role="presentation"><a href="#team5" role="tab" id="team5-tab" data-toggle="tab" aria-controls="team5"><img src=""""),_display_(/*233.135*/routes/*233.141*/.Assets.at("images/team5.jpg")),format.raw/*233.171*/(""""  alt=" " /></a></li>
				<div class="clearfix"></div>
			</ul>
		</div>
	</div>
</div>
</body>
</html>
    
""")))}),format.raw/*242.2*/("""
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
                  DATE: Mon Jun 20 18:48:48 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/index.scala.html
                  HASH: 1130a8ce111be55b04cffe60fd23ea1034eef942
                  MATRIX: 745->1|857->18|887->23|908->36|947->38|978->43|1089->127|1104->133|1158->166|1950->931|1965->937|2006->957|2318->1242|2333->1248|2397->1291|10534->9399|10551->9405|10603->9434|10784->9586|10801->9592|10854->9622|11031->9770|11048->9776|11101->9806|11276->9952|11293->9958|11346->9988|11533->10146|11550->10152|11603->10182|11754->10302
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|41->10|41->10|41->10|60->29|60->29|60->29|68->37|68->37|68->37|260->229|260->229|260->229|261->230|261->230|261->230|262->231|262->231|262->231|263->232|263->232|263->232|264->233|264->233|264->233|273->242
                  -- GENERATED --
              */
          