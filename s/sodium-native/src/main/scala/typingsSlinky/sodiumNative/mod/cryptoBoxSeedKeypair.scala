package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_box_seed_keypair")
@js.native
object cryptoBoxSeedKeypair extends js.Object {
  
  def apply(publicKey: Buffer, secretKey: Buffer, seed: Buffer): Unit = js.native
}
