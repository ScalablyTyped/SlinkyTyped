package typingsSlinky.sipJs.mod

import typingsSlinky.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers
import typingsSlinky.sipJs.libSessionMod.InviteClientContext.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "InviteClientContext")
@js.native
class InviteClientContext protected ()
  extends typingsSlinky.sipJs.libSessionMod.InviteClientContext {
  def this(ua: typingsSlinky.sipJs.uAMod.UA, target: String) = this()
  def this(ua: typingsSlinky.sipJs.uAMod.UA, target: typingsSlinky.sipJs.coreMod.URI) = this()
  def this(ua: typingsSlinky.sipJs.uAMod.UA, target: String, options: Options) = this()
  def this(ua: typingsSlinky.sipJs.uAMod.UA, target: typingsSlinky.sipJs.coreMod.URI, options: Options) = this()
  def this(
    ua: typingsSlinky.sipJs.uAMod.UA,
    target: String,
    options: Options,
    modifiers: SessionDescriptionHandlerModifiers
  ) = this()
  def this(
    ua: typingsSlinky.sipJs.uAMod.UA,
    target: typingsSlinky.sipJs.coreMod.URI,
    options: Options,
    modifiers: SessionDescriptionHandlerModifiers
  ) = this()
}

