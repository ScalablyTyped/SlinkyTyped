package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerEntryChange")
@js.native
class LedgerEntryChange ()
  extends typingsSlinky.stellarBase.mod.xdr.LedgerEntryChange
/* static members */
@JSImport("stellar-sdk", "xdr.LedgerEntryChange")
@js.native
object LedgerEntryChange extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange): Boolean = js.native
  
  def ledgerEntryCreated(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  def ledgerEntryRemoved(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  def ledgerEntryState(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  def ledgerEntryUpdated(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryChange, io: Buffer): Unit = js.native
}
