package typingsSlinky.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplCategory extends js.Object {
  var category: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.native
  var escape: js.UndefOr[js.Function1[/* string */ String, String]] = js.native
  var message: js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]] = js.native
  var standard: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.native
}

object PartialPickImplkeyofImplCategory {
  @scala.inline
  def apply(): PartialPickImplkeyofImplCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplCategory]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplCategoryOps[Self <: PartialPickImplkeyofImplCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: /* response */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: /* string */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: (/* message */ String, /* type */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withStandard(value: /* response */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStandard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(js.undefined)
        ret
    }
  }
  
}

