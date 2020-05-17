package typingsSlinky.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplPrompt extends js.Object {
  var category: js.UndefOr[String] = js.native
  var prompt: js.UndefOr[String] = js.native
  var result: js.UndefOr[String] = js.native
  var results: js.UndefOr[String] = js.native
  var searchButton: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplPrompt {
  @scala.inline
  def apply(): PartialPickImplkeyofImplPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplPrompt]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplPromptOps[Self <: PartialPickImplkeyofImplPrompt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchButton")(js.undefined)
        ret
    }
  }
  
}

