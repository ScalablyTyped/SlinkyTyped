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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Networkstatus extends StObject {
  
  var network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval = js.native
  
  var reason: highest_risk_level | elevated_risk_level | rule | Null = js.native
  
  var risk_level: normal | elevated | highest | not_assessed | unknown_ = js.native
  
  var risk_score: Double = js.native
  
  var rule: js.UndefOr[String] = js.native
  
  var seller_message: String = js.native
  
  var `type`: authorized | manual_review | issuer_declined | blocked | invalid = js.native
}
object Networkstatus {
  
  @scala.inline
  def apply(
    network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval,
    risk_level: normal | elevated | highest | not_assessed | unknown_,
    risk_score: Double,
    seller_message: String,
    `type`: authorized | manual_review | issuer_declined | blocked | invalid
  ): Networkstatus = {
    val __obj = js.Dynamic.literal(network_status = network_status.asInstanceOf[js.Any], risk_level = risk_level.asInstanceOf[js.Any], risk_score = risk_score.asInstanceOf[js.Any], seller_message = seller_message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Networkstatus]
  }
  
  @scala.inline
  implicit class NetworkstatusMutableBuilder[Self <: Networkstatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetwork_status(value: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval): Self = StObject.set(x, "network_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: highest_risk_level | elevated_risk_level | rule): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonNull: Self = StObject.set(x, "reason", null)
    
    @scala.inline
    def setRisk_level(value: normal | elevated | highest | not_assessed | unknown_): Self = StObject.set(x, "risk_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRisk_score(value: Double): Self = StObject.set(x, "risk_score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setSeller_message(value: String): Self = StObject.set(x, "seller_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: authorized | manual_review | issuer_declined | blocked | invalid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
