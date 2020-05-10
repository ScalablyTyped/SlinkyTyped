package typingsSlinky.timelinejs3.TL

import typingsSlinky.timelinejs3.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineSlideData extends js.Object {
  /*
    * Defaults to true, which means that Timeline will scan text fields and automatically add <a> tags so that
    * links and email addresses are "clickable." If set to false, you may still manually apply the tags in the
    * appropriate fields when you want links. Autolinking applies to the text field in a text object and the
    * caption and credit fields in a media object.
    */
  var autolink: js.UndefOr[Boolean] = js.native
  /*
    * A Javascript object. The object can have these properties:
    * url: the fully-qualified URL pointing to an image which will be used as the background
    * color: a CSS color, in hexadecimal (e.g. #0f9bd1) or a valid CSS color keyword.
    */
  var background: js.UndefOr[AnonColor] = js.native
  /*
    * A string which will be used when Timeline displays the date for this. If used, override's display_date
    * values set on the start or end date for this event, which is useful if you want to control how the two
    * dates relate to each other.
    */
  var display_date: js.UndefOr[String] = js.native
  var end_date: js.UndefOr[ITimelineDate] = js.native
  /*
    * If present, Timeline will organize events with the same value for group to be in the same row or adjacent
    * rows, separate from events in other groups. The common value for the group will be shown as a label at the
    * left edge of the navigation.
    */
  var group: js.UndefOr[String] = js.native
  var media: js.UndefOr[ITimelineMedia] = js.native
  /*
    * Required for events, but not for `title` slides.
    */
  var start_date: js.UndefOr[ITimelineDate] = js.native
  /*
    * Not required, but recommended.
    */
  var text: js.UndefOr[ITimelineText] = js.native
  /*
    * A string value which is unique among all slides in your timeline. If not specified, TimelineJS will
    * construct an ID based on the headline, but if you later edit your headline, the ID will change. Unique IDs
    * are used when the hash_bookmark option is used, and can also be used with the timeline.goToId() method to
    * programmatically move the timeline to a specific slide.
    */
  var unique_id: js.UndefOr[String] = js.native
}

object ITimelineSlideData {
  @scala.inline
  def apply(): ITimelineSlideData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimelineSlideData]
  }
  @scala.inline
  implicit class ITimelineSlideDataOps[Self <: ITimelineSlideData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutolink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autolink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutolink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autolink")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: AnonColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_date")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_date(value: ITimelineDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_date")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: ITimelineMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_date(value: ITimelineDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_date")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: ITimelineText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_id")(js.undefined)
        ret
    }
  }
  
}

