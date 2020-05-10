package typingsSlinky.vueRouter.vueMod

import typingsSlinky.vueRouter.mod.default
import typingsSlinky.vueRouter.routerMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vue extends js.Object {
  @JSName("$route")
  var $route: Route = js.native
  @JSName("$router")
  var $router: default = js.native
}

object Vue {
  @scala.inline
  def apply($route: Route, $router: default): Vue = {
    val __obj = js.Dynamic.literal($route = $route.asInstanceOf[js.Any], $router = $router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vue]
  }
  @scala.inline
  implicit class VueOps[Self <: Vue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$route(value: Route): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$router(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$router")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

