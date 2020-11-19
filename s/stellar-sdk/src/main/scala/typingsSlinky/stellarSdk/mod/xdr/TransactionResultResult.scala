package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TransactionResultResult")
@js.native
class TransactionResultResult ()
  extends typingsSlinky.stellarBase.mod.xdr.TransactionResultResult
/* static members */
@JSImport("stellar-sdk", "xdr.TransactionResultResult")
@js.native
object TransactionResultResult extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult): Buffer = js.native
  
  def txFailed(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.OperationResult]): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  def txFeeBumpInnerFailed(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  def txFeeBumpInnerSuccess(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  def txSuccess(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.OperationResult]): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult, io: Buffer): Unit = js.native
}
