package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.BucketEntry")
@js.native
class BucketEntry ()
  extends typingsSlinky.stellarBase.mod.xdr.BucketEntry
object BucketEntry {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.deadentry")
  @js.native
  def deadentry(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  @JSImport("stellar-sdk", "xdr.BucketEntry.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  @JSImport("stellar-sdk", "xdr.BucketEntry.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.initentry")
  @js.native
  def initentry(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.liveentry")
  @js.native
  def liveentry(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.metaentry")
  @js.native
  def metaentry(value: typingsSlinky.stellarBase.xdrMod.xdr.BucketMetadata): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.BucketEntry.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.BucketEntry.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BucketEntry.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.BucketEntry, io: Buffer): Unit = js.native
}
