package typingsSlinky.stellarSdk.mod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.mod.xdr.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "verify")
@js.native
object verify extends js.Object {
  def apply(data: Buffer, signature: Signature, rawPublicKey: Buffer): Boolean = js.native
}

