package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.AllowTrustResult")
@js.native
class AllowTrustResult ()
  extends typingsSlinky.stellarBase.mod.xdr.AllowTrustResult
object AllowTrustResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.allowTrustSuccess")
  @js.native
  def allowTrustSuccess(): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AllowTrustResult.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult, io: Buffer): Unit = js.native
}
