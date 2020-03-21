package typingsSlinky.vueRouter

import typingsSlinky.vueRouter.mod.default
import typingsSlinky.vueRouter.routerMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$route")
    var $route: Route = js.native
    @JSName("$router")
    var $router: default = js.native
  }
  
}

