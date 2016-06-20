
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
<title>Ponos ISEP</title>
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
                        <a class="link link--kumya" href=""""),_display_(/*66.60*/routes/*66.66*/.Application.index()),format.raw/*66.86*/(""""><i></i><span data-letters="PONOS-ISEP">PONOS ISEP</span></a>
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
                         <li class="rectangle"><a href=""""),_display_(/*80.58*/routes/*80.64*/.Application.login()),format.raw/*80.84*/("""">Se connecter</a></li>
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

<!-- smooth scrolling -->
    <script type="text/javascript">
        $(document).ready(function() """),format.raw/*136.38*/("""{"""),format.raw/*136.39*/("""
        """),format.raw/*137.9*/("""/*
            var defaults = """),format.raw/*138.28*/("""{"""),format.raw/*138.29*/("""
            """),format.raw/*139.13*/("""containerID: 'toTop', // fading element id
            containerHoverID: 'toTopHover', // fading element hover id
            scrollSpeed: 1200,
            easingType: 'linear' 
            """),format.raw/*143.13*/("""}"""),format.raw/*143.14*/(""";
        */                              
        $().UItoTop("""),format.raw/*145.21*/("""{"""),format.raw/*145.22*/(""" """),format.raw/*145.23*/("""easingType: 'easeOutQuart' """),format.raw/*145.50*/("""}"""),format.raw/*145.51*/(""");
        """),format.raw/*146.9*/("""}"""),format.raw/*146.10*/(""");
    </script>
    <a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<!-- for bootstrap working -->
        <script src=""""),_display_(/*151.23*/routes/*151.29*/.Assets.at("javascript/bootstrap.js")),format.raw/*151.66*/(""""></script>

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
                  DATE: Mon Jun 20 18:48:48 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/main.scala.html
                  HASH: 71d8c9a7e9d6b26deccb63beec1583ffb7b27d39
                  MATRIX: 1002->260|1127->290|1155->292|1794->903|1823->904|1852->905|1908->932|1938->933|1997->964|2026->965|2055->966|2105->988|2134->989|2163->990|2240->1040|2255->1046|2315->1085|2421->1164|2436->1170|2490->1203|2579->1265|2594->1271|2654->1310|2732->1361|2747->1367|2803->1402|2897->1469|2912->1475|2978->1520|3063->1578|3078->1584|3136->1621|3539->1997|3554->2003|3611->2039|3687->2088|3702->2094|3757->2128|3868->2211|3897->2212|3933->2221|3995->2255|4024->2256|4070->2274|4157->2333|4186->2334|4249->2369|4278->2370|4321->2386|4350->2387|4384->2394|4412->2395|4512->2468|4527->2474|4585->2511|4674->2573|4689->2579|4745->2614|5105->2947|5120->2953|5161->2973|5726->3511|5741->3517|5782->3537|5867->3595|5882->3601|5927->3625|6015->3686|6030->3692|6075->3716|6343->3957|6358->3963|6399->3983|6587->4233|6624->4243|6652->4250|6681->4252|7188->4731|7204->4737|7246->4757|7323->4806|7339->4812|7385->4836|7465->4888|7481->4894|7527->4918|8843->6205|8873->6206|8910->6215|8969->6245|8999->6246|9041->6259|9261->6450|9291->6451|9383->6514|9413->6515|9443->6516|9499->6543|9529->6544|9568->6555|9598->6556|9831->6761|9847->6767|9906->6804
                  LINES: 32->7|37->7|39->9|50->20|50->20|50->20|50->20|50->20|51->21|51->21|51->21|51->21|51->21|51->21|53->23|53->23|53->23|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|59->29|59->29|59->29|62->32|62->32|62->32|68->38|68->38|68->38|69->39|69->39|69->39|71->41|71->41|72->42|72->42|72->42|73->43|74->44|74->44|74->44|74->44|75->45|75->45|76->46|76->46|80->50|80->50|80->50|81->51|81->51|81->51|96->66|96->66|96->66|105->75|105->75|105->75|106->76|106->76|106->76|107->77|107->77|107->77|110->80|110->80|110->80|117->88|118->89|118->89|120->91|131->102|131->102|131->102|132->103|132->103|132->103|133->104|133->104|133->104|165->136|165->136|166->137|167->138|167->138|168->139|172->143|172->143|174->145|174->145|174->145|174->145|174->145|175->146|175->146|180->151|180->151|180->151
                  -- GENERATED --
              */
          