package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Contacts.Person
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object of options for <Titanium.UI.iOS.ApplicationShortcuts.addDynamicShortcut>.
  */
@js.native
trait ShortcutParams extends js.Object {
  /**
  	 * The icon to be displayed on the application shortcut. You can either use one of the constants like
  	 * <Titanium.UI.iOS.SHORTCUT_ICON_TYPE_COMPOSE>, a local image specified by the image path or a reference to a
  	 * <Titanium.Contacts.Person>.
  	 */
  var icon: js.UndefOr[Double | java.lang.String | Person] = js.native
  /**
  	 * The unique key for the application shortcut. Equates to the underlying `UIApplicationShortcutItemIconType` key
  	 */
  var identifier: java.lang.String = js.native
  /**
  	 * The subtitle displayed on the application shortcut.
  	 */
  var subtitle: js.UndefOr[java.lang.String] = js.native
  /**
  	 * The title of the application shortcut.
  	 */
  var title: java.lang.String = js.native
  /**
  	 * The userInfo of the application shortcut.
  	 */
  var userInfo: js.UndefOr[js.Any] = js.native
}

object ShortcutParams {
  @scala.inline
  def apply(identifier: java.lang.String, title: java.lang.String): ShortcutParams = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutParams]
  }
  @scala.inline
  implicit class ShortcutParamsOps[Self <: ShortcutParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: Double | java.lang.String | Person): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(js.undefined)
        ret
    }
  }
  
}

