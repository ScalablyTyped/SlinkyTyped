package typingsSlinky.xssFilters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XSSFilters extends js.Object {
  def inDoubleQuotedAttr(s: String): String = js.native
  def inHTMLComment(s: String): String = js.native
  def inHTMLData(s: String): String = js.native
  def inSingleQuotedAttr(s: String): String = js.native
  def inUnQuotedAttr(s: String): String = js.native
  def uriComponentInDoubleQuotedAttr(s: String): String = js.native
  def uriComponentInHTMLComment(s: String): String = js.native
  def uriComponentInHTMLData(s: String): String = js.native
  def uriComponentInSingleQuotedAttr(s: String): String = js.native
  def uriComponentInUnQuotedAttr(s: String): String = js.native
  def uriFragmentInDoubleQuotedAttr(s: String): String = js.native
  def uriFragmentInHTMLComment(s: String): String = js.native
  def uriFragmentInHTMLData(s: String): String = js.native
  def uriFragmentInSingleQuotedAttr(s: String): String = js.native
  def uriFragmentInUnQuotedAttr(s: String): String = js.native
  def uriInDoubleQuotedAttr(s: String): String = js.native
  def uriInHTMLComment(s: String): String = js.native
  def uriInHTMLData(s: String): String = js.native
  def uriInSingleQuotedAttr(s: String): String = js.native
  def uriInUnQuotedAttr(s: String): String = js.native
  def uriPathInDoubleQuotedAttr(s: String): String = js.native
  def uriPathInHTMLComment(s: String): String = js.native
  def uriPathInHTMLData(s: String): String = js.native
  def uriPathInSingleQuotedAttr(s: String): String = js.native
  def uriPathInUnQuotedAttr(s: String): String = js.native
  def uriQueryInDoubleQuotedAttr(s: String): String = js.native
  def uriQueryInHTMLComment(s: String): String = js.native
  def uriQueryInHTMLData(s: String): String = js.native
  def uriQueryInSingleQuotedAttr(s: String): String = js.native
  def uriQueryInUnQuotedAttr(s: String): String = js.native
}

object XSSFilters {
  @scala.inline
  def apply(
    inDoubleQuotedAttr: String => String,
    inHTMLComment: String => String,
    inHTMLData: String => String,
    inSingleQuotedAttr: String => String,
    inUnQuotedAttr: String => String,
    uriComponentInDoubleQuotedAttr: String => String,
    uriComponentInHTMLComment: String => String,
    uriComponentInHTMLData: String => String,
    uriComponentInSingleQuotedAttr: String => String,
    uriComponentInUnQuotedAttr: String => String,
    uriFragmentInDoubleQuotedAttr: String => String,
    uriFragmentInHTMLComment: String => String,
    uriFragmentInHTMLData: String => String,
    uriFragmentInSingleQuotedAttr: String => String,
    uriFragmentInUnQuotedAttr: String => String,
    uriInDoubleQuotedAttr: String => String,
    uriInHTMLComment: String => String,
    uriInHTMLData: String => String,
    uriInSingleQuotedAttr: String => String,
    uriInUnQuotedAttr: String => String,
    uriPathInDoubleQuotedAttr: String => String,
    uriPathInHTMLComment: String => String,
    uriPathInHTMLData: String => String,
    uriPathInSingleQuotedAttr: String => String,
    uriPathInUnQuotedAttr: String => String,
    uriQueryInDoubleQuotedAttr: String => String,
    uriQueryInHTMLComment: String => String,
    uriQueryInHTMLData: String => String,
    uriQueryInSingleQuotedAttr: String => String,
    uriQueryInUnQuotedAttr: String => String
  ): XSSFilters = {
    val __obj = js.Dynamic.literal(inDoubleQuotedAttr = js.Any.fromFunction1(inDoubleQuotedAttr), inHTMLComment = js.Any.fromFunction1(inHTMLComment), inHTMLData = js.Any.fromFunction1(inHTMLData), inSingleQuotedAttr = js.Any.fromFunction1(inSingleQuotedAttr), inUnQuotedAttr = js.Any.fromFunction1(inUnQuotedAttr), uriComponentInDoubleQuotedAttr = js.Any.fromFunction1(uriComponentInDoubleQuotedAttr), uriComponentInHTMLComment = js.Any.fromFunction1(uriComponentInHTMLComment), uriComponentInHTMLData = js.Any.fromFunction1(uriComponentInHTMLData), uriComponentInSingleQuotedAttr = js.Any.fromFunction1(uriComponentInSingleQuotedAttr), uriComponentInUnQuotedAttr = js.Any.fromFunction1(uriComponentInUnQuotedAttr), uriFragmentInDoubleQuotedAttr = js.Any.fromFunction1(uriFragmentInDoubleQuotedAttr), uriFragmentInHTMLComment = js.Any.fromFunction1(uriFragmentInHTMLComment), uriFragmentInHTMLData = js.Any.fromFunction1(uriFragmentInHTMLData), uriFragmentInSingleQuotedAttr = js.Any.fromFunction1(uriFragmentInSingleQuotedAttr), uriFragmentInUnQuotedAttr = js.Any.fromFunction1(uriFragmentInUnQuotedAttr), uriInDoubleQuotedAttr = js.Any.fromFunction1(uriInDoubleQuotedAttr), uriInHTMLComment = js.Any.fromFunction1(uriInHTMLComment), uriInHTMLData = js.Any.fromFunction1(uriInHTMLData), uriInSingleQuotedAttr = js.Any.fromFunction1(uriInSingleQuotedAttr), uriInUnQuotedAttr = js.Any.fromFunction1(uriInUnQuotedAttr), uriPathInDoubleQuotedAttr = js.Any.fromFunction1(uriPathInDoubleQuotedAttr), uriPathInHTMLComment = js.Any.fromFunction1(uriPathInHTMLComment), uriPathInHTMLData = js.Any.fromFunction1(uriPathInHTMLData), uriPathInSingleQuotedAttr = js.Any.fromFunction1(uriPathInSingleQuotedAttr), uriPathInUnQuotedAttr = js.Any.fromFunction1(uriPathInUnQuotedAttr), uriQueryInDoubleQuotedAttr = js.Any.fromFunction1(uriQueryInDoubleQuotedAttr), uriQueryInHTMLComment = js.Any.fromFunction1(uriQueryInHTMLComment), uriQueryInHTMLData = js.Any.fromFunction1(uriQueryInHTMLData), uriQueryInSingleQuotedAttr = js.Any.fromFunction1(uriQueryInSingleQuotedAttr), uriQueryInUnQuotedAttr = js.Any.fromFunction1(uriQueryInUnQuotedAttr))
    __obj.asInstanceOf[XSSFilters]
  }
  @scala.inline
  implicit class XSSFiltersOps[Self <: XSSFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInDoubleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDoubleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInHTMLComment(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inHTMLComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInHTMLData(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inHTMLData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInSingleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inSingleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInUnQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inUnQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriComponentInDoubleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriComponentInDoubleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriComponentInHTMLComment(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriComponentInHTMLComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriComponentInHTMLData(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriComponentInHTMLData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriComponentInSingleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriComponentInSingleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriComponentInUnQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriComponentInUnQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriFragmentInDoubleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriFragmentInDoubleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriFragmentInHTMLComment(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriFragmentInHTMLComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriFragmentInHTMLData(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriFragmentInHTMLData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriFragmentInSingleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriFragmentInSingleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriFragmentInUnQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriFragmentInUnQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriInDoubleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriInDoubleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriInHTMLComment(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriInHTMLComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriInHTMLData(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriInHTMLData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriInSingleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriInSingleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriInUnQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriInUnQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriPathInDoubleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPathInDoubleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriPathInHTMLComment(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPathInHTMLComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriPathInHTMLData(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPathInHTMLData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriPathInSingleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPathInSingleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriPathInUnQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPathInUnQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriQueryInDoubleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriQueryInDoubleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriQueryInHTMLComment(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriQueryInHTMLComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriQueryInHTMLData(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriQueryInHTMLData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriQueryInSingleQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriQueryInSingleQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriQueryInUnQuotedAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriQueryInUnQuotedAttr")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

