package typingsSlinky.virtualDom.VirtualDOM

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VHook extends js.Object {
  def hook(node: Element, propertyName: String): Unit = js.native
  def unhook(node: Element, propertyName: String): Unit = js.native
}

object VHook {
  @scala.inline
  def apply(hook: (Element, String) => Unit, unhook: (Element, String) => Unit): VHook = {
    val __obj = js.Dynamic.literal(hook = js.Any.fromFunction2(hook), unhook = js.Any.fromFunction2(unhook))
    __obj.asInstanceOf[VHook]
  }
  @scala.inline
  implicit class VHookOps[Self <: VHook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHook(value: (Element, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnhook(value: (Element, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhook")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

