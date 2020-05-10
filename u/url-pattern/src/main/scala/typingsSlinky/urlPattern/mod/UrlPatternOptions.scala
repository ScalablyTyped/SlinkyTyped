package typingsSlinky.urlPattern.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlPatternOptions extends js.Object {
  var escapeChar: js.UndefOr[String] = js.native
  var optionalSegmentEndChar: js.UndefOr[String] = js.native
  var optionalSegmentStartChar: js.UndefOr[String] = js.native
  var segmentNameCharset: js.UndefOr[String] = js.native
  var segmentNameStartChar: js.UndefOr[String] = js.native
  var segmentValueCharset: js.UndefOr[String] = js.native
  var wildcardChar: js.UndefOr[String] = js.native
}

object UrlPatternOptions {
  @scala.inline
  def apply(): UrlPatternOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlPatternOptions]
  }
  @scala.inline
  implicit class UrlPatternOptionsOps[Self <: UrlPatternOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscapeChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalSegmentEndChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalSegmentEndChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalSegmentEndChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalSegmentEndChar")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalSegmentStartChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalSegmentStartChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalSegmentStartChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalSegmentStartChar")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentNameCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentNameCharset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentNameCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentNameCharset")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentNameStartChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentNameStartChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentNameStartChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentNameStartChar")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentValueCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentValueCharset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentValueCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentValueCharset")(js.undefined)
        ret
    }
    @scala.inline
    def withWildcardChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcardChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWildcardChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcardChar")(js.undefined)
        ret
    }
  }
  
}

