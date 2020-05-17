package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import typingsSlinky.sendgrid.anon.EnableBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BypassListManagement extends js.Object {
  def getEnable(): Boolean = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def toJSON(): EnableBoolean = js.native
}

object BypassListManagement {
  @scala.inline
  def apply(getEnable: () => Boolean, setEnable: Boolean => Unit, toJSON: () => EnableBoolean): BypassListManagement = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), setEnable = js.Any.fromFunction1(setEnable), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[BypassListManagement]
  }
  @scala.inline
  implicit class BypassListManagementOps[Self <: BypassListManagement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEnable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEnable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => EnableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

