package typingsSlinky.tweetnacl.mod

import typingsSlinky.tweetnacl.mod.sign.detached
import typingsSlinky.tweetnacl.mod.sign.keyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait sign extends js.Object {
  
  def apply(msg: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  def detached(msg: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSName("detached")
  var detached_Original: detached = js.native
  
  def keyPair(): SignKeyPair = js.native
  @JSName("keyPair")
  var keyPair_Original: keyPair = js.native
  
  def open(signedMsg: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
  
  val publicKeyLength: Double = js.native
  
  val secretKeyLength: Double = js.native
  
  val seedLength: Double = js.native
  
  val signatureLength: Double = js.native
}
@JSImport("tweetnacl", "sign")
@js.native
object sign extends js.Object {
  
  @js.native
  trait detached extends js.Object {
    
    def apply(msg: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def verify(msg: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): Boolean = js.native
  }
  
  @js.native
  trait keyPair extends js.Object {
    
    def apply(): SignKeyPair = js.native
    
    def fromSecretKey(secretKey: js.typedarray.Uint8Array): SignKeyPair = js.native
    
    def fromSeed(secretKey: js.typedarray.Uint8Array): SignKeyPair = js.native
  }
}
