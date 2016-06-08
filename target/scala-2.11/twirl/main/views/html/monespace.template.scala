
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
												<input type="text" value="Nom d'utilisateur" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*30.115*/("""{"""),format.raw/*30.116*/("""this.value = 'Nom d'utilisateur;"""),format.raw/*30.148*/("""}"""),format.raw/*30.149*/("""" required="">	
												<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*31.110*/("""{"""),format.raw/*31.111*/("""this.value = 'Password';"""),format.raw/*31.135*/("""}"""),format.raw/*31.136*/("""" required="">	
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
		$(document).ready(function() """),format.raw/*51.32*/("""{"""),format.raw/*51.33*/("""
		"""),format.raw/*52.3*/("""/*
			var defaults = """),format.raw/*53.19*/("""{"""),format.raw/*53.20*/("""
			"""),format.raw/*54.4*/("""containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			"""),format.raw/*58.4*/("""}"""),format.raw/*58.5*/(""";
		*/								
		$().UItoTop("""),format.raw/*60.15*/("""{"""),format.raw/*60.16*/(""" """),format.raw/*60.17*/("""easingType: 'easeOutQuart' """),format.raw/*60.44*/("""}"""),format.raw/*60.45*/(""");
		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/(""");
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<!-- for bootstrap working -->
		<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
</body>
</html>
    
""")))}),format.raw/*71.2*/("""
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
                  DATE: Wed Jun 08 17:06:10 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/monespace.scala.html
                  HASH: 5302360755b4f0848e2b22528a1478c2f898858c
                  MATRIX: 753->1|865->18|895->23|921->41|960->43|991->48|1879->907|1909->908|1970->940|2000->941|2155->1067|2185->1068|2238->1092|2268->1093|2987->1784|3016->1785|3047->1789|3097->1811|3126->1812|3158->1817|3344->1976|3372->1977|3431->2008|3460->2009|3489->2010|3544->2037|3573->2038|3606->2044|3634->2045|3948->2329
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|82->51|82->51|83->52|84->53|84->53|85->54|89->58|89->58|91->60|91->60|91->60|91->60|91->60|92->61|92->61|102->71
                  -- GENERATED --
              */
          