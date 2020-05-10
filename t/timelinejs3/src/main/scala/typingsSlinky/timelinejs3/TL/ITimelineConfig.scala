package typingsSlinky.timelinejs3.TL

import typingsSlinky.timelinejs3.timelinejs3Strings.cosmological
import typingsSlinky.timelinejs3.timelinejs3Strings.human
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineConfig extends js.Object {
  var eras: js.UndefOr[js.Array[ITimelineEra]] = js.native
  var events: js.Array[ITimelineSlideData] = js.native
  /*
    * Either human or cosmological. If no scale is specified, the default is human. The cosmological scale is
    * required to handle dates in the very distant past or future. (Before Tuesday, April 20th, 271,821 BCE
    * after Saturday, September 13 275,760 CE) For the cosmological scale, only the year is considered, but it's
    * OK to have a cosmological timeline with years between 271,821 BCE and 275,760 CE.
    */
  var scale: js.UndefOr[human | cosmological] = js.native
  var title: js.UndefOr[ITimelineSlideData] = js.native
}

object ITimelineConfig {
  @scala.inline
  def apply(events: js.Array[ITimelineSlideData]): ITimelineConfig = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineConfig]
  }
  @scala.inline
  implicit class ITimelineConfigOps[Self <: ITimelineConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: js.Array[ITimelineSlideData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEras(value: js.Array[ITimelineEra]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEras: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eras")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: human | cosmological): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: ITimelineSlideData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

