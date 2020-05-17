package typingsSlinky.semanticUiReact.checkboxCheckboxMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.HtmlLabelProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.checkbox
import typingsSlinky.semanticUiReact.semanticUiReactStrings.radio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictCheckboxProps extends InputHTMLAttributes[HTMLInputElement] {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Whether or not checkbox is indeterminate. */
  var defaultIndeterminate: js.UndefOr[Boolean] = js.native
  /** Removes padding for a label. Auto applied when there is no label. */
  var fitted: js.UndefOr[Boolean] = js.native
  /** A unique identifier. */
  @JSName("id")
  var id_StrictCheckboxProps: js.UndefOr[Double | String] = js.native
  /** Whether or not checkbox is indeterminate. */
  var indeterminate: js.UndefOr[Boolean] = js.native
  /** The text of the associated label element. */
  var label: js.UndefOr[SemanticShorthandItem[HtmlLabelProps]] = js.native
  /**
    * Called when the user attempts to change the checked state.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed checked/indeterminate state.
    */
  @JSName("onChange")
  var onChange_StrictCheckboxProps: js.UndefOr[
    js.Function2[
      SyntheticEvent[EventTarget with HTMLInputElement, Event], 
      /* data */ CheckboxProps, 
      Unit
    ]
  ] = js.native
  /**
    * Called when the checkbox or label is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and current checked/indeterminate state.
    */
  @JSName("onClick")
  var onClick_StrictCheckboxProps: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps, Unit]
  ] = js.native
  /**
    * Called when the user presses down on the mouse.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and current checked/indeterminate state.
    */
  @JSName("onMouseDown")
  var onMouseDown_StrictCheckboxProps: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps, Unit]
  ] = js.native
  /**
    * Called when the user releases the mouse.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and current checked/indeterminate state.
    */
  @JSName("onMouseUp")
  var onMouseUp_StrictCheckboxProps: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps, Unit]
  ] = js.native
  /** Format as a radio element. This means it is an exclusive option. */
  var radio: js.UndefOr[Boolean] = js.native
  /** Format to emphasize the current selection state. */
  var slider: js.UndefOr[Boolean] = js.native
  /** A checkbox can receive focus. */
  @JSName("tabIndex")
  var tabIndex_StrictCheckboxProps: js.UndefOr[Double | String] = js.native
  /** Format to show an on or off choice. */
  var toggle: js.UndefOr[Boolean] = js.native
  /** HTML input type, either checkbox or radio. */
  @JSName("type")
  var type_StrictCheckboxProps: js.UndefOr[checkbox | radio] = js.native
  /** The HTML input value. */
  @JSName("value")
  var value_StrictCheckboxProps: js.UndefOr[Double | String] = js.native
}

object StrictCheckboxProps {
  @scala.inline
  def apply(): StrictCheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictCheckboxProps]
  }
  @scala.inline
  implicit class StrictCheckboxPropsOps[Self <: StrictCheckboxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDefaultIndeterminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIndeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIndeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withFitted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitted")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndeterminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelFunction3(
      value: (/* component */ ReactComponentClass[HtmlLabelProps], HtmlLabelProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (SyntheticEvent[EventTarget with HTMLInputElement, Event], /* data */ CheckboxProps) => Unit
    ): Self = {
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
    def withOnClick(value: (/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit): Self = {
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
    def withOnMouseDown(value: (/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit): Self = {
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
    def withOnMouseUp(value: (/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withRadio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radio")(js.undefined)
        ret
    }
    @scala.inline
    def withSlider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(js.undefined)
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
    def withToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: checkbox | radio): Self = {
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
    def withValue(value: Double | String): Self = {
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

