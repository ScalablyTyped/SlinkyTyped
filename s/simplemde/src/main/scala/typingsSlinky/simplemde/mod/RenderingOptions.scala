package typingsSlinky.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderingOptions extends js.Object {
  var codeSyntaxHighlighting: Boolean = js.native
  var singleLineBreaks: js.UndefOr[Boolean] = js.native
}

object RenderingOptions {
  @scala.inline
  def apply(codeSyntaxHighlighting: Boolean): RenderingOptions = {
    val __obj = js.Dynamic.literal(codeSyntaxHighlighting = codeSyntaxHighlighting.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingOptions]
  }
  @scala.inline
  implicit class RenderingOptionsOps[Self <: RenderingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeSyntaxHighlighting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeSyntaxHighlighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleLineBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleLineBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleLineBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleLineBreaks")(js.undefined)
        ret
    }
  }
  
}

