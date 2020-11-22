package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "LedgerEntryData")
@js.native
class LedgerEntryData ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData
/* static members */
@JSImport("stellar-base/types/xdr", "LedgerEntryData")
@js.native
object LedgerEntryData extends js.Object {
  
  def account(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  def claimableBalance(value: typingsSlinky.stellarBase.xdrMod.xdr.ClaimableBalanceEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  def data(value: typingsSlinky.stellarBase.xdrMod.xdr.DataEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData): Boolean = js.native
  
  def offer(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData): Buffer = js.native
  
  def trustline(value: typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData, io: Buffer): Unit = js.native
}
