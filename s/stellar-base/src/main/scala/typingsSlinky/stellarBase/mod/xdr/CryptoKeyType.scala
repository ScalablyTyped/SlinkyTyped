package typingsSlinky.stellarBase.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.CryptoKeyType")
@js.native
class CryptoKeyType ()
  extends typingsSlinky.stellarBase.xdrMod.default.CryptoKeyType

/* static members */
@JSImport("stellar-base", "xdr.CryptoKeyType")
@js.native
object CryptoKeyType extends js.Object {
  def keyTypeEd25519(): typingsSlinky.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
  def keyTypeHashX(): typingsSlinky.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
  def keyTypeMuxedEd25519(): typingsSlinky.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
  def keyTypePreAuthTx(): typingsSlinky.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
}

