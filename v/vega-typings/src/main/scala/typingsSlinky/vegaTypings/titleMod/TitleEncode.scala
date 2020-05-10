package typingsSlinky.vegaTypings.titleMod

import typingsSlinky.vegaTypings.encodeMod.GroupEncodeEntry
import typingsSlinky.vegaTypings.encodeMod.TextEncodeEntry
import typingsSlinky.vegaTypings.legendMod.GuideEncodeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitleEncode extends js.Object {
  /**
    * Custom encoding for the title container group.
    */
  var group: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.native
  /**
    * Custom encoding for the subtitle text.
    */
  var subtitle: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
  /**
    * Custom encoding for the title text.
    */
  var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
}

object TitleEncode {
  @scala.inline
  def apply(): TitleEncode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleEncode]
  }
  @scala.inline
  implicit class TitleEncodeOps[Self <: TitleEncode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: GuideEncodeEntry[GroupEncodeEntry]): Self = {
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
    def withSubtitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = {
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

