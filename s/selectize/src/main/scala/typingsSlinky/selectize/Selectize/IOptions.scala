package typingsSlinky.selectize.Selectize

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.selectize.AnonDirection
import typingsSlinky.selectize.JQuery
import typingsSlinky.selectize.selectizeStrings.focus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://github.com/brianreavis/selectize.js/blob/master/docs/usage.md
// option identifiers are parameterized by T; data is parameterized by U
@js.native
trait IOptions[T, U] extends js.Object {
  /**
    * Sets if the "Add..." option should be the default selection in the dropdown.
    *
    * Default: false
    */
  var addPrecedence: js.UndefOr[Boolean] = js.native
  /**
    * If true, Selectize will treat any options with a "" value like normal. This defaults to false to
    * accomodate the common <select> practice of having the first empty option act as a placeholder.
    *
    * Default: false
    */
  var allowEmptyOption: js.UndefOr[Boolean] = js.native
  /**
    * If true, the dropdown will be closed after a selection is made.
    *
    * Default: false
    */
  var closeAfterSelect: js.UndefOr[Boolean] = js.native
  /**
    * Copy the original input classes to the Dropdown element.
    *
    * Default: true
    */
  var copyClassesToDropdown: js.UndefOr[Boolean] = js.native
  /**
    * Allows the user to create a new items that aren't in the list of options.
    * This option can be any of the following: "true", "false" (disabled), or a function that accepts two
    * arguments: "input" and "callback". The callback should be invoked with the final data for the option.
    *
    * Default: false
    */
  var create: js.UndefOr[js.Any] = js.native
  /**
    * Specifies a RegExp or String containing a regular expression that the current search filter must match to
    * be allowed to be created. May also be a predicate function that takes the filter text and returns whether
    * it is allowed.
    *
    * Default: null
    */
  var createFilter: js.UndefOr[js.Any] = js.native
  /**
    * If true, when user exits the field (clicks outside of input or presses ESC) new option is created and
    * selected (if `create`-option is enabled).
    *
    * Default: false
    */
  var createOnBlur: js.UndefOr[Boolean] = js.native
  /**
    * The <option> attribute from which to read JSON data about the option.
    *
    * Default: "data-data"
    */
  var dataAttr: js.UndefOr[String] = js.native
  /**
    * The string to separate items by. This option is only used when Selectize is instantiated from a
    * <input type="text"> element.
    *
    * Default: ','
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * Enable or disable international character support.
    *
    * Default: true
    */
  var diacritics: js.UndefOr[Boolean] = js.native
  /**
    * The name of the property to disabled option and optgroup.
    *
    * Default: 'disabled'
    */
  var disabledField: js.UndefOr[String] = js.native
  /**
    * The element the dropdown menu is appended to. This should be "body" or null.
    * If null, the dropdown will be appended as a child of the selectize control.
    *
    * Default: null
    */
  var dropdownParent: js.UndefOr[String] = js.native
  /**
    * If true, the items that are currently selected will not be shown in the dropdown list of available options.
    *
    * Default: false
    */
  var hideSelected: js.UndefOr[Boolean] = js.native
  /**
    * Toggles match highlighting within the dropdown menu.
    *
    * Default: true
    */
  var highlight: js.UndefOr[Boolean] = js.native
  // General
  // ------------------------------------------------------------------------------------------------------------
  /**
    * An array of the initial selected values. By default this is populated from the original input element.
    */
  var items: js.UndefOr[js.Array[T]] = js.native
  /**
    * The name of the property to render as an option / item label (not needed when custom rendering
    * functions are defined).
    *
    * Default: "text"
    */
  var labelField: js.UndefOr[String] = js.native
  // Callbacks
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Invoked when new options should be loaded from the server.
    */
  var load: js.UndefOr[js.Function2[/* query */ String, /* callback */ js.Function, _]] = js.native
  /**
    * The number of milliseconds to wait before requesting options from the server or null.
    * If null, throttling is disabled.
    *
    * Default: 300
    */
  var loadThrottle: js.UndefOr[Double] = js.native
  /**
    * If truthy, Selectize will make all optgroups be in the same order as they were added (by the `$order`
    * property). Otherwise, it will order based on the score of the results in each.
    *
    * Default: false
    */
  var lockOptgroupOrder: js.UndefOr[Boolean] = js.native
  /**
    * The max number of items the user can select.
    *
    * Default: Infinity
    */
  var maxItems: js.UndefOr[Double] = js.native
  /**
    * The max number of items to render at once in the dropdown list of options.
    *
    * Default: 1000
    */
  var maxOptions: js.UndefOr[Double] = js.native
  /**
    * Invoked when the control loses focus.
    */
  var onBlur: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Invoked when the value of the control changes.
    *
    * If single select, value is of type T.
    * If multi select, value is of type T[].
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  /**
    * Invoked when the control is manually cleared via the clear() method.
    */
  var onClear: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Invoked when the user attempts to delete the current selection.
    */
  var onDelete: js.UndefOr[js.Function1[/* values */ js.Array[T], _]] = js.native
  /**
    * Invoked when the dropdown closes.
    */
  var onDropdownClose: js.UndefOr[js.Function1[/* dropdown */ JQuery, _]] = js.native
  /**
    * Invoked when the dropdown opens.
    */
  var onDropdownOpen: js.UndefOr[js.Function1[/* dropdown */ JQuery, _]] = js.native
  /**
    * Invoked when the control gains focus.
    */
  var onFocus: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Invoked once the control is completely initialized.
    */
  var onInitialize: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Invoked when an item is selected.
    */
  var onItemAdd: js.UndefOr[js.Function2[/* value */ T, /* item */ JQuery, _]] = js.native
  /**
    * Invoked when an item is deselected.
    */
  var onItemRemove: js.UndefOr[js.Function1[/* value */ T, _]] = js.native
  /**
    * Invoked when new options have been loaded and added to the control (via the "load" option or "load" API method).
    */
  var onLoad: js.UndefOr[js.Function1[/* data */ js.Array[U], _]] = js.native
  /**
    * Invoked when a new option is added to the available options list.
    */
  var onOptionAdd: js.UndefOr[js.Function2[/* value */ T, /* data */ U, _]] = js.native
  /**
    * Invoked when an option is removed from the available options.
    */
  var onOptionRemove: js.UndefOr[js.Function1[/* value */ T, _]] = js.native
  /**
    * Invoked when the user types while filtering options.
    */
  var onType: js.UndefOr[js.Function1[/* srt */ String, _]] = js.native
  /**
    * Show the dropdown immediately when the control receives focus.
    *
    * Default: true
    */
  var openOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * The name of the property to group items by.
    *
    * Default: "optgroup"
    */
  var optgroupField: js.UndefOr[String] = js.native
  /**
    * The name of the property to render as an option group label (not needed when custom rendering
    * functions are defined).
    *
    * Default: "label"
    */
  var optgroupLabelField: js.UndefOr[String] = js.native
  /**
    * An array of optgroup values that indicates the order they should be listed in in the dropdown.
    * If not provided, groups will be ordered by the ranking of the options within them.
    *
    * Default: null
    */
  var optgroupOrder: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the option group property that serves as its unique identifier.
    *
    * Default: "value"
    */
  var optgroupValueField: js.UndefOr[String] = js.native
  /**
    * Option groups that options will be bucketed into.
    * If your element is a <select> with <optgroup>s this property gets populated automatically.
    * Make sure each object in the array has a property named whatever "optgroupValueField" is set to.
    */
  var optgroups: js.UndefOr[js.Array[U]] = js.native
  // Data / Searching
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Options available to select; array of objects. If your element is <select> with <option>s specified this
    * property gets populated accordingly. Setting this property is convenient if you have your data as an
    * array and want to automatically generate the <option>s.
    *
    * Default: []
    */
  var options: js.UndefOr[js.Array[U]] = js.native
  /**
    * If false, items created by the user will not show up as available options once they are unselected.
    *
    * Default: true
    */
  var persist: js.UndefOr[Boolean] = js.native
  /**
    * The placeholder of the control (displayed when nothing is selected / typed).
    * Defaults to input element's placeholder, unless this one is specified.
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Plugins to use
    *
    * Default: null
    */
  var plugins: js.UndefOr[(js.Array[IPluginOption | String]) | StringDictionary[js.Any]] = js.native
  /**
    * If true, the "load" function will be called upon control initialization (with an empty search).
    * Alternatively it can be set to "focus" to call the "load" function when control receives focus.
    *
    * Default: false
    */
  var preload: js.UndefOr[Boolean | focus] = js.native
  // Rendering
  // ------------------------------------------------------------------------------------------------------------
  var render: js.UndefOr[ICustomRenderers[U]] = js.native
  /**
    * Overrides the scoring function used to sort available options. The provided function should return a
    * function that returns a number greater than or equal to zero to represent the "score" of an item
    * (the function's first argument). If 0, the option is declared not a match.
    */
  var score: js.UndefOr[js.Function1[/* search */ ISearch, js.Function1[/* item */ _, Double]]] = js.native
  /**
    * The animation duration (in milliseconds) of the scroll animation triggered when going [up] and [down] in
    * the options dropdown.
    *
    * Default: 60
    */
  var scrollDuration: js.UndefOr[Double] = js.native
  /**
    * When searching for multiple terms (separated by a space), this is the operator used. Can be "and" or "or".
    *
    * Default: "and"
    */
  var searchConjunction: js.UndefOr[String] = js.native
  /**
    * An array of property names to analyze when filtering options.
    *
    * Default: ["text"]
    */
  var searchField: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * If true, the tab key will choose the currently selected item.
    *
    * Default: false
    */
  var selectOnTab: js.UndefOr[Boolean] = js.native
  /**
    * A single field or an array of fields to sort by. Each item in the array should be an object containing at
    * least a "field" property. Optionally, "direction" can be set to "asc" or "desc". The order of the array
    * defines the sort precedence.
    *
    * Unless present, a special "$score" field will be automatically added to the beginning of the sort list.
    * This will make results sorted primarily by match quality (descending).
    *
    * Default: "$order"
    */
  var sortField: js.UndefOr[String | js.Array[AnonDirection]] = js.native
  /**
    * The name of the property to use as the "value" when an item is selected.
    *
    * Default: "value"
    */
  var valueField: js.UndefOr[String] = js.native
}

object IOptions {
  @scala.inline
  def apply[T, U](): IOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions[T, U]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t, u] <: IOptions[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withAddPrecedence(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPrecedence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddPrecedence: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPrecedence")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEmptyOption(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmptyOption: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyOption")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseAfterSelect(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAfterSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseAfterSelect: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAfterSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyClassesToDropdown(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyClassesToDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyClassesToDropdown: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyClassesToDropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: js.Any): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateFilter(value: js.Any): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateFilter: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateOnBlur(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateOnBlur: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withDataAttr(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAttr: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDiacritics(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diacritics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiacritics: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diacritics")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledField(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledField: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledField")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownParent(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownParent: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownParent")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSelected(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSelected: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[T]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelField(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelField: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelField")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: (/* query */ String, /* callback */ js.Function) => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadThrottle(value: Double): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadThrottle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadThrottle: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadThrottle")(js.undefined)
        ret
    }
    @scala.inline
    def withLockOptgroupOrder(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockOptgroupOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockOptgroupOrder: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockOptgroupOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: Double): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOptions(value: Double): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOptions: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: () => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ js.Any => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClear(value: () => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClear: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDelete(value: /* values */ js.Array[T] => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDelete: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropdownClose(value: /* dropdown */ JQuery => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropdownClose: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropdownOpen(value: /* dropdown */ JQuery => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropdownOpen: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: () => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialize(value: () => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInitialize: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemAdd(value: (/* value */ T, /* item */ JQuery) => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemAdd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnItemAdd: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemRemove(value: /* value */ T => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemRemove: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* data */ js.Array[U] => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOptionAdd(value: (/* value */ T, /* data */ U) => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOptionAdd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnOptionAdd: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOptionAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOptionRemove(value: /* value */ T => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOptionRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOptionRemove: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOptionRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnType(value: /* srt */ String => _): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnType: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onType")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnFocus(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnFocus: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOptgroupField(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroupField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptgroupField: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroupField")(js.undefined)
        ret
    }
    @scala.inline
    def withOptgroupLabelField(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroupLabelField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptgroupLabelField: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroupLabelField")(js.undefined)
        ret
    }
    @scala.inline
    def withOptgroupOrder(value: js.Array[String]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroupOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptgroupOrder: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroupOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withOptgroupValueField(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroupValueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptgroupValueField: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroupValueField")(js.undefined)
        ret
    }
    @scala.inline
    def withOptgroups(value: js.Array[U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptgroups: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optgroups")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: (js.Array[IPluginOption | String]) | StringDictionary[js.Any]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: Boolean | focus): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: ICustomRenderers[U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: /* search */ ISearch => js.Function1[/* item */ _, Double]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScore: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDuration(value: Double): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDuration: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchConjunction(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchConjunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchConjunction: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchConjunction")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchField(value: String | js.Array[String]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchField: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchField")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnTab(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnTab: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnTab")(js.undefined)
        ret
    }
    @scala.inline
    def withSortField(value: String | js.Array[AnonDirection]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortField: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(js.undefined)
        ret
    }
    @scala.inline
    def withValueField(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
  }
  
}

