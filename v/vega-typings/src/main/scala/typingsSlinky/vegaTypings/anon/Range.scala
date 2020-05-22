package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range
  extends ScaledValueRef[js.Any] {
  var range: Double | Boolean
  var scale: typingsSlinky.vegaTypings.encodeMod.Field
}

object Range {
  @scala.inline
  def apply(range: Double | Boolean, scale: typingsSlinky.vegaTypings.encodeMod.Field): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

