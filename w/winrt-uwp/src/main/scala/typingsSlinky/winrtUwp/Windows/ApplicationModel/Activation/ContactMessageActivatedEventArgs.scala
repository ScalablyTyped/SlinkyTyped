package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to send a message to a contact. */
@js.native
trait ContactMessageActivatedEventArgs extends StObject {
  
  /** Gets the contact for the message. */
  var contact: Contact = js.native
  
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the identifier of the service used for the message. */
  var serviceId: String = js.native
  
  /** Gets the user identifier of the service used for the message. */
  var serviceUserId: String = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the action to be performed. */
  var verb: String = js.native
}
object ContactMessageActivatedEventArgs {
  
  @scala.inline
  def apply(
    contact: Contact,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    serviceId: String,
    serviceUserId: String,
    splashScreen: SplashScreen,
    verb: String
  ): ContactMessageActivatedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], serviceUserId = serviceUserId.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMessageActivatedEventArgs]
  }
  
  @scala.inline
  implicit class ContactMessageActivatedEventArgsMutableBuilder[Self <: ContactMessageActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUserId(value: String): Self = StObject.set(x, "serviceUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
