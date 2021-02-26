package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.Hyper")
@js.native
class Hyper protected ()
  extends typingsSlinky.stellarBase.mod.xdr.Hyper {
  def this(low: Double, high: Double) = this()
}
object Hyper {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.MAX_VALUE")
  @js.native
  val MAX_VALUE: typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.MIN_VALUE")
  @js.native
  val MIN_VALUE: typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.fromBytes")
  @js.native
  def fromBytes(low: Double, high: Double): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.fromString")
  @js.native
  def fromString(input: String): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSImport("stellar-sdk", "xdr.Hyper.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSImport("stellar-sdk", "xdr.Hyper.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Hyper): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Hyper): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Hyper.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Hyper.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Hyper.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Hyper, io: Buffer): Unit = js.native
}
