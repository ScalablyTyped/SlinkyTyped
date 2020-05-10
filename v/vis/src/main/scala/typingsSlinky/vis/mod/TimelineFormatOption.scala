package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineFormatOption extends js.Object {
  var majorLabels: js.UndefOr[TimelineFormatLabelsOption | TimelineFormatLabelsFunction] = js.native
  var minorLabels: js.UndefOr[TimelineFormatLabelsOption | TimelineFormatLabelsFunction] = js.native
}

object TimelineFormatOption {
  @scala.inline
  def apply(): TimelineFormatOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineFormatOption]
  }
  @scala.inline
  implicit class TimelineFormatOptionOps[Self <: TimelineFormatOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMajorLabelsFunction3(value: (/* date */ js.Date, /* scale */ String, /* step */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorLabels")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMajorLabels(value: TimelineFormatLabelsOption | TimelineFormatLabelsFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorLabelsFunction3(value: (/* date */ js.Date, /* scale */ String, /* step */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorLabels")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMinorLabels(value: TimelineFormatLabelsOption | TimelineFormatLabelsFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorLabels")(js.undefined)
        ret
    }
  }
  
}

