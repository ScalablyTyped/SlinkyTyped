package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.cards.ICardSourceCreationOptionsExtended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Card extends StObject {
  
  var card: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.native
}
object Card {
  
  @scala.inline
  def apply(): Card = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit class CardMutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: String | ICardSourceCreationOptionsExtended): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}
