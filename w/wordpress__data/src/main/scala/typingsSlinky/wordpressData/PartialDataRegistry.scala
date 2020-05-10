package typingsSlinky.wordpressData

import typingsSlinky.wordpressData.mod.DispatcherMap
import typingsSlinky.wordpressData.mod.GenericStoreConfig
import typingsSlinky.wordpressData.mod.SelectorMap
import typingsSlinky.wordpressData.mod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/data.@wordpress/data.DataRegistry> */
@js.native
trait PartialDataRegistry extends js.Object {
  var dispatch: js.UndefOr[js.Function1[/* key */ String, DispatcherMap]] = js.native
  var registerGenericStore: js.UndefOr[js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit]] = js.native
  var registerStore: js.UndefOr[FnCall] = js.native
  var select: js.UndefOr[js.Function1[/* key */ String, SelectorMap]] = js.native
  var subscribe: js.UndefOr[Subscriber] = js.native
}

object PartialDataRegistry {
  @scala.inline
  def apply(): PartialDataRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDataRegistry]
  }
  @scala.inline
  implicit class PartialDataRegistryOps[Self <: PartialDataRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispatch(value: /* key */ String => DispatcherMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDispatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterGenericStore(value: (/* key */ String, /* config */ GenericStoreConfig) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerGenericStore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRegisterGenericStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerGenericStore")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterStore(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisterStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerStore")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* key */ String => SelectorMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.undefined)
        ret
    }
  }
  
}

