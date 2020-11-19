package typingsSlinky.winrt.global.Windows.ApplicationModel

import typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory
import typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldType
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.ApplicationModel.Contacts")
@js.native
object Contacts extends js.Object {
  
  @js.native
  class Contact ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Contacts.Contact
  
  @js.native
  class ContactField protected ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactField {
    def this(value: String, `type`: ContactFieldType) = this()
    def this(value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
    def this(name: String, value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
  }
  
  @js.native
  object ContactFieldCategory extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory with Double
      ] = js.native
    
    /* 1 */ val home: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.home with Double = js.native
    
    /* 3 */ val mobile: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.mobile with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.none with Double = js.native
    
    /* 4 */ val other: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.other with Double = js.native
    
    /* 2 */ val work: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.work with Double = js.native
  }
  
  @js.native
  class ContactFieldFactory ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldFactory
  
  @js.native
  object ContactFieldType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldType with Double
      ] = js.native
    
    /* 4 */ val custom: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.custom with Double = js.native
    
    /* 0 */ val email: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.email with Double = js.native
    
    /* 3 */ val instantMessage: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.instantMessage with Double = js.native
    
    /* 2 */ val location: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.location with Double = js.native
    
    /* 1 */ val phoneNumber: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.phoneNumber with Double = js.native
  }
  
  @js.native
  class ContactInformation ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactInformation
  
  @js.native
  class ContactInstantMessageField protected ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactInstantMessageField {
    def this(userName: String) = this()
    def this(userName: String, category: ContactFieldCategory) = this()
    def this(userName: String, category: ContactFieldCategory, service: String, displayText: String, verb: Uri) = this()
  }
  
  @js.native
  class ContactLocationField protected ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactLocationField {
    def this(unstructuredAddress: String) = this()
    def this(unstructuredAddress: String, category: ContactFieldCategory) = this()
    def this(
      unstructuredAddress: String,
      category: ContactFieldCategory,
      street: String,
      city: String,
      region: String,
      country: String,
      postalCode: String
    ) = this()
  }
  
  @js.native
  class ContactPicker ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactPicker
  
  @js.native
  object ContactSelectionMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode with Double
      ] = js.native
    
    /* 0 */ val contacts: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode.contacts with Double = js.native
    
    /* 1 */ val fields: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode.fields with Double = js.native
  }
  
  @js.native
  class KnownContactField ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Contacts.KnownContactField
  /* static members */
  @js.native
  object KnownContactField extends js.Object {
    
    def convertNameToType(name: String): ContactFieldType = js.native
    
    def convertTypeToName(`type`: ContactFieldType): String = js.native
    
    var email: String = js.native
    
    var instantMessage: String = js.native
    
    var location: String = js.native
    
    var phoneNumber: String = js.native
  }
  
  @js.native
  object Provider extends js.Object {
    
    @js.native
    object AddContactResult extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult with Double
          ] = js.native
      
      /* 0 */ val added: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.added with Double = js.native
      
      /* 1 */ val alreadyAdded: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.alreadyAdded with Double = js.native
      
      /* 2 */ val unavailable: typingsSlinky.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.unavailable with Double = js.native
    }
    
    @js.native
    class ContactPickerUI ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
    
    @js.native
    class ContactRemovedEventArgs ()
      extends typingsSlinky.winrt.Windows.ApplicationModel.Contacts.Provider.ContactRemovedEventArgs
  }
}
