package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.`identifier-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttributeRightHandSideIdentifierList extends js.Object {
  var `type`: `identifier-list`
  var value: js.Array[ExtendedAttributeRightHandSideIdentifier]
}

object ExtendedAttributeRightHandSideIdentifierList {
  @scala.inline
  def apply(`type`: `identifier-list`, value: js.Array[ExtendedAttributeRightHandSideIdentifier]): ExtendedAttributeRightHandSideIdentifierList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIdentifierList]
  }
}

