package typingsSlinky.tampermonkey.Tampermonkey

import typingsSlinky.tampermonkey.tampermonkeyBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightNotification
  extends Notification
     with NotificationDetails {
  @JSName("highlight")
  var highlight_HighlightNotification: `true` = js.native
  @JSName("text")
  var text_HighlightNotification: js.UndefOr[scala.Nothing] = js.native
}

object HighlightNotification {
  @scala.inline
  def apply(highlight: `true`): HighlightNotification = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightNotification]
  }
  @scala.inline
  implicit class HighlightNotificationOps[Self <: HighlightNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlight(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

