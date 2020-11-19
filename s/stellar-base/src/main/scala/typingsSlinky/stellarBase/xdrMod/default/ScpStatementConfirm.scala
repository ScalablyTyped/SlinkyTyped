package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.NCommit
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "ScpStatementConfirm")
@js.native
class ScpStatementConfirm protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementConfirm {
  def this(attributes: NCommit) = this()
}
/* static members */
@JSImport("stellar-base/types/xdr", "ScpStatementConfirm")
@js.native
object ScpStatementConfirm extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementConfirm = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementConfirm = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementConfirm = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementConfirm = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementConfirm): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementConfirm = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementConfirm): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementConfirm, io: Buffer): Unit = js.native
}
