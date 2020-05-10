package typingsSlinky.seen

import typingsSlinky.seen.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProjection extends js.Object {
  var projection: Matrix = js.native
}

object AnonProjection {
  @scala.inline
  def apply(projection: Matrix): AnonProjection = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjection]
  }
  @scala.inline
  implicit class AnonProjectionOps[Self <: AnonProjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjection(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

