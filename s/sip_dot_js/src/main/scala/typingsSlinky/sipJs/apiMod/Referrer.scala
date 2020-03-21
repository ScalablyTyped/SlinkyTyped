package typingsSlinky.sipJs.apiMod

import typingsSlinky.sipJs.coreMod.URI
import typingsSlinky.sipJs.referrerOptionsMod.ReferrerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Referrer")
@js.native
class Referrer protected ()
  extends typingsSlinky.sipJs.referrerMod.Referrer {
  /**
    * Constructs a new instance of the `Referrer` class.
    * @param session - The session the REFER will be sent from. See {@link Session} for details.
    * @param referTo - The referral target. If a `Session`, a REFER w/Replaces is sent.
    * @param options - An options bucket. See {@link ReferrerOptions} for details.
    */
  def this(session: typingsSlinky.sipJs.sessionMod.Session, referTo: URI) = this()
  def this(session: typingsSlinky.sipJs.sessionMod.Session, referTo: typingsSlinky.sipJs.sessionMod.Session) = this()
  def this(session: typingsSlinky.sipJs.sessionMod.Session, referTo: URI, options: ReferrerOptions) = this()
  def this(
    session: typingsSlinky.sipJs.sessionMod.Session,
    referTo: typingsSlinky.sipJs.sessionMod.Session,
    options: ReferrerOptions
  ) = this()
}

