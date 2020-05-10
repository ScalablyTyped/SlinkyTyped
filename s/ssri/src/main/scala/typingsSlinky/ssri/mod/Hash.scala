package typingsSlinky.ssri.mod

import typingsSlinky.ssri.AnonStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "Hash")
@js.native
class Hash protected () extends HashLike {
  def this(hash: String) = this()
  def this(hash: String, opts: AnonStrict) = this()
  var isHash: Boolean = js.native
  var source: String = js.native
  def hexDigest(): String = js.native
  def toJSON(): String = js.native
  def toString(opts: AnonStrict): String = js.native
}

