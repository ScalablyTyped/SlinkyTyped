package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Push API interface provides a way to receive notifications from third-party servers as well as request URLs for push notifications. */
@js.native
trait PushManager extends StObject {
  
  def getSubscription(): js.Promise[org.scalajs.dom.experimental.push.PushSubscription | Null] = js.native
  
  def permissionState(): js.Promise[org.scalajs.dom.experimental.push.PushPermissionState] = js.native
  def permissionState(options: PushSubscriptionOptionsInit): js.Promise[org.scalajs.dom.experimental.push.PushPermissionState] = js.native
  
  def subscribe(): js.Promise[org.scalajs.dom.experimental.push.PushSubscription] = js.native
  def subscribe(options: PushSubscriptionOptionsInit): js.Promise[org.scalajs.dom.experimental.push.PushSubscription] = js.native
}
