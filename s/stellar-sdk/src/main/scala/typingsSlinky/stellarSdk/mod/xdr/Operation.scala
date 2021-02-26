package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Body
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-line:strict-export-declare-modifiers
@JSImport("stellar-sdk", "xdr.Operation")
@js.native
class Operation[T /* <: typingsSlinky.stellarBase.mod.Operation */] protected ()
  extends typingsSlinky.stellarBase.mod.xdr.Operation[T] {
  def this(attributes: Body) = this()
}
object Operation {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Operation.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation] = js.native
  @JSImport("stellar-sdk", "xdr.Operation.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation] = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Operation.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation] = js.native
  @JSImport("stellar-sdk", "xdr.Operation.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation] = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Operation.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation]): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Operation.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation] = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Operation.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation]): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Operation.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Operation.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Operation.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Operation.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Operation.write")
  @js.native
  def write(
    value: typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation],
    io: Buffer
  ): Unit = js.native
}
