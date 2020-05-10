package typingsSlinky.unimodulesReactNativeAdapter.nativeModulesProxyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyNativeModule
  extends /* propertyName */ StringDictionary[js.Any] {
  def addListener(eventName: String): Unit = js.native
  def removeListeners(count: Double): Unit = js.native
}

object ProxyNativeModule {
  @scala.inline
  def apply(addListener: String => Unit, removeListeners: Double => Unit): ProxyNativeModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), removeListeners = js.Any.fromFunction1(removeListeners))
    __obj.asInstanceOf[ProxyNativeModule]
  }
  @scala.inline
  implicit class ProxyNativeModuleOps[Self <: ProxyNativeModule] (val x: Self) extends AnyVal {
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
  }
  
}

