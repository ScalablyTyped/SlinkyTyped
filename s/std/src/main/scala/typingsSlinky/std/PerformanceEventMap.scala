package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceEventMap extends js.Object {
  var resourcetimingbufferfull: org.scalajs.dom.raw.Event = js.native
}

object PerformanceEventMap {
  @scala.inline
  def apply(resourcetimingbufferfull: org.scalajs.dom.raw.Event): PerformanceEventMap = {
    val __obj = js.Dynamic.literal(resourcetimingbufferfull = resourcetimingbufferfull.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEventMap]
  }
  @scala.inline
  implicit class PerformanceEventMapOps[Self <: PerformanceEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourcetimingbufferfull(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcetimingbufferfull")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

