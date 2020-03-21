package typingsSlinky.serviceWorkerMock

import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.fetch
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.message
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.notificationclick
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.notificationclose
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.push
import typingsSlinky.std.Notification
import typingsSlinky.std.Partial
import typingsSlinky.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(name: fetch, request: String): js.Promise[Unit] = js.native
  def apply(name: fetch, request: Request): js.Promise[Unit] = js.native
  def apply(name: message, args: PartialMessageEvent): js.Promise[Unit] = js.native
  def apply(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
  def apply(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
  def apply(
    name: push,
    args: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
    ]
  ): js.Promise[Unit] = js.native
  def apply(`type`: String): js.Promise[Unit] = js.native
}

