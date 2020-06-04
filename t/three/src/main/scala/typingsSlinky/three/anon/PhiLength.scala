package typingsSlinky.three.anon

import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhiLength extends js.Object {
  var phiLength: Double
  var phiStart: Double
  var points: js.Array[Vector2]
  var segments: Double
}

object PhiLength {
  @scala.inline
  def apply(phiLength: Double, phiStart: Double, points: js.Array[Vector2], segments: Double): PhiLength = {
    val __obj = js.Dynamic.literal(phiLength = phiLength.asInstanceOf[js.Any], phiStart = phiStart.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhiLength]
  }
  @scala.inline
  implicit class PhiLengthOps[Self <: PhiLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPhiLength(value: Double): Self = this.set("phiLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhiStart(value: Double): Self = this.set("phiStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoints(value: js.Array[Vector2]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegments(value: Double): Self = this.set("segments", value.asInstanceOf[js.Any])
  }
  
}

