package typingsSlinky.serviceWorkerMock.mod

import org.scalajs.dom.experimental.Notification
import org.scalajs.dom.experimental.Request
import typingsSlinky.serviceWorkerMock.anon.FnCall
import typingsSlinky.serviceWorkerMock.anon.PartialMessageEvent
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.fetch
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.message
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.notificationclick
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.notificationclose
import typingsSlinky.serviceWorkerMock.serviceWorkerMockStrings.push
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * A key/value map of active listeners (`install`/`activate`/`fetch`/etc).
    */
  val listeners: Listeners = js.native
  
  /**
    * Used to generate a snapshot of the service worker internals.
    */
  def snapshot(): Snapshot = js.native
  
  /**
    * Used to trigger active listeners.
    */
  def trigger(
    `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
  ): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_fetch(name: fetch, request: String): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_fetch(name: fetch, request: Request): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_message(name: message, args: PartialMessageEvent): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_notificationclick(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_notificationclose(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_push(
    name: push,
    args: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
    ]
  ): js.Promise[Unit] = js.native
  
  @js.native
  trait WorkerGlobalScope extends js.Object {
    
    var listeners: Listeners = js.native
    
    def snapshot(): Snapshot = js.native
    @JSName("snapshot")
    var snapshot_Original: js.Function0[Snapshot] = js.native
    
    def trigger(
      `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
    ): js.Promise[Unit] = js.native
    @JSName("trigger")
    var trigger_Original: FnCall = js.native
    @JSName("trigger")
    def trigger_fetch(name: fetch, request: String): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_fetch(name: fetch, request: Request): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_message(name: message, args: PartialMessageEvent): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_notificationclick(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_notificationclose(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_push(
      name: push,
      args: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
        ]
    ): js.Promise[Unit] = js.native
  }
}
