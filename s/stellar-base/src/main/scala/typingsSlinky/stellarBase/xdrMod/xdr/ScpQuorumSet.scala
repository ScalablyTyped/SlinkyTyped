package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScpQuorumSet extends js.Object {
  def innerSets(): js.Array[ScpQuorumSet] = js.native
  def innerSets(value: js.Array[ScpQuorumSet]): js.Array[ScpQuorumSet] = js.native
  def threshold(): Double = js.native
  def threshold(value: Double): Double = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def validators(): js.Array[PublicKey] = js.native
  def validators(value: js.Array[PublicKey]): js.Array[PublicKey] = js.native
}

