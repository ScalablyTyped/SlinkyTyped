package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.Infinity
import typingsSlinky.webidl2.webidl2Strings.NaN
import typingsSlinky.webidl2.webidl2Strings.`null`
import typingsSlinky.webidl2.webidl2Strings.boolean
import typingsSlinky.webidl2.webidl2Strings.dictionary
import typingsSlinky.webidl2.webidl2Strings.number
import typingsSlinky.webidl2.webidl2Strings.sequence
import typingsSlinky.webidl2.webidl2Strings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.ValueDescriptionString
  - typingsSlinky.webidl2.mod.ValueDescriptionNumber
  - typingsSlinky.webidl2.mod.ValueDescriptionBoolean
  - typingsSlinky.webidl2.mod.ValueDescriptionNull
  - typingsSlinky.webidl2.mod.ValueDescriptionInfinity
  - typingsSlinky.webidl2.mod.ValueDescriptionNaN
  - typingsSlinky.webidl2.mod.ValueDescriptionSequence
  - typingsSlinky.webidl2.mod.ValueDescriptionDictionary
*/
trait ValueDescription extends js.Object
object ValueDescription {
  
  @scala.inline
  def ValueDescriptionNaN(`type`: NaN): ValueDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionSequence(`type`: sequence, value: js.Array[js.Any]): ValueDescription = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionInfinity(negative: Boolean, `type`: Infinity): ValueDescription = {
    val __obj = js.Dynamic.literal(negative = negative.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionString(`type`: string, value: String): ValueDescription = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionDictionary(`type`: dictionary): ValueDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionNumber(`type`: number, value: String): ValueDescription = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionNull(`type`: `null`): ValueDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionBoolean(`type`: boolean, value: Boolean): ValueDescription = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
}
