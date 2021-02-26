package typingsSlinky.sharepoint.SP.Utilities

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrincipalInfo extends ClientValueObject {
  
  def get_department(): String = js.native
  
  def get_displayName(): String = js.native
  
  def get_email(): String = js.native
  
  def get_jobTitle(): String = js.native
  
  def get_loginName(): String = js.native
  
  def get_mobile(): String = js.native
  
  def get_principalId(): Double = js.native
  
  def get_principalType(): PrincipalType = js.native
  
  def get_sIPAddress(): String = js.native
}
object PrincipalInfo {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_department: () => String,
    get_displayName: () => String,
    get_email: () => String,
    get_jobTitle: () => String,
    get_loginName: () => String,
    get_mobile: () => String,
    get_principalId: () => Double,
    get_principalType: () => PrincipalType,
    get_sIPAddress: () => String,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): PrincipalInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_department = js.Any.fromFunction0(get_department), get_displayName = js.Any.fromFunction0(get_displayName), get_email = js.Any.fromFunction0(get_email), get_jobTitle = js.Any.fromFunction0(get_jobTitle), get_loginName = js.Any.fromFunction0(get_loginName), get_mobile = js.Any.fromFunction0(get_mobile), get_principalId = js.Any.fromFunction0(get_principalId), get_principalType = js.Any.fromFunction0(get_principalType), get_sIPAddress = js.Any.fromFunction0(get_sIPAddress), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[PrincipalInfo]
  }
  
  @scala.inline
  implicit class PrincipalInfoMutableBuilder[Self <: PrincipalInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_department(value: () => String): Self = StObject.set(x, "get_department", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_displayName(value: () => String): Self = StObject.set(x, "get_displayName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_email(value: () => String): Self = StObject.set(x, "get_email", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_jobTitle(value: () => String): Self = StObject.set(x, "get_jobTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_loginName(value: () => String): Self = StObject.set(x, "get_loginName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_mobile(value: () => String): Self = StObject.set(x, "get_mobile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_principalId(value: () => Double): Self = StObject.set(x, "get_principalId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_principalType(value: () => PrincipalType): Self = StObject.set(x, "get_principalType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_sIPAddress(value: () => String): Self = StObject.set(x, "get_sIPAddress", js.Any.fromFunction0(value))
  }
}
