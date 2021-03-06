package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.InnerTransactionResultResult")
@js.native
class InnerTransactionResultResult ()
  extends typingsSlinky.stellarBase.xdrMod.default.InnerTransactionResultResult
object InnerTransactionResultResult {
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txBadAuth")
  @js.native
  def txBadAuth(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txBadAuthExtra")
  @js.native
  def txBadAuthExtra(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txBadSeq")
  @js.native
  def txBadSeq(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txBadSponsorship")
  @js.native
  def txBadSponsorship(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txFailed")
  @js.native
  def txFailed(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.OperationResult]): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txInsufficientBalance")
  @js.native
  def txInsufficientBalance(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txInsufficientFee")
  @js.native
  def txInsufficientFee(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txInternalError")
  @js.native
  def txInternalError(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txMissingOperation")
  @js.native
  def txMissingOperation(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txNoAccount")
  @js.native
  def txNoAccount(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txNotSupported")
  @js.native
  def txNotSupported(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txSuccess")
  @js.native
  def txSuccess(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.OperationResult]): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txTooEarly")
  @js.native
  def txTooEarly(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txTooLate")
  @js.native
  def txTooLate(): typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultResult, io: Buffer): Unit = js.native
}
