package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Key
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.Curve25519Secret")
@js.native
class Curve25519Secret protected ()
  extends typingsSlinky.stellarBase.mod.xdr.Curve25519Secret {
  def this(attributes: Key) = this()
}
/* static members */
@JSImport("stellar-sdk", "xdr.Curve25519Secret")
@js.native
object Curve25519Secret extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Secret, io: Buffer): Unit = js.native
}
