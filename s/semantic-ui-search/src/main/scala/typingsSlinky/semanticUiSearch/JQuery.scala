package typingsSlinky.semanticUiSearch

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search
import typingsSlinky.semanticUiSearch.SemanticUI.Search.ClassNameSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.ErrorSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.FieldsSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.MetadataSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.RegExpSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.SelectorSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.TemplatesSettings
import typingsSlinky.semanticUiSearch.SemanticUI.SearchSettings
import typingsSlinky.semanticUiSearch.semanticUiSearchBooleans.`false`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`add results`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`cancel query`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`clear cache`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`display message`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`generate results`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`get result`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`get value`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`has minimum characters`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`hide results`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`is empty`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`is focused`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`is visible`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`read cache`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`search local`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`search object`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`search remote`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`set value`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`show results`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`type`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`write cache`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.apiSettings
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.cache
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.className
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.debug
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.destroy
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.duration
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.easing
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.error
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.fields
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.hideDelay
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.maxResults
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.metadata
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.minCharacters
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.name
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.namespace
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onResults
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onResultsAdd
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onResultsClose
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onResultsOpen
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onSearchQuery
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onSelect
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.performance
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.query
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.regExp
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.searchDelay
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.searchFields
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.searchFullText
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.selectFirstResult
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.selector
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.setting
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.showNoResults
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.silent
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.source
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.templates
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.transition
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def search(): JQuery = js.native
  def search(behavior: setting, name: `type`, value: js.UndefOr[scala.Nothing]): String = js.native
  def search(behavior: setting, name: `type`, value: String): JQuery = js.native
  def search(behavior: setting, name: apiSettings, value: ApiSettings): JQuery = js.native
  def search(behavior: setting, name: cache, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def search(behavior: setting, name: cache, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def search(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def search(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def search(behavior: setting, name: duration, value: Double): JQuery = js.native
  def search(behavior: setting, name: easing, value: js.UndefOr[scala.Nothing]): String = js.native
  def search(behavior: setting, name: easing, value: String): JQuery = js.native
  def search(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def search(behavior: setting, name: fields, value: FieldsSettings): JQuery = js.native
  def search(behavior: setting, name: hideDelay, value: js.UndefOr[scala.Nothing]): Double = js.native
  def search(behavior: setting, name: hideDelay, value: Double): JQuery = js.native
  def search(behavior: setting, name: maxResults, value: js.UndefOr[scala.Nothing]): Double = js.native
  def search(behavior: setting, name: maxResults, value: Double): JQuery = js.native
  def search(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def search(behavior: setting, name: minCharacters, value: js.UndefOr[scala.Nothing]): Double = js.native
  def search(behavior: setting, name: minCharacters, value: Double): JQuery = js.native
  def search(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def search(behavior: setting, name: namespace, value: String): JQuery = js.native
  def search(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def search(behavior: setting, name: name, value: String): JQuery = js.native
  def search(behavior: setting, name: onResultsAdd, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit] = js.native
  def search(
    behavior: setting,
    name: onResultsAdd,
    value: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]
  ): JQuery = js.native
  def search(behavior: setting, name: onResultsClose, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def search(behavior: setting, name: onResultsClose, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def search(behavior: setting, name: onResultsOpen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def search(behavior: setting, name: onResultsOpen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def search(behavior: setting, name: onResults, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit] = js.native
  def search(
    behavior: setting,
    name: onResults,
    value: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]
  ): JQuery = js.native
  def search(behavior: setting, name: onSearchQuery, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit] = js.native
  def search(
    behavior: setting,
    name: onSearchQuery,
    value: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]
  ): JQuery = js.native
  def search(behavior: setting, name: onSelect, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit] = js.native
  def search(
    behavior: setting,
    name: onSelect,
    value: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
  ): JQuery = js.native
  def search(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def search(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def search(behavior: setting, name: searchDelay, value: js.UndefOr[scala.Nothing]): Double = js.native
  def search(behavior: setting, name: searchDelay, value: Double): JQuery = js.native
  def search(behavior: setting, name: searchFields, value: js.UndefOr[scala.Nothing]): js.Array[String] = js.native
  def search(behavior: setting, name: searchFields, value: js.Array[String]): JQuery = js.native
  def search(behavior: setting, name: searchFullText, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def search(behavior: setting, name: searchFullText, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: selectFirstResult, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def search(behavior: setting, name: selectFirstResult, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def search(behavior: setting, name: showNoResults, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def search(behavior: setting, name: showNoResults, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def search(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: source, value: js.UndefOr[scala.Nothing]): `false` | js.Any = js.native
  def search(behavior: setting, name: source, value: js.Any): JQuery = js.native
  def search(behavior: setting, name: source, value: `false`): JQuery = js.native
  def search(behavior: setting, name: templates, value: js.UndefOr[scala.Nothing]): TemplatesSettings = js.native
  def search(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
  def search(behavior: setting, name: transition, value: String): JQuery = js.native
  def search(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def search(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def search(settings: SearchSettings): JQuery = js.native
  @JSName("search")
  def search_ApiSettings(behavior: setting, name: apiSettings, value: js.UndefOr[scala.Nothing]): ApiSettings = js.native
  @JSName("search")
  def search_ClassNameSettings(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  @JSName("search")
  def search_FieldsSettings(behavior: setting, name: fields, value: js.UndefOr[scala.Nothing]): FieldsSettings = js.native
  @JSName("search")
  def search_JQuery(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  @JSName("search")
  def search_JQuery(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  @JSName("search")
  def search_MetadataSettings(behavior: setting, name: metadata, value: js.UndefOr[scala.Nothing]): MetadataSettings = js.native
  @JSName("search")
  var search_Original: Search = js.native
  @JSName("search")
  def search_RegExpSettings(behavior: setting, name: regExp, value: js.UndefOr[scala.Nothing]): RegExpSettings = js.native
  @JSName("search")
  def search_SelectorSettings(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  /**
    * Adds HTML to results and displays
    */
  @JSName("search")
  def search_addresults(behavior: `add results`, html: String): JQuery = js.native
  /**
    * Cancels current remote search query
    */
  @JSName("search")
  def search_cancelquery(behavior: `cancel query`): JQuery = js.native
  /**
    * Clears value from cache, if no parameter passed clears all cache
    */
  @JSName("search")
  def search_clearcache(behavior: `clear cache`): JQuery = js.native
  @JSName("search")
  def search_clearcache(behavior: `clear cache`, query: String): JQuery = js.native
  /**
    * Removes all events
    */
  @JSName("search")
  def search_destroy(behavior: destroy): JQuery = js.native
  /**
    * Displays message in search results with text, using template matching type
    */
  @JSName("search")
  def search_displaymessage(behavior: `display message`, text: String, `type`: String): JQuery = js.native
  /**
    * Generates results using parser specified by settings.template
    */
  @JSName("search")
  def search_generateresults(behavior: `generate results`, response: js.Any): JQuery = js.native
  /**
    * Returns JSON object matching searched title or id (see above)
    */
  @JSName("search")
  def search_getresult(behavior: `get result`, value: js.Any): js.Any = js.native
  /**
    * Returns current search value
    */
  @JSName("search")
  def search_getvalue(behavior: `get value`): js.Any = js.native
  /**
    * Whether has minimum characters
    */
  @JSName("search")
  def search_hasminimumcharacters(behavior: `has minimum characters`): Boolean = js.native
  /**
    * Hides results container
    */
  @JSName("search")
  def search_hideresults(behavior: `hide results`): JQuery = js.native
  @JSName("search")
  def search_hideresults(behavior: `hide results`, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Whether search results are empty
    */
  @JSName("search")
  def search_isempty(behavior: `is empty`): Boolean = js.native
  /**
    * Whether search is currently focused
    */
  @JSName("search")
  def search_isfocused(behavior: `is focused`): Boolean = js.native
  /**
    * Whether search results are visible
    */
  @JSName("search")
  def search_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Search for value currently set in search input
    */
  @JSName("search")
  def search_query(behavior: query): JQuery = js.native
  @JSName("search")
  def search_query(behavior: query, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Reads cached results for query
    */
  @JSName("search")
  def search_readcache(behavior: `read cache`, query: String): JQuery = js.native
  /**
    * Search local object for specified query and display results
    */
  @JSName("search")
  def search_searchlocal(behavior: `search local`, query: String): JQuery = js.native
  /**
    * Search object for specified query and return results
    */
  @JSName("search")
  def search_searchobject(behavior: `search object`, query: String, `object`: js.Any, searchFields: js.Array[String]): js.Any = js.native
  /**
    * Search remote endpoint for specified query and display results
    */
  @JSName("search")
  def search_searchremote(behavior: `search remote`, query: String): JQuery = js.native
  @JSName("search")
  def search_searchremote(behavior: `search remote`, query: String, callback: js.Function0[Unit]): JQuery = js.native
  @JSName("search")
  def search_setting(behavior: setting, value: SearchSettings): JQuery = js.native
  /**
    * Sets search input to value
    */
  @JSName("search")
  def search_setvalue(behavior: `set value`, value: js.Any): JQuery = js.native
  /**
    * Shows results container
    */
  @JSName("search")
  def search_showresults(behavior: `show results`): JQuery = js.native
  @JSName("search")
  def search_showresults(behavior: `show results`, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Writes cached results for query
    */
  @JSName("search")
  def search_writecache(behavior: `write cache`, query: String): JQuery = js.native
}
