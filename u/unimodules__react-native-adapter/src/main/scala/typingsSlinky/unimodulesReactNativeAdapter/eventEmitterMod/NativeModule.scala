package typingsSlinky.unimodulesReactNativeAdapter.eventEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeModule extends js.Object {
  var startObserving: js.UndefOr[js.Function0[Unit]] = js.native
  var stopObserving: js.UndefOr[js.Function0[Unit]] = js.native
  def addListener(eventName: String): Unit = js.native
  def removeListeners(count: Double): Unit = js.native
}

object NativeModule {
  @scala.inline
  def apply(addListener: String => Unit, removeListeners: Double => Unit): NativeModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), removeListeners = js.Any.fromFunction1(removeListeners))
    __obj.asInstanceOf[NativeModule]
  }
  @scala.inline
  implicit class NativeModuleOps[Self <: NativeModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveListeners(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartObserving(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startObserving")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStartObserving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startObserving")(js.undefined)
        ret
    }
    @scala.inline
    def withStopObserving(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopObserving")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopObserving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopObserving")(js.undefined)
        ret
    }
  }
  
}

