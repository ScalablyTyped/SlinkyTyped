package typingsSlinky.tweetnacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxKeyPair extends js.Object {
  
  var publicKey: js.typedarray.Uint8Array = js.native
  
  var secretKey: js.typedarray.Uint8Array = js.native
}
object BoxKeyPair {
  
  @scala.inline
  def apply(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): BoxKeyPair = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxKeyPair]
  }
  
  @scala.inline
  implicit class BoxKeyPairOps[Self <: BoxKeyPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPublicKey(value: js.typedarray.Uint8Array): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: js.typedarray.Uint8Array): Self = this.set("secretKey", value.asInstanceOf[js.Any])
  }
}
