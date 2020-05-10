package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLineHeight extends js.Object {
  var lineHeight: Double = js.native
}

object AnonLineHeight {
  @scala.inline
  def apply(lineHeight: Double): AnonLineHeight = {
    val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineHeight]
  }
  @scala.inline
  implicit class AnonLineHeightOps[Self <: AnonLineHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

