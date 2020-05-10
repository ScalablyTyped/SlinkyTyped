package typingsSlinky.yaml.parseCstMod.CST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  var end: Double = js.native
  var origEnd: js.UndefOr[Double] = js.native
  var origStart: js.UndefOr[Double] = js.native
  var start: Double = js.native
  def isEmpty(): Boolean = js.native
}

object Range {
  @scala.inline
  def apply(end: Double, isEmpty: () => Boolean, start: Double): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origStart")(js.undefined)
        ret
    }
  }
  
}

