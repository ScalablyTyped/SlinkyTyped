package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service. */
@js.native
trait PushSubscription extends js.Object {
  val endpoint: java.lang.String = js.native
  val expirationTime: Double | Null = js.native
  val options: org.scalajs.dom.experimental.push.PushSubscriptionOptions = js.native
  def getKey(name: org.scalajs.dom.experimental.push.PushEncryptionKeyName): js.typedarray.ArrayBuffer | Null = js.native
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
    def withEndpoint(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetKey(value: org.scalajs.dom.experimental.push.PushEncryptionKeyName => js.typedarray.ArrayBuffer | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: org.scalajs.dom.experimental.push.PushSubscriptionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => org.scalajs.dom.experimental.push.PushSubscriptionJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: () => js.Promise[scala.Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpirationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(null)
        ret
    }
  }
  
}

