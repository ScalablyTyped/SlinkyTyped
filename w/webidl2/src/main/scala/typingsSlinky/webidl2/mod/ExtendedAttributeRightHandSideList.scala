package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.`decimal-list`
import typingsSlinky.webidl2.webidl2Strings.`identifier-list`
import typingsSlinky.webidl2.webidl2Strings.`integer-list`
import typingsSlinky.webidl2.webidl2Strings.`string-list`
import org.scalablytyped.runtime.StObject
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
  def ExtendedAttributeRightHandSideDecimalList(`type`: `decimal-list`, value: js.Array[ExtendedAttributeRightHandSideDecimal]): typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideDecimalList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideDecimalList]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideIdentifierList(`type`: `identifier-list`, value: js.Array[ExtendedAttributeRightHandSideIdentifier]): typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideIdentifierList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideIdentifierList]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideIntegerList(`type`: `integer-list`, value: js.Array[ExtendedAttributeRightHandSideInteger]): typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideIntegerList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideIntegerList]
  }
  
  @scala.inline
  def ExtendedAttributeRightHandSideStringList(`type`: `string-list`, value: js.Array[ExtendedAttributeRightHandSideString]): typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideStringList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideStringList]
  }
}
