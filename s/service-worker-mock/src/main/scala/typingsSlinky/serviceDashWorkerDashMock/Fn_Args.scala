package typingsSlinky.serviceDashWorkerDashMock

import typingsSlinky.serviceDashWorkerDashMock.serviceDashWorkerDashMockStrings.fetch
import typingsSlinky.serviceDashWorkerDashMock.serviceDashWorkerDashMockStrings.message
import typingsSlinky.serviceDashWorkerDashMock.serviceDashWorkerDashMockStrings.notificationclick
import typingsSlinky.serviceDashWorkerDashMock.serviceDashWorkerDashMockStrings.notificationclose
import typingsSlinky.serviceDashWorkerDashMock.serviceDashWorkerDashMockStrings.push
import typingsSlinky.std.MessageEvent
import typingsSlinky.std.Notification
import typingsSlinky.std.Partial
import typingsSlinky.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Args extends js.Object {
  def apply(name: fetch, request: String): js.Promise[Unit] = js.native
  def apply(name: fetch, request: Request): js.Promise[Unit] = js.native
  def apply(name: message, args: Partial[MessageEvent]): js.Promise[Unit] = js.native
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

