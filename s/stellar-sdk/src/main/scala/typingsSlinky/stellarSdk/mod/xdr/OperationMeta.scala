package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Changes
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.OperationMeta")
@js.native
class OperationMeta protected ()
  extends typingsSlinky.stellarBase.mod.xdr.OperationMeta {
  def this(attributes: Changes) = this()
}
/* static members */
@JSImport("stellar-sdk", "xdr.OperationMeta")
@js.native
object OperationMeta extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationMeta = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.OperationMeta = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.OperationMeta = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.OperationMeta = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationMeta): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationMeta = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationMeta): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationMeta, io: Buffer): Unit = js.native
}
