package typingsSlinky.semanticUiDropdown.SemanticUI.DropdownSettings

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiDropdown.JQuery
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.ClassNameSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.KeySettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.SelectorSettings
import typingsSlinky.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.activate
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.auto
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.both
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.combo
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.downward
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.exact
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.hide
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.nothing
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.select
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.text
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.upward
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * Sets a default action to occur. (See usage guide)
    *
    * @default 'activate'
    * @see {@link http://semantic-ui.com/modules/dropdown.html#/usage}
    */
  var action: activate | select | combo | nothing | hide | (js.ThisFunction3[
    /* this */ JQuery, 
    /* text */ String, 
    /* value */ String | `false`, 
    /* element */ JQuery, 
    Unit
  ]) = js.native
  /**
    * Whether search selection should allow users to add their own selections, works for single or multi-select.
    *
    * @default false
    */
  var allowAdditions: Boolean = js.native
  /**
    * Whether menu items with sub-menus (categories) should be selectable
    *
    * @default false
    */
  var allowCategorySelection: Boolean = js.native
  /**
    * When set to true will fire onChange even when the value a user select matches the currently selected value.
    *
    * @default false
    */
  var allowReselection: Boolean = js.native
  /**
    * Whether to allow the element to be navigable by keyboard, by automatically creating a tabindex
    *
    * @default true
    */
  var allowTab: Boolean = js.native
  // endregion
  // region Remote Settings
  /**
    * Can be set to an object to specify API settings for retrieving remote selection menu content from an API endpoint
    *
    * @default false
    * @see {@link http://semantic-ui.com/behaviors/api.html}
    */
  var apiSettings: `false` | ApiSettings = js.native
  var className: ClassNameSettings = js.native
  /**
    * Element context to use when checking whether can show when keepOnScreen: true
    *
    * @default 'window'
    */
  var context: String | JQuery = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * Time in milliseconds to debounce show or hide behavior when on: hover is used, or when touch is used.
    */
  var delay: DelaySettings = js.native
  // endregion
  // region Additional Settings
  /**
    * When set to auto determines direction based on whether dropdown can fit on screen. Set to upward or downward to always force a direction.
    *
    * @default 'auto'
    */
  var direction: auto | upward | downward = js.native
  /**
    * Duration of animation events
    *
    * @default 200
    */
  var duration: Double = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * List mapping dropdown content to JSON Property when using API
    */
  var fields: FieldsSettings = js.native
  /**
    * When set to true API will be expected to return the complete result set, which will then be filtered clientside to only display matching results.
    *
    * @default false
    * @since 2.2.8
    */
  var filterRemoteData: Boolean = js.native
  /**
    * Whether search selection will force currently selected choice when element is blurred.
    *
    * @default true
    */
  var forceSelection: Boolean = js.native
  /**
    * Specifying to "true" will use a fuzzy full text search, setting to "exact" will force the exact search to be matched somewhere in the string
    *
    * @default false
    */
  var fullTextSearch: Boolean | exact = js.native
  /**
    * Maximum glyph width, used to calculate search size. This is usually size of a "W" in your font in em
    *
    * @default 1.0714
    */
  var glyphWidth: Double = js.native
  /**
    * When disabled user additions will appear in the results menu using a specially formatted selection item formatted by templates.addition.
    *
    * @default true
    */
  var hideAdditions: Boolean = js.native
  /**
    * Whether dropdown should try to keep itself on screen by checking whether menus display position in its context (Default context is page).
    *
    * @default true
    */
  var keepOnScreen: Boolean = js.native
  /**
    * The keycode used to represent keyboard shortcuts. To avoid issues with some foreign languages, you can pass false for comma delimiter's value
    */
  var keys: KeySettings = js.native
  /**
    * Allows customization of multi-select labels
    */
  var label: LabelSettings = js.native
  /**
    * When using search selection specifies how to match values.
    *
    * @default 'both'
    */
  var `match`: both | value | text = js.native
  /**
    * When set to a number, sets the maximum number of selections
    *
    * @default false
    */
  var maxSelections: `false` | Double = js.native
  // endregion
  // region DOM Settings
  /**
    * You can specify site wide messages by modifying $.fn.dropdown.settings.message that will apply on any dropdown if it appears in the page.
    */
  var message: MessageSettings = js.native
  var metadata: MetadataSettings = js.native
  /**
    * The minimum characters for a search to begin showing results
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
  // region Frequently Used Settings
  /**
    * Event used to trigger dropdown (Hover, Click, Custom Event)
    *
    * @default 'click'
    */
  var on: String = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  /**
    * @default 'auto'
    */
  var placeholder: auto | value | `false` = js.native
  /**
    * Whether HTML included in dropdown values should be preserved. (Allows icons to show up in selected value)
    *
    * @default true
    */
  var preserveHTML: Boolean = js.native
  var regExp: RegExpSettings = js.native
  /**
    * When enabled will automatically store selected name/value pairs in sessionStorage to preserve user selection on page refresh. Disabling will clear remote dropdown values on refresh.
    *
    * @default true
    */
  var saveRemoteData: Boolean = js.native
  /**
    * Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice.
    *
    * @default true
    */
  var selectOnKeydown: Boolean = js.native
  var selector: SelectorSettings = js.native
  /**
    * Whether to show dropdown menu automatically on element focus.
    *
    * @default true
    */
  var showOnFocus: Boolean = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Whether to sort values when creating a dropdown automatically from a select element.
    *
    * @default false
    */
  var sortSelect: Boolean = js.native
  /**
    * Named transition to use when animating menu in and out.
    * Defaults to slide down or slide up depending on dropdown direction.
    * Fade and slide down are available without including ui transitions
    *
    * @default 'auto'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: auto | String = js.native
  // endregion
  // region Multiple Select Settings
  /**
    * Whether multiselect should use labels. Must be set to true when allowAdditions is true
    *
    * @default true
    */
  var useLabels: Boolean = js.native
  /**
    * When specified allows you to initialize dropdown with specific values. See usage guide for details.
    *
    * @default false
    */
  var values: js.Any = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Is called after a dropdown selection is added using a multiple select dropdown, only receives the added value
    */
  def onAdd(addedValue: js.Any, addedText: String, $addedChoice: JQuery): Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Is called after a dropdown value changes. Receives the name and value of selection and the active menu element
    */
  def onChange(value: js.Any, text: String, $choice: JQuery): Unit = js.native
  /**
    * Is called before a dropdown is hidden. If false is returned, dropdown will not be hidden.
    */
  def onHide(): `false` | Unit = js.native
  /**
    * Allows you to modify a label before it is added. Expects the jQ DOM element for a label to be returned.
    */
  def onLabelCreate(value: js.Any, text: String): JQuery = js.native
  /**
    * Called when a label is remove, return false; will prevent the label from being removed.
    */
  def onLabelRemove(value: js.Any): `false` | Unit = js.native
  /**
    * Is called after a label is selected by a user
    */
  def onLabelSelect($selectedLabels: JQuery): Unit = js.native
  /**
    * Is called after a dropdown is searched with no matching values
    */
  def onNoResults(searchValue: js.Any): Unit = js.native
  /**
    * Is called after a dropdown selection is removed using a multiple select dropdown, only receives the removed value
    */
  def onRemove(removedValue: js.Any, removedText: String, $removedChoice: JQuery): Unit = js.native
  /**
    * Is called before a dropdown is shown. If false is returned, dropdown will not be shown.
    */
  def onShow(): `false` | Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    action: activate | select | combo | nothing | hide | (js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ]),
    allowAdditions: Boolean,
    allowCategorySelection: Boolean,
    allowReselection: Boolean,
    allowTab: Boolean,
    apiSettings: `false` | ApiSettings,
    className: ClassNameSettings,
    context: String | JQuery,
    debug: Boolean,
    delay: DelaySettings,
    direction: auto | upward | downward,
    duration: Double,
    error: ErrorSettings,
    fields: FieldsSettings,
    filterRemoteData: Boolean,
    forceSelection: Boolean,
    fullTextSearch: Boolean | exact,
    glyphWidth: Double,
    hideAdditions: Boolean,
    keepOnScreen: Boolean,
    keys: KeySettings,
    label: LabelSettings,
    `match`: both | value | text,
    maxSelections: `false` | Double,
    message: MessageSettings,
    metadata: MetadataSettings,
    minCharacters: Double,
    name: String,
    namespace: String,
    on: String,
    onAdd: (js.Any, String, JQuery) => Unit,
    onChange: (js.Any, String, JQuery) => Unit,
    onHide: () => `false` | Unit,
    onLabelCreate: (js.Any, String) => JQuery,
    onLabelRemove: js.Any => `false` | Unit,
    onLabelSelect: JQuery => Unit,
    onNoResults: js.Any => Unit,
    onRemove: (js.Any, String, JQuery) => Unit,
    onShow: () => `false` | Unit,
    performance: Boolean,
    placeholder: auto | value | `false`,
    preserveHTML: Boolean,
    regExp: RegExpSettings,
    saveRemoteData: Boolean,
    selectOnKeydown: Boolean,
    selector: SelectorSettings,
    showOnFocus: Boolean,
    silent: Boolean,
    sortSelect: Boolean,
    transition: auto | String,
    useLabels: Boolean,
    values: js.Any,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], allowAdditions = allowAdditions.asInstanceOf[js.Any], allowCategorySelection = allowCategorySelection.asInstanceOf[js.Any], allowReselection = allowReselection.asInstanceOf[js.Any], allowTab = allowTab.asInstanceOf[js.Any], apiSettings = apiSettings.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], filterRemoteData = filterRemoteData.asInstanceOf[js.Any], forceSelection = forceSelection.asInstanceOf[js.Any], fullTextSearch = fullTextSearch.asInstanceOf[js.Any], glyphWidth = glyphWidth.asInstanceOf[js.Any], hideAdditions = hideAdditions.asInstanceOf[js.Any], keepOnScreen = keepOnScreen.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxSelections = maxSelections.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], minCharacters = minCharacters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onAdd = js.Any.fromFunction3(onAdd), onChange = js.Any.fromFunction3(onChange), onHide = js.Any.fromFunction0(onHide), onLabelCreate = js.Any.fromFunction2(onLabelCreate), onLabelRemove = js.Any.fromFunction1(onLabelRemove), onLabelSelect = js.Any.fromFunction1(onLabelSelect), onNoResults = js.Any.fromFunction1(onNoResults), onRemove = js.Any.fromFunction3(onRemove), onShow = js.Any.fromFunction0(onShow), performance = performance.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], preserveHTML = preserveHTML.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], saveRemoteData = saveRemoteData.asInstanceOf[js.Any], selectOnKeydown = selectOnKeydown.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showOnFocus = showOnFocus.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], sortSelect = sortSelect.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useLabels = useLabels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(
      value: activate | select | combo | nothing | hide | (js.ThisFunction3[
          /* this */ JQuery, 
          /* text */ String, 
          /* value */ String | `false`, 
          /* element */ JQuery, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowAdditions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowCategorySelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCategorySelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowReselection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReselection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiSettings(value: `false` | ApiSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: DelaySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: auto | upward | downward): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
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
    def withFilterRemoteData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRemoteData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullTextSearch(value: Boolean | exact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTextSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlyphWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideAdditions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAdditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepOnScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOnScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: KeySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: LabelSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: both | value | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSelections(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: MessageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
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
    def withOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAdd(value: (js.Any, String, JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnChange(value: (js.Any, String, JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnHide(value: () => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnLabelCreate(value: (js.Any, String) => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabelCreate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnLabelRemove(value: js.Any => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabelRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnLabelSelect(value: JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabelSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnNoResults(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNoResults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRemove(value: (js.Any, String, JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnShow(value: () => `false` | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: auto | value | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegExp(value: RegExpSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveRemoteData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveRemoteData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectOnKeydown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnKeydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: auto | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
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

