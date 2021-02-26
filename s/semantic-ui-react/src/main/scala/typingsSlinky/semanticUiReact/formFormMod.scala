package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.FormHTMLAttributes
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.formButtonMod.FormButtonProps
import typingsSlinky.semanticUiReact.formCheckboxMod.FormCheckboxProps
import typingsSlinky.semanticUiReact.formDropdownMod.FormDropdownProps
import typingsSlinky.semanticUiReact.formFieldMod.FormFieldProps
import typingsSlinky.semanticUiReact.formGroupMod.FormGroupProps
import typingsSlinky.semanticUiReact.formInputMod.FormInputProps
import typingsSlinky.semanticUiReact.formRadioMod.FormRadioProps
import typingsSlinky.semanticUiReact.formSelectMod.FormSelectProps
import typingsSlinky.semanticUiReact.formTextAreaMod.FormTextAreaProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.equal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFormMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/Form", JSImport.Default)
  @js.native
  val default: FormComponent = js.native
  
  @js.native
  trait FormComponent extends FunctionComponent[FormProps] {
    
    var Button: ReactComponentClass[FormButtonProps] = js.native
    
    var Checkbox: ReactComponentClass[FormCheckboxProps] = js.native
    
    var Dropdown: ReactComponentClass[FormDropdownProps] = js.native
    
    var Field: ReactComponentClass[FormFieldProps] = js.native
    
    var Group: ReactComponentClass[FormGroupProps] = js.native
    
    var Input: ReactComponentClass[FormInputProps] = js.native
    
    var Radio: ReactComponentClass[FormRadioProps] = js.native
    
    var Select: ReactComponentClass[FormSelectProps] = js.native
    
    var TextArea: ReactComponentClass[FormTextAreaProps] = js.native
  }
  
  type FormProps = StrictFormProps
  
  @js.native
  trait StrictFormProps extends FormHTMLAttributes[HTMLFormElement] {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Automatically show any error Message children. */
    var error: js.UndefOr[Boolean] = js.native
    
    /** A form can have its color inverted for contrast. */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /** Automatically show a loading indicator. */
    var loading: js.UndefOr[Boolean] = js.native
    
    /** The HTML form submit handler. */
    @JSName("onSubmit")
    var onSubmit_StrictFormProps: js.UndefOr[
        js.Function2[SyntheticEvent[EventTarget with HTMLFormElement, Event], /* data */ FormProps, Unit]
      ] = js.native
    
    /** A comment can contain a form to reply to a comment. This may have arbitrary content. */
    var reply: js.UndefOr[Boolean] = js.native
    
    /** A form can vary in size. */
    var size: js.UndefOr[String] = js.native
    
    /** Automatically show any success Message children. */
    var success: js.UndefOr[Boolean] = js.native
    
    /** A form can prevent itself from stacking on mobile. */
    var unstackable: js.UndefOr[Boolean] = js.native
    
    /** Automatically show any warning Message children. */
    var warning: js.UndefOr[Boolean] = js.native
    
    /** Forms can automatically divide fields to be equal width. */
    var widths: js.UndefOr[equal] = js.native
  }
  object StrictFormProps {
    
    @scala.inline
    def apply(): StrictFormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFormProps]
    }
    
    @scala.inline
    implicit class StrictFormPropsMutableBuilder[Self <: StrictFormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: (SyntheticEvent[EventTarget with HTMLFormElement, Event], /* data */ FormProps) => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setReply(value: Boolean): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setUnstackable(value: Boolean): Self = StObject.set(x, "unstackable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstackableUndefined: Self = StObject.set(x, "unstackable", js.undefined)
      
      @scala.inline
      def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
      
      @scala.inline
      def setWidths(value: equal): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
  
  type _To = FormComponent
  
  /* This means you don't have to write `default`, but can instead just say `formFormMod.foo` */
  override def _to: FormComponent = default
}
