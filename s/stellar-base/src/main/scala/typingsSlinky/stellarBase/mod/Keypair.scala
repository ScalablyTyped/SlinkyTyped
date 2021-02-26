package typingsSlinky.stellarBase.mod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.PublicKey
import typingsSlinky.stellarBase.anon.Type
import typingsSlinky.stellarBase.xdrMod.default.DecoratedSignature
import typingsSlinky.stellarBase.xdrMod.xdr.AccountId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "Keypair")
@js.native
class Keypair protected () extends StObject {
  def this(keys: PublicKey) = this()
  def this(keys: Type) = this()
  
  def canSign(): Boolean = js.native
  
  def publicKey(): String = js.native
  
  def rawPublicKey(): Buffer = js.native
  
  def rawSecretKey(): Buffer = js.native
  
  def secret(): String = js.native
  
  def sign(data: Buffer): Buffer = js.native
  
  def signDecorated(data: Buffer): DecoratedSignature = js.native
  
  def signatureHint(): Buffer = js.native
  
  val `type`: KeypairType = js.native
  
  def verify(data: Buffer, signature: Buffer): Boolean = js.native
  
  def xdrAccountId(): AccountId = js.native
}
/* static members */
object Keypair {
  
  @JSImport("stellar-base", "Keypair.fromPublicKey")
  @js.native
  def fromPublicKey(publicKey: String): Keypair = js.native
  
  @JSImport("stellar-base", "Keypair.fromRawEd25519Seed")
  @js.native
  def fromRawEd25519Seed(secretSeed: Buffer): Keypair = js.native
  
  @JSImport("stellar-base", "Keypair.fromSecret")
  @js.native
  def fromSecret(secretKey: String): Keypair = js.native
  
  @JSImport("stellar-base", "Keypair.master")
  @js.native
  def master(networkPassphrase: String): Keypair = js.native
  
  @JSImport("stellar-base", "Keypair.random")
  @js.native
  def random(): Keypair = js.native
}
