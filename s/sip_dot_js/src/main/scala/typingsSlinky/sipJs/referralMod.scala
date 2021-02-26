package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreMod.IncomingRequestMessage
import typingsSlinky.sipJs.coreMod.NameAddrHeader
import typingsSlinky.sipJs.inviterMod.Inviter
import typingsSlinky.sipJs.inviterOptionsMod.InviterOptions
import typingsSlinky.sipJs.outgoingResponseMod.ResponseOptions
import typingsSlinky.sipJs.referMod.IncomingReferRequest
import typingsSlinky.sipJs.sessionMod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referralMod {
  
  @JSImport("sip.js/lib/api/referral", "Referral")
  @js.native
  class Referral protected () extends StObject {
    /** @internal */
    def this(incomingReferRequest: IncomingReferRequest, session: Session) = this()
    
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    
    var incomingReferRequest: js.Any = js.native
    
    var inviter: js.Any = js.native
    
    /**
      * Creates an inviter which may be used to send an out of dialog INVITE request.
      *
      * @remarks
      * This a helper method to create an Inviter which will execute the referral
      * of the `Session` which was referred. The appropriate headers are set and
      * the referred `Session` is linked to the new `Session`. Note that only a
      * single instance of the `Inviter` will be created and returned (if called
      * more than once a reference to the same `Inviter` will be returned every time).
      *
      * @param options - Options bucket.
      * @param modifiers - Session description handler modifiers.
      */
    def makeInviter(): Inviter = js.native
    def makeInviter(options: InviterOptions): Inviter = js.native
    
    def referTo: NameAddrHeader = js.native
    
    def referredBy: js.UndefOr[String] = js.native
    
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    
    def replaces: js.UndefOr[String] = js.native
    
    /** Incoming REFER request message. */
    def request: IncomingRequestMessage = js.native
    
    var session: js.Any = js.native
  }
}
