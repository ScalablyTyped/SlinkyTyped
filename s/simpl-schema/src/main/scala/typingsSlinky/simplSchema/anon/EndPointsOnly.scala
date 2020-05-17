package typingsSlinky.simplSchema.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndPointsOnly extends js.Object {
  var endPointsOnly: Boolean = js.native
}

object EndPointsOnly {
  @scala.inline
  def apply(endPointsOnly: Boolean): EndPointsOnly = {
    val __obj = js.Dynamic.literal(endPointsOnly = endPointsOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPointsOnly]
  }
  @scala.inline
  implicit class EndPointsOnlyOps[Self <: EndPointsOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndPointsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPointsOnly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

