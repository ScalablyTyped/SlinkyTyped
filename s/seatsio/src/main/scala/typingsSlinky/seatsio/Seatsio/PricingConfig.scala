package typingsSlinky.seatsio.Seatsio

import typingsSlinky.seatsio.anon.LabelPrice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.seatsio.Seatsio.PricingConfigSimple
  - typingsSlinky.seatsio.Seatsio.PricingConfigMulti
*/
trait PricingConfig extends js.Object
object PricingConfig {
  
  @scala.inline
  def PricingConfigSimple(category: String, price: Double): PricingConfig = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingConfig]
  }
  
  @scala.inline
  def PricingConfigMulti(category: String, ticketTypes: js.Array[LabelPrice]): PricingConfig = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], ticketTypes = ticketTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingConfig]
  }
}
