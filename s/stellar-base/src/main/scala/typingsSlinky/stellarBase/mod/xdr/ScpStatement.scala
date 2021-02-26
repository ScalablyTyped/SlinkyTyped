package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.NodeId
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.ScpStatement")
@js.native
class ScpStatement protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.ScpStatement {
  def this(attributes: NodeId) = this()
}
object ScpStatement {
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement = js.native
  @JSImport("stellar-base", "xdr.ScpStatement.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement = js.native
  @JSImport("stellar-base", "xdr.ScpStatement.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.ScpStatement.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.ScpStatement.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatement, io: Buffer): Unit = js.native
}
