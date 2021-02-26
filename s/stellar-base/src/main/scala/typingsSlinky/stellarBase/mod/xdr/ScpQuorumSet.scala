package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.InnerSets
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.ScpQuorumSet")
@js.native
class ScpQuorumSet protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.ScpQuorumSet {
  def this(attributes: InnerSets) = this()
}
object ScpQuorumSet {
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpQuorumSet.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpQuorumSet = js.native
  @JSImport("stellar-base", "xdr.ScpQuorumSet.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpQuorumSet = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ScpQuorumSet.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpQuorumSet = js.native
  @JSImport("stellar-base", "xdr.ScpQuorumSet.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpQuorumSet = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpQuorumSet.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpQuorumSet): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpQuorumSet.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpQuorumSet = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpQuorumSet.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpQuorumSet): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpQuorumSet.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.ScpQuorumSet.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ScpQuorumSet.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.ScpQuorumSet.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpQuorumSet.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpQuorumSet, io: Buffer): Unit = js.native
}
