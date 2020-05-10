package typingsSlinky.stripeV3

import typingsSlinky.stripeV3.stripeV3Strings.approved_by_network
import typingsSlinky.stripeV3.stripeV3Strings.authorized
import typingsSlinky.stripeV3.stripeV3Strings.blocked
import typingsSlinky.stripeV3.stripeV3Strings.declined_by_network
import typingsSlinky.stripeV3.stripeV3Strings.elevated
import typingsSlinky.stripeV3.stripeV3Strings.elevated_risk_level
import typingsSlinky.stripeV3.stripeV3Strings.highest
import typingsSlinky.stripeV3.stripeV3Strings.highest_risk_level
import typingsSlinky.stripeV3.stripeV3Strings.invalid
import typingsSlinky.stripeV3.stripeV3Strings.issuer_declined
import typingsSlinky.stripeV3.stripeV3Strings.manual_review
import typingsSlinky.stripeV3.stripeV3Strings.normal
import typingsSlinky.stripeV3.stripeV3Strings.not_assessed
import typingsSlinky.stripeV3.stripeV3Strings.not_sent_to_network
import typingsSlinky.stripeV3.stripeV3Strings.reversed_after_approval
import typingsSlinky.stripeV3.stripeV3Strings.rule
import typingsSlinky.stripeV3.stripeV3Strings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNetworkstatus extends js.Object {
  var network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval = js.native
  var reason: highest_risk_level | elevated_risk_level | rule | Null = js.native
  var risk_level: normal | elevated | highest | not_assessed | unknown_ = js.native
  var risk_score: Double = js.native
  var rule: js.UndefOr[String] = js.native
  var seller_message: String = js.native
  var `type`: authorized | manual_review | issuer_declined | blocked | invalid = js.native
}

object AnonNetworkstatus {
  @scala.inline
  def apply(
    network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval,
    risk_level: normal | elevated | highest | not_assessed | unknown_,
    risk_score: Double,
    seller_message: String,
    `type`: authorized | manual_review | issuer_declined | blocked | invalid
  ): AnonNetworkstatus = {
    val __obj = js.Dynamic.literal(network_status = network_status.asInstanceOf[js.Any], risk_level = risk_level.asInstanceOf[js.Any], risk_score = risk_score.asInstanceOf[js.Any], seller_message = seller_message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNetworkstatus]
  }
  @scala.inline
  implicit class AnonNetworkstatusOps[Self <: AnonNetworkstatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetwork_status(value: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRisk_level(value: normal | elevated | highest | not_assessed | unknown_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("risk_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRisk_score(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("risk_score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeller_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: authorized | manual_review | issuer_declined | blocked | invalid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: highest_risk_level | elevated_risk_level | rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(null)
        ret
    }
    @scala.inline
    def withRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
  }
  
}

