package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPaymentStrictSendOp extends js.Object {
  
  def destAsset(): Asset = js.native
  def destAsset(value: Asset): Asset = js.native
  
  def destMin(): Int64 = js.native
  def destMin(value: Int64): Int64 = js.native
  
  def destination(): MuxedAccount = js.native
  def destination(value: MuxedAccount): MuxedAccount = js.native
  
  def path(): js.Array[Asset] = js.native
  def path(value: js.Array[Asset]): js.Array[Asset] = js.native
  
  def sendAmount(): Int64 = js.native
  def sendAmount(value: Int64): Int64 = js.native
  
  def sendAsset(): Asset = js.native
  def sendAsset(value: Asset): Asset = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
