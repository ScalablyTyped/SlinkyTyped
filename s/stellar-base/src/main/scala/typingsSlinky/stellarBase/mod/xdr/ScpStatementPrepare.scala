package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Ballot
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.ScpStatementPrepare")
@js.native
class ScpStatementPrepare protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.ScpStatementPrepare {
  def this(attributes: Ballot) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.ScpStatementPrepare")
@js.native
object ScpStatementPrepare extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPrepare = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPrepare = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPrepare = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPrepare = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPrepare): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPrepare = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPrepare): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpStatementPrepare, io: Buffer): Unit = js.native
}
