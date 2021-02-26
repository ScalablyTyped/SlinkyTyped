package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TrustLineEntryExt")
@js.native
class TrustLineEntryExt ()
  extends typingsSlinky.stellarBase.mod.xdr.TrustLineEntryExt
object TrustLineEntryExt {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.0")
  @js.native
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TrustLineEntryExt.1")
  @js.native
  def `1`(value: typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryV1): typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
}
