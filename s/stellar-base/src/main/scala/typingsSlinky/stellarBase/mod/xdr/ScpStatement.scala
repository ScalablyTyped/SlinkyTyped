package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.NodeId
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.ScpStatement")
@js.native
class ScpStatement protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.ScpStatement {
  def this(attributes: NodeId) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.ScpStatement")
@js.native
object ScpStatement extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement, io: Buffer): Unit = js.native
}

