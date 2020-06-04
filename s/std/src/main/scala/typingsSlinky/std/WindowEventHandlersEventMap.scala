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
  @scala.inline
  implicit class WindowEventHandlersEventMapOps[Self <: WindowEventHandlersEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterprint(value: org.scalajs.dom.raw.Event): Self = this.set("afterprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeprint(value: org.scalajs.dom.raw.Event): Self = this.set("beforeprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeunload(value: org.scalajs.dom.raw.BeforeUnloadEvent): Self = this.set("beforeunload", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashchange(value: org.scalajs.dom.raw.HashChangeEvent): Self = this.set("hashchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguagechange(value: org.scalajs.dom.raw.Event): Self = this.set("languagechange", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: org.scalajs.dom.raw.MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageerror(value: org.scalajs.dom.raw.MessageEvent): Self = this.set("messageerror", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffline(value: org.scalajs.dom.raw.Event): Self = this.set("offline", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnline(value: org.scalajs.dom.raw.Event): Self = this.set("online", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagehide(value: PageTransitionEvent): Self = this.set("pagehide", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageshow(value: PageTransitionEvent): Self = this.set("pageshow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopstate(value: org.scalajs.dom.raw.PopStateEvent): Self = this.set("popstate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejectionhandled(value: PromiseRejectionEvent): Self = this.set("rejectionhandled", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorage(value: org.scalajs.dom.raw.StorageEvent): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnhandledrejection(value: PromiseRejectionEvent): Self = this.set("unhandledrejection", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnload(value: org.scalajs.dom.raw.Event): Self = this.set("unload", value.asInstanceOf[js.Any])
  }
  
}

