package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt")
@js.native
class TransactionHistoryEntryExt ()
  extends typingsSlinky.stellarBase.mod.xdr.TransactionHistoryEntryExt
/* static members */
@JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt")
@js.native
object TransactionHistoryEntryExt extends js.Object {
  
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt, io: Buffer): Unit = js.native
}
