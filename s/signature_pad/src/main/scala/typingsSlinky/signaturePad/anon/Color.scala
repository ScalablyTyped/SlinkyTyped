package typingsSlinky.signaturePad.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: String
  var points: js.Array[typingsSlinky.signaturePad.mod.Point]
}

object Color {
  @scala.inline
  def apply(color: String, points: js.Array[typingsSlinky.signaturePad.mod.Point]): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

