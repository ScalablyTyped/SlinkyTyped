package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.encodeMod.Field
import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldScale
  extends ScaledValueRef[js.Any] {
  var field: Field
  var scale: Field
}

object AnonFieldScale {
  @scala.inline
  def apply(field: Field, scale: Field): AnonFieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFieldScale]
  }
}

