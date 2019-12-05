package typingsSlinky.stellarDashSdk.stellarDashSdkMod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "verify")
@js.native
object verify extends js.Object {
  def apply(data: Buffer, signature: Signature, rawPublicKey: Buffer): Boolean = js.native
}

