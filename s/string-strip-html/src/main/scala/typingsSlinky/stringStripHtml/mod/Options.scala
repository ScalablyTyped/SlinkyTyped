package typingsSlinky.stringStripHtml.mod

import typingsSlinky.stringStripHtml.stringStripHtmlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dumpLinkHrefsNearby: js.UndefOr[DumpLinkHrefsNearby | `false`] = js.native
  var ignoreTags: js.UndefOr[js.Array[String]] = js.native
  var onlyStripTags: js.UndefOr[js.Array[String]] = js.native
  var returnRangeOnly: js.UndefOr[Boolean] = js.native
  var skipHtmlDecoding: js.UndefOr[Boolean] = js.native
  var stripTogetherWithTheirContents: js.UndefOr[js.Array[String] | `false`] = js.native
  var trimOnlySpaces: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDumpLinkHrefsNearby(value: DumpLinkHrefsNearby | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpLinkHrefsNearby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDumpLinkHrefsNearby: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpLinkHrefsNearby")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTags")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyStripTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyStripTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyStripTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyStripTags")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnRangeOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnRangeOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnRangeOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnRangeOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipHtmlDecoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHtmlDecoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipHtmlDecoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHtmlDecoding")(js.undefined)
        ret
    }
    @scala.inline
    def withStripTogetherWithTheirContents(value: js.Array[String] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTogetherWithTheirContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripTogetherWithTheirContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTogetherWithTheirContents")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimOnlySpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimOnlySpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimOnlySpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimOnlySpaces")(js.undefined)
        ret
    }
  }
  
}

