package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.DataName
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.ManageDataOp")
@js.native
class ManageDataOp protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.ManageDataOp {
  def this(attributes: DataName) = this()
}
object ManageDataOp {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageDataOp = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ManageDataOp = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ManageDataOp = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ManageDataOp = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageDataOp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageDataOp = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageDataOp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageDataOp.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageDataOp, io: Buffer): Unit = js.native
}
