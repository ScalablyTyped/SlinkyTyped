package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.buttonButtonMod.ButtonProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.modalModalMod.StrictModalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmConfirmMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm/Confirm", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ConfirmProps, js.Object, js.Any] {
    def this(props: ConfirmProps) = this()
    def this(props: ConfirmProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm/Confirm", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ConfirmProps] = js.native
  
  @js.native
  trait ConfirmProps
    extends StrictConfirmProps
       with /* key */ StringDictionary[js.Any]
  object ConfirmProps {
    
    @scala.inline
    def apply(): ConfirmProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmProps]
    }
  }
  
  @js.native
  trait StrictConfirmProps extends StrictModalProps {
    
    /** The cancel button text. */
    var cancelButton: js.UndefOr[SemanticShorthandItem[ButtonProps]] = js.native
    
    /** The OK button text. */
    var confirmButton: js.UndefOr[SemanticShorthandItem[ButtonProps]] = js.native
    
    /**
      * Called when the Modal is closed without clicking confirm.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onCancel: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps, Unit]
      ] = js.native
    
    /**
      * Called when the OK button is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onConfirm: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps, Unit]
      ] = js.native
  }
  object StrictConfirmProps {
    
    @scala.inline
    def apply(): StrictConfirmProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictConfirmProps]
    }
    
    @scala.inline
    implicit class StrictConfirmPropsMutableBuilder[Self <: StrictConfirmProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButton(value: SemanticShorthandItem[ButtonProps]): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonFunction3(
        value: (/* component */ ReactElement, ButtonProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "cancelButton", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCancelButtonReactElement(value: ReactElement): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
      
      @scala.inline
      def setConfirmButton(value: SemanticShorthandItem[ButtonProps]): Self = StObject.set(x, "confirmButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmButtonFunction3(
        value: (/* component */ ReactElement, ButtonProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "confirmButton", js.Any.fromFunction3(value))
      
      @scala.inline
      def setConfirmButtonReactElement(value: ReactElement): Self = StObject.set(x, "confirmButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmButtonUndefined: Self = StObject.set(x, "confirmButton", js.undefined)
      
      @scala.inline
      def setOnCancel(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ConfirmProps]
  
  /* This means you don't have to write `default`, but can instead just say `confirmConfirmMod.foo` */
  override def _to: ReactComponentClass[ConfirmProps] = default
}
