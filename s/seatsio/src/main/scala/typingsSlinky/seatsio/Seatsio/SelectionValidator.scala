package typingsSlinky.seatsio.Seatsio

import typingsSlinky.seatsio.seatsioStrings.consecutiveSeats
import typingsSlinky.seatsio.seatsioStrings.noOrphanSeats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.seatsio.anon.Highlight
  - typingsSlinky.seatsio.anon.`0`
*/
trait SelectionValidator extends js.Object
object SelectionValidator {
  
  @scala.inline
  def Highlight(`type`: noOrphanSeats): SelectionValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionValidator]
  }
  
  @scala.inline
  def `0`(`type`: consecutiveSeats): SelectionValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionValidator]
  }
}
