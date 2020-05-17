package typingsSlinky.ssri.mod

import typingsSlinky.ssri.anon.Options
import typingsSlinky.ssri.anon.OptionsSingle
import typingsSlinky.ssri.anon.OptionsSingleStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "fromHex")
@js.native
object fromHex extends js.Object {
  def apply(hexDigest: String, algorithm: String): Hash = js.native
  def apply(hexDigest: String, algorithm: String, opts: Options): IntegrityMap = js.native
  def apply(hexDigest: String, algorithm: String, opts: OptionsSingle): Hash = js.native
  def apply(hexDigest: String, algorithm: String, opts: OptionsSingleStrict): IntegrityMap | Hash = js.native
}

