package typingsSlinky.semanticUiReact.checkboxCheckboxMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.HtmlLabelProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.checkbox
import typingsSlinky.semanticUiReact.semanticUiReactStrings.radio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setDefaultIndeterminate(value: Boolean): Self = this.set("defaultIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultIndeterminate: Self = this.set("defaultIndeterminate", js.undefined)
    
    @scala.inline
    def setFitted(value: Boolean): Self = this.set("fitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitted: Self = this.set("fitted", js.undefined)
    
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFunction3(
      value: (/* component */ ReactType[HtmlLabelProps], HtmlLabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("label", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (SyntheticEvent[EventTarget with HTMLInputElement, Event], /* data */ CheckboxProps) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: (/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit): Self = this.set("onMouseDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: (/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit): Self = this.set("onMouseUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setRadio(value: Boolean): Self = this.set("radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadio: Self = this.set("radio", js.undefined)
    
    @scala.inline
    def setSlider(value: Boolean): Self = this.set("slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlider: Self = this.set("slider", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double | String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def setType(value: checkbox | radio): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
