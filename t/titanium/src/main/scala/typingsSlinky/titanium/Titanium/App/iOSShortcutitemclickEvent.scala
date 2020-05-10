package typingsSlinky.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a user taps the Application Shortcut.
		 */
@js.native
trait iOSShortcutitemclickEvent extends iOSBaseEvent {
  /**
  			 * The unique identifier for the application shortcut.
  			 */
  var itemtype: String = js.native
  /**
  			 * The subtitle of the application shortcut.
  			 */
  var subtitle: String = js.native
  /**
  			 * The title of the application shortcut.
  			 */
  var title: String = js.native
  /**
  			 * The payload passed by the application shortcut.
  			 */
  var userInfo: js.Any = js.native
}

object iOSShortcutitemclickEvent {
  @scala.inline
  def apply(itemtype: String, source: iOS, subtitle: String, title: String, userInfo: js.Any): iOSShortcutitemclickEvent = {
    val __obj = js.Dynamic.literal(itemtype = itemtype.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSShortcutitemclickEvent]
  }
  @scala.inline
  implicit class iOSShortcutitemclickEventOps[Self <: iOSShortcutitemclickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemtype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

