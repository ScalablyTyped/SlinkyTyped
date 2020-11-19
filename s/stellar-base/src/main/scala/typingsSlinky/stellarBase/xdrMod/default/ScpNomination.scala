package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Accepted
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "ScpNomination")
@js.native
class ScpNomination protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination {
  def this(attributes: Accepted) = this()
}
/* static members */
@JSImport("stellar-base/types/xdr", "ScpNomination")
@js.native
object ScpNomination extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination, io: Buffer): Unit = js.native
}
