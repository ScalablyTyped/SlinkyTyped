package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.`decimal-list`
import typingsSlinky.webidl2.webidl2Strings.`identifier-list`
import typingsSlinky.webidl2.webidl2Strings.`integer-list`
import typingsSlinky.webidl2.webidl2Strings.`string-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideIdentifierList
  - typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideStringList
  - typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideDecimalList
  - typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideIntegerList
*/
trait ExtendedAttributeRightHandSideList extends ExtendedAttributeRightHandSide
object ExtendedAttributeRightHandSideList {
  
  @scala.inline
  def ExtendedAttributeRightHandSideIdentifierList(`type`: `identifier-list`, value: js.Array[ExtendedAttributeRightHandSideIdentifier]): ExtendedAttributeRightHandSideList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideList]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideStringList(`type`: `string-list`, value: js.Array[ExtendedAttributeRightHandSideString]): ExtendedAttributeRightHandSideList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideList]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideDecimalList(`type`: `decimal-list`, value: js.Array[ExtendedAttributeRightHandSideDecimal]): ExtendedAttributeRightHandSideList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideList]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideIntegerList(`type`: `integer-list`, value: js.Array[ExtendedAttributeRightHandSideInteger]): ExtendedAttributeRightHandSideList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideList]
  }
}
