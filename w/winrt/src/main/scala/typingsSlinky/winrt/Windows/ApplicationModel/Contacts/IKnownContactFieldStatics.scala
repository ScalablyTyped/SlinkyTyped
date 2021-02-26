package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKnownContactFieldStatics extends StObject {
  
  def convertNameToType(name: String): ContactFieldType = js.native
  
  def convertTypeToName(`type`: ContactFieldType): String = js.native
  
  var email: String = js.native
  
  var instantMessage: String = js.native
  
  var location: String = js.native
  
  var phoneNumber: String = js.native
}
object IKnownContactFieldStatics {
  
  @scala.inline
  def apply(
    convertNameToType: String => ContactFieldType,
    convertTypeToName: ContactFieldType => String,
    email: String,
    instantMessage: String,
    location: String,
    phoneNumber: String
  ): IKnownContactFieldStatics = {
    val __obj = js.Dynamic.literal(convertNameToType = js.Any.fromFunction1(convertNameToType), convertTypeToName = js.Any.fromFunction1(convertTypeToName), email = email.asInstanceOf[js.Any], instantMessage = instantMessage.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKnownContactFieldStatics]
  }
  
  @scala.inline
  implicit class IKnownContactFieldStaticsMutableBuilder[Self <: IKnownContactFieldStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertNameToType(value: String => ContactFieldType): Self = StObject.set(x, "convertNameToType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertTypeToName(value: ContactFieldType => String): Self = StObject.set(x, "convertTypeToName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantMessage(value: String): Self = StObject.set(x, "instantMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
