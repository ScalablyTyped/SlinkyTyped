package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.Infinity
import typingsSlinky.webidl2.webidl2Strings.NaN
import typingsSlinky.webidl2.webidl2Strings.`null`
import typingsSlinky.webidl2.webidl2Strings.boolean
import typingsSlinky.webidl2.webidl2Strings.dictionary
import typingsSlinky.webidl2.webidl2Strings.number
import typingsSlinky.webidl2.webidl2Strings.sequence
import typingsSlinky.webidl2.webidl2Strings.string
import org.scalablytyped.runtime.StObject
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
trait ValueDescription extends StObject
object ValueDescription {
  
  @scala.inline
  def ValueDescriptionBoolean(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: boolean,
    value: Boolean
  ): typingsSlinky.webidl2.mod.ValueDescriptionBoolean = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ValueDescriptionBoolean]
  }
  
  @scala.inline
  def ValueDescriptionDictionary(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: dictionary
  ): typingsSlinky.webidl2.mod.ValueDescriptionDictionary = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ValueDescriptionDictionary]
  }
  
  @scala.inline
  def ValueDescriptionInfinity(
    extAttrs: js.Array[ExtendedAttribute],
    negative: Boolean,
    parent: Argument | ConstantMemberType | FieldType,
    `type`: Infinity
  ): typingsSlinky.webidl2.mod.ValueDescriptionInfinity = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ValueDescriptionInfinity]
  }
  
  @scala.inline
  def ValueDescriptionNaN(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: NaN
  ): typingsSlinky.webidl2.mod.ValueDescriptionNaN = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ValueDescriptionNaN]
  }
  
  @scala.inline
  def ValueDescriptionNull(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: `null`
  ): typingsSlinky.webidl2.mod.ValueDescriptionNull = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ValueDescriptionNull]
  }
  
  @scala.inline
  def ValueDescriptionNumber(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: number,
    value: String
  ): typingsSlinky.webidl2.mod.ValueDescriptionNumber = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ValueDescriptionNumber]
  }
  
  @scala.inline
  def ValueDescriptionSequence(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: sequence,
    value: js.Array[js.Any]
  ): typingsSlinky.webidl2.mod.ValueDescriptionSequence = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ValueDescriptionSequence]
  }
  
  @scala.inline
  def ValueDescriptionString(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: string,
    value: String
  ): typingsSlinky.webidl2.mod.ValueDescriptionString = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ValueDescriptionString]
  }
}
