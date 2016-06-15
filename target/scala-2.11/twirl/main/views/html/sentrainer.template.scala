
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sentrainer_Scope0 {
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

class sentrainer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("S'entrainer")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
	
    """),format.raw/*5.5*/("""<!DOCTYPE html>
<html>
<head>
<title>Entrainement</title>
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
						 <li><a href="index.scala.html">Accueil</a></li>
						 <li><a href="monespace.scala.html">Mon Espace</a></li>
						 <li><a class="active" href="sentrainer.scala.html">S'entraîner</a></li>
						 <li><a href="http://educ.isep.fr">Moodle</a></li>
                           <li><a href="http://www.isep.fr/parcours/">Parcours</a></li>
						 <li><a href="#" data-toggle="modal" data-target="#myModal">Se connecter</a></li>
					  </ul>
				 </div>
				<div class="clearfix"></div>
			</div>
    </div>
<!-- //page-head -->
<!-- courses -->
	<div class="courses_box1">
	   <div class="container">
		<h3 class="tittle">Les QCM d'entraînement</h3>
	   	  
		<div class="col-md-9 wow fadeInUp animated" data-wow-delay=".5s">
			<div class="course_list">
                <div class="table-header clearfix">
                	<div class="id_col">ID</div>
                	<div class="name_col">Nom du cours</div>
                    <div class="duration_col">Durée</div>
                    <div class="date_col">Date de début</div>
    			</div>
                <ul class="table-list">
                    <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    				 <li class="clearfix">
    					<div class="id_col">(II:2405)</div>

        				<div class="name_col"><a href="#">Génie Logiciel</a></div>

        				<div class="duration_col">2 heures</div>

        				<div class="date_col">25/05/2016</div>
    				</li>
    			</ul>
               </div>
		</div>
		<div class="col-md-3">
			<div class="courses_box1-left wow fadeInLeft animated" data-wow-delay=".5s">
                <form>
                 <div class="select-block1">
                    <select>
                        <option value="">Cours</option>
                        <option value="">Cours</option>
                        <option value="">Cours</option>
                        <option value="">Cours</option>
                        <option value="">Cours</option>
                    </select>
                 </div>
                <!-- select-block -->
                 <div class="select-block1">
                    <select>
                        <option value="">Durée</option>
                        <option value="">Durée</option>
                        <option value="">Durée</option>
                        <option value="">Durée</option>
                        <option value="">Durée</option>
                    </select>
                </div>
                <!-- select-block -->
                <div class="select-block1">
                    <select>
                        <option value="">Facile</option>
                        <option value="">Difficile</option>
                        <option value="">Moyen</option>
                    </select>
                </div>
                <!-- select-block -->
                <div class="select-block1">
                    <select>
                        <option value="">25/05/2016</option>
                        <option value="">25/05/2016</option>
                        <option value="">25/05/2016</option>
                        <option value="">25/05/2016</option>
                        <option value="">25/05/2016</option>
                    </select>
                </div>
				<!-- select-block -->
				<div class="select-block1">
					<select>
						<option value="">Promotion</option>
						<option value="">Promotion</option>
						<option value="">Promotion</option>
						<option value="">Promotion</option>
						<option value="">Promotion</option>
					</select>
				</div>
                <!-- select-block -->
                <input type="submit" value="search" class="course-submit">		                            
            </form>
	       </div>
	       <div class="personBox wow fadeInLeft animated" data-wow-delay=".5s">
              <div class="personBox_1">
                 <div class="person_image">
                      <img src="images/team1.jpg" class="img-responsive" alt=""/> 
                 </div>
                 <div class="person_image_desc">
                   <h6>Le mot du prof</h6>
                   <p>Coucour toi !</p>
                </div>
                <div class="clearfix"> </div>
             </div>
             <div class="person_description">
                <p>
                    Salut les gens moi c'est Quentin de Junior ISEP ! Si vous voulez en savoir plus sur moi ou Junior ISEP 
                    n'hésitez pas à cliquer sur "plus", allez là clique !<a href="http://www.juniorisep.com/">Plus..</a>
                </p>
             </div>
          </div>
		</div>	
		<div class="clearfix"> </div>
	   </div>
	</div>
<!-- courses -->
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
												<input type="text" value="Nom d'utilisateur" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*391.115*/("""{"""),format.raw/*391.116*/("""this.value = 'Nom d'utilisateur;"""),format.raw/*391.148*/("""}"""),format.raw/*391.149*/("""" required="">	
												<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*392.110*/("""{"""),format.raw/*392.111*/("""this.value = 'Password';"""),format.raw/*392.135*/("""}"""),format.raw/*392.136*/("""" required="">	
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
		$(document).ready(function() """),format.raw/*411.32*/("""{"""),format.raw/*411.33*/("""
		"""),format.raw/*412.3*/("""/*
			var defaults = """),format.raw/*413.19*/("""{"""),format.raw/*413.20*/("""
			"""),format.raw/*414.4*/("""containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			"""),format.raw/*418.4*/("""}"""),format.raw/*418.5*/(""";
		*/								
		$().UItoTop("""),format.raw/*420.15*/("""{"""),format.raw/*420.16*/(""" """),format.raw/*420.17*/("""easingType: 'easeOutQuart' """),format.raw/*420.44*/("""}"""),format.raw/*420.45*/(""");
		"""),format.raw/*421.3*/("""}"""),format.raw/*421.4*/(""");
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<!-- for bootstrap working -->
		<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
</body>
</html>
    
""")))}),format.raw/*431.2*/("""
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
object sentrainer extends sentrainer_Scope0.sentrainer
              /*
                  -- GENERATED --
                  DATE: Wed Jun 15 20:08:26 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/sentrainer.scala.html
                  HASH: e8a85721112841112f3e108f7aff30ac0974c5c1
                  MATRIX: 755->1|867->18|897->23|924->42|963->44|998->53|1634->661|1663->662|1692->663|1748->690|1778->691|1838->723|1867->724|1896->725|1946->747|1975->748|2004->749|3040->1757|3069->1758|3100->1762|3162->1796|3191->1797|3225->1804|3304->1855|3333->1856|3396->1891|3425->1892|3463->1903|3491->1904|3523->1909|3551->1910|16002->14331|16033->14332|16095->14364|16126->14365|16282->14491|16313->14492|16367->14516|16398->14517|17116->15206|17146->15207|17178->15211|17229->15233|17259->15234|17292->15239|17479->15398|17508->15399|17568->15430|17598->15431|17628->15432|17684->15459|17714->15460|17748->15466|17777->15467|18092->15751
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|67->36|67->36|68->37|68->37|68->37|69->38|70->39|70->39|70->39|70->39|71->40|71->40|72->41|72->41|422->391|422->391|422->391|422->391|423->392|423->392|423->392|423->392|442->411|442->411|443->412|444->413|444->413|445->414|449->418|449->418|451->420|451->420|451->420|451->420|451->420|452->421|452->421|462->431
                  -- GENERATED --
              */
          