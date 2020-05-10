package typingsSlinky.vueRouter.optionsMod

import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vueRouter.mod.default
import typingsSlinky.vueRouter.routerMod.NavigationGuard
import typingsSlinky.vueRouter.routerMod.RawLocation
import typingsSlinky.vueRouter.routerMod.Route
import typingsSlinky.vueRouter.vueRouterBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var beforeRouteEnter: js.UndefOr[NavigationGuard[V]] = js.native
  var beforeRouteLeave: js.UndefOr[NavigationGuard[V]] = js.native
  var beforeRouteUpdate: js.UndefOr[NavigationGuard[V]] = js.native
  var router: js.UndefOr[default] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply[V](): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[V]]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self[v] <: ComponentOptions[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withBeforeRouteEnter(
      value: (/* to */ Route, /* from */ Route, /* next */ js.Function1[
          /* to */ js.UndefOr[RawLocation | `false` | (js.Function1[V, js.Any]) | Unit], 
          Unit
        ]) => js.Any
    ): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRouteEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeRouteEnter: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRouteEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRouteLeave(
      value: (/* to */ Route, /* from */ Route, /* next */ js.Function1[
          /* to */ js.UndefOr[RawLocation | `false` | (js.Function1[V, js.Any]) | Unit], 
          Unit
        ]) => js.Any
    ): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRouteLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeRouteLeave: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRouteLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRouteUpdate(
      value: (/* to */ Route, /* from */ Route, /* next */ js.Function1[
          /* to */ js.UndefOr[RawLocation | `false` | (js.Function1[V, js.Any]) | Unit], 
          Unit
        ]) => js.Any
    ): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRouteUpdate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeRouteUpdate: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRouteUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRouter(value: default): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouter: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(js.undefined)
        ret
    }
  }
  
}

