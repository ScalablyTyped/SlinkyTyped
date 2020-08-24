package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.decimal
import typingsSlinky.webidl2.webidl2Strings.identifier
import typingsSlinky.webidl2.webidl2Strings.integer
import typingsSlinky.webidl2.webidl2Strings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideIdentifier
  - typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideString
  - typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideDecimal
  - typingsSlinky.webidl2.mod.ExtendedAttributeRightHandSideInteger
*/
trait ExtendedAttributeRightHandSideBase extends ExtendedAttributeRightHandSide

object ExtendedAttributeRightHandSideBase {
  @scala.inline
  def ExtendedAttributeRightHandSideIdentifier(`type`: identifier, value: String): ExtendedAttributeRightHandSideBase = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideBase]
  }
  @scala.inline
  def ExtendedAttributeRightHandSideString(`type`: string, value: String): ExtendedAttributeRightHandSideBase = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideBase]
  }
  @scala.inline
  def ExtendedAttributeRightHandSideDecimal(`type`: decimal, value: String): ExtendedAttributeRightHandSideBase = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideBase]
  }
  @scala.inline
  def ExtendedAttributeRightHandSideInteger(`type`: integer, value: String): ExtendedAttributeRightHandSideBase = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideBase]
  }
}

