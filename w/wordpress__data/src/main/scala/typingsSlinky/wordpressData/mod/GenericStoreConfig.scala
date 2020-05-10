package typingsSlinky.wordpressData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericStoreConfig extends js.Object {
  var subscribe: Subscriber = js.native
  def getActions(): DispatcherMap = js.native
  def getSelectors(): SelectorMap = js.native
}

object GenericStoreConfig {
  @scala.inline
  def apply(
    getActions: () => DispatcherMap,
    getSelectors: () => SelectorMap,
    subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
  ): GenericStoreConfig = {
    val __obj = js.Dynamic.literal(getActions = js.Any.fromFunction0(getActions), getSelectors = js.Any.fromFunction0(getSelectors), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[GenericStoreConfig]
  }
  @scala.inline
  implicit class GenericStoreConfigOps[Self <: GenericStoreConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetActions(value: () => DispatcherMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectors(value: () => SelectorMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectors")(js.Any.fromFunction0(value))
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

