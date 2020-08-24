package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.BytesRead
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.PeerStats")
@js.native
class PeerStats protected ()
  extends typingsSlinky.stellarBase.mod.xdr.PeerStats {
  def this(attributes: BytesRead) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.PeerStats")
@js.native
object PeerStats extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerStats = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PeerStats = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PeerStats = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PeerStats = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerStats): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PeerStats = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerStats): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PeerStats, io: Buffer): Unit = js.native
}

