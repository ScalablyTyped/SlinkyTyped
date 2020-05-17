package typingsSlinky.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplBeginsWith extends js.Object {
  var beginsWith: js.UndefOr[String] = js.native
  var escape: js.UndefOr[js.RegExp] = js.native
}

object PartialPickImplkeyofImplBeginsWith {
  @scala.inline
  def apply(): PartialPickImplkeyofImplBeginsWith = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplBeginsWith]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplBeginsWithOps[Self <: PartialPickImplkeyofImplBeginsWith] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginsWith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginsWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginsWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginsWith")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
  }
  
}

