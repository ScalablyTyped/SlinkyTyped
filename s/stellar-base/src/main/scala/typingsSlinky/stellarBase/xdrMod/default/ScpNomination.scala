package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Accepted
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.ScpNomination")
@js.native
class ScpNomination protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination {
  def this(attributes: Accepted) = this()
}
object ScpNomination {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination = js.native
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination = js.native
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpNomination.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpNomination, io: Buffer): Unit = js.native
}
