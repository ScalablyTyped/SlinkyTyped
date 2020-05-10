package typingsSlinky.winrt

import typingsSlinky.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHit extends js.Object {
  var hit: Double = js.native
  var rect: Rect = js.native
}

object AnonHit {
  @scala.inline
  def apply(hit: Double, rect: Rect): AnonHit = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHit]
  }
  @scala.inline
  implicit class AnonHitOps[Self <: AnonHit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

