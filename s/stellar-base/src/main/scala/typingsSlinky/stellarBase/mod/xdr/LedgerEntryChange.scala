package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerEntryChange")
@js.native
class LedgerEntryChange ()
  extends typingsSlinky.stellarBase.xdrMod.default.LedgerEntryChange
object LedgerEntryChange {
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryChange.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryChange.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.ledgerEntryCreated")
  @js.native
  def ledgerEntryCreated(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.ledgerEntryRemoved")
  @js.native
  def ledgerEntryRemoved(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.ledgerEntryState")
  @js.native
  def ledgerEntryState(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.ledgerEntryUpdated")
  @js.native
  def ledgerEntryUpdated(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryChange.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryChange.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryChange.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange, io: Buffer): Unit = js.native
}
