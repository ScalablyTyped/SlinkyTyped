package typingsSlinky.sipJs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import typingsSlinky.sipJs.subscribeMod.OutgoingSubscribeRequest
import typingsSlinky.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import typingsSlinky.sipJs.subscriptionSubscriptionDelegateMod.SubscriptionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/subscription/subscription", JSImport.Namespace)
@js.native
object subscriptionSubscriptionMod extends js.Object {
  
  @js.native
  trait Subscription extends js.Object {
    
    /** If true, refresh subscription prior to expiration. Default is false. */
    var autoRefresh: Boolean = js.native
    
    /** Subscription delegate. */
    var delegate: js.UndefOr[SubscriptionDelegate] = js.native
    
    /**
      * Destroy subscription.
      */
    def dispose(): Unit = js.native
    
    /** The subscription id. */
    val id: String = js.native
    
    /**
      * 4.1.2.2.  Refreshing of Subscriptions
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
      */
    def refresh(): OutgoingSubscribeRequest = js.native
    
    /**
      * Send re-SUBSCRIBE request.
      * Refreshing a subscription and unsubscribing.
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.2
      * @param delegate - Request delegate.
      * @param options - Options bucket
      */
    def subscribe(): OutgoingSubscribeRequest = js.native
    def subscribe(delegate: js.UndefOr[scala.Nothing], options: RequestOptions): OutgoingSubscribeRequest = js.native
    def subscribe(delegate: OutgoingSubscribeRequestDelegate): OutgoingSubscribeRequest = js.native
    def subscribe(delegate: OutgoingSubscribeRequestDelegate, options: RequestOptions): OutgoingSubscribeRequest = js.native
    
    /** Subscription expires. Number of seconds until the subscription expires. */
    val subscriptionExpires: Double = js.native
    
    /** Subscription state. */
    val subscriptionState: SubscriptionState = js.native
    
    /**
      * 4.1.2.3.  Unsubscribing
      * https://tools.ietf.org/html/rfc6665#section-4.1.2.3
      */
    def unsubscribe(): OutgoingSubscribeRequest = js.native
  }
  
  @js.native
  sealed trait SubscriptionState extends js.Object
  @js.native
  object SubscriptionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SubscriptionState with String] = js.native
    
    @js.native
    sealed trait Active extends SubscriptionState
    /* "Active" */ @js.native
    object Active extends TopLevel[Active with String]
    
    @js.native
    sealed trait Initial extends SubscriptionState
    /* "Initial" */ @js.native
    object Initial extends TopLevel[Initial with String]
    
    @js.native
    sealed trait NotifyWait extends SubscriptionState
    /* "NotifyWait" */ @js.native
    object NotifyWait extends TopLevel[NotifyWait with String]
    
    @js.native
    sealed trait Pending extends SubscriptionState
    /* "Pending" */ @js.native
    object Pending extends TopLevel[Pending with String]
    
    @js.native
    sealed trait Terminated extends SubscriptionState
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
  }
}
