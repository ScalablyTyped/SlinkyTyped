package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScpStatementConfirm extends js.Object {
  def ballot(): ScpBallot = js.native
  def ballot(value: ScpBallot): ScpBallot = js.native
  def nCommit(): Double = js.native
  def nCommit(value: Double): Double = js.native
  def nH(): Double = js.native
  def nH(value: Double): Double = js.native
  def nPrepared(): Double = js.native
  def nPrepared(value: Double): Double = js.native
  def quorumSetHash(): Buffer = js.native
  def quorumSetHash(value: Buffer): Buffer = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}

