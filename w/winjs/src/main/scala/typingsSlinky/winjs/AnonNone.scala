package typingsSlinky.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNone extends js.Object {
  /**
    * The dialog was dismissed without the user selecting any of the commands. The user may have dismissed the dialog by hitting the escape key or pressing the hardware back button.
    **/
  var none: String = js.native
  /**
    * The user dismissed the dialog by pressing the primary command.
    **/
  var primary: String = js.native
  /**
    * The user dismissed the dialog by pressing the secondary command.
    **/
  var secondary: String = js.native
}

object AnonNone {
  @scala.inline
  def apply(none: String, primary: String, secondary: String): AnonNone = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNone]
  }
  @scala.inline
  implicit class AnonNoneOps[Self <: AnonNone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

