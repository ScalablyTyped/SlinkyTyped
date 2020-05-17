package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bcc extends js.Object {
  def getEmail(): Email = js.native
  def getEnable(): Boolean = js.native
  def setEmail(value: Email): Unit = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def toJSON(): typingsSlinky.sendgrid.anon.Email = js.native
}

object Bcc {
  @scala.inline
  def apply(
    getEmail: () => Email,
    getEnable: () => Boolean,
    setEmail: Email => Unit,
    setEnable: Boolean => Unit,
    toJSON: () => typingsSlinky.sendgrid.anon.Email
  ): Bcc = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getEnable = js.Any.fromFunction0(getEnable), setEmail = js.Any.fromFunction1(setEmail), setEnable = js.Any.fromFunction1(setEnable), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Bcc]
  }
  @scala.inline
  implicit class BccOps[Self <: Bcc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEmail(value: () => Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEmail(value: Email => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEmail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => typingsSlinky.sendgrid.anon.Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

