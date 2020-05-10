package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserveResult extends js.Object {
  /**
    * 目标节点布局区域的边界
    */
  var boundingClientRect: js.UndefOr[ObserveNodeRect] = js.native
  /**
    * 相交比例
    */
  var intersectionRatio: js.UndefOr[Double] = js.native
  /**
    * 相交区域的边界
    */
  var intersectionRect: js.UndefOr[js.Any] = js.native
  /**
    * 参照区域的边界
    */
  var relativeRect: js.UndefOr[ObserveNodeRect] = js.native
  /**
    * 相交检测时的时间戳
    */
  var time: js.UndefOr[Double] = js.native
}

object ObserveResult {
  @scala.inline
  def apply(): ObserveResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserveResult]
  }
  @scala.inline
  implicit class ObserveResultOps[Self <: ObserveResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingClientRect(value: ObserveNodeRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingClientRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingClientRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingClientRect")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersectionRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersectionRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersectionRect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersectionRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionRect")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeRect(value: ObserveNodeRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeRect")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

