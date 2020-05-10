package typingsSlinky.semanticUiSearch.SemanticUI.SearchSettings

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
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

@js.native
trait Impl extends js.Object {
  // region Behavior
  /**
    * Settings for API call.
    *
    * @see {@link http://semantic-ui.com/behaviors/api.html#/usage}
    */
  var apiSettings: ApiSettings = js.native
  /**
    * Caches results locally to avoid requerying server
    *
    * @default true
    */
  var cache: Boolean = js.native
  /**
    * Class names used to determine element state
    */
  var className: ClassNameSettings = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * Duration of animation events
    *
    * @default 300
    */
  var duration: Double = js.native
  /**
    * Easing equation when using fallback Javascript animation
    *
    * @default 'easeOutExpo'
    */
  var easing: String = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * List mapping display content to JSON property, either with API or source.
    */
  var fields: FieldsSettings = js.native
  /**
    * Delay before hiding results after search blur
    *
    * @default 0
    */
  var hideDelay: Double = js.native
  /**
    * Maximum results to display when using local and simple search, maximum category count for category search
    *
    * @default 7
    */
  var maxResults: Double = js.native
  /**
    * HTML5 metadata attributes used internally
    */
  var metadata: MetadataSettings = js.native
  /**
    * Minimum characters to query for results
    *
    * @default 1
    */
  var minCharacters: Double = js.native
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // endregion
  // region DOM Settings
  /**
    * Regular expressions used for matching
    */
  var regExp: RegExpSettings = js.native
  /**
    * Delay before querying results on inputchange
    *
    * @default 100
    */
  var searchDelay: Double = js.native
  /**
    * Specify object properties inside local source object which will be searched
    */
  var searchFields: js.Array[String] = js.native
  /**
    * Return local results that match anywhere inside your content
    *
    * @default true
    */
  var searchFullText: Boolean = js.native
  /**
    * Whether the search should automatically select the first search result after searching
    *
    * @default false
    */
  var selectFirstResult: Boolean = js.native
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings = js.native
  /**
    * Whether a "no results" message should be shown if no results are found. (These messages can be modified using the template object specified below)
    *
    * @default false
    */
  var showNoResults: Boolean = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Specify a Javascript object which will be searched locally
    *
    * @default false
    */
  var source: `false` | js.Any = js.native
  // endregion
  // region Templates
  var templates: TemplatesSettings = js.native
  /**
    * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
    *
    * @default 'fade'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String = js.native
  var `type`: String = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Callback on server response
    */
  def onResults(response: js.Any): Unit = js.native
  /**
    * Callback after processing element template to add HTML to results. Function should return false to prevent default actions.
    */
  def onResultsAdd(html: String): `false` | Unit = js.native
  /**
    * Callback when results are closed
    */
  def onResultsClose(): Unit = js.native
  /**
    * Callback when results are opened
    */
  def onResultsOpen(): Unit = js.native
  /**
    * Callback on search query
    */
  def onSearchQuery(query: String): Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Callback on element selection by user.
    * The first parameter includes the filtered response results for that element.
    * The function should return false to prevent default action (closing search results and selecting value).
    */
  def onSelect(result: js.Any, response: js.Any): `false` | Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    apiSettings: ApiSettings,
    cache: Boolean,
    className: ClassNameSettings,
    debug: Boolean,
    duration: Double,
    easing: String,
    error: ErrorSettings,
    fields: FieldsSettings,
    hideDelay: Double,
    maxResults: Double,
    metadata: MetadataSettings,
    minCharacters: Double,
    name: String,
    namespace: String,
    onResults: js.Any => Unit,
    onResultsAdd: String => `false` | Unit,
    onResultsClose: () => Unit,
    onResultsOpen: () => Unit,
    onSearchQuery: String => Unit,
    onSelect: (js.Any, js.Any) => `false` | Unit,
    performance: Boolean,
    regExp: RegExpSettings,
    searchDelay: Double,
    searchFields: js.Array[String],
    searchFullText: Boolean,
    selectFirstResult: Boolean,
    selector: SelectorSettings,
    showNoResults: Boolean,
    silent: Boolean,
    source: `false` | js.Any,
    templates: TemplatesSettings,
    transition: String,
    `type`: String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hideDelay = hideDelay.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], minCharacters = minCharacters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onResults = js.Any.fromFunction1(onResults), onResultsAdd = js.Any.fromFunction1(onResultsAdd), onResultsClose = js.Any.fromFunction0(onResultsClose), onResultsOpen = js.Any.fromFunction0(onResultsOpen), onSearchQuery = js.Any.fromFunction1(onSearchQuery), onSelect = js.Any.fromFunction2(onSelect), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], searchDelay = searchDelay.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], searchFullText = searchFullText.asInstanceOf[js.Any], selectFirstResult = selectFirstResult.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showNoResults = showNoResults.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: FieldsSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: MetadataSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnResults(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnResultsAdd(value: String => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnResultsClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnResultsOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSearchQuery(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSelect(value: (js.Any, js.Any) => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegExp(value: RegExpSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchFullText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFullText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectFirstResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFirstResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNoResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNoResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: `false` | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplates(value: TemplatesSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

