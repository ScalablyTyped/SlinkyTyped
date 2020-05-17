package typingsSlinky.three.anon

import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Holes extends js.Object {
  var holes: js.Array[js.Array[Vector2]] = js.native
  var shape: js.Array[Vector2] = js.native
}

object Holes {
  @scala.inline
  def apply(holes: js.Array[js.Array[Vector2]], shape: js.Array[Vector2]): Holes = {
    val __obj = js.Dynamic.literal(holes = holes.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Holes]
  }
  @scala.inline
  implicit class HolesOps[Self <: Holes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHoles(value: js.Array[js.Array[Vector2]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: js.Array[Vector2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

