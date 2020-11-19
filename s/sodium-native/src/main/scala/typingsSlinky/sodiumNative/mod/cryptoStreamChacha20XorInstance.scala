package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_stream_chacha20_xor_instance")
@js.native
object cryptoStreamChacha20XorInstance extends js.Object {
  
  def apply(nonce: Buffer, key: Buffer): CryptoStreamChacha20XorWrap = js.native
}
