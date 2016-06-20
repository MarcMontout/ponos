
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Hassan/Desktop/ponos/conf/routes
// @DATE:Mon Jun 20 16:23:41 CEST 2016

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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entrainer""", """controllers.Application.entrainer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """espaceprof""", """controllers.Application.espaceprof()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """question""", """controllers.Application.question()"""),
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
  private[this] lazy val controllers_Application_entrainer5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entrainer")))
  )
  private[this] lazy val controllers_Application_entrainer5_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_Application_espaceprof6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("espaceprof")))
  )
  private[this] lazy val controllers_Application_espaceprof6_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_Application_login7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login7_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_Application_question8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("question")))
  )
  private[this] lazy val controllers_Application_question8_invoker = createInvoker(
    Application_2.question(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "question",
      Nil,
      "GET",
      """""",
      this.prefix + """question"""
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
    case controllers_Application_entrainer5_route(params) =>
      call { 
        controllers_Application_entrainer5_invoker.call(Application_2.entrainer())
      }
  
    // @LINE:20
    case controllers_Application_espaceprof6_route(params) =>
      call { 
        controllers_Application_espaceprof6_invoker.call(Application_2.espaceprof())
      }
  
    // @LINE:22
    case controllers_Application_login7_route(params) =>
      call { 
        controllers_Application_login7_invoker.call(Application_2.login())
      }
  
    // @LINE:24
    case controllers_Application_question8_route(params) =>
      call { 
        controllers_Application_question8_invoker.call(Application_2.question())
      }
  }
}
