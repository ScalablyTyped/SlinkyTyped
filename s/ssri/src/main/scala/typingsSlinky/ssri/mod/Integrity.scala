package typingsSlinky.ssri.mod

import typingsSlinky.ssri.anon.PickAlgorithm
import typingsSlinky.ssri.anon.Sep
import typingsSlinky.ssri.anon.Single
import typingsSlinky.ssri.anon.Strict
import typingsSlinky.ssri.anon.`0`
import typingsSlinky.ssri.ssriBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssri", "Integrity")
@js.native
class Integrity () extends js.Object {
  
  def concat(integrity: String): IntegrityMap = js.native
  def concat(integrity: String, opts: Strict): IntegrityMap = js.native
  def concat(integrity: HashLike): IntegrityMap = js.native
  def concat(integrity: HashLike, opts: Strict): IntegrityMap = js.native
  def concat(integrity: IntegrityLike): IntegrityMap = js.native
  def concat(integrity: IntegrityLike, opts: Strict): IntegrityMap = js.native
  
  def hexDigest(): String = js.native
  
  var isIntegrity: Boolean = js.native
  
  def `match`(integrity: String): Hash | `false` = js.native
  def `match`(integrity: String, opts: PickAlgorithm): Hash | `false` = js.native
  def `match`(integrity: HashLike): Hash | `false` = js.native
  def `match`(integrity: HashLike, opts: PickAlgorithm): Hash | `false` = js.native
  def `match`(integrity: IntegrityLike): Hash | `false` = js.native
  def `match`(integrity: IntegrityLike, opts: PickAlgorithm): Hash | `false` = js.native
  
  /**
    * Safely merges another IntegrityLike or integrity string into an Integrity object.
    */
  def merge(): Unit = js.native
  def merge(otherIntegrity: js.UndefOr[scala.Nothing], opts: Single): Unit = js.native
  def merge(otherIntegrity: String): Unit = js.native
  def merge(otherIntegrity: String, opts: Single): Unit = js.native
  def merge(otherIntegrity: HashLike): Unit = js.native
  def merge(otherIntegrity: HashLike, opts: Single): Unit = js.native
  def merge(otherIntegrity: IntegrityLike): Unit = js.native
  def merge(otherIntegrity: IntegrityLike, opts: Single): Unit = js.native
  
  def pickAlgorithm(): String = js.native
  def pickAlgorithm(opts: `0`): String = js.native
  
  def toJSON(): String = js.native
  
  def toString(opts: Sep): String = js.native
}
