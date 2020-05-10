package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticRangeInit extends js.Object {
  var endContainer: org.scalajs.dom.raw.Node = js.native
  var endOffset: Double = js.native
  var startContainer: org.scalajs.dom.raw.Node = js.native
  var startOffset: Double = js.native
}

object StaticRangeInit {
  @scala.inline
  def apply(
    endContainer: org.scalajs.dom.raw.Node,
    endOffset: Double,
    startContainer: org.scalajs.dom.raw.Node,
    startOffset: Double
  ): StaticRangeInit = {
    val __obj = js.Dynamic.literal(endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRangeInit]
  }
  @scala.inline
  implicit class StaticRangeInitOps[Self <: StaticRangeInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndContainer(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartContainer(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

