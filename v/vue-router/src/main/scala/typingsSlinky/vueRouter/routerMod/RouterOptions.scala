package typingsSlinky.vueRouter.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterOptions extends js.Object {
  var base: js.UndefOr[String] = js.native
  var fallback: js.UndefOr[Boolean] = js.native
  var linkActiveClass: js.UndefOr[String] = js.native
  var linkExactActiveClass: js.UndefOr[String] = js.native
  var mode: js.UndefOr[RouterMode] = js.native
  var parseQuery: js.UndefOr[js.Function1[/* query */ String, js.Object]] = js.native
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.native
  var scrollBehavior: js.UndefOr[
    js.Function3[
      /* to */ Route, 
      /* from */ Route, 
      /* savedPosition */ Position | Unit, 
      js.UndefOr[PositionResult | js.Promise[PositionResult] | Null]
    ]
  ] = js.native
  var stringifyQuery: js.UndefOr[js.Function1[/* query */ js.Object, String]] = js.native
}

object RouterOptions {
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  @scala.inline
  implicit class RouterOptionsOps[Self <: RouterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkActiveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkActiveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkExactActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkExactActiveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkExactActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkExactActiveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: RouterMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withParseQuery(value: /* query */ String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[RouteConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollBehavior(
      value: (/* to */ Route, /* from */ Route, /* savedPosition */ Position | Unit) => js.UndefOr[PositionResult | js.Promise[PositionResult] | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBehavior")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutScrollBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withStringifyQuery(value: /* query */ js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifyQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStringifyQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifyQuery")(js.undefined)
        ret
    }
  }
  
}

