package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSpan extends js.Object {
  /**
    * If DocumentSpan.textSpan is the span for name of the declaration,
    * then this is the span for relevant declaration
    */
  var contextSpan: js.UndefOr[TextSpan] = js.native
  var fileName: java.lang.String = js.native
  var originalContextSpan: js.UndefOr[TextSpan] = js.native
  var originalFileName: js.UndefOr[java.lang.String] = js.native
  /**
    * If the span represents a location that was remapped (e.g. via a .d.ts.map file),
    * then the original filename and span will be specified here
    */
  var originalTextSpan: js.UndefOr[TextSpan] = js.native
  var textSpan: TextSpan = js.native
}

object DocumentSpan {
  @scala.inline
  def apply(fileName: java.lang.String, textSpan: TextSpan): DocumentSpan = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSpan]
  }
  @scala.inline
  implicit class DocumentSpanOps[Self <: DocumentSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
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
    def withOriginalContextSpan(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalContextSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalContextSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalContextSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalFileName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalTextSpan(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTextSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalTextSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTextSpan")(js.undefined)
        ret
    }
  }
  
}

