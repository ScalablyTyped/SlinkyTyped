package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopologyResponseBody extends StObject {
  
  def inboundPeers(): js.Array[PeerStats] = js.native
  def inboundPeers(value: js.Array[PeerStats]): js.Array[PeerStats] = js.native
  
  def outboundPeers(): js.Array[PeerStats] = js.native
  def outboundPeers(value: js.Array[PeerStats]): js.Array[PeerStats] = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def totalInboundPeerCount(): Double = js.native
  def totalInboundPeerCount(value: Double): Double = js.native
  
  def totalOutboundPeerCount(): Double = js.native
  def totalOutboundPeerCount(value: Double): Double = js.native
}
