package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.UnsignedHyper")
@js.native
class UnsignedHyper protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper {
  def this(low: Double, high: Double) = this()
}
object UnsignedHyper {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.MAX_VALUE")
  @js.native
  val MAX_VALUE: typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.MIN_VALUE")
  @js.native
  val MIN_VALUE: typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.fromBytes")
  @js.native
  def fromBytes(low: Double, high: Double): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.fromString")
  @js.native
  def fromString(input: String): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.UnsignedHyper.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper, io: Buffer): Unit = js.native
}
