package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightSpan extends js.Object {
  var contextSpan: js.UndefOr[TextSpan] = js.native
  var fileName: js.UndefOr[java.lang.String] = js.native
  var isInString: js.UndefOr[`true`] = js.native
  var kind: HighlightSpanKind = js.native
  var textSpan: TextSpan = js.native
}

object HighlightSpan {
  @scala.inline
  def apply(kind: HighlightSpanKind, textSpan: TextSpan): HighlightSpan = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightSpan]
  }
  @scala.inline
  implicit class HighlightSpanOps[Self <: HighlightSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: HighlightSpanKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextSpan(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextSpan(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInString(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInString")(js.undefined)
        ret
    }
  }
  
}

