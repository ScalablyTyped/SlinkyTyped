package typingsSlinky.ssri.mod

import typingsSlinky.ssri.anon.Single
import typingsSlinky.ssri.anon.SingleBoolean
import typingsSlinky.ssri.anon.SingleStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "parse")
@js.native
object parse extends js.Object {
  def apply(sri: String): Hash = js.native
  def apply(sri: String, opts: Single): IntegrityMap = js.native
  def apply(sri: String, opts: SingleBoolean): IntegrityMap | Hash = js.native
  def apply(sri: String, opts: SingleStrict): Hash = js.native
  def apply(sri: HashLike): Hash = js.native
  def apply(sri: HashLike, opts: Single): IntegrityMap = js.native
  def apply(sri: HashLike, opts: SingleBoolean): IntegrityMap | Hash = js.native
  def apply(sri: HashLike, opts: SingleStrict): Hash = js.native
  def apply(sri: IntegrityLike): Hash = js.native
  def apply(sri: IntegrityLike, opts: Single): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: SingleBoolean): IntegrityMap | Hash = js.native
  def apply(sri: IntegrityLike, opts: SingleStrict): Hash = js.native
}

