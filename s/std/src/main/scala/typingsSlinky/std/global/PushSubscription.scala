package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.experimental.push.PushEncryptionKeyName
import org.scalajs.dom.experimental.push.PushSubscriptionJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PushSubscription")
@js.native
class PushSubscription ()
  extends typingsSlinky.std.PushSubscription {
  /* CompleteClass */
  override val endpoint: java.lang.String = js.native
  /* CompleteClass */
  override val expirationTime: Double | Null = js.native
  /* CompleteClass */
  override val options: org.scalajs.dom.experimental.push.PushSubscriptionOptions = js.native
  /* CompleteClass */
  override def getKey(name: PushEncryptionKeyName): js.typedarray.ArrayBuffer | Null = js.native
  /* CompleteClass */
  override def toJSON(): PushSubscriptionJSON = js.native
  /* CompleteClass */
  override def unsubscribe(): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("PushSubscription")
@js.native
object PushSubscription
  extends Instantiable0[org.scalajs.dom.experimental.push.PushSubscription]

