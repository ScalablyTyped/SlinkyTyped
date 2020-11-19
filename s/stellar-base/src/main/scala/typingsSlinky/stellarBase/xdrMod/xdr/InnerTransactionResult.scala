package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerTransactionResult extends js.Object {
  
  def ext(): InnerTransactionResultExt = js.native
  def ext(value: InnerTransactionResultExt): InnerTransactionResultExt = js.native
  
  def feeCharged(): Int64 = js.native
  def feeCharged(value: Int64): Int64 = js.native
  
  def result(): InnerTransactionResultResult = js.native
  def result(value: InnerTransactionResultResult): InnerTransactionResultResult = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
