package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.Claimant")
@js.native
class Claimant ()
  extends typingsSlinky.stellarBase.mod.xdr.Claimant
object Claimant {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Claimant.claimantTypeV0")
  @js.native
  def claimantTypeV0(value: typingsSlinky.stellarBase.xdrMod.xdr.ClaimantV0): typingsSlinky.stellarBase.xdrMod.xdr.Claimant = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Claimant.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Claimant = js.native
  @JSImport("stellar-sdk", "xdr.Claimant.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Claimant = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Claimant.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Claimant = js.native
  @JSImport("stellar-sdk", "xdr.Claimant.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Claimant = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Claimant.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Claimant): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Claimant.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Claimant = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Claimant.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Claimant): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Claimant.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Claimant.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Claimant.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Claimant.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Claimant.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Claimant, io: Buffer): Unit = js.native
}
