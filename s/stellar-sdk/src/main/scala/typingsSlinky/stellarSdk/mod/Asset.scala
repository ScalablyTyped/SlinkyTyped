package typingsSlinky.stellarSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "Asset")
@js.native
class Asset protected ()
  extends typingsSlinky.stellarBase.mod.Asset {
  def this(code: String) = this()
  def this(code: String, issuer: String) = this()
}
/* static members */
@JSImport("stellar-sdk", "Asset")
@js.native
object Asset extends js.Object {
  
  def fromOperation(xdr: typingsSlinky.stellarBase.xdrMod.default.Asset): typingsSlinky.stellarBase.mod.Asset = js.native
  
  def native(): typingsSlinky.stellarBase.mod.Asset = js.native
}
