
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Hassan/Desktop/ponos/conf/routes
// @DATE:Tue Jun 21 00:28:59 CEST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:8
  Qcm_3: controllers.Qcm,
  // @LINE:11
  Session_1: controllers.Session,
  // @LINE:14
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:8
    Qcm_3: controllers.Qcm,
    // @LINE:11
    Session_1: controllers.Session,
    // @LINE:14
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_2, Qcm_3, Session_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Qcm_3, Session_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """qcm""", """controllers.Qcm.afficheqcm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.Session.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """monespace""", """controllers.Application.monespace()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ancienqcm""", """controllers.Application.ancienqcm()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entrainer""", """controllers.Application.entrainer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """espaceprof""", """controllers.Application.espaceprof()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """q1""", """controllers.Application.question1()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """q2""", """controllers.Application.question2()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """q3""", """controllers.Application.question3()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """q4""", """controllers.Application.question4()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """q5""", """controllers.Application.question5()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Qcm_afficheqcm1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("qcm")))
  )
  private[this] lazy val controllers_Qcm_afficheqcm1_invoker = createInvoker(
    Qcm_3.afficheqcm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Qcm",
      "afficheqcm",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """qcm"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Session_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_Session_message2_invoker = createInvoker(
    Session_1.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Session",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_monespace4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("monespace")))
  )
  private[this] lazy val controllers_Application_monespace4_invoker = createInvoker(
    Application_2.monespace(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "monespace",
      Nil,
      "GET",
      """""",
      this.prefix + """monespace"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_ancienqcm5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ancienqcm")))
  )
  private[this] lazy val controllers_Application_ancienqcm5_invoker = createInvoker(
    Application_2.ancienqcm(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "ancienqcm",
      Nil,
      "GET",
      """""",
      this.prefix + """ancienqcm"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_entrainer6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entrainer")))
  )
  private[this] lazy val controllers_Application_entrainer6_invoker = createInvoker(
    Application_2.entrainer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "entrainer",
      Nil,
      "GET",
      """""",
      this.prefix + """entrainer"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_espaceprof7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("espaceprof")))
  )
  private[this] lazy val controllers_Application_espaceprof7_invoker = createInvoker(
    Application_2.espaceprof(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "espaceprof",
      Nil,
      "GET",
      """""",
      this.prefix + """espaceprof"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login8_invoker = createInvoker(
    Application_2.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_question19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("q1")))
  )
  private[this] lazy val controllers_Application_question19_invoker = createInvoker(
    Application_2.question1(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "question1",
      Nil,
      "GET",
      """""",
      this.prefix + """q1"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_question210_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("q2")))
  )
  private[this] lazy val controllers_Application_question210_invoker = createInvoker(
    Application_2.question2(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "question2",
      Nil,
      "GET",
      """""",
      this.prefix + """q2"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_question311_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("q3")))
  )
  private[this] lazy val controllers_Application_question311_invoker = createInvoker(
    Application_2.question3(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "question3",
      Nil,
      "GET",
      """""",
      this.prefix + """q3"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_question412_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("q4")))
  )
  private[this] lazy val controllers_Application_question412_invoker = createInvoker(
    Application_2.question4(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "question4",
      Nil,
      "GET",
      """""",
      this.prefix + """q4"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Application_question513_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("q5")))
  )
  private[this] lazy val controllers_Application_question513_invoker = createInvoker(
    Application_2.question5(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "question5",
      Nil,
      "GET",
      """""",
      this.prefix + """q5"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index())
      }
  
    // @LINE:8
    case controllers_Qcm_afficheqcm1_route(params) =>
      call { 
        controllers_Qcm_afficheqcm1_invoker.call(Qcm_3.afficheqcm)
      }
  
    // @LINE:11
    case controllers_Session_message2_route(params) =>
      call { 
        controllers_Session_message2_invoker.call(Session_1.message)
      }
  
    // @LINE:14
    case controllers_Assets_at3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:16
    case controllers_Application_monespace4_route(params) =>
      call { 
        controllers_Application_monespace4_invoker.call(Application_2.monespace())
      }
  
    // @LINE:18
    case controllers_Application_ancienqcm5_route(params) =>
      call { 
        controllers_Application_ancienqcm5_invoker.call(Application_2.ancienqcm())
      }
  
    // @LINE:20
    case controllers_Application_entrainer6_route(params) =>
      call { 
        controllers_Application_entrainer6_invoker.call(Application_2.entrainer())
      }
  
    // @LINE:22
    case controllers_Application_espaceprof7_route(params) =>
      call { 
        controllers_Application_espaceprof7_invoker.call(Application_2.espaceprof())
      }
  
    // @LINE:24
    case controllers_Application_login8_route(params) =>
      call { 
        controllers_Application_login8_invoker.call(Application_2.login())
      }
  
    // @LINE:26
    case controllers_Application_question19_route(params) =>
      call { 
        controllers_Application_question19_invoker.call(Application_2.question1())
      }
  
    // @LINE:28
    case controllers_Application_question210_route(params) =>
      call { 
        controllers_Application_question210_invoker.call(Application_2.question2())
      }
  
    // @LINE:30
    case controllers_Application_question311_route(params) =>
      call { 
        controllers_Application_question311_invoker.call(Application_2.question3())
      }
  
    // @LINE:32
    case controllers_Application_question412_route(params) =>
      call { 
        controllers_Application_question412_invoker.call(Application_2.question4())
      }
  
    // @LINE:34
    case controllers_Application_question513_route(params) =>
      call { 
        controllers_Application_question513_invoker.call(Application_2.question5())
      }
  }
}
