package typingsSlinky.vueRouter.routerMod

import typingsSlinky.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteRecord extends js.Object {
  var beforeEnter: js.UndefOr[
    js.Function3[
      /* route */ Route, 
      /* redirect */ js.Function1[/* location */ RawLocation, Unit], 
      /* next */ js.Function0[Unit], 
      _
    ]
  ] = js.native
  var components: Dictionary[Component] = js.native
  var instances: Dictionary[Vue] = js.native
  var matchAs: js.UndefOr[String] = js.native
  var meta: js.Any = js.native
  var name: js.UndefOr[String] = js.native
  var parent: js.UndefOr[RouteRecord] = js.native
  var path: String = js.native
  var props: Boolean | js.Object | RoutePropsFunction | (Dictionary[Boolean | js.Object | RoutePropsFunction]) = js.native
  var redirect: js.UndefOr[RedirectOption] = js.native
  var regex: js.RegExp = js.native
}

object RouteRecord {
  @scala.inline
  def apply(
    components: Dictionary[Component],
    instances: Dictionary[Vue],
    meta: js.Any,
    path: String,
    props: Boolean | js.Object | RoutePropsFunction | (Dictionary[Boolean | js.Object | RoutePropsFunction]),
    regex: js.RegExp
  ): RouteRecord = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecord]
  }
  @scala.inline
  implicit class RouteRecordOps[Self <: RouteRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: Dictionary[Component]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstances(value: Dictionary[Vue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropsFunction1(value: /* route */ Route => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProps(
      value: Boolean | js.Object | RoutePropsFunction | (Dictionary[Boolean | js.Object | RoutePropsFunction])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeEnter(
      value: (/* route */ Route, /* redirect */ js.Function1[/* location */ RawLocation, Unit], /* next */ js.Function0[Unit]) => _
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
    def withMatchAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAs")(js.undefined)
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
    def withParent(value: RouteRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
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

