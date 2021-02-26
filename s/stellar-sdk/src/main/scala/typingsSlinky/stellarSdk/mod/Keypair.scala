package typingsSlinky.stellarSdk.mod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.PublicKey
import typingsSlinky.stellarBase.anon.Type
import org.scalablytyped.runtime.StObject
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
object Keypair {
  
  @JSImport("stellar-sdk", "Keypair.fromPublicKey")
  @js.native
  def fromPublicKey(publicKey: String): typingsSlinky.stellarBase.mod.Keypair = js.native
  
  @JSImport("stellar-sdk", "Keypair.fromRawEd25519Seed")
  @js.native
  def fromRawEd25519Seed(secretSeed: Buffer): typingsSlinky.stellarBase.mod.Keypair = js.native
  
  @JSImport("stellar-sdk", "Keypair.fromSecret")
  @js.native
  def fromSecret(secretKey: String): typingsSlinky.stellarBase.mod.Keypair = js.native
  
  @JSImport("stellar-sdk", "Keypair.master")
  @js.native
  def master(networkPassphrase: String): typingsSlinky.stellarBase.mod.Keypair = js.native
  
  @JSImport("stellar-sdk", "Keypair.random")
  @js.native
  def random(): typingsSlinky.stellarBase.mod.Keypair = js.native
}
