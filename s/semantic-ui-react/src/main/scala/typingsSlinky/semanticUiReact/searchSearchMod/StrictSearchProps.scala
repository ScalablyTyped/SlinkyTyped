package typingsSlinky.semanticUiReact.searchSearchMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.inputInputMod.InputProps
import typingsSlinky.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typingsSlinky.semanticUiReact.searchResultMod.SearchResultProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictSearchProps extends js.Object {
  // ------------------------------------
  // Style
  // ------------------------------------
  /** A search can have its results aligned to its left or right container edge. */
  var aligned: js.UndefOr[String] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A search can display results from remote content ordered by categories. */
  var category: js.UndefOr[Boolean] = js.native
  // ------------------------------------
  // Rendering
  // ------------------------------------
  /**
    * Renders the SearchCategory layout.
    *
    * @param {object} categoryContent - The Renderable SearchCategory contents.
    * @param {object} resultsContent - The Renderable SearchResult contents.
    * @returns {*} - Renderable SearchCategory layout.
    */
  var categoryLayoutRenderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, ReactElement]] = js.native
  /**
    * Renders the SearchCategory contents.
    *
    * @param {object} props - The SearchCategory props object.
    * @returns {*} - Renderable SearchCategory contents.
    */
  var categoryRenderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, ReactElement]] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  // ------------------------------------
  // Behavior
  // ------------------------------------
  /** Initial value of open. */
  var defaultOpen: js.UndefOr[Boolean] = js.native
  /** Initial value. */
  var defaultValue: js.UndefOr[String] = js.native
  /** A search can have its results take up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** Shorthand for Icon. */
  var icon: js.UndefOr[js.Any] = js.native
  /** Shorthand for input element. */
  var input: js.UndefOr[SemanticShorthandItem[InputProps]] = js.native
  /** A search can show a loading indicator. */
  var loading: js.UndefOr[Boolean] = js.native
  /** Minimum characters to query for results. */
  var minCharacters: js.UndefOr[Double] = js.native
  /** Additional text for "No Results" message with less emphasis. */
  var noResultsDescription: js.UndefOr[TagMod[Any]] = js.native
  /** Message to display when there are no results. */
  var noResultsMessage: js.UndefOr[TagMod[Any]] = js.native
  // ------------------------------------
  // Callbacks
  // ------------------------------------
  /**
    * Called on blur.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onBlur: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps, Unit]
  ] = js.native
  /**
    * Called on focus.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onFocus: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps, Unit]
  ] = js.native
  /**
    * Called on mousedown.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onMouseDown: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps, Unit]
  ] = js.native
  /**
    * Called when a result is selected.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onResultSelect: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ SearchResultData, Unit]
  ] = js.native
  /**
    * Called on search input change.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props, includes current value of search input.
    */
  var onSearchChange: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps, Unit]
  ] = js.native
  /**
    * Called when the active selection index is changed.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onSelectionChange: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchResultData, Unit]
  ] = js.native
  /** Controls whether or not the results menu is displayed. */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * Renders the SearchResult contents.
    *
    * @param {object} props - The SearchResult props object.
    * @returns {*} - Renderable SearchResult contents.
    */
  var resultRenderer: js.UndefOr[js.Function1[/* props */ SearchResultProps, ReactElement]] = js.native
  /**
    * One of:
    * - array of Search.Result props e.g. `{ title: '', description: '' }` or
    * - object of categories e.g. `{ name: '', results: [{ title: '', description: '' }]`
    */
  var results: js.UndefOr[js.Array[_] | js.Object] = js.native
  /** Whether the search should automatically select the first result after searching. */
  var selectFirstResult: js.UndefOr[Boolean] = js.native
  /** Whether a "no results" message should be shown if no results are found. */
  var showNoResults: js.UndefOr[Boolean] = js.native
  /** A search can have different sizes. */
  var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.native
  /** Current value of the search input. Creates a controlled component. */
  var value: js.UndefOr[String] = js.native
}

object StrictSearchProps {
  @scala.inline
  def apply(): StrictSearchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictSearchProps]
  }
  @scala.inline
  implicit class StrictSearchPropsOps[Self <: StrictSearchProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAligned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aligned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAligned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aligned")(js.undefined)
        ret
    }
    @scala.inline
    def withAs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: Boolean): Self = {
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
    def withCategoryLayoutRenderer(value: /* props */ SearchCategoryProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryLayoutRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCategoryLayoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryLayoutRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryRenderer(value: /* props */ SearchCategoryProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCategoryRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
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
    def withDefaultValue(value: String): Self = {
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
    def withInputReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputFunction3(
      value: (/* component */ ReactComponentClass[InputProps], InputProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withInput(value: SemanticShorthandItem[InputProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
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
    def withNoResultsDescriptionReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResultsDescription(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResultsDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsDescription")(js.undefined)
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
    def withOnBlur(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps) => Unit): Self = {
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
    def withOnFocus(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps) => Unit): Self = {
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
    def withOnMouseDown(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps) => Unit): Self = {
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
    def withOnResultSelect(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ SearchResultData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnResultSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchChange(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps) => Unit): Self = {
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
    def withOnSelectionChange(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchResultData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
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
    def withResultRenderer(value: /* props */ SearchResultProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResultRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[_] | js.Object): Self = {
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
    def withSize(value: mini | tiny | small | large | big | huge | massive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
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
  }
  
}

