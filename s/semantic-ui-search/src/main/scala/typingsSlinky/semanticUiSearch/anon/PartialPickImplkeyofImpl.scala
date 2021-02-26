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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, keyof semantic-ui-search.SemanticUI.SearchSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends StObject {
  
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
  implicit class PartialPickImplkeyofImplMutableBuilder[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiSettingsUndefined: Self = StObject.set(x, "apiSettings", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFields(value: FieldsSettings): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCharactersUndefined: Self = StObject.set(x, "minCharacters", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setOnResults(value: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]): Self = StObject.set(x, "onResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResultsAdd(value: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]): Self = StObject.set(x, "onResultsAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResultsAddUndefined: Self = StObject.set(x, "onResultsAdd", js.undefined)
    
    @scala.inline
    def setOnResultsClose(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onResultsClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResultsCloseUndefined: Self = StObject.set(x, "onResultsClose", js.undefined)
    
    @scala.inline
    def setOnResultsOpen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onResultsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResultsOpenUndefined: Self = StObject.set(x, "onResultsOpen", js.undefined)
    
    @scala.inline
    def setOnResultsUndefined: Self = StObject.set(x, "onResults", js.undefined)
    
    @scala.inline
    def setOnSearchQuery(value: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]): Self = StObject.set(x, "onSearchQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSearchQueryUndefined: Self = StObject.set(x, "onSearchQuery", js.undefined)
    
    @scala.inline
    def setOnSelect(
      value: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
    ): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    
    @scala.inline
    def setSearchDelay(value: Double): Self = StObject.set(x, "searchDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchDelayUndefined: Self = StObject.set(x, "searchDelay", js.undefined)
    
    @scala.inline
    def setSearchFields(value: js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFieldsUndefined: Self = StObject.set(x, "searchFields", js.undefined)
    
    @scala.inline
    def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value :_*))
    
    @scala.inline
    def setSearchFullText(value: Boolean): Self = StObject.set(x, "searchFullText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFullTextUndefined: Self = StObject.set(x, "searchFullText", js.undefined)
    
    @scala.inline
    def setSelectFirstResult(value: Boolean): Self = StObject.set(x, "selectFirstResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectFirstResultUndefined: Self = StObject.set(x, "selectFirstResult", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setShowNoResults(value: Boolean): Self = StObject.set(x, "showNoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNoResultsUndefined: Self = StObject.set(x, "showNoResults", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setSource(value: `false` | js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
