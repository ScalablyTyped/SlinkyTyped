package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import typingsSlinky.sendgrid.AnonSubstitutiontag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTracking extends js.Object {
  def getEnable(): Boolean = js.native
  def getSubscriptionTag(): String = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def setSubscriptionTag(subscriptionTag: String): Unit = js.native
  def toJSON(): AnonSubstitutiontag = js.native
}

object OpenTracking {
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getSubscriptionTag: () => String,
    setEnable: Boolean => Unit,
    setSubscriptionTag: String => Unit,
    toJSON: () => AnonSubstitutiontag
  ): OpenTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getSubscriptionTag = js.Any.fromFunction0(getSubscriptionTag), setEnable = js.Any.fromFunction1(setEnable), setSubscriptionTag = js.Any.fromFunction1(setSubscriptionTag), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[OpenTracking]
  }
  @scala.inline
  implicit class OpenTrackingOps[Self <: OpenTracking] (val x: Self) extends AnyVal {
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
    def withGetSubscriptionTag(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubscriptionTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEnable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubscriptionTag(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubscriptionTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => AnonSubstitutiontag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

