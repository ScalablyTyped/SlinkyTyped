package typingsSlinky.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewport extends js.Object {
  var postscale: Matrix = js.native
  var prescale: Matrix = js.native
}

object Viewport {
  @scala.inline
  def apply(postscale: Matrix, prescale: Matrix): Viewport = {
    val __obj = js.Dynamic.literal(postscale = postscale.asInstanceOf[js.Any], prescale = prescale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  @scala.inline
  implicit class ViewportOps[Self <: Viewport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostscale(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrescale(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prescale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

