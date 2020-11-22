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
  def ValueDescriptionNaN(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: NaN
  ): ValueDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionSequence(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: sequence,
    value: js.Array[js.Any]
  ): ValueDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionInfinity(
    extAttrs: js.Array[ExtendedAttribute],
    negative: Boolean,
    parent: Argument | ConstantMemberType | FieldType,
    `type`: Infinity
  ): ValueDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionString(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: string,
    value: String
  ): ValueDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionDictionary(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: dictionary
  ): ValueDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionNumber(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: number,
    value: String
  ): ValueDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionNull(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: `null`
  ): ValueDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  
  @scala.inline
  def ValueDescriptionBoolean(
    extAttrs: js.Array[ExtendedAttribute],
    parent: Argument | ConstantMemberType | FieldType,
    `type`: boolean,
    value: Boolean
  ): ValueDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
}
