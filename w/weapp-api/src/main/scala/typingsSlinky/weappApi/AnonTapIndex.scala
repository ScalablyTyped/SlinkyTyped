package typingsSlinky.weappApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTapIndex extends js.Object {
  var tapIndex: Double = js.native
}

object AnonTapIndex {
  @scala.inline
  def apply(tapIndex: Double): AnonTapIndex = {
    val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTapIndex]
  }
  @scala.inline
  implicit class AnonTapIndexOps[Self <: AnonTapIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTapIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

