package typingsSlinky.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompact extends js.Object {
  /**
    * When the AppBar is closed, its height is reduced such that button commands are still visible, but their labels are hidden.
    **/
  var compact: String = js.native
  /**
    * When the AppBar is closed, its height is always sized to content.
    **/
  var full: String = js.native
  /**
    * When the AppBar is closed, its height is reduced to the minimal height required to display only its overflowbutton. All other content in the AppBar is not displayed.
    **/
  var minimal: String = js.native
  /**
    * When the AppBar is closed, it is not visible and doesn't take up any space.
    **/
  var none: String = js.native
}

object AnonCompact {
  @scala.inline
  def apply(compact: String, full: String, minimal: String, none: String): AnonCompact = {
    val __obj = js.Dynamic.literal(compact = compact.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], minimal = minimal.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompact]
  }
  @scala.inline
  implicit class AnonCompactOps[Self <: AnonCompact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

