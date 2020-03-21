package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.AnonFields
  - typingsSlinky.vegaTypings.AnonFieldsArray
*/
trait MultiDataRef extends js.Object

object MultiDataRef {
  @scala.inline
  def AnonFields(data: String, fields: js.Array[ScaleField]): MultiDataRef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiDataRef]
  }
  @scala.inline
  def AnonFieldsArray(fields: js.Array[(js.Array[String | Double | Boolean]) | DataRef | SignalRef]): MultiDataRef = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiDataRef]
  }
}

