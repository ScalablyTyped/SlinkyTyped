package typingsSlinky.sipJs.apiMod

import typingsSlinky.sipJs.infoerOptionsMod.InfoerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Infoer")
@js.native
class Infoer protected ()
  extends typingsSlinky.sipJs.infoerMod.Infoer {
  /**
    * Constructs a new instance of the `Infoer` class.
    * @param session - The session the INFO will be sent from. See {@link Session} for details.
    * @param options - An options bucket.
    */
  def this(session: typingsSlinky.sipJs.sessionMod.Session) = this()
  def this(session: typingsSlinky.sipJs.sessionMod.Session, options: InfoerOptions) = this()
}

