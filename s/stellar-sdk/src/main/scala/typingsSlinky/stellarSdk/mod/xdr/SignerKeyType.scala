package typingsSlinky.stellarSdk.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.SignerKeyType")
@js.native
class SignerKeyType ()
  extends typingsSlinky.stellarBase.mod.xdr.SignerKeyType

/* static members */
@JSImport("stellar-sdk", "xdr.SignerKeyType")
@js.native
object SignerKeyType extends js.Object {
  def signerKeyTypeEd25519(): typingsSlinky.stellarBase.xdrMod.xdr.SignerKeyType = js.native
  def signerKeyTypeHashX(): typingsSlinky.stellarBase.xdrMod.xdr.SignerKeyType = js.native
  def signerKeyTypePreAuthTx(): typingsSlinky.stellarBase.xdrMod.xdr.SignerKeyType = js.native
}

