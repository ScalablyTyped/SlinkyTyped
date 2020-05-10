package typingsSlinky.tinajsTina

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Partial
import typingsSlinky.tinajsTina.mod.Component
import typingsSlinky.tinajsTina.mod.ComponentProperties
import typingsSlinky.tinajsTina.mod.Page
import typingsSlinky.tinajsTina.mod.PageDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@tinajs/tina.@tinajs/tina.PageDefinitions> */
@js.native
trait PartialPageDefinitions extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeLoad: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[js.Any], StringDictionary[_]]] = js.native
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  var methods: js.UndefOr[
    StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
  ] = js.native
  var mixins: js.UndefOr[js.Array[Partial[PageDefinitions]]] = js.native
  var moved: js.UndefOr[js.Function0[Unit]] = js.native
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  var onLoad: js.UndefOr[js.ThisFunction1[/* this */ Page, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  var onPageScroll: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.native
  var onPullDownRefresh: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.native
  var onReachBottom: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.native
  var onReady: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  var onShareAppMessage: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.native
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  var onUnload: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  var properties: js.UndefOr[ComponentProperties] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
}

object PartialPageDefinitions {
  @scala.inline
  def apply(): PartialPageDefinitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageDefinitions]
  }
  @scala.inline
  implicit class PartialPageDefinitionsOps[Self <: PartialPageDefinitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttached(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAttached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLoad(value: js.ThisFunction0[/* this */ Page, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withCompute(value: /* data */ StringDictionary[js.Any] => StringDictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compute")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDetached(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDetached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withMixins(value: js.Array[Partial[PageDefinitions]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(js.undefined)
        ret
    }
    @scala.inline
    def withMoved(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moved")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: js.ThisFunction0[/* this */ Page, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: js.ThisFunction1[/* this */ Page, /* options */ js.UndefOr[js.Any], Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageScroll(value: /* event */ Page => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPullDownRefresh(value: /* event */ Page => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPullDownRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDownRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReachBottom(value: /* event */ Page => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReachBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: js.ThisFunction0[/* this */ Page, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShareAppMessage(value: /* event */ Page => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShareAppMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShareAppMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShareAppMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: js.ThisFunction0[/* this */ Page, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnload(value: js.ThisFunction0[/* this */ Page, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnload")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: ComponentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
  }
  
}

