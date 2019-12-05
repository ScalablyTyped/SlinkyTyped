package typingsSlinky.sipDotJs.sipDotJsMod

import typingsSlinky.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
import typingsSlinky.sipDotJs.libSessionMod.InviteClientContext.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "InviteClientContext")
@js.native
class InviteClientContext protected ()
  extends typingsSlinky.sipDotJs.libSessionMod.InviteClientContext {
  def this(ua: typingsSlinky.sipDotJs.libUAMod.UA, target: String) = this()
  def this(ua: typingsSlinky.sipDotJs.libUAMod.UA, target: typingsSlinky.sipDotJs.libCoreMod.URI) = this()
  def this(ua: typingsSlinky.sipDotJs.libUAMod.UA, target: String, options: Options) = this()
  def this(
    ua: typingsSlinky.sipDotJs.libUAMod.UA,
    target: typingsSlinky.sipDotJs.libCoreMod.URI,
    options: Options
  ) = this()
  def this(
    ua: typingsSlinky.sipDotJs.libUAMod.UA,
    target: String,
    options: Options,
    modifiers: SessionDescriptionHandlerModifiers
  ) = this()
  def this(
    ua: typingsSlinky.sipDotJs.libUAMod.UA,
    target: typingsSlinky.sipDotJs.libCoreMod.URI,
    options: Options,
    modifiers: SessionDescriptionHandlerModifiers
  ) = this()
}

