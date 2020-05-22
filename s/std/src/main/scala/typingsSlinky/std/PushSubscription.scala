package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service. */
trait PushSubscription extends js.Object {
  val endpoint: java.lang.String
  val expirationTime: Double | Null
  val options: org.scalajs.dom.experimental.push.PushSubscriptionOptions
  def getKey(name: org.scalajs.dom.experimental.push.PushEncryptionKeyName): js.typedarray.ArrayBuffer | Null
  def toJSON(): org.scalajs.dom.experimental.push.PushSubscriptionJSON
  def unsubscribe(): js.Promise[scala.Boolean]
}

object PushSubscription {
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    getKey: org.scalajs.dom.experimental.push.PushEncryptionKeyName => js.typedarray.ArrayBuffer | Null,
    options: org.scalajs.dom.experimental.push.PushSubscriptionOptions,
    toJSON: () => org.scalajs.dom.experimental.push.PushSubscriptionJSON,
    unsubscribe: () => js.Promise[scala.Boolean],
    expirationTime: Double = null.asInstanceOf[Double]
  ): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey), options = options.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unsubscribe = js.Any.fromFunction0(unsubscribe), expirationTime = expirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSubscription]
  }
}

