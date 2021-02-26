package typingsSlinky.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCertificate extends StObject {
  
  /**
    * An attribute to store the type of the application certificate
    */
  val `type`: String = js.native
  
  /**
    * An attribute to store the value of the application certificate
    */
  val value: String = js.native
}
object ApplicationCertificate {
  
  @scala.inline
  def apply(`type`: String, value: String): ApplicationCertificate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCertificate]
  }
  
  @scala.inline
  implicit class ApplicationCertificateMutableBuilder[Self <: ApplicationCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
