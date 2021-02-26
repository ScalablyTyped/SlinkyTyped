package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt")
@js.native
class LedgerHeaderHistoryEntryExt ()
  extends typingsSlinky.stellarBase.xdrMod.default.LedgerHeaderHistoryEntryExt
object LedgerHeaderHistoryEntryExt {
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderHistoryEntryExt.0")
  @js.native
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
}
