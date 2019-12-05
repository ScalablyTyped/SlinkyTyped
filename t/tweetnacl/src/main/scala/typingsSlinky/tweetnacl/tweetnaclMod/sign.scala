package typingsSlinky.tweetnacl.tweetnaclMod

import typingsSlinky.tweetnacl.tweetnaclMod.sign.detached
import typingsSlinky.tweetnacl.tweetnaclMod.sign.keyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sign extends js.Object {
  @JSName("detached")
  var detached_Original: detached = js.native
  @JSName("keyPair")
  var keyPair_Original: keyPair = js.native
  val publicKeyLength: Double = js.native
  val secretKeyLength: Double = js.native
  val seedLength: Double = js.native
  val signatureLength: Double = js.native
  def apply(msg: scala.scalajs.js.typedarray.Uint8Array, secretKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def detached(msg: scala.scalajs.js.typedarray.Uint8Array, secretKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def keyPair(): SignKeyPair = js.native
  def open(
    signedMsg: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array | Null = js.native
}

@JSImport("tweetnacl", "sign")
@js.native
object sign extends js.Object {
  @js.native
  trait detached extends js.Object {
    def apply(msg: scala.scalajs.js.typedarray.Uint8Array, secretKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
    def verify(
      msg: scala.scalajs.js.typedarray.Uint8Array,
      sig: scala.scalajs.js.typedarray.Uint8Array,
      publicKey: scala.scalajs.js.typedarray.Uint8Array
    ): Boolean = js.native
  }
  
  @js.native
  trait keyPair extends js.Object {
    def apply(): SignKeyPair = js.native
    def fromSecretKey(secretKey: scala.scalajs.js.typedarray.Uint8Array): SignKeyPair = js.native
    def fromSeed(secretKey: scala.scalajs.js.typedarray.Uint8Array): SignKeyPair = js.native
  }
  
}

