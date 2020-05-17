package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`true`
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.editor
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.hybrid
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCompleteParams
  extends SharedEditorParams
     with SharedSelectAutoCompleteEditorParams
     with EditorParams {
  var allowEmpty: js.UndefOr[Boolean] = js.native
  var emptyPlaceholder: js.UndefOr[String | HTMLElement] = js.native
  var freetext: js.UndefOr[Boolean] = js.native
  var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.native
  var searchFunc: js.UndefOr[
    js.Function2[
      /* term */ String, 
      /* values */ js.Array[String], 
      js.Array[String] | js.Promise[js.Array[String]]
    ]
  ] = js.native
  /**If you return a promise from the searchFunc callback then a "Searching..." placeholder will be displayed until the promise resolved.
    You can customise this placeholder using the searchingPlaceholder option. */
  var searchingPlaceholder: js.UndefOr[String | HTMLElement] = js.native
  var showListOnEmpty: js.UndefOr[Boolean] = js.native
  var values: `true` | js.Array[String] | JSONRecord | String = js.native
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.native
}

object AutoCompleteParams {
  @scala.inline
  def apply(values: `true` | js.Array[String] | JSONRecord | String): AutoCompleteParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteParams]
  }
  @scala.inline
  implicit class AutoCompleteParamsOps[Self <: AutoCompleteParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: `true` | js.Array[String] | JSONRecord | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyPlaceholderHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyPlaceholder(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withFreetext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freetext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreetext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freetext")(js.undefined)
        ret
    }
    @scala.inline
    def withListItemFormatter(value: (/* value */ String, /* text */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutListItemFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchFunc(
      value: (/* term */ String, /* values */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFunc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSearchFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchingPlaceholderHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchingPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchingPlaceholder(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchingPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchingPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchingPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withShowListOnEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showListOnEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowListOnEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showListOnEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalNavigation(value: editor | table | hybrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalNavigation")(js.undefined)
        ret
    }
  }
  
}

