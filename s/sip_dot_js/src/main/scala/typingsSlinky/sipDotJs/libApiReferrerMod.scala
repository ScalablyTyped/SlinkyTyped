package typingsSlinky.sipDotJs

import typingsSlinky.sipDotJs.libApiReferrerDashDelegateMod.ReferrerDelegate
import typingsSlinky.sipDotJs.libApiReferrerDashOptionsMod.ReferrerOptions
import typingsSlinky.sipDotJs.libApiReferrerDashReferDashOptionsMod.ReferrerReferOptions
import typingsSlinky.sipDotJs.libApiSessionMod.Session
import typingsSlinky.sipDotJs.libCoreMessagesMethodsReferMod.OutgoingReferRequest
import typingsSlinky.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/referrer", JSImport.Namespace)
@js.native
object libApiReferrerMod extends js.Object {
  @js.native
  class Referrer protected () extends js.Object {
    def this(session: Session, referTo: Session) = this()
    /**
      * Constructs a new instance of the `Referrer` class.
      * @param session - The session the REFER will be sent from. See {@link Session} for details.
      * @param referTo - The referral target. If a `Session`, a REFER w/Replaces is sent.
      * @param options - An options bucket. See {@link ReferrerOptions} for details.
      */
    def this(session: Session, referTo: URI) = this()
    def this(session: Session, referTo: Session, options: ReferrerOptions) = this()
    def this(session: Session, referTo: URI, options: ReferrerOptions) = this()
    /** The referTo. */
    var _referTo: js.Any = js.native
    /** The referrer session. */
    var _session: js.Any = js.native
    /** The referrer delegate. */
    var delegate: js.UndefOr[ReferrerDelegate] = js.native
    var extraHeaders: js.Any = js.native
    /** The logger. */
    var logger: js.Any = js.native
    var referToString: js.Any = js.native
    /** The referrer session. */
    val session: Session = js.native
    /**
      * Sends the REFER request.
      * @param options - An options bucket.
      */
    def refer(): js.Promise[OutgoingReferRequest] = js.native
    def refer(options: ReferrerReferOptions): js.Promise[OutgoingReferRequest] = js.native
  }
  
}

