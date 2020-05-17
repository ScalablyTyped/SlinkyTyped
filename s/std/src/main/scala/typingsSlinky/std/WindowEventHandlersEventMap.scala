package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEventHandlersEventMap extends js.Object {
  var afterprint: org.scalajs.dom.raw.Event = js.native
  var beforeprint: org.scalajs.dom.raw.Event = js.native
  var beforeunload: org.scalajs.dom.raw.BeforeUnloadEvent = js.native
  var hashchange: org.scalajs.dom.raw.HashChangeEvent = js.native
  var languagechange: org.scalajs.dom.raw.Event = js.native
  var message: org.scalajs.dom.raw.MessageEvent = js.native
  var messageerror: org.scalajs.dom.raw.MessageEvent = js.native
  var offline: org.scalajs.dom.raw.Event = js.native
  var online: org.scalajs.dom.raw.Event = js.native
  var pagehide: PageTransitionEvent = js.native
  var pageshow: PageTransitionEvent = js.native
  var popstate: org.scalajs.dom.raw.PopStateEvent = js.native
  var rejectionhandled: PromiseRejectionEvent = js.native
  var storage: org.scalajs.dom.raw.StorageEvent = js.native
  var unhandledrejection: PromiseRejectionEvent = js.native
  var unload: org.scalajs.dom.raw.Event = js.native
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
    def withAfterprint(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeprint(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeunload(value: org.scalajs.dom.raw.BeforeUnloadEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeunload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashchange(value: org.scalajs.dom.raw.HashChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguagechange(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languagechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: org.scalajs.dom.raw.MessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageerror(value: org.scalajs.dom.raw.MessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffline(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnline(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("online")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagehide(value: PageTransitionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagehide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageshow(value: PageTransitionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageshow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopstate(value: org.scalajs.dom.raw.PopStateEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popstate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectionhandled(value: PromiseRejectionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionhandled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorage(value: org.scalajs.dom.raw.StorageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhandledrejection(value: PromiseRejectionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhandledrejection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnload(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

