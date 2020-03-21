package typingsSlinky.sipJs.apiMod

import typingsSlinky.sipJs.referMod.IncomingReferRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Referral")
@js.native
class Referral protected ()
  extends typingsSlinky.sipJs.referralMod.Referral {
  /** @internal */
  def this(incomingReferRequest: IncomingReferRequest, session: typingsSlinky.sipJs.sessionMod.Session) = this()
}

