package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventHandlersEventMap extends js.Object {
  var afterprint: org.scalajs.dom.raw.Event
  var beforeprint: org.scalajs.dom.raw.Event
  var beforeunload: org.scalajs.dom.raw.BeforeUnloadEvent
  var hashchange: org.scalajs.dom.raw.HashChangeEvent
  var languagechange: org.scalajs.dom.raw.Event
  var message: org.scalajs.dom.raw.MessageEvent
  var messageerror: org.scalajs.dom.raw.MessageEvent
  var offline: org.scalajs.dom.raw.Event
  var online: org.scalajs.dom.raw.Event
  var pagehide: PageTransitionEvent
  var pageshow: PageTransitionEvent
  var popstate: org.scalajs.dom.raw.PopStateEvent
  var rejectionhandled: PromiseRejectionEvent
  var storage: org.scalajs.dom.raw.StorageEvent
  var unhandledrejection: PromiseRejectionEvent
  var unload: org.scalajs.dom.raw.Event
}

object WindowEventHandlersEventMap {
  @scala.inline
  def apply(
    afterprint: org.scalajs.dom.raw.Event,
    beforeprint: org.scalajs.dom.raw.Event,
    beforeunload: org.scalajs.dom.raw.BeforeUnloadEvent,
    hashchange: org.scalajs.dom.raw.HashChangeEvent,
    languagechange: org.scalajs.dom.raw.Event,
    message: org.scalajs.dom.raw.MessageEvent,
    messageerror: org.scalajs.dom.raw.MessageEvent,
    offline: org.scalajs.dom.raw.Event,
    online: org.scalajs.dom.raw.Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    popstate: org.scalajs.dom.raw.PopStateEvent,
    rejectionhandled: PromiseRejectionEvent,
    storage: org.scalajs.dom.raw.StorageEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: org.scalajs.dom.raw.Event
  ): WindowEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(afterprint = afterprint.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
}

