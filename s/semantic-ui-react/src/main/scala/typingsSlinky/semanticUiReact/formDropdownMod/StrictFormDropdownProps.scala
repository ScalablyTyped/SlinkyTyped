package typingsSlinky.semanticUiReact.formDropdownMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticUiReact.dropdownDropdownMod.DropdownOnSearchChangeData
import typingsSlinky.semanticUiReact.dropdownDropdownMod.DropdownProps
import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import typingsSlinky.semanticUiReact.formFieldMod.StrictFormFieldProps
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`bottom left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`bottom right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top left`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top right`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.semanticUiReact.dropdownDropdownMod.StrictDropdownProps because var conflicts: as, children, className, disabled, error, `inline`. Inlined additionLabel, additionPosition, allowAdditions, basic, button, clearable, closeOnBlur, closeOnEscape, closeOnChange, compact, deburr, defaultOpen, defaultSearchQuery, defaultSelectedLabel, defaultUpward, defaultValue, direction, floating, fluid, header, icon, item, labeled, lazyLoad, loading, minCharacters, multiple, noResultsMessage, onAddItem, onBlur, onChange, onClick, onClose, onFocus, onLabelClick, onMouseDown, onOpen, onSearchChange, open, openOnFocus, options, placeholder, pointing, renderLabel, scrolling, search, searchInput, searchQuery, selectOnBlur, selectOnNavigation, selectedLabel, selection, simple, tabIndex, text, trigger, value, upward, wrapSelection */ @js.native
trait StrictFormDropdownProps extends StrictFormFieldProps {
  /** Label prefixed to an option added by a user. */
  var additionLabel: js.UndefOr[Double | String | TagMod[Any]] = js.native
  /** Position of the `Add: ...` option in the dropdown list ('top' or 'bottom'). */
  var additionPosition: js.UndefOr[top | bottom] = js.native
  /**
    * Allow user additions to the list of options (boolean).
    * Requires the use of `selection`, `options` and `search`.
    */
  var allowAdditions: js.UndefOr[Boolean] = js.native
  /** A Dropdown can reduce its complexity. */
  var basic: js.UndefOr[Boolean] = js.native
  /** Format the Dropdown to appear as a button. */
  var button: js.UndefOr[Boolean] = js.native
  /** Using the clearable setting will let users remove their selection from a dropdown. */
  var clearable: js.UndefOr[Boolean] = js.native
  /** Whether or not the menu should close when the dropdown is blurred. */
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the menu should close when a value is selected from the dropdown.
    * By default, multiple selection dropdowns will remain open on change, while single
    * selection dropdowns will close on change.
    */
  var closeOnChange: js.UndefOr[Boolean] = js.native
  /** Whether or not the dropdown should close when the escape key is pressed. */
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  /** A compact dropdown has no minimum width. */
  var compact: js.UndefOr[Boolean] = js.native
  /** Whether or not the dropdown should strip diacritics in options and input search */
  var deburr: js.UndefOr[Boolean] = js.native
  /** Initial value of open. */
  var defaultOpen: js.UndefOr[Boolean] = js.native
  /** Initial value of searchQuery. */
  var defaultSearchQuery: js.UndefOr[String] = js.native
  /** Currently selected label in multi-select. */
  var defaultSelectedLabel: js.UndefOr[Double | String] = js.native
  /** Initial value of upward. */
  var defaultUpward: js.UndefOr[Boolean] = js.native
  /** Initial value or value array if multiple. */
  var defaultValue: js.UndefOr[String | Double | Boolean | (js.Array[Double | String | Boolean])] = js.native
  /** A dropdown menu can open to the left or to the right. */
  var direction: js.UndefOr[left | right] = js.native
  /** Individual fields may display an error state along with a message. */
  @JSName("error")
  var error_StrictFormDropdownProps: js.UndefOr[js.Any] = js.native
  /** A dropdown menu can contain floated content. */
  var floating: js.UndefOr[Boolean] = js.native
  /** A dropdown can take the full width of its parent */
  var fluid: js.UndefOr[Boolean] = js.native
  /** A dropdown menu can contain a header. */
  var header: js.UndefOr[TagMod[Any]] = js.native
  /** Shorthand for Icon. */
  var icon: js.UndefOr[js.Any] = js.native
  /** A dropdown can be formatted as a Menu item. */
  var item: js.UndefOr[Boolean] = js.native
  /** A dropdown can be labeled. */
  var labeled: js.UndefOr[Boolean] = js.native
  /** A dropdown can defer rendering its options until it is open. */
  var lazyLoad: js.UndefOr[Boolean] = js.native
  /** A dropdown can show that it is currently loading data. */
  var loading: js.UndefOr[Boolean] = js.native
  /** The minimum characters for a search to begin showing results. */
  var minCharacters: js.UndefOr[Double] = js.native
  /** A selection dropdown can allow multiple selections. */
  var multiple: js.UndefOr[Boolean] = js.native
  /** Message to display when there are no results. */
  var noResultsMessage: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Called when a user adds a new item. Use this to update the options list.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and the new item's value.
    */
  var onAddItem: js.UndefOr[
    js.Function2[/* event */ SyntheticKeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called on blur.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onBlur: js.UndefOr[
    js.Function2[/* event */ SyntheticKeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called when the user attempts to change the value.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed value.
    */
  var onChange: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[/* event */ SyntheticKeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called on focus.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onFocus: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called when a multi-select label is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All label props.
    */
  var onLabelClick: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ LabelProps, Unit]
  ] = js.native
  /**
    * Called on mousedown.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onMouseDown: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called on search input change.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props, includes current value of searchQuery.
    */
  var onSearchChange: js.UndefOr[
    js.Function2[
      /* event */ SyntheticEvent[Event, HTMLElement], 
      /* data */ DropdownOnSearchChangeData, 
      Unit
    ]
  ] = js.native
  /** Controls whether or not the dropdown menu is displayed. */
  var open: js.UndefOr[Boolean] = js.native
  /** Whether or not the menu should open when the dropdown is focused. */
  var openOnFocus: js.UndefOr[Boolean] = js.native
  /** Array of Dropdown.Item props e.g. `{ text: '', value: '' }` */
  var options: js.UndefOr[js.Array[DropdownItemProps]] = js.native
  /** Placeholder text. */
  var placeholder: js.UndefOr[String] = js.native
  /** A dropdown can be formatted so that its menu is pointing. */
  var pointing: js.UndefOr[
    Boolean | left | right | top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)
  ] = js.native
  /**
    * Mapped over the active items and returns shorthand for the active item Labels.
    * Only applies to `multiple` Dropdowns.
    *
    * @param {object} item - A currently active dropdown item.
    * @param {number} index - The current index.
    * @param {object} defaultLabelProps - The default props for an active item Label.
    * @returns {*} Shorthand for a Label.
    */
  var renderLabel: js.UndefOr[
    js.Function3[
      /* item */ DropdownItemProps, 
      /* index */ Double, 
      /* defaultLabelProps */ LabelProps, 
      _
    ]
  ] = js.native
  /** A dropdown can have its menu scroll. */
  var scrolling: js.UndefOr[Boolean] = js.native
  /**
    * A selection dropdown can allow a user to search through a large list of choices.
    * Pass a function here to replace the default search.
    */
  var search: js.UndefOr[
    Boolean | (js.Function2[
      /* options */ js.Array[DropdownItemProps], 
      /* value */ String, 
      js.Array[DropdownItemProps]
    ])
  ] = js.native
  /** A shorthand for a search input. */
  var searchInput: js.UndefOr[js.Any] = js.native
  /** Current value of searchQuery. Creates a controlled component. */
  var searchQuery: js.UndefOr[String] = js.native
  /** Define whether the highlighted item should be selected on blur. */
  var selectOnBlur: js.UndefOr[Boolean] = js.native
  /** Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice. */
  var selectOnNavigation: js.UndefOr[Boolean] = js.native
  /** Currently selected label in multi-select. */
  var selectedLabel: js.UndefOr[Double | String] = js.native
  /** A dropdown can be used to select between choices in a form. */
  var selection: js.UndefOr[js.Any] = js.native
  /** A simple dropdown can open without Javascript. */
  var simple: js.UndefOr[Boolean] = js.native
  /** A dropdown can receive focus. */
  var tabIndex: js.UndefOr[Double | String] = js.native
  /** The text displayed in the dropdown, usually for the active item. */
  var text: js.UndefOr[String] = js.native
  /** Custom element to trigger the menu to become visible. Takes place of 'text'. */
  var trigger: js.UndefOr[TagMod[Any]] = js.native
  /** Controls whether the dropdown will open upward. */
  var upward: js.UndefOr[Boolean] = js.native
  /** Current value or value array if multiple. Creates a controlled component. */
  var value: js.UndefOr[Boolean | Double | String | (js.Array[Boolean | Double | String])] = js.native
  /**
    * A dropdown will go to the last element when ArrowUp is pressed on the first,
    * or go to the first when ArrowDown is pressed on the last( aka infinite selection )
    */
  var wrapSelection: js.UndefOr[Boolean] = js.native
}

object StrictFormDropdownProps {
  @scala.inline
  def apply(): StrictFormDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFormDropdownProps]
  }
  @scala.inline
  implicit class StrictFormDropdownPropsOps[Self <: StrictFormDropdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionLabel(value: Double | String | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionPosition(value: top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowAdditions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAdditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdditions")(js.undefined)
        ret
    }
    @scala.inline
    def withBasic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withClearable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearable")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnChange")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withDeburr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deburr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeburr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deburr")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSearchQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSearchQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSearchQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSearchQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelectedLabel(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultUpward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUpward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultUpward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUpward")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String | Double | Boolean | (js.Array[Double | String | Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: js.Any): Self = {
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
    def withFloating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floating")(js.undefined)
        ret
    }
    @scala.inline
    def withFluid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFluid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withLabeled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labeled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabeled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labeled")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
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
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResultsMessageReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResultsMessage(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResultsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAddItem(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAddItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLabelClick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ LabelProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabelClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnLabelClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabelClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ DropdownProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchChange(
      value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ DropdownOnSearchChangeData) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSearchChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[DropdownItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPointing(
      value: Boolean | left | right | top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointing")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderLabel(value: (/* item */ DropdownItemProps, /* index */ Double, /* defaultLabelProps */ LabelProps) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLabel")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchFunction2(
      value: (/* options */ js.Array[DropdownItemProps], /* value */ String) => js.Array[DropdownItemProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSearch(
      value: Boolean | (js.Function2[
          /* options */ js.Array[DropdownItemProps], 
          /* value */ String, 
          js.Array[DropdownItemProps]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchInput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchInput")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedLabel(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSimple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withUpward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upward")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Boolean | Double | String | (js.Array[Boolean | Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapSelection")(js.undefined)
        ret
    }
  }
  
}

