package typingsSlinky.stripe

import typingsSlinky.stripe.stripeStrings.account
import typingsSlinky.stripe.stripeStrings.allowed_categories
import typingsSlinky.stripe.stripeStrings.blocked_categories
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.cardholder
import typingsSlinky.stripe.stripeStrings.max_amount
import typingsSlinky.stripe.stripeStrings.max_approvals
import typingsSlinky.stripe.stripeStrings.spending_limits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntity extends js.Object {
  /**
    * Entity which the authorization control acts on. One of account, card, or cardholder.
    */
  var entity: account | cardholder | card
  /**
    * Name of the authorization control. One of allowed_categories, blocked_categories, max_amount, max_approvals, or spending_limits.
    */
  var name: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits
}

object AnonEntity {
  @scala.inline
  def apply(
    entity: account | cardholder | card,
    name: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits
  ): AnonEntity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntity]
  }
}

