package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_generichash_instance")
@js.native
object cryptoGenerichashInstance extends js.Object {
  
  def apply(): CryptoGenericHashWrap = js.native
  def apply(key: js.UndefOr[scala.Nothing], outputLength: Double): CryptoGenericHashWrap = js.native
  def apply(key: Buffer): CryptoGenericHashWrap = js.native
  def apply(key: Buffer, outputLength: Double): CryptoGenericHashWrap = js.native
}
