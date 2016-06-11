
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Hassan/Desktop/ponos/conf/routes
// @DATE:Wed Jun 08 18:42:54 CEST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
