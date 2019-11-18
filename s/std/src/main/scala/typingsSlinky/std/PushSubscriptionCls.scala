package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PushSubscription")
@js.native
class PushSubscriptionCls () extends PushSubscription {
  /* CompleteClass */
  override val endpoint: java.lang.String = js.native
  /* CompleteClass */
  override val expirationTime: Double | Null = js.native
  /* CompleteClass */
  override val options: org.scalajs.dom.experimental.push.PushSubscriptionOptions = js.native
  /* CompleteClass */
  override def getKey(name: org.scalajs.dom.experimental.push.PushEncryptionKeyName): scala.scalajs.js.typedarray.ArrayBuffer | Null = js.native
  /* CompleteClass */
  override def toJSON(): org.scalajs.dom.experimental.push.PushSubscriptionJSON = js.native
  /* CompleteClass */
  override def unsubscribe(): js.Promise[scala.Boolean] = js.native
}

