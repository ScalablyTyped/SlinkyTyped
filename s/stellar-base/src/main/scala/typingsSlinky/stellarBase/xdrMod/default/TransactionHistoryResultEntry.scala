package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.TxResultSet
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry")
@js.native
class TransactionHistoryResultEntry protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry {
  def this(attributes: TxResultSet) = this()
}
object TransactionHistoryResultEntry {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionHistoryResultEntry.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntry, io: Buffer): Unit = js.native
}
