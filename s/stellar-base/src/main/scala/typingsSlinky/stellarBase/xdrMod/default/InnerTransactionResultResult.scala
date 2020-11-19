package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "InnerTransactionResultResult")
@js.native
class InnerTransactionResultResult ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult
/* static members */
@JSImport("stellar-base/types/xdr", "InnerTransactionResultResult")
@js.native
object InnerTransactionResultResult extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult): Buffer = js.native
  
  def txBadAuth(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txBadAuthExtra(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txBadSeq(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txFailed(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.OperationResult]): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txInsufficientBalance(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txInsufficientFee(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txInternalError(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txMissingOperation(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txNoAccount(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txNotSupported(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txSuccess(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.OperationResult]): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txTooEarly(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def txTooLate(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult, io: Buffer): Unit = js.native
}
