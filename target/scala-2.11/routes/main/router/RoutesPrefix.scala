
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Hassan/Desktop/ponos/conf/routes
// @DATE:Tue Jun 21 00:28:59 CEST 2016


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
