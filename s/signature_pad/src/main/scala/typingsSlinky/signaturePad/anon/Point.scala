package typingsSlinky.signaturePad.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var color: String
  var point: typingsSlinky.signaturePad.mod.Point
}

object Point {
  @scala.inline
  def apply(color: String, point: typingsSlinky.signaturePad.mod.Point): Point = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

