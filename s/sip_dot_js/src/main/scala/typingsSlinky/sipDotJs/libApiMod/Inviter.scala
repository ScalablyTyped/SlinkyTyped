package typingsSlinky.sipDotJs.libApiMod

import typingsSlinky.sipDotJs.libApiInviterDashOptionsMod.InviterOptions
import typingsSlinky.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Inviter")
@js.native
class Inviter protected ()
  extends typingsSlinky.sipDotJs.libApiInviterMod.Inviter {
  /**
    * Constructs a new instance of the `Inviter` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param options - Options bucket. See {@link InviterOptions} for details.
    */
  def this(userAgent: typingsSlinky.sipDotJs.libApiUserDashAgentMod.UserAgent, targetURI: URI) = this()
  def this(
    userAgent: typingsSlinky.sipDotJs.libApiUserDashAgentMod.UserAgent,
    targetURI: URI,
    options: InviterOptions
  ) = this()
}

