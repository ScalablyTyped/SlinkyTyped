package typingsSlinky.sharp.sharpMod

import typingsSlinky.sharp.sharpStrings.and
import typingsSlinky.sharp.sharpStrings.eor
import typingsSlinky.sharp.sharpStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoolEnum extends js.Object {
  var and: typingsSlinky.sharp.sharpStrings.and
  var eor: typingsSlinky.sharp.sharpStrings.eor
  var or: typingsSlinky.sharp.sharpStrings.or
}

object BoolEnum {
  @scala.inline
  def apply(and: and, eor: eor, or: or): BoolEnum = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], eor = eor.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoolEnum]
  }
}

