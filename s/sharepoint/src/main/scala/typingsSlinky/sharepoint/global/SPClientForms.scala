package typingsSlinky.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPClientForms {
  
  @JSGlobal("SPClientForms.ClientForm")
  @js.native
  class ClientForm protected ()
    extends typingsSlinky.sharepoint.SPClientForms.ClientForm {
    def this(qualifier: String) = this()
  }
  
  @JSGlobal("SPClientForms.ClientFormManager")
  @js.native
  class ClientFormManager ()
    extends typingsSlinky.sharepoint.SPClientForms.ClientFormManager
  object ClientFormManager {
    
    /* static member */
    @JSGlobal("SPClientForms.ClientFormManager.GetClientForm")
    @js.native
    def GetClientForm(qualifier: String): typingsSlinky.sharepoint.SPClientForms.ClientForm = js.native
    
    /* static member */
    @JSGlobal("SPClientForms.ClientFormManager.RegisterClientForm")
    @js.native
    def RegisterClientForm(qualifier: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SPClientForms.ClientFormManager.SubmitClientForm")
    @js.native
    def SubmitClientForm(qualifier: String): Boolean = js.native
  }
  
  object ClientValidation {
    
    @JSGlobal("SPClientForms.ClientValidation.MaxLengthUrlValidator")
    @js.native
    class MaxLengthUrlValidator ()
      extends typingsSlinky.sharepoint.SPClientForms.ClientValidation.MaxLengthUrlValidator
    
    @JSGlobal("SPClientForms.ClientValidation.RequiredFileValidator")
    @js.native
    class RequiredFileValidator ()
      extends typingsSlinky.sharepoint.SPClientForms.ClientValidation.RequiredFileValidator
    
    @JSGlobal("SPClientForms.ClientValidation.RequiredRichTextValidator")
    @js.native
    class RequiredRichTextValidator ()
      extends typingsSlinky.sharepoint.SPClientForms.ClientValidation.RequiredRichTextValidator
    
    @JSGlobal("SPClientForms.ClientValidation.RequiredValidator")
    @js.native
    class RequiredValidator ()
      extends typingsSlinky.sharepoint.SPClientForms.ClientValidation.RequiredValidator
    
    @JSGlobal("SPClientForms.ClientValidation.ValidationResult")
    @js.native
    class ValidationResult protected ()
      extends typingsSlinky.sharepoint.SPClientForms.ClientValidation.ValidationResult {
      def this(hasErrors: Boolean, errorMsg: String) = this()
    }
    
    @JSGlobal("SPClientForms.ClientValidation.ValidatorSet")
    @js.native
    class ValidatorSet ()
      extends typingsSlinky.sharepoint.SPClientForms.ClientValidation.ValidatorSet
  }
  
  @JSGlobal("SPClientForms.FormManagerEvents")
  @js.native
  object FormManagerEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPClientForms.FormManagerEvents with Double] = js.native
    
    /* 3 */ val Event_GetControlValueCallback: typingsSlinky.sharepoint.SPClientForms.FormManagerEvents.Event_GetControlValueCallback with Double = js.native
    
    /* 6 */ val Event_GetHasValueChangedCallback: typingsSlinky.sharepoint.SPClientForms.FormManagerEvents.Event_GetHasValueChangedCallback with Double = js.native
    
    /* 2 */ val Event_OnControlFocusSetCallback: typingsSlinky.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlFocusSetCallback with Double = js.native
    
    /* 1 */ val Event_OnControlInitializedCallback: typingsSlinky.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlInitializedCallback with Double = js.native
    
    /* 4 */ val Event_OnControlValidationError: typingsSlinky.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlValidationError with Double = js.native
    
    /* 0 */ val Event_OnControlValueChanged: typingsSlinky.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlValueChanged with Double = js.native
    
    /* 5 */ val Event_RegisterControlValidator: typingsSlinky.sharepoint.SPClientForms.FormManagerEvents.Event_RegisterControlValidator with Double = js.native
  }
}
