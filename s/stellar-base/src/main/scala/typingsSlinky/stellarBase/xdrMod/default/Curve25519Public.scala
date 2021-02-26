package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Key
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.Curve25519Public")
@js.native
class Curve25519Public protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public {
  def this(attributes: Key) = this()
}
object Curve25519Public {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Curve25519Public.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public, io: Buffer): Unit = js.native
}
