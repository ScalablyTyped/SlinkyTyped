package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreMod.IncomingResponseMessage
import typingsSlinky.sipJs.coreMod.URI
import typingsSlinky.sipJs.emitterMod.Emitter
import typingsSlinky.sipJs.publishMod.OutgoingPublishRequest
import typingsSlinky.sipJs.publisherOptionsMod.PublisherOptions
import typingsSlinky.sipJs.publisherPublishOptionsMod.PublisherPublishOptions
import typingsSlinky.sipJs.publisherStateMod.PublisherState
import typingsSlinky.sipJs.publisherUnpublishOptionsMod.PublisherUnpublishOptions
import typingsSlinky.sipJs.userAgentMod.UserAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publisherMod {
  
  @JSImport("sip.js/lib/api/publisher", "Publisher")
  @js.native
  class Publisher protected () extends StObject {
    /**
      * Constructs a new instance of the `Publisher` class.
      *
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param eventType - The event type identifying the published document.
      * @param options - Options bucket. See {@link PublisherOptions} for details.
      */
    def this(userAgent: UserAgent, targetURI: URI, eventType: String) = this()
    def this(userAgent: UserAgent, targetURI: URI, eventType: String, options: PublisherOptions) = this()
    
    /** The publication state. */
    var _state: js.Any = js.native
    
    /** Emits when the registration state changes. */
    var _stateEventEmitter: js.Any = js.native
    
    /**
      * Destructor.
      */
    def dispose(): js.Promise[Unit] = js.native
    
    var disposed: js.Any = js.native
    
    var event: js.Any = js.native
    
    var id: js.Any = js.native
    
    var logger: js.Any = js.native
    
    var options: js.Any = js.native
    
    var pubRequestBody: js.Any = js.native
    
    var pubRequestEtag: js.Any = js.native
    
    var pubRequestExpires: js.Any = js.native
    
    /**
      * Publish.
      * @param content - Body to publish
      */
    def publish(content: String): js.Promise[Unit] = js.native
    def publish(content: String, options: PublisherPublishOptions): js.Promise[Unit] = js.native
    
    var publishRefreshTimer: js.Any = js.native
    
    /** @internal */
    /* protected */ def receiveResponse(response: IncomingResponseMessage): Unit = js.native
    
    var refreshRequest: js.Any = js.native
    
    var request: js.Any = js.native
    
    /** @internal */
    /* protected */ def send(): OutgoingPublishRequest = js.native
    
    var sendPublishRequest: js.Any = js.native
    
    /** The publication state. */
    def state: PublisherState = js.native
    
    /** Emits when the publisher state changes. */
    def stateChange: Emitter[PublisherState] = js.native
    
    /**
      * Transition publication state.
      */
    var stateTransition: js.Any = js.native
    
    var target: js.Any = js.native
    
    /**
      * Unpublish.
      */
    def unpublish(): js.Promise[Unit] = js.native
    def unpublish(options: PublisherUnpublishOptions): js.Promise[Unit] = js.native
    
    var userAgent: js.Any = js.native
  }
}
