package typingsSlinky.sipJs.mod

import typingsSlinky.sipJs.inviterOptionsMod.InviterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Inviter")
@js.native
class Inviter protected ()
  extends typingsSlinky.sipJs.apiMod.Inviter {
  /**
    * Constructs a new instance of the `Inviter` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param options - Options bucket. See {@link InviterOptions} for details.
    */
  def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, targetURI: typingsSlinky.sipJs.coreMod.URI) = this()
  def this(
    userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
    targetURI: typingsSlinky.sipJs.coreMod.URI,
    options: InviterOptions
  ) = this()
}

