package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayname extends js.Object {
  /**
    * The display name for this account. This is used on the Stripe Dashboard to
    * differentiate between accounts.
    */
  var display_name: js.UndefOr[String] = js.native
  /**
    * The timezone used in the Stripe Dashboard for this account. A list of
    * possible time zone values is maintained at the IANA Time Zone Database.
    */
  var timezone: js.UndefOr[String] = js.native
}

object AnonDisplayname {
  @scala.inline
  def apply(): AnonDisplayname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDisplayname]
  }
  @scala.inline
  implicit class AnonDisplaynameOps[Self <: AnonDisplayname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
  }
  
}

