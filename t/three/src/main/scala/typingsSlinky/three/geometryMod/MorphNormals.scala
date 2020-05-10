package typingsSlinky.three.geometryMod

import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MorphNormals extends js.Object {
  var name: String = js.native
  var normals: js.Array[Vector3] = js.native
}

object MorphNormals {
  @scala.inline
  def apply(name: String, normals: js.Array[Vector3]): MorphNormals = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], normals = normals.asInstanceOf[js.Any])
    __obj.asInstanceOf[MorphNormals]
  }
  @scala.inline
  implicit class MorphNormalsOps[Self <: MorphNormals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormals(value: js.Array[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

