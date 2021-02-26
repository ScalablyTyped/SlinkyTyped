package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.DataEntry")
@js.native
class DataEntry protected ()
  extends typingsSlinky.stellarBase.mod.xdr.DataEntry {
  def this(attributes: typingsSlinky.stellarBase.anon.DataValue) = this()
}
object DataEntry {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DataEntry.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.DataEntry = js.native
  @JSImport("stellar-sdk", "xdr.DataEntry.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.DataEntry = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.DataEntry.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.DataEntry = js.native
  @JSImport("stellar-sdk", "xdr.DataEntry.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.DataEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DataEntry.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.DataEntry): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DataEntry.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.DataEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DataEntry.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.DataEntry): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DataEntry.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.DataEntry.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.DataEntry.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.DataEntry.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.DataEntry.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.DataEntry, io: Buffer): Unit = js.native
}
