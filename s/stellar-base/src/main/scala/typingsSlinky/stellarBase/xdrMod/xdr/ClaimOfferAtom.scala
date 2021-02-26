package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimOfferAtom extends StObject {
  
  def amountBought(): Int64 = js.native
  def amountBought(value: Int64): Int64 = js.native
  
  def amountSold(): Int64 = js.native
  def amountSold(value: Int64): Int64 = js.native
  
  def assetBought(): Asset = js.native
  def assetBought(value: Asset): Asset = js.native
  
  def assetSold(): Asset = js.native
  def assetSold(value: Asset): Asset = js.native
  
  def offerId(): Int64 = js.native
  def offerId(value: Int64): Int64 = js.native
  
  def sellerId(): AccountId = js.native
  def sellerId(value: AccountId): AccountId = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
