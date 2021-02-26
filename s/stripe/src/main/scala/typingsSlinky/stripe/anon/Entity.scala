package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.account
import typingsSlinky.stripe.stripeStrings.allowed_categories
import typingsSlinky.stripe.stripeStrings.blocked_categories
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.cardholder
import typingsSlinky.stripe.stripeStrings.max_amount
import typingsSlinky.stripe.stripeStrings.max_approvals
import typingsSlinky.stripe.stripeStrings.spending_limits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity extends StObject {
  
  /**
    * Entity which the authorization control acts on. One of account, card, or cardholder.
    */
  var entity: account | cardholder | card = js.native
  
  /**
    * Name of the authorization control. One of allowed_categories, blocked_categories, max_amount, max_approvals, or spending_limits.
    */
  var name: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits = js.native
}
object Entity {
  
  @scala.inline
  def apply(
    entity: account | cardholder | card,
    name: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits
  ): Entity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit class EntityMutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: account | cardholder | card): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
