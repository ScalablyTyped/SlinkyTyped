package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.PeerAddressIp")
@js.native
class PeerAddressIp ()
  extends typingsSlinky.stellarBase.xdrMod.default.PeerAddressIp

/* static members */
@JSImport("stellar-base", "xdr.PeerAddressIp")
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

