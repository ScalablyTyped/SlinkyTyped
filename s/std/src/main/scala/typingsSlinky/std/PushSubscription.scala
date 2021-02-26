package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service. */
@js.native
trait PushSubscription extends StObject {
  
  val endpoint: java.lang.String = js.native
  
  val expirationTime: Double | Null = js.native
  
  def getKey(name: org.scalajs.dom.experimental.push.PushEncryptionKeyName): js.typedarray.ArrayBuffer | Null = js.native
  
  val options: org.scalajs.dom.experimental.push.PushSubscriptionOptions = js.native
  
  def toJSON(): org.scalajs.dom.experimental.push.PushSubscriptionJSON = js.native
  
  def unsubscribe(): js.Promise[scala.Boolean] = js.native
}
object PushSubscription {
  
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    getKey: org.scalajs.dom.experimental.push.PushEncryptionKeyName => js.typedarray.ArrayBuffer | Null,
    options: org.scalajs.dom.experimental.push.PushSubscriptionOptions,
    toJSON: () => org.scalajs.dom.experimental.push.PushSubscriptionJSON,
    unsubscribe: () => js.Promise[scala.Boolean]
  ): org.scalajs.dom.experimental.push.PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey), options = options.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[org.scalajs.dom.experimental.push.PushSubscription]
  }
  
  @scala.inline
  implicit class PushSubscriptionMutableBuilder[Self <: org.scalajs.dom.experimental.push.PushSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: java.lang.String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: Double): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    @scala.inline
    def setGetKey(value: org.scalajs.dom.experimental.push.PushEncryptionKeyName => js.typedarray.ArrayBuffer | Null): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: org.scalajs.dom.experimental.push.PushSubscriptionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => org.scalajs.dom.experimental.push.PushSubscriptionJSON): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnsubscribe(value: () => js.Promise[scala.Boolean]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
