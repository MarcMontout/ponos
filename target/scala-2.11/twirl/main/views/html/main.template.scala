
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

    <head>
<title>Mon Espace Elève</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta property="og:title" content="Vide" />
<meta name="keywords" content="Eduma Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*20.78*/("""{"""),format.raw/*20.79*/(""" """),format.raw/*20.80*/("""setTimeout(hideURLbar, 0); """),format.raw/*20.107*/("""}"""),format.raw/*20.108*/(""", false);
function hideURLbar()"""),format.raw/*21.22*/("""{"""),format.raw/*21.23*/(""" """),format.raw/*21.24*/("""window.scrollTo(0,1); """),format.raw/*21.46*/("""}"""),format.raw/*21.47*/(""" """),format.raw/*21.48*/("""</script>
<!-- //for-mobile-apps -->
<link href=""""),_display_(/*23.14*/routes/*23.20*/.Assets.at("Stylesheets/bootstrap.css")),format.raw/*23.59*/("""" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href=""""),_display_(/*25.14*/routes/*25.20*/.Assets.at("Stylesheets/nav.css")),format.raw/*25.53*/("""" rel="stylesheet" type="text/css" media="all"/>
<link href=""""),_display_(/*26.14*/routes/*26.20*/.Assets.at("Stylesheets/hoverpack.css")),format.raw/*26.59*/("""" rel='stylesheet' type='text/css' />
<link href=""""),_display_(/*27.14*/routes/*27.20*/.Assets.at("Stylesheets/style.css")),format.raw/*27.55*/("""" rel='stylesheet' type='text/css' />
<!-- js -->
   <script src=""""),_display_(/*29.18*/routes/*29.24*/.Assets.at("javascript/jquery-1.11.1.min.js")),format.raw/*29.69*/(""""></script>
<!-- //js -->
<!-- dropdown -->
<script src=""""),_display_(/*32.15*/routes/*32.21*/.Assets.at("javascript/hoverpack.js")),format.raw/*32.58*/(""""></script>
<!-- //dropdown -->
<!--webfont-->
<link href='//fonts.googleapis.com/css?family=Nunito:400,300,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src=""""),_display_(/*38.38*/routes/*38.44*/.Assets.at("javascript/move-top.js")),format.raw/*38.80*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*39.38*/routes/*39.44*/.Assets.at("javascript/easing.js")),format.raw/*39.78*/(""""></script>
<script type="text/javascript">
    jQuery(document).ready(function($) """),format.raw/*41.40*/("""{"""),format.raw/*41.41*/("""
        """),format.raw/*42.9*/("""$(".scroll").click(function(event)"""),format.raw/*42.43*/("""{"""),format.raw/*42.44*/("""     
            """),format.raw/*43.13*/("""event.preventDefault();
            $('html,body').animate("""),format.raw/*44.36*/("""{"""),format.raw/*44.37*/("""scrollTop:$(this.hash).offset().top"""),format.raw/*44.72*/("""}"""),format.raw/*44.73*/(""",1000);
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/(""");
    """),format.raw/*46.5*/("""}"""),format.raw/*46.6*/(""");
</script>
<!-- start-smoth-scrolling -->
<!--animate-->
<link href= """"),_display_(/*50.15*/routes/*50.21*/.Assets.at("Stylesheets/animate.css")),format.raw/*50.58*/("""" rel="stylesheet" type="text/css" media="all">
<script src=""""),_display_(/*51.15*/routes/*51.21*/.Assets.at("javascript/wow.min.js")),format.raw/*51.56*/(""""></script>
    <script>
         new WOW().init();
    </script>
<!--//end-animate-->

</head>


<body>

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
                         <li><a class="active" href=""""),_display_(/*75.55*/routes/*75.61*/.Application.index()),format.raw/*75.81*/("""">Accueil</a></li>
                         <li><a href=""""),_display_(/*76.40*/routes/*76.46*/.Application.monespace()),format.raw/*76.70*/("""">Mon Espace</a></li>
                         <li><a href=""""),_display_(/*77.40*/routes/*77.46*/.Application.entrainer()),format.raw/*77.70*/("""">S'entraîner</a></li>
                         <li><a href="http://educ.isep.fr">Moodle</a></li>
                           <li><a href="http://www.isep.fr/parcours/">Parcours</a></li>
                         <li class="rectangle"><a href="#" data-toggle="modal" data-target="#myModal">Se connecter</a></li>
                      </ul>
                 </div>
                <div class="clearfix"></div>
            </div>
    </div>

        """),format.raw/*88.32*/("""
        """),_display_(/*89.10*/content),format.raw/*89.17*/("""

"""),format.raw/*91.1*/("""</body>

<div class="footer">
    <div class="container">
        <div class="col-md-3 footer-grid wow fadeInRight animated" data-wow-delay=".5s">
            <h3>A propos</h3>
            <p>Ponos ISEP est un projet développé avec amour par l'équipe du groupe rose de l'ISEP.</p>
        </div>
        <div class="col-md-2 footer-grid wow fadeInRight animated" data-wow-delay=".5s">
            <h3>Navigation</h3>
            <ul>
                <li><a class="active" href=""""),_display_(/*102.46*/routes/*102.52*/.Application.index()),format.raw/*102.72*/("""">Accueil</a></li>
                <li><a href=""""),_display_(/*103.31*/routes/*103.37*/.Application.monespace()),format.raw/*103.61*/("""">Mon Espace</a></li>
                <li><a href=""""),_display_(/*104.31*/routes/*104.37*/.Application.entrainer()),format.raw/*104.61*/("""">S'entraîner</a></li>
                <li><a href="http://educ.isep.fr">Moodle</a></li>                        
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


</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Jun 08 18:10:25 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/main.scala.html
                  HASH: ccbda61a0dab23a402f1bd37acaddbf265e2ea9b
                  MATRIX: 1002->260|1127->290|1155->292|1800->909|1829->910|1858->911|1914->938|1944->939|2003->970|2032->971|2061->972|2111->994|2140->995|2169->996|2246->1046|2261->1052|2321->1091|2427->1170|2442->1176|2496->1209|2585->1271|2600->1277|2660->1316|2738->1367|2753->1373|2809->1408|2903->1475|2918->1481|2984->1526|3069->1584|3084->1590|3142->1627|3545->2003|3560->2009|3617->2045|3693->2094|3708->2100|3763->2134|3874->2217|3903->2218|3939->2227|4001->2261|4030->2262|4076->2280|4163->2339|4192->2340|4255->2375|4284->2376|4327->2392|4356->2393|4390->2400|4418->2401|4518->2474|4533->2480|4591->2517|4680->2579|4695->2585|4751->2620|5658->3500|5673->3506|5714->3526|5799->3584|5814->3590|5859->3614|5947->3675|5962->3681|6007->3705|6481->4241|6518->4251|6546->4258|6575->4260|7082->4739|7098->4745|7140->4765|7217->4814|7233->4820|7279->4844|7359->4896|7375->4902|7421->4926
                  LINES: 32->7|37->7|39->9|50->20|50->20|50->20|50->20|50->20|51->21|51->21|51->21|51->21|51->21|51->21|53->23|53->23|53->23|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|59->29|59->29|59->29|62->32|62->32|62->32|68->38|68->38|68->38|69->39|69->39|69->39|71->41|71->41|72->42|72->42|72->42|73->43|74->44|74->44|74->44|74->44|75->45|75->45|76->46|76->46|80->50|80->50|80->50|81->51|81->51|81->51|105->75|105->75|105->75|106->76|106->76|106->76|107->77|107->77|107->77|117->88|118->89|118->89|120->91|131->102|131->102|131->102|132->103|132->103|132->103|133->104|133->104|133->104
                  -- GENERATED --
              */
          