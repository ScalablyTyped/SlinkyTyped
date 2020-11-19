package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service. */
@js.native
trait PushSubscription extends js.Object {
  
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
  ): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey), options = options.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[PushSubscription]
  }
  
  @scala.inline
  implicit class PushSubscriptionOps[Self <: org.scalajs.dom.experimental.push.PushSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpoint(value: java.lang.String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetKey(value: org.scalajs.dom.experimental.push.PushEncryptionKeyName => js.typedarray.ArrayBuffer | Null): Self = this.set("getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: org.scalajs.dom.experimental.push.PushSubscriptionOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => org.scalajs.dom.experimental.push.PushSubscriptionJSON): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnsubscribe(value: () => js.Promise[scala.Boolean]): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpirationTime(value: Double): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeNull: Self = this.set("expirationTime", null)
  }
}
