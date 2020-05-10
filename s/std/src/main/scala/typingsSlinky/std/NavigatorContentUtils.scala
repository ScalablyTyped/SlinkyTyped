package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorContentUtils extends js.Object {
  def registerProtocolHandler(scheme: java.lang.String, url: java.lang.String, title: java.lang.String): Unit = js.native
  def unregisterProtocolHandler(scheme: java.lang.String, url: java.lang.String): Unit = js.native
}

object NavigatorContentUtils {
  @scala.inline
  def apply(
    registerProtocolHandler: (java.lang.String, java.lang.String, java.lang.String) => Unit,
    unregisterProtocolHandler: (java.lang.String, java.lang.String) => Unit
  ): NavigatorContentUtils = {
    val __obj = js.Dynamic.literal(registerProtocolHandler = js.Any.fromFunction3(registerProtocolHandler), unregisterProtocolHandler = js.Any.fromFunction2(unregisterProtocolHandler))
    __obj.asInstanceOf[NavigatorContentUtils]
  }
  @scala.inline
  implicit class NavigatorContentUtilsOps[Self <: org.scalajs.dom.raw.NavigatorContentUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterProtocolHandler(value: (java.lang.String, java.lang.String, java.lang.String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerProtocolHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUnregisterProtocolHandler(value: (java.lang.String, java.lang.String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterProtocolHandler")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

