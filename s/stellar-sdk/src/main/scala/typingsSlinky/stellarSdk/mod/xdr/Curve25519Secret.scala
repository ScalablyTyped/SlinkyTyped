package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Key
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.Curve25519Secret")
@js.native
class Curve25519Secret protected ()
  extends typingsSlinky.stellarBase.mod.xdr.Curve25519Secret {
  def this(attributes: Key) = this()
}
object Curve25519Secret {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret, io: Buffer): Unit = js.native
}
