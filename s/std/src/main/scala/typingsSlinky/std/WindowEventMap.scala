package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventMap
  extends GlobalEventHandlersEventMap
     with WindowEventHandlersEventMap {
  var MSGestureChange: org.scalajs.dom.raw.Event
  var MSGestureDoubleTap: org.scalajs.dom.raw.Event
  var MSGestureEnd: org.scalajs.dom.raw.Event
  var MSGestureHold: org.scalajs.dom.raw.Event
  var MSGestureStart: org.scalajs.dom.raw.Event
  var MSGestureTap: org.scalajs.dom.raw.Event
  var MSInertiaStart: org.scalajs.dom.raw.Event
  var MSPointerCancel: org.scalajs.dom.raw.Event
  var MSPointerDown: org.scalajs.dom.raw.Event
  var MSPointerEnter: org.scalajs.dom.raw.Event
  var MSPointerLeave: org.scalajs.dom.raw.Event
  var MSPointerMove: org.scalajs.dom.raw.Event
  var MSPointerOut: org.scalajs.dom.raw.Event
  var MSPointerOver: org.scalajs.dom.raw.Event
  var MSPointerUp: org.scalajs.dom.raw.Event
  var compassneedscalibration: org.scalajs.dom.raw.Event
  var devicelight: DeviceLightEvent
  var devicemotion: org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
  var deviceorientation: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
  var deviceorientationabsolute: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
  var mousewheel: org.scalajs.dom.raw.Event
  var orientationchange: org.scalajs.dom.raw.Event
  @JSName("progress")
  var progress_WindowEventMap: org.scalajs.dom.raw.ProgressEvent
  var readystatechange: org.scalajs.dom.raw.ProgressEvent
  var vrdisplayactivate: org.scalajs.dom.raw.Event
  var vrdisplayblur: org.scalajs.dom.raw.Event
  var vrdisplayconnect: org.scalajs.dom.raw.Event
  var vrdisplaydeactivate: org.scalajs.dom.raw.Event
  var vrdisplaydisconnect: org.scalajs.dom.raw.Event
  var vrdisplayfocus: org.scalajs.dom.raw.Event
  var vrdisplaypointerrestricted: org.scalajs.dom.raw.Event
  var vrdisplaypointerunrestricted: org.scalajs.dom.raw.Event
  var vrdisplaypresentchange: org.scalajs.dom.raw.Event
}

object WindowEventMap {
  @scala.inline
  def apply(
    MSGestureChange: org.scalajs.dom.raw.Event,
    MSGestureDoubleTap: org.scalajs.dom.raw.Event,
    MSGestureEnd: org.scalajs.dom.raw.Event,
    MSGestureHold: org.scalajs.dom.raw.Event,
    MSGestureStart: org.scalajs.dom.raw.Event,
    MSGestureTap: org.scalajs.dom.raw.Event,
    MSInertiaStart: org.scalajs.dom.raw.Event,
    MSPointerCancel: org.scalajs.dom.raw.Event,
    MSPointerDown: org.scalajs.dom.raw.Event,
    MSPointerEnter: org.scalajs.dom.raw.Event,
    MSPointerLeave: org.scalajs.dom.raw.Event,
    MSPointerMove: org.scalajs.dom.raw.Event,
    MSPointerOut: org.scalajs.dom.raw.Event,
    MSPointerOver: org.scalajs.dom.raw.Event,
    MSPointerUp: org.scalajs.dom.raw.Event,
    abort: org.scalajs.dom.raw.UIEvent,
    afterprint: org.scalajs.dom.raw.Event,
    animationcancel: org.scalajs.dom.raw.AnimationEvent,
    animationend: org.scalajs.dom.raw.AnimationEvent,
    animationiteration: org.scalajs.dom.raw.AnimationEvent,
    animationstart: org.scalajs.dom.raw.AnimationEvent,
    auxclick: org.scalajs.dom.raw.MouseEvent,
    beforeprint: org.scalajs.dom.raw.Event,
    beforeunload: org.scalajs.dom.raw.BeforeUnloadEvent,
    blur: org.scalajs.dom.raw.FocusEvent,
    cancel: org.scalajs.dom.raw.Event,
    canplay: org.scalajs.dom.raw.Event,
    canplaythrough: org.scalajs.dom.raw.Event,
    change: org.scalajs.dom.raw.Event,
    click: org.scalajs.dom.raw.MouseEvent,
    close: org.scalajs.dom.raw.Event,
    compassneedscalibration: org.scalajs.dom.raw.Event,
    contextmenu: org.scalajs.dom.raw.MouseEvent,
    cuechange: org.scalajs.dom.raw.Event,
    dblclick: org.scalajs.dom.raw.MouseEvent,
    devicelight: DeviceLightEvent,
    devicemotion: org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent,
    deviceorientation: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent,
    deviceorientationabsolute: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent,
    drag: org.scalajs.dom.raw.DragEvent,
    dragend: org.scalajs.dom.raw.DragEvent,
    dragenter: org.scalajs.dom.raw.DragEvent,
    dragexit: org.scalajs.dom.raw.Event,
    dragleave: org.scalajs.dom.raw.DragEvent,
    dragover: org.scalajs.dom.raw.DragEvent,
    dragstart: org.scalajs.dom.raw.DragEvent,
    drop: org.scalajs.dom.raw.DragEvent,
    durationchange: org.scalajs.dom.raw.Event,
    emptied: org.scalajs.dom.raw.Event,
    ended: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.ErrorEvent,
    focus: org.scalajs.dom.raw.FocusEvent,
    focusin: org.scalajs.dom.raw.FocusEvent,
    focusout: org.scalajs.dom.raw.FocusEvent,
    gotpointercapture: org.scalajs.dom.raw.PointerEvent,
    hashchange: org.scalajs.dom.raw.HashChangeEvent,
    input: org.scalajs.dom.raw.Event,
    invalid: org.scalajs.dom.raw.Event,
    keydown: org.scalajs.dom.raw.KeyboardEvent,
    keypress: org.scalajs.dom.raw.KeyboardEvent,
    keyup: org.scalajs.dom.raw.KeyboardEvent,
    languagechange: org.scalajs.dom.raw.Event,
    load: org.scalajs.dom.raw.Event,
    loadeddata: org.scalajs.dom.raw.Event,
    loadedmetadata: org.scalajs.dom.raw.Event,
    loadstart: org.scalajs.dom.raw.Event,
    lostpointercapture: org.scalajs.dom.raw.PointerEvent,
    message: org.scalajs.dom.raw.MessageEvent,
    messageerror: org.scalajs.dom.raw.MessageEvent,
    mousedown: org.scalajs.dom.raw.MouseEvent,
    mouseenter: org.scalajs.dom.raw.MouseEvent,
    mouseleave: org.scalajs.dom.raw.MouseEvent,
    mousemove: org.scalajs.dom.raw.MouseEvent,
    mouseout: org.scalajs.dom.raw.MouseEvent,
    mouseover: org.scalajs.dom.raw.MouseEvent,
    mouseup: org.scalajs.dom.raw.MouseEvent,
    mousewheel: org.scalajs.dom.raw.Event,
    offline: org.scalajs.dom.raw.Event,
    online: org.scalajs.dom.raw.Event,
    orientationchange: org.scalajs.dom.raw.Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    pause: org.scalajs.dom.raw.Event,
    play: org.scalajs.dom.raw.Event,
    playing: org.scalajs.dom.raw.Event,
    pointercancel: org.scalajs.dom.raw.PointerEvent,
    pointerdown: org.scalajs.dom.raw.PointerEvent,
    pointerenter: org.scalajs.dom.raw.PointerEvent,
    pointerleave: org.scalajs.dom.raw.PointerEvent,
    pointermove: org.scalajs.dom.raw.PointerEvent,
    pointerout: org.scalajs.dom.raw.PointerEvent,
    pointerover: org.scalajs.dom.raw.PointerEvent,
    pointerup: org.scalajs.dom.raw.PointerEvent,
    popstate: org.scalajs.dom.raw.PopStateEvent,
    progress: org.scalajs.dom.raw.ProgressEvent,
    ratechange: org.scalajs.dom.raw.Event,
    readystatechange: org.scalajs.dom.raw.ProgressEvent,
    rejectionhandled: PromiseRejectionEvent,
    reset: org.scalajs.dom.raw.Event,
    resize: org.scalajs.dom.raw.UIEvent,
    scroll: org.scalajs.dom.raw.Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: org.scalajs.dom.raw.Event,
    seeking: org.scalajs.dom.raw.Event,
    select: org.scalajs.dom.raw.Event,
    selectionchange: org.scalajs.dom.raw.Event,
    selectstart: org.scalajs.dom.raw.Event,
    stalled: org.scalajs.dom.raw.Event,
    storage: org.scalajs.dom.raw.StorageEvent,
    submit: org.scalajs.dom.raw.Event,
    suspend: org.scalajs.dom.raw.Event,
    timeupdate: org.scalajs.dom.raw.Event,
    toggle: org.scalajs.dom.raw.Event,
    touchcancel: org.scalajs.dom.raw.TouchEvent,
    touchend: org.scalajs.dom.raw.TouchEvent,
    touchmove: org.scalajs.dom.raw.TouchEvent,
    touchstart: org.scalajs.dom.raw.TouchEvent,
    transitioncancel: org.scalajs.dom.raw.TransitionEvent,
    transitionend: org.scalajs.dom.raw.TransitionEvent,
    transitionrun: org.scalajs.dom.raw.TransitionEvent,
    transitionstart: org.scalajs.dom.raw.TransitionEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: org.scalajs.dom.raw.Event,
    volumechange: org.scalajs.dom.raw.Event,
    vrdisplayactivate: org.scalajs.dom.raw.Event,
    vrdisplayblur: org.scalajs.dom.raw.Event,
    vrdisplayconnect: org.scalajs.dom.raw.Event,
    vrdisplaydeactivate: org.scalajs.dom.raw.Event,
    vrdisplaydisconnect: org.scalajs.dom.raw.Event,
    vrdisplayfocus: org.scalajs.dom.raw.Event,
    vrdisplaypointerrestricted: org.scalajs.dom.raw.Event,
    vrdisplaypointerunrestricted: org.scalajs.dom.raw.Event,
    vrdisplaypresentchange: org.scalajs.dom.raw.Event,
    waiting: org.scalajs.dom.raw.Event,
    wheel: org.scalajs.dom.raw.WheelEvent
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(MSGestureChange = MSGestureChange.asInstanceOf[js.Any], MSGestureDoubleTap = MSGestureDoubleTap.asInstanceOf[js.Any], MSGestureEnd = MSGestureEnd.asInstanceOf[js.Any], MSGestureHold = MSGestureHold.asInstanceOf[js.Any], MSGestureStart = MSGestureStart.asInstanceOf[js.Any], MSGestureTap = MSGestureTap.asInstanceOf[js.Any], MSInertiaStart = MSInertiaStart.asInstanceOf[js.Any], MSPointerCancel = MSPointerCancel.asInstanceOf[js.Any], MSPointerDown = MSPointerDown.asInstanceOf[js.Any], MSPointerEnter = MSPointerEnter.asInstanceOf[js.Any], MSPointerLeave = MSPointerLeave.asInstanceOf[js.Any], MSPointerMove = MSPointerMove.asInstanceOf[js.Any], MSPointerOut = MSPointerOut.asInstanceOf[js.Any], MSPointerOver = MSPointerOver.asInstanceOf[js.Any], MSPointerUp = MSPointerUp.asInstanceOf[js.Any], abort = abort.asInstanceOf[js.Any], afterprint = afterprint.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compassneedscalibration = compassneedscalibration.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], devicelight = devicelight.asInstanceOf[js.Any], devicemotion = devicemotion.asInstanceOf[js.Any], deviceorientation = deviceorientation.asInstanceOf[js.Any], deviceorientationabsolute = deviceorientationabsolute.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mousewheel = mousewheel.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], orientationchange = orientationchange.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], vrdisplayactivate = vrdisplayactivate.asInstanceOf[js.Any], vrdisplayblur = vrdisplayblur.asInstanceOf[js.Any], vrdisplayconnect = vrdisplayconnect.asInstanceOf[js.Any], vrdisplaydeactivate = vrdisplaydeactivate.asInstanceOf[js.Any], vrdisplaydisconnect = vrdisplaydisconnect.asInstanceOf[js.Any], vrdisplayfocus = vrdisplayfocus.asInstanceOf[js.Any], vrdisplaypointerrestricted = vrdisplaypointerrestricted.asInstanceOf[js.Any], vrdisplaypointerunrestricted = vrdisplaypointerunrestricted.asInstanceOf[js.Any], vrdisplaypresentchange = vrdisplaypresentchange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMap]
  }
  @scala.inline
  implicit class WindowEventMapOps[Self <: WindowEventMap] (val x: Self) extends AnyVal {
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
    def setMSGestureChange(value: org.scalajs.dom.raw.Event): Self = this.set("MSGestureChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureDoubleTap(value: org.scalajs.dom.raw.Event): Self = this.set("MSGestureDoubleTap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureEnd(value: org.scalajs.dom.raw.Event): Self = this.set("MSGestureEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureHold(value: org.scalajs.dom.raw.Event): Self = this.set("MSGestureHold", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureStart(value: org.scalajs.dom.raw.Event): Self = this.set("MSGestureStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureTap(value: org.scalajs.dom.raw.Event): Self = this.set("MSGestureTap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSInertiaStart(value: org.scalajs.dom.raw.Event): Self = this.set("MSInertiaStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerCancel(value: org.scalajs.dom.raw.Event): Self = this.set("MSPointerCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerDown(value: org.scalajs.dom.raw.Event): Self = this.set("MSPointerDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerEnter(value: org.scalajs.dom.raw.Event): Self = this.set("MSPointerEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerLeave(value: org.scalajs.dom.raw.Event): Self = this.set("MSPointerLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerMove(value: org.scalajs.dom.raw.Event): Self = this.set("MSPointerMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerOut(value: org.scalajs.dom.raw.Event): Self = this.set("MSPointerOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerOver(value: org.scalajs.dom.raw.Event): Self = this.set("MSPointerOver", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerUp(value: org.scalajs.dom.raw.Event): Self = this.set("MSPointerUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompassneedscalibration(value: org.scalajs.dom.raw.Event): Self = this.set("compassneedscalibration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevicelight(value: DeviceLightEvent): Self = this.set("devicelight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevicemotion(value: org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent): Self = this.set("devicemotion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceorientation(value: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent): Self = this.set("deviceorientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceorientationabsolute(value: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent): Self = this.set("deviceorientationabsolute", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousewheel(value: org.scalajs.dom.raw.Event): Self = this.set("mousewheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientationchange(value: org.scalajs.dom.raw.Event): Self = this.set("orientationchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: org.scalajs.dom.raw.ProgressEvent): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadystatechange(value: org.scalajs.dom.raw.ProgressEvent): Self = this.set("readystatechange", value.asInstanceOf[js.Any])
    @scala.inline
    def setVrdisplayactivate(value: org.scalajs.dom.raw.Event): Self = this.set("vrdisplayactivate", value.asInstanceOf[js.Any])
    @scala.inline
    def setVrdisplayblur(value: org.scalajs.dom.raw.Event): Self = this.set("vrdisplayblur", value.asInstanceOf[js.Any])
    @scala.inline
    def setVrdisplayconnect(value: org.scalajs.dom.raw.Event): Self = this.set("vrdisplayconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def setVrdisplaydeactivate(value: org.scalajs.dom.raw.Event): Self = this.set("vrdisplaydeactivate", value.asInstanceOf[js.Any])
    @scala.inline
    def setVrdisplaydisconnect(value: org.scalajs.dom.raw.Event): Self = this.set("vrdisplaydisconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def setVrdisplayfocus(value: org.scalajs.dom.raw.Event): Self = this.set("vrdisplayfocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setVrdisplaypointerrestricted(value: org.scalajs.dom.raw.Event): Self = this.set("vrdisplaypointerrestricted", value.asInstanceOf[js.Any])
    @scala.inline
    def setVrdisplaypointerunrestricted(value: org.scalajs.dom.raw.Event): Self = this.set("vrdisplaypointerunrestricted", value.asInstanceOf[js.Any])
    @scala.inline
    def setVrdisplaypresentchange(value: org.scalajs.dom.raw.Event): Self = this.set("vrdisplaypresentchange", value.asInstanceOf[js.Any])
  }
  
}

