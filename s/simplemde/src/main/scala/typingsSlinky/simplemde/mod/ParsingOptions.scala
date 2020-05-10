package typingsSlinky.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsingOptions extends js.Object {
  var allowAtxHeaderWithoutSpace: js.UndefOr[Boolean] = js.native
  var strikethrough: js.UndefOr[Boolean] = js.native
  var underscoresBreakWords: js.UndefOr[Boolean] = js.native
}

object ParsingOptions {
  @scala.inline
  def apply(): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsingOptions]
  }
  @scala.inline
  implicit class ParsingOptionsOps[Self <: ParsingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAtxHeaderWithoutSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAtxHeaderWithoutSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAtxHeaderWithoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAtxHeaderWithoutSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withStrikethrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrikethrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderscoresBreakWords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underscoresBreakWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderscoresBreakWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underscoresBreakWords")(js.undefined)
        ret
    }
  }
  
}

