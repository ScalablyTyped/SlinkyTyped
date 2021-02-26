package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.TransactionResultResult")
@js.native
class TransactionResultResult ()
  extends typingsSlinky.stellarBase.xdrMod.default.TransactionResultResult
object TransactionResultResult {
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  @JSImport("stellar-base", "xdr.TransactionResultResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  @JSImport("stellar-base", "xdr.TransactionResultResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.txFailed")
  @js.native
  def txFailed(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.OperationResult]): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.txFeeBumpInnerFailed")
  @js.native
  def txFeeBumpInnerFailed(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.txFeeBumpInnerSuccess")
  @js.native
  def txFeeBumpInnerSuccess(value: typingsSlinky.stellarBase.xdrMod.xdr.InnerTransactionResultPair): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.txSuccess")
  @js.native
  def txSuccess(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.OperationResult]): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.TransactionResultResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.TransactionResultResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionResultResult.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultResult, io: Buffer): Unit = js.native
}
