package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Declineon extends js.Object {
  /**
    * Automatically declines certain charge types regardless of whether the card
    * issuer accepted or declined the charge.
    */
  var decline_on: js.UndefOr[Avsfailure] = js.native
  /**
    * The default text that appears on credit card statements when a charge is
    * made. This field prefixes any dynamic statement_descriptor specified on the
    * charge. statement_descriptor_prefix is useful for maximizing descriptor space
    * for the dynamic portion.
    */
  var statement_descriptor_prefix: js.UndefOr[String] = js.native
}

object Declineon {
  @scala.inline
  def apply(): Declineon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Declineon]
  }
  @scala.inline
  implicit class DeclineonOps[Self <: Declineon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecline_on(value: Avsfailure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decline_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecline_on: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decline_on")(js.undefined)
        ret
    }
    @scala.inline
    def withStatement_descriptor_prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor_prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatement_descriptor_prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor_prefix")(js.undefined)
        ret
    }
  }
  
}

