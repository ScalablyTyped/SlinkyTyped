package typingsSlinky.uglifyJs.mod

import typingsSlinky.uglifyJs.uglifyJsStrings.all
import typingsSlinky.uglifyJs.uglifyJsStrings.some
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputOptions extends js.Object {
  var ascii_only: js.UndefOr[Boolean] = js.native
  var beautify: js.UndefOr[Boolean] = js.native
  var braces: js.UndefOr[Boolean] = js.native
  var comments: js.UndefOr[Boolean | all | some | js.RegExp] = js.native
  var indent_level: js.UndefOr[Double] = js.native
  var indent_start: js.UndefOr[Boolean] = js.native
  var inline_script: js.UndefOr[Boolean] = js.native
  var keep_quoted_props: js.UndefOr[Boolean] = js.native
  var max_line_len: js.UndefOr[Boolean | Double] = js.native
  var preamble: js.UndefOr[String] = js.native
  var preserve_line: js.UndefOr[Boolean] = js.native
  var quote_keys: js.UndefOr[Boolean] = js.native
  var quote_style: js.UndefOr[OutputQuoteStyle] = js.native
  var semicolons: js.UndefOr[Boolean] = js.native
  var shebang: js.UndefOr[Boolean] = js.native
  var webkit: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
  var wrap_iife: js.UndefOr[Boolean] = js.native
}

object OutputOptions {
  @scala.inline
  def apply(): OutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputOptions]
  }
  @scala.inline
  implicit class OutputOptionsOps[Self <: OutputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscii_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascii_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscii_only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascii_only")(js.undefined)
        ret
    }
    @scala.inline
    def withBeautify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beautify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeautify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beautify")(js.undefined)
        ret
    }
    @scala.inline
    def withBraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braces")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: Boolean | all | some | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_level(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_level: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_level")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent_start(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent_start")(js.undefined)
        ret
    }
    @scala.inline
    def withInline_script(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline_script: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_script")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_quoted_props(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_quoted_props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_quoted_props: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_quoted_props")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_line_len(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_line_len")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_line_len: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_line_len")(js.undefined)
        ret
    }
    @scala.inline
    def withPreamble(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preamble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreamble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preamble")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserve_line(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserve_line: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve_line")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote_keys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote_keys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote_keys")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote_style(value: OutputQuoteStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote_style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote_style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote_style")(js.undefined)
        ret
    }
    @scala.inline
    def withSemicolons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemicolons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolons")(js.undefined)
        ret
    }
    @scala.inline
    def withShebang(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shebang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShebang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shebang")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkit")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap_iife(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap_iife")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap_iife: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap_iife")(js.undefined)
        ret
    }
  }
  
}

