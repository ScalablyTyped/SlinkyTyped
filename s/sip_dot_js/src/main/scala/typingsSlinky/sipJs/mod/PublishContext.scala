package typingsSlinky.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "PublishContext")
@js.native
class PublishContext protected ()
  extends typingsSlinky.sipJs.publishContextMod.PublishContext {
  def this(ua: typingsSlinky.sipJs.uAMod.UA, target: String, event: String) = this()
  def this(ua: typingsSlinky.sipJs.uAMod.UA, target: typingsSlinky.sipJs.coreMod.URI, event: String) = this()
  def this(ua: typingsSlinky.sipJs.uAMod.UA, target: String, event: String, options: js.Any) = this()
  def this(
    ua: typingsSlinky.sipJs.uAMod.UA,
    target: typingsSlinky.sipJs.coreMod.URI,
    event: String,
    options: js.Any
  ) = this()
}

