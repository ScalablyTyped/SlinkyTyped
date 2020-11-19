package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "TransactionHistoryResultEntryExt")
@js.native
class TransactionHistoryResultEntryExt ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt
/* static members */
@JSImport("stellar-base/types/xdr", "TransactionHistoryResultEntryExt")
@js.native
object TransactionHistoryResultEntryExt extends js.Object {
  
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt, io: Buffer): Unit = js.native
}
