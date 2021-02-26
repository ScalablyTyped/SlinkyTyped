package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.BytesRead
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.PeerStats")
@js.native
class PeerStats protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.PeerStats {
  def this(attributes: BytesRead) = this()
}
object PeerStats {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerStats = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerStats.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PeerStats = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PeerStats = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerStats.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PeerStats = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerStats): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerStats = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerStats): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerStats.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PeerStats.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PeerStats.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerStats, io: Buffer): Unit = js.native
}
