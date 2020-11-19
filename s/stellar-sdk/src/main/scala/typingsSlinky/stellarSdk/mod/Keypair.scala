package typingsSlinky.stellarSdk.mod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.PublicKey
import typingsSlinky.stellarBase.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "Keypair")
@js.native
class Keypair protected ()
  extends typingsSlinky.stellarBase.mod.Keypair {
  def this(keys: PublicKey) = this()
  def this(keys: Type) = this()
}
/* static members */
@JSImport("stellar-sdk", "Keypair")
@js.native
object Keypair extends js.Object {
  
  def fromPublicKey(publicKey: String): typingsSlinky.stellarBase.mod.Keypair = js.native
  
  def fromRawEd25519Seed(secretSeed: Buffer): typingsSlinky.stellarBase.mod.Keypair = js.native
  
  def fromSecret(secretKey: String): typingsSlinky.stellarBase.mod.Keypair = js.native
  
  def master(networkPassphrase: String): typingsSlinky.stellarBase.mod.Keypair = js.native
  
  def random(): typingsSlinky.stellarBase.mod.Keypair = js.native
}
