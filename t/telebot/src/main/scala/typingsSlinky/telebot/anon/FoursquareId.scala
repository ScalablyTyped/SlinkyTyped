package typingsSlinky.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoursquareId extends js.Object {
  var foursquareId: js.UndefOr[String] = js.native
  var notification: js.UndefOr[Boolean] = js.native
  var replyMarkup: js.UndefOr[js.Any] = js.native
  var replyToMessage: js.UndefOr[Double] = js.native
}

object FoursquareId {
  @scala.inline
  def apply(): FoursquareId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoursquareId]
  }
  @scala.inline
  implicit class FoursquareIdOps[Self <: FoursquareId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFoursquareId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foursquareId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoursquareId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foursquareId")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyMarkup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyToMessage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyToMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyToMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyToMessage")(js.undefined)
        ret
    }
  }
  
}

