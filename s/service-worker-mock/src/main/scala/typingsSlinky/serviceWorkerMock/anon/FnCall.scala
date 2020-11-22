package typingsSlinky.serviceWorkerMock.anon

import org.scalajs.dom.experimental.Notification
import org.scalajs.dom.experimental.Request
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.fetch
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.message
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.notificationclick
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.notificationclose
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.push
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(name: fetch, request: String): js.Promise[Unit] = js.native
  def apply(name: fetch, request: Request): js.Promise[Unit] = js.native
  def apply(name: message, args: PartialMessageEventany): js.Promise[Unit] = js.native
  def apply(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
  def apply(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
  def apply(
    name: push,
    args: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
    ]
  ): js.Promise[Unit] = js.native
  def apply(
    `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
  ): js.Promise[Unit] = js.native
}
