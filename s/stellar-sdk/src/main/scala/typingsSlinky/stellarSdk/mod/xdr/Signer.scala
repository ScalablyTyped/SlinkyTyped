package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Weight
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.Signer")
@js.native
class Signer protected ()
  extends typingsSlinky.stellarBase.mod.xdr.Signer {
  def this(attributes: Weight) = this()
}
object Signer {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Signer.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Signer = js.native
  @JSImport("stellar-sdk", "xdr.Signer.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Signer = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Signer.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Signer = js.native
  @JSImport("stellar-sdk", "xdr.Signer.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Signer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Signer.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Signer): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Signer.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Signer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Signer.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Signer): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Signer.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Signer.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Signer.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Signer.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Signer.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Signer, io: Buffer): Unit = js.native
}
