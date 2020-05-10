package typingsSlinky.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineDate extends ITimelineEra {
  var asset: js.UndefOr[ITimeLineAsset] = js.native
  var classname: js.UndefOr[String] = js.native
}

object ITimelineDate {
  @scala.inline
  def apply(endDate: String, headline: String, startDate: String, text: String): ITimelineDate = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineDate]
  }
  @scala.inline
  implicit class ITimelineDateOps[Self <: ITimelineDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsset(value: ITimeLineAsset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset")(js.undefined)
        ret
    }
    @scala.inline
    def withClassname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classname")(js.undefined)
        ret
    }
  }
  
}

