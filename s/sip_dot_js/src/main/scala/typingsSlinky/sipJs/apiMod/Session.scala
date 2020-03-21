package typingsSlinky.sipJs.apiMod

import typingsSlinky.sipJs.sessionOptionsMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Session")
@js.native
abstract class Session protected ()
  extends typingsSlinky.sipJs.sessionMod.Session {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent) = this()
  protected def this(userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent, options: SessionOptions) = this()
}

