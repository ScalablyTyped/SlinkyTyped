package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldScale
  extends ScaledValueRef[js.Any] {
  var field: typingsSlinky.vegaTypings.encodeMod.Field
  var scale: typingsSlinky.vegaTypings.encodeMod.Field
}

object FieldScale {
  @scala.inline
  def apply(field: typingsSlinky.vegaTypings.encodeMod.Field, scale: typingsSlinky.vegaTypings.encodeMod.Field): FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldScale]
  }
}

