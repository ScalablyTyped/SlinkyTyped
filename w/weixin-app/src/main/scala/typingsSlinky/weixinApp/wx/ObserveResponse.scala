package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserveResponse extends js.Object {
   // 相交区域占目标节点的布局区域的比例
  var boundingClientRect: RectArea = js.native
  var dataset: js.Any = js.native
  var id: String = js.native
  var intersectionRatio: Double = js.native
  var intersectionRect: RectArea = js.native
  var relativeRect: RectArea = js.native
  var time: Double = js.native
}

object ObserveResponse {
  @scala.inline
  def apply(
    boundingClientRect: RectArea,
    dataset: js.Any,
    id: String,
    intersectionRatio: Double,
    intersectionRect: RectArea,
    relativeRect: RectArea,
    time: Double
  ): ObserveResponse = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], relativeRect = relativeRect.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveResponse]
  }
  @scala.inline
  implicit class ObserveResponseOps[Self <: ObserveResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingClientRect(value: RectArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingClientRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersectionRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersectionRect(value: RectArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeRect(value: RectArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

