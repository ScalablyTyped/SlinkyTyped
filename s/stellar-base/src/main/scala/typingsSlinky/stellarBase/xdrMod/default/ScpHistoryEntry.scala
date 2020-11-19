package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "ScpHistoryEntry")
@js.native
class ScpHistoryEntry ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntry
/* static members */
@JSImport("stellar-base/types/xdr", "ScpHistoryEntry")
@js.native
object ScpHistoryEntry extends js.Object {
  
  def `0`(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntryV0): typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntry): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntry): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntry, io: Buffer): Unit = js.native
}
