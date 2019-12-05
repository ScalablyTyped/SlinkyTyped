package typingsSlinky.stellarDashSdk.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Asset")
@js.native
class Asset protected ()
  extends typingsSlinky.stellarDashBase.stellarDashBaseMod.Asset {
  def this(code: String) = this()
  def this(code: String, issuer: String) = this()
}

/* static members */
@JSImport("stellar-sdk", "Asset")
@js.native
object Asset extends js.Object {
  def fromOperation(xdr: typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Asset): typingsSlinky.stellarDashBase.stellarDashBaseMod.Asset = js.native
  def native(): typingsSlinky.stellarDashBase.stellarDashBaseMod.Asset = js.native
}

