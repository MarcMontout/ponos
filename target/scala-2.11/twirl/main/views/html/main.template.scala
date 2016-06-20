
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
<html>
    <head>
        
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta property="og:title" content="Vide" />
<meta name="keywords" content="Eduma Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*19.78*/("""{"""),format.raw/*19.79*/(""" """),format.raw/*19.80*/("""setTimeout(hideURLbar, 0); """),format.raw/*19.107*/("""}"""),format.raw/*19.108*/(""", false);
function hideURLbar()"""),format.raw/*20.22*/("""{"""),format.raw/*20.23*/(""" """),format.raw/*20.24*/("""window.scrollTo(0,1); """),format.raw/*20.46*/("""}"""),format.raw/*20.47*/(""" """),format.raw/*20.48*/("""</script>
<!-- //for-mobile-apps -->
<link href=""""),_display_(/*22.14*/routes/*22.20*/.Assets.at("Stylesheets/bootstrap.css")),format.raw/*22.59*/("""" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href=""""),_display_(/*24.14*/routes/*24.20*/.Assets.at("Stylesheets/nav.css")),format.raw/*24.53*/("""" rel="stylesheet" type="text/css" media="all"/>
<link href=""""),_display_(/*25.14*/routes/*25.20*/.Assets.at("Stylesheets/hoverpack.css")),format.raw/*25.59*/("""" rel='stylesheet' type='text/css' />
<link href=""""),_display_(/*26.14*/routes/*26.20*/.Assets.at("Stylesheets/style.css")),format.raw/*26.55*/("""" rel='stylesheet' type='text/css' />
<!-- js -->
   <script src=""""),_display_(/*28.18*/routes/*28.24*/.Assets.at("javascripts/jquery-1.11.1.min.js")),format.raw/*28.70*/(""""></script>
<!-- //js -->
<!-- dropdown -->
<script src=""""),_display_(/*31.15*/routes/*31.21*/.Assets.at("javascripts/hoverpack.js")),format.raw/*31.59*/(""""></script>
<!-- //dropdown -->
<!--webfont-->
<link href='//fonts.googleapis.com/css?family=Nunito:400,300,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src=""""),_display_(/*37.38*/routes/*37.44*/.Assets.at("javascripts/move-top.js")),format.raw/*37.81*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*38.38*/routes/*38.44*/.Assets.at("javascripts/easing.js")),format.raw/*38.79*/(""""></script>
<script type="text/javascript">
    jQuery(document).ready(function($) """),format.raw/*40.40*/("""{"""),format.raw/*40.41*/("""
        """),format.raw/*41.9*/("""$(".scroll").click(function(event)"""),format.raw/*41.43*/("""{"""),format.raw/*41.44*/("""     
            """),format.raw/*42.13*/("""event.preventDefault();
            $('html,body').animate("""),format.raw/*43.36*/("""{"""),format.raw/*43.37*/("""scrollTop:$(this.hash).offset().top"""),format.raw/*43.72*/("""}"""),format.raw/*43.73*/(""",1000);
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/(""");
    """),format.raw/*45.5*/("""}"""),format.raw/*45.6*/(""");
</script>
<!-- start-smoth-scrolling -->
<!--animate-->
<link href= """"),_display_(/*49.15*/routes/*49.21*/.Assets.at("Stylesheets/animate.css")),format.raw/*49.58*/("""" rel="stylesheet" type="text/css" media="all">
<script src=""""),_display_(/*50.15*/routes/*50.21*/.Assets.at("javascripts/wow.min.js")),format.raw/*50.57*/(""""></script>
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
                        <a class="link link--kumya" href=""""),_display_(/*65.60*/routes/*65.66*/.Application.index()),format.raw/*65.86*/(""""><i></i><span data-letters="PONOS-ISEP">PONOS ISEP</span></a>
                    </h1>
                </div>
                <div class="top-nav wow fadeInUp animated" data-wow-delay=".5s">                                        
                        <label class="mobile_menu" for="mobile_menu">
                        <span>Menu</span>
                        </label>
                        <input id="mobile_menu" type="checkbox">
                        <ul class="nav">
                         <li><a class="active" href=""""),_display_(/*74.55*/routes/*74.61*/.Application.index()),format.raw/*74.81*/("""">Accueil</a></li>
                         <li><a href=""""),_display_(/*75.40*/routes/*75.46*/.Application.monespace()),format.raw/*75.70*/("""">Mon Espace</a></li>
                         <li><a href=""""),_display_(/*76.40*/routes/*76.46*/.Application.entrainer()),format.raw/*76.70*/("""">S'entraîner</a></li>
                         <li><a href="http://educ.isep.fr">Moodle</a></li>
                         <li><a href="http://www.isep.fr/parcours/">Parcours</a></li>
                         <li class="rectangle"><a href=""""),_display_(/*79.58*/routes/*79.64*/.Application.login()),format.raw/*79.84*/("""">Se connecter</a></li>
                      </ul>
                 </div>
                <div class="clearfix"></div>
            </div>
    </div>

        """),format.raw/*87.32*/("""
        """),_display_(/*88.10*/content),format.raw/*88.17*/("""

"""),format.raw/*90.1*/("""</body>

<div class="footer">
    <div class="container">
        <div class="col-md-3 footer-grid wow fadeInRight animated" data-wow-delay=".5s">
            <h3>A propos</h3>
            <p>Ponos ISEP est un projet développé avec amour par l'équipe du groupe rose de l'ISEP.</p>
        </div>
        <div class="col-md-2 footer-grid wow fadeInRight animated" data-wow-delay=".5s">
            <h3>Navigation</h3>
            <ul>
                <li><a class="active" href=""""),_display_(/*101.46*/routes/*101.52*/.Application.index()),format.raw/*101.72*/("""">Accueil</a></li>
                <li><a href=""""),_display_(/*102.31*/routes/*102.37*/.Application.monespace()),format.raw/*102.61*/("""">Mon Espace</a></li>
                <li><a href=""""),_display_(/*103.31*/routes/*103.37*/.Application.entrainer()),format.raw/*103.61*/("""">S'entraîner</a></li>
                <li><a href="http://educ.isep.fr">Moodle</a></li>
                <li><a href=""""),_display_(/*105.31*/routes/*105.37*/.Application.espaceprof()),format.raw/*105.62*/("""">Espace professeur</a></li>                        
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
        <script src=""""),_display_(/*151.23*/routes/*151.29*/.Assets.at("javascripts/bootstrap.js")),format.raw/*151.67*/(""""></script>

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
                  DATE: Tue Jun 21 00:28:59 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/main.scala.html
                  HASH: 9bc085fcce61c11cdab38dbbf31d223ea403e84c
                  MATRIX: 1002->260|1127->290|1155->292|1766->875|1795->876|1824->877|1880->904|1910->905|1969->936|1998->937|2027->938|2077->960|2106->961|2135->962|2212->1012|2227->1018|2287->1057|2393->1136|2408->1142|2462->1175|2551->1237|2566->1243|2626->1282|2704->1333|2719->1339|2775->1374|2869->1441|2884->1447|2951->1493|3036->1551|3051->1557|3110->1595|3513->1971|3528->1977|3586->2014|3662->2063|3677->2069|3733->2104|3844->2187|3873->2188|3909->2197|3971->2231|4000->2232|4046->2250|4133->2309|4162->2310|4225->2345|4254->2346|4297->2362|4326->2363|4360->2370|4388->2371|4488->2444|4503->2450|4561->2487|4650->2549|4665->2555|4722->2591|5082->2924|5097->2930|5138->2950|5703->3488|5718->3494|5759->3514|5844->3572|5859->3578|5904->3602|5992->3663|6007->3669|6052->3693|6320->3934|6335->3940|6376->3960|6564->4210|6601->4220|6629->4227|6658->4229|7165->4708|7181->4714|7223->4734|7300->4783|7316->4789|7362->4813|7442->4865|7458->4871|7504->4895|7651->5014|7667->5020|7714->5045|8970->6272|9000->6273|9037->6282|9096->6312|9126->6313|9168->6326|9388->6517|9418->6518|9510->6581|9540->6582|9570->6583|9626->6610|9656->6611|9695->6622|9725->6623|9958->6828|9974->6834|10034->6872
                  LINES: 32->7|37->7|39->9|49->19|49->19|49->19|49->19|49->19|50->20|50->20|50->20|50->20|50->20|50->20|52->22|52->22|52->22|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|58->28|58->28|58->28|61->31|61->31|61->31|67->37|67->37|67->37|68->38|68->38|68->38|70->40|70->40|71->41|71->41|71->41|72->42|73->43|73->43|73->43|73->43|74->44|74->44|75->45|75->45|79->49|79->49|79->49|80->50|80->50|80->50|95->65|95->65|95->65|104->74|104->74|104->74|105->75|105->75|105->75|106->76|106->76|106->76|109->79|109->79|109->79|116->87|117->88|117->88|119->90|130->101|130->101|130->101|131->102|131->102|131->102|132->103|132->103|132->103|134->105|134->105|134->105|165->136|165->136|166->137|167->138|167->138|168->139|172->143|172->143|174->145|174->145|174->145|174->145|174->145|175->146|175->146|180->151|180->151|180->151
                  -- GENERATED --
              */
          