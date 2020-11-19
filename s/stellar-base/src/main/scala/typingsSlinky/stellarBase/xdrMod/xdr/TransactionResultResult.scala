package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionResultResult extends js.Object {
  
  def innerResultPair(): InnerTransactionResultPair = js.native
  def innerResultPair(value: InnerTransactionResultPair): InnerTransactionResultPair = js.native
  
  def results(): js.Array[OperationResult] = js.native
  def results(value: js.Array[OperationResult]): js.Array[OperationResult] = js.native
  
  def switch(): TransactionResultCode = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): InnerTransactionResultPair | js.Array[OperationResult] = js.native
}
