package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import typingsSlinky.sendgrid.anon.Clicktracking
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingSettings extends js.Object {
  def getClickTracking(): ClickTracking = js.native
  def getGanalytics(): Ganalytics = js.native
  def getOpenTracking(): OpenTracking = js.native
  def getSubscriptionTracking(): SubscriptionTracking = js.native
  def setClickTracking(value: ClickTracking): Unit = js.native
  def setGanalytics(value: Ganalytics): Unit = js.native
  def setOpenTracking(value: OpenTracking): Unit = js.native
  def setSubscriptionTracking(value: SubscriptionTracking): Unit = js.native
  def toJSON(): Clicktracking = js.native
}

object TrackingSettings {
  @scala.inline
  def apply(
    getClickTracking: () => ClickTracking,
    getGanalytics: () => Ganalytics,
    getOpenTracking: () => OpenTracking,
    getSubscriptionTracking: () => SubscriptionTracking,
    setClickTracking: ClickTracking => Unit,
    setGanalytics: Ganalytics => Unit,
    setOpenTracking: OpenTracking => Unit,
    setSubscriptionTracking: SubscriptionTracking => Unit,
    toJSON: () => Clicktracking
  ): TrackingSettings = {
    val __obj = js.Dynamic.literal(getClickTracking = js.Any.fromFunction0(getClickTracking), getGanalytics = js.Any.fromFunction0(getGanalytics), getOpenTracking = js.Any.fromFunction0(getOpenTracking), getSubscriptionTracking = js.Any.fromFunction0(getSubscriptionTracking), setClickTracking = js.Any.fromFunction1(setClickTracking), setGanalytics = js.Any.fromFunction1(setGanalytics), setOpenTracking = js.Any.fromFunction1(setOpenTracking), setSubscriptionTracking = js.Any.fromFunction1(setSubscriptionTracking), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[TrackingSettings]
  }
  @scala.inline
  implicit class TrackingSettingsOps[Self <: TrackingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetClickTracking(value: () => ClickTracking): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClickTracking")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGanalytics(value: () => Ganalytics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGanalytics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOpenTracking(value: () => OpenTracking): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenTracking")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubscriptionTracking(value: () => SubscriptionTracking): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubscriptionTracking")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetClickTracking(value: ClickTracking => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClickTracking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetGanalytics(value: Ganalytics => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGanalytics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOpenTracking(value: OpenTracking => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpenTracking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubscriptionTracking(value: SubscriptionTracking => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubscriptionTracking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => Clicktracking): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

