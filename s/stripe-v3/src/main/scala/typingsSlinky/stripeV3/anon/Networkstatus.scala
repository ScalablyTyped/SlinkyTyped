package typingsSlinky.stripeV3.anon

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

trait Networkstatus extends js.Object {
  var network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval
  var reason: highest_risk_level | elevated_risk_level | rule | Null
  var risk_level: normal | elevated | highest | not_assessed | unknown_
  var risk_score: Double
  var rule: js.UndefOr[String] = js.undefined
  var seller_message: String
  var `type`: authorized | manual_review | issuer_declined | blocked | invalid
}

object Networkstatus {
  @scala.inline
  def apply(
    network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval,
    risk_level: normal | elevated | highest | not_assessed | unknown_,
    risk_score: Double,
    seller_message: String,
    `type`: authorized | manual_review | issuer_declined | blocked | invalid,
    reason: highest_risk_level | elevated_risk_level | rule = null,
    rule: String = null
  ): Networkstatus = {
    val __obj = js.Dynamic.literal(network_status = network_status.asInstanceOf[js.Any], risk_level = risk_level.asInstanceOf[js.Any], risk_score = risk_score.asInstanceOf[js.Any], seller_message = seller_message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Networkstatus]
  }
}

