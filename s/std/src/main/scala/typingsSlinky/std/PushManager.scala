package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Push API interface provides a way to receive notifications from third-party servers as well as request URLs for push notifications. */
@js.native
trait PushManager extends js.Object {
  def getSubscription(): js.Promise[org.scalajs.dom.experimental.push.PushSubscription | Null] = js.native
  def permissionState(): js.Promise[org.scalajs.dom.experimental.push.PushPermissionState] = js.native
  def permissionState(options: PushSubscriptionOptionsInit): js.Promise[org.scalajs.dom.experimental.push.PushPermissionState] = js.native
  def subscribe(): js.Promise[org.scalajs.dom.experimental.push.PushSubscription] = js.native
  def subscribe(options: PushSubscriptionOptionsInit): js.Promise[org.scalajs.dom.experimental.push.PushSubscription] = js.native
}

