package typingsSlinky.semanticUiReact

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.TextareaHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaTextAreaMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/TextArea/TextArea", JSImport.Default)
  @js.native
  class default () extends TextArea
  
  @js.native
  trait StrictTextAreaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /**
      * Called on change.
      *
      * @param {SyntheticEvent} event - The React SyntheticEvent object
      * @param {object} data - All props and the event value.
      */
    @JSName("onChange")
    var onChange_StrictTextAreaProps: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLTextAreaElement], /* data */ TextAreaProps, Unit]
      ] = js.native
    
    /**
      * Called on input.
      *
      * @param {SyntheticEvent} event - The React SyntheticEvent object
      * @param {object} data - All props and the event value.
      */
    @JSName("onInput")
    var onInput_StrictTextAreaProps: js.UndefOr[
        js.Function2[
          SyntheticEvent[EventTarget with HTMLTextAreaElement, Event], 
          /* data */ TextAreaProps, 
          Unit
        ]
      ] = js.native
    
    /** Indicates row count for a TextArea. */
    @JSName("rows")
    var rows_StrictTextAreaProps: js.UndefOr[Double | String] = js.native
    
    /** The value of the textarea. */
    @JSName("value")
    var value_StrictTextAreaProps: js.UndefOr[Double | String] = js.native
  }
  object StrictTextAreaProps {
    
    @scala.inline
    def apply(): StrictTextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTextAreaProps]
    }
    
    @scala.inline
    implicit class StrictTextAreaPropsMutableBuilder[Self <: StrictTextAreaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ ChangeEvent[HTMLTextAreaElement], /* data */ TextAreaProps) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnInput(
        value: (SyntheticEvent[EventTarget with HTMLTextAreaElement, Event], /* data */ TextAreaProps) => Unit
      ): Self = StObject.set(x, "onInput", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setRows(value: Double | String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TextArea
    extends Component[TextAreaProps, js.Object, js.Any] {
    
    def focus(): Unit = js.native
  }
  
  type TextAreaProps = StrictTextAreaProps
}
