package typingsSlinky.stellarSdk.mod

import org.scalablytyped.runtime.StObject
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
object Asset {
  
  @JSImport("stellar-sdk", "Asset.fromOperation")
  @js.native
  def fromOperation(xdr: typingsSlinky.stellarBase.xdrMod.default.Asset): typingsSlinky.stellarBase.mod.Asset = js.native
  
  @JSImport("stellar-sdk", "Asset.native")
  @js.native
  def native(): typingsSlinky.stellarBase.mod.Asset = js.native
}
