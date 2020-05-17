package typingsSlinky.webPush.mod

import typingsSlinky.node.Buffer
import typingsSlinky.webPush.anon.RequestDetailsbodynull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", "generateRequestDetails")
@js.native
object generateRequestDetails extends js.Object {
  def apply(subscription: PushSubscription): RequestDetails = js.native
  def apply(subscription: PushSubscription, payload: String): RequestDetails = js.native
  def apply(subscription: PushSubscription, payload: String, options: RequestOptions): RequestDetails = js.native
  def apply(subscription: PushSubscription, payload: Null, options: RequestOptions): RequestDetailsbodynull = js.native
  def apply(subscription: PushSubscription, payload: Buffer): RequestDetails = js.native
  def apply(subscription: PushSubscription, payload: Buffer, options: RequestOptions): RequestDetails = js.native
}

