package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
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

@JSGlobal("PushSubscription")
@js.native
object PushSubscription
  extends Instantiable0[org.scalajs.dom.experimental.push.PushSubscription]

