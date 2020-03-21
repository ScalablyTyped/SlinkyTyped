package typingsSlinky.web3Utils

import typingsSlinky.web3Utils.mod._Mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends _Mixed {
  var `type`: String
  var value: String
}

object AnonType {
  @scala.inline
  def apply(`type`: String, value: String): AnonType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

