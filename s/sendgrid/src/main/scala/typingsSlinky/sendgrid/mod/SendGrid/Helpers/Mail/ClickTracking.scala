package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import typingsSlinky.sendgrid.anon.Enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickTracking extends js.Object {
  def getEnable(): Boolean = js.native
  def getEnableText(): Boolean = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def setEnableText(enableText: Boolean): Unit = js.native
  def toJSON(): Enable = js.native
}

object ClickTracking {
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getEnableText: () => Boolean,
    setEnable: Boolean => Unit,
    setEnableText: Boolean => Unit,
    toJSON: () => Enable
  ): ClickTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getEnableText = js.Any.fromFunction0(getEnableText), setEnable = js.Any.fromFunction1(setEnable), setEnableText = js.Any.fromFunction1(setEnableText), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ClickTracking]
  }
  @scala.inline
  implicit class ClickTrackingOps[Self <: ClickTracking] (val x: Self) extends AnyVal {
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
    def withGetEnableText(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnableText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEnable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnableText(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnableText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => Enable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

