package typingsSlinky.wxJsSdkDt.wx

import typingsSlinky.wxJsSdkDt.anon.CardList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddCardConfig extends StObject {
  
  var cardList: js.Array[Card] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ CardList, Unit]] = js.native
}
object AddCardConfig {
  
  @scala.inline
  def apply(cardList: js.Array[Card]): AddCardConfig = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardConfig]
  }
  
  @scala.inline
  implicit class AddCardConfigMutableBuilder[Self <: AddCardConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardList(value: js.Array[Card]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardListVarargs(value: Card*): Self = StObject.set(x, "cardList", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ CardList => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
