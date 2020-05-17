package typingsSlinky.semanticUiSearch.anon

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiSearch.JQuery
import typingsSlinky.semanticUiSearch.SemanticUI.Search.ClassNameSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.ErrorSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.FieldsSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.MetadataSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.RegExpSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.SelectorSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.TemplatesSettings
import typingsSlinky.semanticUiSearch.semanticUiSearchBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, keyof semantic-ui-search.SemanticUI.SearchSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var apiSettings: js.UndefOr[ApiSettings] = js.native
  var cache: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var fields: js.UndefOr[FieldsSettings] = js.native
  var hideDelay: js.UndefOr[Double] = js.native
  var maxResults: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[MetadataSettings] = js.native
  var minCharacters: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var onResults: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]] = js.native
  var onResultsAdd: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]] = js.native
  var onResultsClose: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onResultsOpen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onSearchQuery: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]] = js.native
  var onSelect: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
  ] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var regExp: js.UndefOr[RegExpSettings] = js.native
  var searchDelay: js.UndefOr[Double] = js.native
  var searchFields: js.UndefOr[js.Array[String]] = js.native
  var searchFullText: js.UndefOr[Boolean] = js.native
  var selectFirstResult: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var showNoResults: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[`false` | js.Any] = js.native
  var templates: js.UndefOr[TemplatesSettings] = js.native
  var transition: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiSettings(value: ApiSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: FieldsSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: MetadataSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResults(value: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResults")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResultsAdd(value: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResultsAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResultsClose(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResultsClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResultsOpen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResultsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchQuery(value: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSearchQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(
      value: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(js.undefined)
        ret
    }
    @scala.inline
    def withRegExp(value: RegExpSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFields")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchFullText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFullText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchFullText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFullText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectFirstResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFirstResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectFirstResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFirstResult")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNoResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNoResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNoResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNoResults")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: `false` | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: TemplatesSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

