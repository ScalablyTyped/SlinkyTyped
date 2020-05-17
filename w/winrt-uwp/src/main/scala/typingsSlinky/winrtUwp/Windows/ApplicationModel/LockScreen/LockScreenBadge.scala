package typingsSlinky.winrtUwp.Windows.ApplicationModel.LockScreen

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a lock screen badge for an app. */
@js.native
trait LockScreenBadge extends js.Object {
  /** Gets the name. */
  var automationName: String = js.native
  /** Gets the glyph to display. */
  var glyph: IRandomAccessStream = js.native
  /** Gets the logo to display with the badge. */
  var logo: IRandomAccessStream = js.native
  /** Gets the number to display with the badge. */
  var number: Double = js.native
  /** Launches the app corresponding to the badge. */
  def launchApp(): Unit = js.native
}

object LockScreenBadge {
  @scala.inline
  def apply(
    automationName: String,
    glyph: IRandomAccessStream,
    launchApp: () => Unit,
    logo: IRandomAccessStream,
    number: Double
  ): LockScreenBadge = {
    val __obj = js.Dynamic.literal(automationName = automationName.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any], launchApp = js.Any.fromFunction0(launchApp), logo = logo.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockScreenBadge]
  }
  @scala.inline
  implicit class LockScreenBadgeOps[Self <: LockScreenBadge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlyph(value: IRandomAccessStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchApp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchApp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogo(value: IRandomAccessStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

