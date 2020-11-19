package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.BucketEntry")
@js.native
class BucketEntry ()
  extends typingsSlinky.stellarBase.mod.xdr.BucketEntry
/* static members */
@JSImport("stellar-sdk", "xdr.BucketEntry")
@js.native
object BucketEntry extends js.Object {
  
  def deadentry(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  def initentry(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry): Boolean = js.native
  
  def liveentry(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  def metaentry(value: typingsSlinky.stellarBase.xdrMod.xdr.BucketMetadata): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry, io: Buffer): Unit = js.native
}
