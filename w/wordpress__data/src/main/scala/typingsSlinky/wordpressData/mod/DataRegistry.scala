package typingsSlinky.wordpressData.mod

import typingsSlinky.wordpressData.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRegistry extends js.Object {
  var dispatch: js.Function1[/* key */ String, DispatcherMap] = js.native
  var registerGenericStore: js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit] = js.native
  var registerStore: FnCall = js.native
  var select: js.Function1[/* key */ String, SelectorMap] = js.native
  var subscribe: Subscriber = js.native
}

object DataRegistry {
  @scala.inline
  def apply(
    dispatch: /* key */ String => DispatcherMap,
    registerGenericStore: (/* key */ String, /* config */ GenericStoreConfig) => Unit,
    registerStore: FnCall,
    select: /* key */ String => SelectorMap,
    subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
  ): DataRegistry = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), registerGenericStore = js.Any.fromFunction2(registerGenericStore), registerStore = registerStore.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[DataRegistry]
  }
  @scala.inline
  implicit class DataRegistryOps[Self <: DataRegistry] (val x: Self) extends AnyVal {
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
    def withRegisterGenericStore(value: (/* key */ String, /* config */ GenericStoreConfig) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerGenericStore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterStore(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: /* key */ String => SelectorMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

