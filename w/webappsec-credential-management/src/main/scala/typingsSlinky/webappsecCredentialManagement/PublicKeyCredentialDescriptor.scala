package typingsSlinky.webappsecCredentialManagement

import typingsSlinky.std.BufferSource
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.ble
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.internal
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.nfc
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.usb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialdescriptor}
  */
@js.native
trait PublicKeyCredentialDescriptor extends StObject {
  
  var id: BufferSource = js.native
  
  var transports: js.UndefOr[js.Array[usb | nfc | ble | internal]] = js.native
  
  var `type`: `public-key` = js.native
}
object PublicKeyCredentialDescriptor {
  
  @scala.inline
  def apply(id: BufferSource, `type`: `public-key`): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialDescriptorMutableBuilder[Self <: PublicKeyCredentialDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: BufferSource): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransports(value: js.Array[usb | nfc | ble | internal]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    @scala.inline
    def setTransportsVarargs(value: (usb | nfc | ble | internal)*): Self = StObject.set(x, "transports", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `public-key`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
