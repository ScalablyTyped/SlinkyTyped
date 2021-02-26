package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.HtmlLabelProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.checkbox
import typingsSlinky.semanticUiReact.semanticUiReactStrings.radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxCheckboxMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Checkbox/Checkbox", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[CheckboxProps, js.Object, js.Any] {
    def this(props: CheckboxProps) = this()
    def this(props: CheckboxProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Checkbox/Checkbox", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CheckboxProps] = js.native
  
  @js.native
  trait CheckboxProps
    extends StrictCheckboxProps
       with /* key */ StringDictionary[js.Any]
  object CheckboxProps {
    
    @scala.inline
    def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
  }
  
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
    implicit class StrictCheckboxPropsMutableBuilder[Self <: StrictCheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setDefaultIndeterminate(value: Boolean): Self = StObject.set(x, "defaultIndeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIndeterminateUndefined: Self = StObject.set(x, "defaultIndeterminate", js.undefined)
      
      @scala.inline
      def setFitted(value: Boolean): Self = StObject.set(x, "fitted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFittedUndefined: Self = StObject.set(x, "fitted", js.undefined)
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      @scala.inline
      def setLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction3(
        value: (/* component */ ReactElement, HtmlLabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (SyntheticEvent[EventTarget with HTMLInputElement, Event], /* data */ CheckboxProps) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: (/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: (/* event */ SyntheticMouseEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setRadio(value: Boolean): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
      
      @scala.inline
      def setSlider(value: Boolean): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double | String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setType(value: checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CheckboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkboxCheckboxMod.foo` */
  override def _to: ReactComponentClass[CheckboxProps] = default
}
