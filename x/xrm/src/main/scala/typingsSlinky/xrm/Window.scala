package typingsSlinky.xrm

import typingsSlinky.xrm.Xrm.GlobalContext
import typingsSlinky.xrm.Xrm.XrmStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var Xrm: XrmStatic = js.native
  def GetGlobalContext(): GlobalContext = js.native
}

object Window {
  @scala.inline
  def apply(GetGlobalContext: () => GlobalContext, Xrm: XrmStatic): Window = {
    val __obj = js.Dynamic.literal(GetGlobalContext = js.Any.fromFunction0(GetGlobalContext), Xrm = Xrm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetGlobalContext(value: () => GlobalContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetGlobalContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withXrm(value: XrmStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Xrm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

