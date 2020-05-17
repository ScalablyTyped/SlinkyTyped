package typingsSlinky.vueRouter.routerMod

import typingsSlinky.vue.optionsMod.DefaultComputed
import typingsSlinky.vue.optionsMod.DefaultData
import typingsSlinky.vue.optionsMod.DefaultMethods
import typingsSlinky.vue.optionsMod.DefaultProps
import typingsSlinky.vue.optionsMod.EsModuleComponent
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vueRouter.vueRouterBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteConfig extends js.Object {
  var alias: js.UndefOr[String | js.Array[String]] = js.native
  var beforeEnter: js.UndefOr[NavigationGuard[Vue]] = js.native
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[js.Array[RouteConfig]] = js.native
  var component: js.UndefOr[Component] = js.native
  var components: js.UndefOr[Dictionary[Component]] = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[String] = js.native
  var path: String = js.native
  var pathToRegexpOptions: js.UndefOr[PathToRegexpOptions] = js.native
  var props: js.UndefOr[Boolean | js.Object | RoutePropsFunction] = js.native
  var redirect: js.UndefOr[RedirectOption] = js.native
}

object RouteConfig {
  @scala.inline
  def apply(path: String): RouteConfig = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfig]
  }
  @scala.inline
  implicit class RouteConfigOps[Self <: RouteConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlias(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeEnter(
      value: (/* to */ Route, /* from */ Route, /* next */ js.Function1[
          /* to */ js.UndefOr[RawLocation | `false` | (js.Function1[Vue, js.Any]) | Unit], 
          Unit
        ]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[RouteConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentFunction2(
      value: (/* resolve */ js.Function1[
          /* component */ typingsSlinky.vue.optionsMod.Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ], 
          Unit
        ], /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => (js.Promise[
          (typingsSlinky.vue.optionsMod.Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]) | EsModuleComponent
        ]) | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withComponentFunction0(
      value: () => typingsSlinky.vue.anon.Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComponent(value: Component): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: Dictionary[Component]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPathToRegexpOptions(value: PathToRegexpOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToRegexpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathToRegexpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToRegexpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPropsFunction1(value: /* route */ Route => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProps(value: Boolean | js.Object | RoutePropsFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectFunction1(value: /* to */ Route => RawLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRedirect(value: RedirectOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(js.undefined)
        ret
    }
  }
  
}

