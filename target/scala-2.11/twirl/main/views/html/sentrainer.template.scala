
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
</head>

<body>
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

                        <div class="name_col"><a href=""""),_display_(/*29.57*/routes/*29.63*/.Application.question1()),format.raw/*29.87*/("""">Programmation n°1</a></div>

                        <div class="duration_col">20 minutes</div>

                        <div class="date_col">25/05/2016</div>
                    </li>

                    <li class="clearfix">
                        <div class="id_col">(II:2275)</div>

                        <div class="name_col"><a href=""""),_display_(/*39.57*/routes/*39.63*/.Application.question2()),format.raw/*39.87*/("""">Programmation n°2</a></div>

                        <div class="duration_col">40 minutes</div>

                        <div class="date_col">27/03/2016</div>
                    </li>

                    <li class="clearfix">
                        <div class="id_col">(II:2095)</div>

                        <div class="name_col"><a href=""""),_display_(/*49.57*/routes/*49.63*/.Application.question3()),format.raw/*49.87*/("""">Mathématiques n°1</a></div>

                        <div class="duration_col">35 minutes</div>

                        <div class="date_col">11/12/2015</div>
                    </li>

                    <li class="clearfix">
                        <div class="id_col">(II:2735)</div>

                        <div class="name_col"><a href=""""),_display_(/*59.57*/routes/*59.63*/.Application.question4()),format.raw/*59.87*/("""">Cisco n°1</a></div>

                        <div class="duration_col">10 minutes</div>

                        <div class="date_col">27/03/2016</div>
                    </li>

                    <li class="clearfix">
                        <div class="id_col">(II:2735)</div>

                        <div class="name_col"><a href=""""),_display_(/*69.57*/routes/*69.63*/.Application.question5()),format.raw/*69.87*/("""">Cisco n°2</a></div>

                        <div class="duration_col">50 minutes</div>

                        <div class="date_col">27/03/2016</div>
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
                      <img src=""""),_display_(/*138.34*/routes/*138.40*/.Assets.at("images/team.jpg")),format.raw/*138.69*/("""" class="img-responsive" alt=""/> 
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
</body>
</html>
    
""")))}),format.raw/*160.2*/("""
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
                  DATE: Mon Jun 20 23:57:26 CEST 2016
                  SOURCE: C:/Users/Hassan/Desktop/ponos/app/views/sentrainer.scala.html
                  HASH: a10a40db75274fc69689e22e4f5803f864ec6449
                  MATRIX: 755->1|867->18|897->23|924->42|963->44|1001->56|1887->915|1902->921|1947->945|2332->1303|2347->1309|2392->1333|2777->1691|2792->1697|2837->1721|3222->2079|3237->2085|3282->2109|3659->2459|3674->2465|3719->2489|6726->5468|6742->5474|6793->5503|7597->6276
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|60->29|60->29|60->29|70->39|70->39|70->39|80->49|80->49|80->49|90->59|90->59|90->59|100->69|100->69|100->69|169->138|169->138|169->138|191->160
                  -- GENERATED --
              */
          