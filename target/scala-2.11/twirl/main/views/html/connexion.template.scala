
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object connexion_Scope0 {
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

class connexion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Connexion")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<head>
<title>Connexion</title>
	
	<link href=""""),_display_(/*10.15*/routes/*10.21*/.Assets.at("Stylesheets/login.css")),format.raw/*10.56*/("""" rel='stylesheet' type='text/css' />

</head>

<body>

	<div class="container">
    
	    <form class="form-signin">
	        <h2 class="form-signin-heading">Please sign in</h2>
	        <label for="inputEmail" class="sr-only">Email address</label>
	        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
	        <label for="inputPassword" class="sr-only">Password</label>
	        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
	        <div class="checkbox">
	          <label>
	            <input type="checkbox" value="remember-me"> Remember me
	          </label>
	        </div>
	        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	      </form>
	</div>

</body>
</html>
""")))}),format.raw/*35.2*/("""
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
object connexion extends connexion_Scope0.connexion
              /*
                  -- GENERATED --
                  DATE: Wed Jun 15 21:50:00 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/connexion.scala.html
                  HASH: a048969ec3ecc4239de6123b1c1340f715f41f3f
                  MATRIX: 753->1|865->18|895->23|920->40|959->42|989->46|1092->122|1107->128|1163->163|2042->1012
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|41->10|41->10|41->10|66->35
                  -- GENERATED --
              */
          