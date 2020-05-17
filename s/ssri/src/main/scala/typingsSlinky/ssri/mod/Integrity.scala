package typingsSlinky.ssri.mod

import typingsSlinky.ssri.anon.PickAlgorithm
import typingsSlinky.ssri.anon.Sep
import typingsSlinky.ssri.anon.Strict
import typingsSlinky.ssri.anon.`0`
import typingsSlinky.ssri.ssriBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "Integrity")
@js.native
class Integrity () extends js.Object {
  var isIntegrity: Boolean = js.native
  def concat(integrity: String): IntegrityMap = js.native
  def concat(integrity: String, opts: Strict): IntegrityMap = js.native
  def concat(integrity: HashLike): IntegrityMap = js.native
  def concat(integrity: HashLike, opts: Strict): IntegrityMap = js.native
  def concat(integrity: IntegrityLike): IntegrityMap = js.native
  def concat(integrity: IntegrityLike, opts: Strict): IntegrityMap = js.native
  def hexDigest(): String = js.native
  def `match`(integrity: String): Hash | `false` = js.native
  def `match`(integrity: String, opts: PickAlgorithm): Hash | `false` = js.native
  def `match`(integrity: HashLike): Hash | `false` = js.native
  def `match`(integrity: HashLike, opts: PickAlgorithm): Hash | `false` = js.native
  def `match`(integrity: IntegrityLike): Hash | `false` = js.native
  def `match`(integrity: IntegrityLike, opts: PickAlgorithm): Hash | `false` = js.native
  def pickAlgorithm(): String = js.native
  def pickAlgorithm(opts: `0`): String = js.native
  def toJSON(): String = js.native
  def toString(opts: Sep): String = js.native
}

