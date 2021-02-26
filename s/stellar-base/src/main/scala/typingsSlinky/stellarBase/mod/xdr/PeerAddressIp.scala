package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.PeerAddressIp")
@js.native
class PeerAddressIp ()
  extends typingsSlinky.stellarBase.xdrMod.default.PeerAddressIp
object PeerAddressIp {
  
  /* static member */
  @JSImport("stellar-base", "xdr.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSImport("stellar-base", "xdr.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSImport("stellar-base", "xdr.PeerAddressIp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PeerAddressIp.iPv4")
  @js.native
  def iPv4(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PeerAddressIp.iPv6")
  @js.native
  def iPv6(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PeerAddressIp.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PeerAddressIp.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PeerAddressIp.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.PeerAddressIp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PeerAddressIp.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp, io: Buffer): Unit = js.native
}
