package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service. */
trait PushSubscription extends js.Object {
  val endpoint: java.lang.String
  val expirationTime: Double | Null
  val options: org.scalajs.dom.experimental.push.PushSubscriptionOptions
  def getKey(name: org.scalajs.dom.experimental.push.PushEncryptionKeyName): scala.scalajs.js.typedarray.ArrayBuffer | Null
  def toJSON(): org.scalajs.dom.experimental.push.PushSubscriptionJSON
  def unsubscribe(): js.Promise[scala.Boolean]
}

@JSGlobal("PushSubscription")
@js.native
object PushSubscription extends Instantiable0[PushSubscription]

