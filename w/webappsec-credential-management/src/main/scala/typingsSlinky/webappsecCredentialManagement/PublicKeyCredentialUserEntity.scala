package typingsSlinky.webappsecCredentialManagement

import typingsSlinky.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialuserentity}
  */
@js.native
trait PublicKeyCredentialUserEntity extends PublicKeyCredentialEntity {
  
  var displayName: String = js.native
  
  var id: BufferSource = js.native
}
object PublicKeyCredentialUserEntity {
  
  @scala.inline
  def apply(displayName: String, id: BufferSource, name: String): PublicKeyCredentialUserEntity = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialUserEntity]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialUserEntityMutableBuilder[Self <: PublicKeyCredentialUserEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: BufferSource): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
