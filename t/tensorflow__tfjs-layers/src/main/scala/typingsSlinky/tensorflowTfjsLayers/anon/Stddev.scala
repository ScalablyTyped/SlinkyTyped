package typingsSlinky.tensorflowTfjsLayers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stddev extends js.Object {
  var stddev: Double = js.native
}

object Stddev {
  @scala.inline
  def apply(stddev: Double): Stddev = {
    val __obj = js.Dynamic.literal(stddev = stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stddev]
  }
  @scala.inline
  implicit class StddevOps[Self <: Stddev] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStddev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stddev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

