package typingsSlinky.wellknown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry[T, C] extends js.Object {
  var coordinates: C = js.native
  var `type`: T = js.native
}

object Geometry {
  @scala.inline
  def apply[T, C](coordinates: C, `type`: T): Geometry[T, C] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry[T, C]]
  }
  @scala.inline
  implicit class GeometryOps[Self[t, c] <: Geometry[t, c], T, C] (val x: Self[T, C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, C]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, C]) with Other]
    @scala.inline
    def withCoordinates(value: C): Self[T, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

