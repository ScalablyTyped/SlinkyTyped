package typingsSlinky.stellarSdk.mod

import typingsSlinky.stellarBase.xdrMod.default.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "FeeBumpTransaction")
@js.native
class FeeBumpTransaction protected ()
  extends typingsSlinky.stellarBase.mod.FeeBumpTransaction {
  def this(envelope: String, networkPassphrase: String) = this()
  def this(envelope: TransactionEnvelope, networkPassphrase: String) = this()
}

