package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to map a contact. */
@js.native
trait ContactMapActivatedEventArgs extends StObject {
  
  /** Gets the address of a contact for the mapping operation. */
  var address: ContactAddress = js.native
  
  /** Gets the contact for the mapping operation. */
  var contact: Contact = js.native
  
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the action to be performed. */
  var verb: String = js.native
}
object ContactMapActivatedEventArgs {
  
  @scala.inline
  def apply(
    address: ContactAddress,
    contact: Contact,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String
  ): ContactMapActivatedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMapActivatedEventArgs]
  }
  
  @scala.inline
  implicit class ContactMapActivatedEventArgsMutableBuilder[Self <: ContactMapActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: ContactAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
