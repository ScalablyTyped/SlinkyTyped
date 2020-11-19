package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerEntryExt")
@js.native
class LedgerEntryExt ()
  extends typingsSlinky.stellarBase.xdrMod.default.LedgerEntryExt
/* static members */
@JSImport("stellar-base", "xdr.LedgerEntryExt")
@js.native
object LedgerEntryExt extends js.Object {
  
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExt, io: Buffer): Unit = js.native
}
