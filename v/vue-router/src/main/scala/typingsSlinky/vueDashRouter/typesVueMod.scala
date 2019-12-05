package typingsSlinky.vueDashRouter

import typingsSlinky.vueDashRouter.typesRouterMod.Route
import typingsSlinky.vueDashRouter.vueDashRouterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object typesVueMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$route")
    var $route: Route = js.native
    @JSName("$router")
    var $router: default = js.native
  }
  
}

