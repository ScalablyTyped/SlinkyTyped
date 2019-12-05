package typingsSlinky.stellarDashSdk.stellarDashSdkMod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarDashBase.Anon_PublicKey
import typingsSlinky.stellarDashBase.Anon_PublicKeyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Keypair")
@js.native
class Keypair protected ()
  extends typingsSlinky.stellarDashBase.stellarDashBaseMod.Keypair {
  def this(keys: Anon_PublicKey) = this()
  def this(keys: Anon_PublicKeyType) = this()
}

/* static members */
@JSImport("stellar-sdk", "Keypair")
@js.native
object Keypair extends js.Object {
  def fromBase58Seed(secretSeed: String): typingsSlinky.stellarDashBase.stellarDashBaseMod.Keypair = js.native
  def fromPublicKey(publicKey: String): typingsSlinky.stellarDashBase.stellarDashBaseMod.Keypair = js.native
  def fromRawEd25519Seed(secretSeed: Buffer): typingsSlinky.stellarDashBase.stellarDashBaseMod.Keypair = js.native
  def fromSecret(secretKey: String): typingsSlinky.stellarDashBase.stellarDashBaseMod.Keypair = js.native
  def master(): typingsSlinky.stellarDashBase.stellarDashBaseMod.Keypair = js.native
  def master(networkPassphrase: String): typingsSlinky.stellarDashBase.stellarDashBaseMod.Keypair = js.native
  def random(): typingsSlinky.stellarDashBase.stellarDashBaseMod.Keypair = js.native
}

