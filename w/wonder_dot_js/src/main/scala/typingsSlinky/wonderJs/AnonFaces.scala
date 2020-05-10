package typingsSlinky.wonderJs

import typingsSlinky.wonderJs.face3Mod.Face3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFaces extends js.Object {
  var faces: js.Array[Face3] = js.native
  var vertices: js.Array[_] = js.native
}

object AnonFaces {
  @scala.inline
  def apply(faces: js.Array[Face3], vertices: js.Array[_]): AnonFaces = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFaces]
  }
  @scala.inline
  implicit class AnonFacesOps[Self <: AnonFaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaces(value: js.Array[Face3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

