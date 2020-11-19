package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.PeerAddressIp")
@js.native
class PeerAddressIp ()
  extends typingsSlinky.stellarBase.mod.xdr.PeerAddressIp
/* static members */
@JSImport("stellar-sdk", "xdr.PeerAddressIp")
@js.native
object PeerAddressIp extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  def iPv4(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  def iPv6(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerAddressIp, io: Buffer): Unit = js.native
}
