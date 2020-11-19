package typingsSlinky.stardustUiReactComponentEventListener.components

import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.abort
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.animationcancel
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.animationend
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.animationiteration
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.animationstart
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.auxclick
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.blur
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.cancel
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.canplay
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.canplaythrough
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.change
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.click
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.close
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.contextmenu
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.copy
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.cuechange
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.cut
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.dblclick
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.drag
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.dragend
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.dragenter
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.dragexit
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.dragleave
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.dragover
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.dragstart
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.drop
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.durationchange
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.emptied
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.ended
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.error
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.focus
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.focusin
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.focusout
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.fullscreenchange
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.fullscreenerror
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.gotpointercapture
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.input
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.invalid
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.keydown
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.keypress
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.keyup
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.load
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.loadeddata
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.loadedmetadata
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.loadstart
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.lostpointercapture
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.mousedown
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.mouseenter
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.mouseleave
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.mousemove
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.mouseout
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.mouseover
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.mouseup
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.paste
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.pause
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.play
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.playing
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.pointercancel
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.pointerdown
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.pointerenter
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.pointerleave
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.pointerlockchange
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.pointerlockerror
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.pointermove
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.pointerout
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.pointerover
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.pointerup
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.progress
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.ratechange
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.readystatechange
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.reset
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.resize
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.scroll
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.securitypolicyviolation
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.seeked
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.seeking
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.select
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.selectionchange
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.selectstart
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.stalled
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.submit
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.suspend
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.timeupdate
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.toggle
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.touchcancel
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.touchend
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.touchmove
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.touchstart
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.transitioncancel
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.transitionend
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.transitionrun
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.transitionstart
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.visibilitychange
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.volumechange
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.waiting
import typingsSlinky.stardustUiReactComponentEventListener.stardustUiReactComponentEventListenerStrings.wheel
import typingsSlinky.stardustUiReactComponentEventListener.typesMod.EventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventListener {
  
  @JSImport("@stardust-ui/react-component-event-listener", "EventListener")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def capture(value: Boolean): this.type = set("capture", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: EventListenerOptions[
      abort | animationcancel | animationend | animationiteration | animationstart | auxclick | blur | cancel | canplay | canplaythrough | change | click | close | contextmenu | copy | cuechange | cut | dblclick | drag | dragend | dragenter | dragexit | dragleave | dragover | dragstart | drop | durationchange | emptied | ended | error | focus | focusin | focusout | fullscreenchange | fullscreenerror | gotpointercapture | input | invalid | keydown | keypress | keyup | load | loadeddata | loadedmetadata | loadstart | lostpointercapture | mousedown | mouseenter | mouseleave | mousemove | mouseout | mouseover | mouseup | paste | pause | play | playing | pointercancel | pointerdown | pointerenter | pointerleave | pointerlockchange | pointerlockerror | pointermove | pointerout | pointerover | pointerup | progress | ratechange | readystatechange | reset | resize | scroll | securitypolicyviolation | seeked | seeking | select | selectionchange | selectstart | stalled | submit | suspend | timeupdate | toggle | touchcancel | touchend | touchmove | touchstart | transitioncancel | transitionend | transitionrun | transitionstart | visibilitychange | volumechange | waiting | wheel
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    listener: /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any => Unit,
    targetRef: ReactRef[Node | Window],
    `type`: abort | animationcancel | animationend | animationiteration | animationstart | auxclick | blur | cancel | canplay | canplaythrough | change | click | close | contextmenu | copy | cuechange | cut | dblclick | drag | dragend | dragenter | dragexit | dragleave | dragover | dragstart | drop | durationchange | emptied | ended | error | focus | focusin | focusout | fullscreenchange | fullscreenerror | gotpointercapture | input | invalid | keydown | keypress | keyup | load | loadeddata | loadedmetadata | loadstart | lostpointercapture | mousedown | mouseenter | mouseleave | mousemove | mouseout | mouseover | mouseup | paste | pause | play | playing | pointercancel | pointerdown | pointerenter | pointerleave | pointerlockchange | pointerlockerror | pointermove | pointerout | pointerover | pointerup | progress | ratechange | readystatechange | reset | resize | scroll | securitypolicyviolation | seeked | seeking | select | selectionchange | selectstart | stalled | submit | suspend | timeupdate | toggle | touchcancel | touchend | touchmove | touchstart | transitioncancel | transitionend | transitionrun | transitionstart | visibilitychange | volumechange | waiting | wheel
  ): Builder = {
    val __props = js.Dynamic.literal(listener = js.Any.fromFunction1(listener), targetRef = targetRef.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EventListenerOptions[
    abort | animationcancel | animationend | animationiteration | animationstart | auxclick | blur | cancel | canplay | canplaythrough | change | click | close | contextmenu | copy | cuechange | cut | dblclick | drag | dragend | dragenter | dragexit | dragleave | dragover | dragstart | drop | durationchange | emptied | ended | error | focus | focusin | focusout | fullscreenchange | fullscreenerror | gotpointercapture | input | invalid | keydown | keypress | keyup | load | loadeddata | loadedmetadata | loadstart | lostpointercapture | mousedown | mouseenter | mouseleave | mousemove | mouseout | mouseover | mouseup | paste | pause | play | playing | pointercancel | pointerdown | pointerenter | pointerleave | pointerlockchange | pointerlockerror | pointermove | pointerout | pointerover | pointerup | progress | ratechange | readystatechange | reset | resize | scroll | securitypolicyviolation | seeked | seeking | select | selectionchange | selectstart | stalled | submit | suspend | timeupdate | toggle | touchcancel | touchend | touchmove | touchstart | transitioncancel | transitionend | transitionrun | transitionstart | visibilitychange | volumechange | waiting | wheel
  ]]))
  }
}
