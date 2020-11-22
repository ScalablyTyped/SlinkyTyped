package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.LedgerMessages
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.ScpHistoryEntryV0")
@js.native
class ScpHistoryEntryV0 protected ()
  extends typingsSlinky.stellarBase.mod.xdr.ScpHistoryEntryV0 {
  def this(attributes: LedgerMessages) = this()
}
/* static members */
@JSImport("stellar-sdk", "xdr.ScpHistoryEntryV0")
@js.native
object ScpHistoryEntryV0 extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntryV0 = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntryV0 = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntryV0 = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntryV0 = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntryV0): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntryV0 = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntryV0): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpHistoryEntryV0, io: Buffer): Unit = js.native
}
