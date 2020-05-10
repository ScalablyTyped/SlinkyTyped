package typingsSlinky.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineModel extends js.Object {
  var timeline: ITimeLine = js.native
}

object ITimelineModel {
  @scala.inline
  def apply(timeline: ITimeLine): ITimelineModel = {
    val __obj = js.Dynamic.literal(timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineModel]
  }
  @scala.inline
  implicit class ITimelineModelOps[Self <: ITimelineModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeline(value: ITimeLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

