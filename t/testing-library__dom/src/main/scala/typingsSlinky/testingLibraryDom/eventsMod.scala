package typingsSlinky.testingLibraryDom

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.Window
import typingsSlinky.testingLibraryDom.anon.DefaultInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("@testing-library/dom/types/events", "createEvent")
  @js.native
  val createEvent: CreateObject with CreateFunction = js.native
  
  @JSImport("@testing-library/dom/types/events", "fireEvent")
  @js.native
  val fireEvent: FireFunction with FireObject = js.native
  
  type CreateFunction = js.Function4[
    /* eventName */ String, 
    /* node */ Document | Element | Window | Node, 
    /* init */ js.UndefOr[js.Object], 
    /* options */ js.UndefOr[DefaultInit], 
    Event
  ]
  
  /* Inlined {[ K in @testing-library/dom.@testing-library/dom/types/events.EventType ]: (element : std.Document | std.Element | std.Window | std.Node, options : {} | undefined): std.Event} */
  @js.native
  trait CreateObject extends StObject {
    
    var abort: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var animationEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var animationIteration: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var animationStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var blur: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var canPlay: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var canPlayThrough: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var change: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var click: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var compositionEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var compositionStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var compositionUpdate: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var contextMenu: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var copy: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var cut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dblClick: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var doubleClick: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var drag: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragExit: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var drop: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var durationChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var emptied: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var encrypted: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var ended: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var error: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var focus: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var focusIn: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var focusOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var gotPointerCapture: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var input: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var invalid: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var keyDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var keyPress: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var keyUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var load: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var loadStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var loadedData: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var loadedMetadata: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var lostPointerCapture: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var paste: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pause: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var play: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var playing: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerCancel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var popState: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var progress: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var rateChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var reset: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var scroll: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var seeked: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var seeking: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var select: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var stalled: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var submit: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var suspend: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var timeUpdate: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var touchCancel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var touchEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var touchMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var touchStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var transitionEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var volumeChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var waiting: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var wheel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
  }
  object CreateObject {
    
    @scala.inline
    def apply(
      abort: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      animationEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      animationIteration: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      animationStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      blur: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      canPlay: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      canPlayThrough: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      change: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      click: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      compositionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      compositionStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      compositionUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      contextMenu: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      copy: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      cut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dblClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      doubleClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      drag: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragExit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      drop: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      durationChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      emptied: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      encrypted: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      ended: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      error: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      focus: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      focusIn: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      focusOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      gotPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      input: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      invalid: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      keyDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      keyPress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      keyUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      load: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      loadStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      loadedData: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      loadedMetadata: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      lostPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      paste: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pause: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      play: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      playing: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      popState: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      progress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      rateChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      reset: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      scroll: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      seeked: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      seeking: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      select: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      stalled: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      submit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      suspend: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      timeUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      transitionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      volumeChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      waiting: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      wheel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
    ): CreateObject = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), dblClick = js.Any.fromFunction2(dblClick), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), focusIn = js.Any.fromFunction2(focusIn), focusOut = js.Any.fromFunction2(focusOut), gotPointerCapture = js.Any.fromFunction2(gotPointerCapture), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), lostPointerCapture = js.Any.fromFunction2(lostPointerCapture), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), pointerCancel = js.Any.fromFunction2(pointerCancel), pointerDown = js.Any.fromFunction2(pointerDown), pointerEnter = js.Any.fromFunction2(pointerEnter), pointerLeave = js.Any.fromFunction2(pointerLeave), pointerMove = js.Any.fromFunction2(pointerMove), pointerOut = js.Any.fromFunction2(pointerOut), pointerOver = js.Any.fromFunction2(pointerOver), pointerUp = js.Any.fromFunction2(pointerUp), popState = js.Any.fromFunction2(popState), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), reset = js.Any.fromFunction2(reset), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionEnd = js.Any.fromFunction2(transitionEnd), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
      __obj.asInstanceOf[CreateObject]
    }
    
    @scala.inline
    implicit class CreateObjectMutableBuilder[Self <: CreateObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "abort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "animationEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationIteration(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "animationIteration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "animationStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlur(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "canPlay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlayThrough(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "canPlayThrough", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "compositionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "compositionStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "compositionUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContextMenu(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "contextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCopy(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDblClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDoubleClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrag(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragExit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragExit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrop(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDurationChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "durationChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmptied(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "emptied", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncrypted(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "encrypted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnded(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "ended", js.Any.fromFunction2(value))
      
      @scala.inline
      def setError(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocus(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusIn(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "focusIn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "focusOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGotPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "gotPointerCapture", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInput(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvalid(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "invalid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "keyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyPress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "keyPress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "keyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoad(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "loadStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedData(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "loadedData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedMetadata(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "loadedMetadata", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLostPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "lostPointerCapture", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPaste(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPause(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlaying(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "playing", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPopState(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "popState", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRateChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "rateChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReset(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScroll(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeked(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "seeked", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeking(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "seeking", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelect(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStalled(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "stalled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubmit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "submit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuspend(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "suspend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTimeUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "timeUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransitionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVolumeChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "volumeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWaiting(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "waiting", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWheel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "wheel", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.copy
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.cut
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.paste
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.compositionEnd
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.compositionStart
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.compositionUpdate
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.keyDown
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.keyPress
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.keyUp
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.focus
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.blur
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.focusIn
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.focusOut
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.change
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.input
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.invalid
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.submit
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.reset
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.click
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.contextMenu
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dblClick
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.drag
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragEnd
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragEnter
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragExit
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragLeave
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragOver
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragStart
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.drop
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseDown
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseEnter
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseLeave
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseMove
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseOut
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseOver
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseUp
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.popState
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.select
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchCancel
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchEnd
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchMove
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchStart
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.scroll
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.wheel
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.abort
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.canPlay
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.canPlayThrough
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.durationChange
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.emptied
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.encrypted
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.ended
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.loadedData
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.loadedMetadata
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.loadStart
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pause
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.play
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.playing
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.progress
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.rateChange
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.seeked
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.seeking
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.stalled
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.suspend
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.timeUpdate
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.volumeChange
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.waiting
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.load
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.error
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.animationStart
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.animationEnd
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.animationIteration
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.transitionEnd
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.doubleClick
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerOver
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerEnter
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerDown
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerMove
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerUp
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerCancel
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerOut
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerLeave
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.gotPointerCapture
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.lostPointerCapture
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def abort: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.abort = "abort".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.abort]
    
    @scala.inline
    def animationEnd: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.animationEnd = "animationEnd".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.animationEnd]
    
    @scala.inline
    def animationIteration: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.animationIteration = "animationIteration".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.animationIteration]
    
    @scala.inline
    def animationStart: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.animationStart = "animationStart".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.animationStart]
    
    @scala.inline
    def blur: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.blur = "blur".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.blur]
    
    @scala.inline
    def canPlay: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.canPlay = "canPlay".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.canPlay]
    
    @scala.inline
    def canPlayThrough: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.canPlayThrough = "canPlayThrough".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.canPlayThrough]
    
    @scala.inline
    def change: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.change = "change".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.change]
    
    @scala.inline
    def click: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.click = "click".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.click]
    
    @scala.inline
    def compositionEnd: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.compositionEnd = "compositionEnd".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.compositionEnd]
    
    @scala.inline
    def compositionStart: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.compositionStart = "compositionStart".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.compositionStart]
    
    @scala.inline
    def compositionUpdate: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.compositionUpdate = "compositionUpdate".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.compositionUpdate]
    
    @scala.inline
    def contextMenu: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.contextMenu = "contextMenu".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.contextMenu]
    
    @scala.inline
    def copy: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.copy = "copy".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.copy]
    
    @scala.inline
    def cut: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.cut = "cut".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.cut]
    
    @scala.inline
    def dblClick: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dblClick = "dblClick".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dblClick]
    
    @scala.inline
    def doubleClick: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.doubleClick = "doubleClick".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.doubleClick]
    
    @scala.inline
    def drag: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.drag = "drag".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.drag]
    
    @scala.inline
    def dragEnd: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragEnd = "dragEnd".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragEnd]
    
    @scala.inline
    def dragEnter: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragEnter = "dragEnter".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragEnter]
    
    @scala.inline
    def dragExit: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragExit = "dragExit".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragExit]
    
    @scala.inline
    def dragLeave: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragLeave = "dragLeave".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragLeave]
    
    @scala.inline
    def dragOver: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragOver = "dragOver".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragOver]
    
    @scala.inline
    def dragStart: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragStart = "dragStart".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.dragStart]
    
    @scala.inline
    def drop: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.drop = "drop".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.drop]
    
    @scala.inline
    def durationChange: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.durationChange = "durationChange".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.durationChange]
    
    @scala.inline
    def emptied: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.emptied = "emptied".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.emptied]
    
    @scala.inline
    def encrypted: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.encrypted = "encrypted".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.encrypted]
    
    @scala.inline
    def ended: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.ended = "ended".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.ended]
    
    @scala.inline
    def error: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.error = "error".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.error]
    
    @scala.inline
    def focus: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.focus = "focus".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.focus]
    
    @scala.inline
    def focusIn: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.focusIn = "focusIn".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.focusIn]
    
    @scala.inline
    def focusOut: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.focusOut = "focusOut".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.focusOut]
    
    @scala.inline
    def gotPointerCapture: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.gotPointerCapture = "gotPointerCapture".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.gotPointerCapture]
    
    @scala.inline
    def input: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.input = "input".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.input]
    
    @scala.inline
    def invalid: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.invalid = "invalid".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.invalid]
    
    @scala.inline
    def keyDown: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.keyDown = "keyDown".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.keyDown]
    
    @scala.inline
    def keyPress: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.keyPress = "keyPress".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.keyPress]
    
    @scala.inline
    def keyUp: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.keyUp = "keyUp".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.keyUp]
    
    @scala.inline
    def load: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.load = "load".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.load]
    
    @scala.inline
    def loadStart: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.loadStart = "loadStart".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.loadStart]
    
    @scala.inline
    def loadedData: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.loadedData = "loadedData".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.loadedData]
    
    @scala.inline
    def loadedMetadata: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.loadedMetadata = "loadedMetadata".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.loadedMetadata]
    
    @scala.inline
    def lostPointerCapture: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.lostPointerCapture = "lostPointerCapture".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.lostPointerCapture]
    
    @scala.inline
    def mouseDown: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseDown = "mouseDown".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseDown]
    
    @scala.inline
    def mouseEnter: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseEnter = "mouseEnter".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseEnter]
    
    @scala.inline
    def mouseLeave: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseLeave = "mouseLeave".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseLeave]
    
    @scala.inline
    def mouseMove: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseMove = "mouseMove".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseMove]
    
    @scala.inline
    def mouseOut: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseOut = "mouseOut".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseOut]
    
    @scala.inline
    def mouseOver: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseOver = "mouseOver".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseOver]
    
    @scala.inline
    def mouseUp: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseUp = "mouseUp".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.mouseUp]
    
    @scala.inline
    def paste: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.paste = "paste".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.paste]
    
    @scala.inline
    def pause: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pause = "pause".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pause]
    
    @scala.inline
    def play: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.play = "play".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.play]
    
    @scala.inline
    def playing: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.playing = "playing".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.playing]
    
    @scala.inline
    def pointerCancel: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerCancel = "pointerCancel".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerCancel]
    
    @scala.inline
    def pointerDown: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerDown = "pointerDown".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerDown]
    
    @scala.inline
    def pointerEnter: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerEnter = "pointerEnter".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerEnter]
    
    @scala.inline
    def pointerLeave: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerLeave = "pointerLeave".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerLeave]
    
    @scala.inline
    def pointerMove: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerMove = "pointerMove".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerMove]
    
    @scala.inline
    def pointerOut: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerOut = "pointerOut".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerOut]
    
    @scala.inline
    def pointerOver: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerOver = "pointerOver".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerOver]
    
    @scala.inline
    def pointerUp: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerUp = "pointerUp".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.pointerUp]
    
    @scala.inline
    def popState: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.popState = "popState".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.popState]
    
    @scala.inline
    def progress: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.progress = "progress".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.progress]
    
    @scala.inline
    def rateChange: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.rateChange = "rateChange".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.rateChange]
    
    @scala.inline
    def reset: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.reset = "reset".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.reset]
    
    @scala.inline
    def scroll: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.scroll = "scroll".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.scroll]
    
    @scala.inline
    def seeked: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.seeked = "seeked".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.seeked]
    
    @scala.inline
    def seeking: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.seeking = "seeking".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.seeking]
    
    @scala.inline
    def select: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.select = "select".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.select]
    
    @scala.inline
    def stalled: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.stalled = "stalled".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.stalled]
    
    @scala.inline
    def submit: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.submit = "submit".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.submit]
    
    @scala.inline
    def suspend: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.suspend = "suspend".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.suspend]
    
    @scala.inline
    def timeUpdate: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.timeUpdate = "timeUpdate".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.timeUpdate]
    
    @scala.inline
    def touchCancel: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchCancel = "touchCancel".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchCancel]
    
    @scala.inline
    def touchEnd: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchEnd = "touchEnd".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchEnd]
    
    @scala.inline
    def touchMove: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchMove = "touchMove".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchMove]
    
    @scala.inline
    def touchStart: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchStart = "touchStart".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.touchStart]
    
    @scala.inline
    def transitionEnd: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.transitionEnd = "transitionEnd".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.transitionEnd]
    
    @scala.inline
    def volumeChange: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.volumeChange = "volumeChange".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.volumeChange]
    
    @scala.inline
    def waiting: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.waiting = "waiting".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.waiting]
    
    @scala.inline
    def wheel: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.wheel = "wheel".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.wheel]
  }
  
  type FireFunction = js.Function2[/* element */ Document | Element | Window | Node, /* event */ Event, Boolean]
  
  /* Inlined {[ K in @testing-library/dom.@testing-library/dom/types/events.EventType ]: (element : std.Document | std.Element | std.Window | std.Node, options : {} | undefined): boolean} */
  @js.native
  trait FireObject extends StObject {
    
    var abort: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var animationEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var animationIteration: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var animationStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var blur: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var canPlay: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var canPlayThrough: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var change: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var click: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var compositionEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var compositionStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var compositionUpdate: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var contextMenu: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var copy: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var cut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dblClick: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var doubleClick: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var drag: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragExit: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var drop: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var durationChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var emptied: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var encrypted: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var ended: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var error: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var focus: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var focusIn: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var focusOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var gotPointerCapture: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var input: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var invalid: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var keyDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var keyPress: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var keyUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var load: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var loadStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var loadedData: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var loadedMetadata: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var lostPointerCapture: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var paste: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pause: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var play: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var playing: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerCancel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var popState: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var progress: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var rateChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var reset: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var scroll: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var seeked: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var seeking: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var select: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var stalled: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var submit: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var suspend: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var timeUpdate: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var touchCancel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var touchEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var touchMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var touchStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var transitionEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var volumeChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var waiting: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var wheel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
  }
  object FireObject {
    
    @scala.inline
    def apply(
      abort: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      animationEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      animationIteration: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      animationStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      blur: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      canPlay: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      canPlayThrough: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      change: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      click: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      compositionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      compositionStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      compositionUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      contextMenu: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      copy: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      cut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dblClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      doubleClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      drag: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragExit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      drop: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      durationChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      emptied: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      encrypted: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      ended: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      error: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      focus: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      focusIn: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      focusOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      gotPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      input: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      invalid: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      keyDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      keyPress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      keyUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      load: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      loadStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      loadedData: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      loadedMetadata: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      lostPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      paste: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pause: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      play: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      playing: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      popState: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      progress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      rateChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      reset: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      scroll: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      seeked: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      seeking: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      select: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      stalled: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      submit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      suspend: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      timeUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      transitionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      volumeChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      waiting: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      wheel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
    ): FireObject = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), dblClick = js.Any.fromFunction2(dblClick), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), focusIn = js.Any.fromFunction2(focusIn), focusOut = js.Any.fromFunction2(focusOut), gotPointerCapture = js.Any.fromFunction2(gotPointerCapture), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), lostPointerCapture = js.Any.fromFunction2(lostPointerCapture), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), pointerCancel = js.Any.fromFunction2(pointerCancel), pointerDown = js.Any.fromFunction2(pointerDown), pointerEnter = js.Any.fromFunction2(pointerEnter), pointerLeave = js.Any.fromFunction2(pointerLeave), pointerMove = js.Any.fromFunction2(pointerMove), pointerOut = js.Any.fromFunction2(pointerOut), pointerOver = js.Any.fromFunction2(pointerOver), pointerUp = js.Any.fromFunction2(pointerUp), popState = js.Any.fromFunction2(popState), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), reset = js.Any.fromFunction2(reset), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionEnd = js.Any.fromFunction2(transitionEnd), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
      __obj.asInstanceOf[FireObject]
    }
    
    @scala.inline
    implicit class FireObjectMutableBuilder[Self <: FireObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "abort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "animationEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationIteration(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "animationIteration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "animationStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlur(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "canPlay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlayThrough(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "canPlayThrough", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "compositionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "compositionStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "compositionUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContextMenu(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "contextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCopy(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDblClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDoubleClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrag(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragExit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragExit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrop(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDurationChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "durationChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmptied(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "emptied", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncrypted(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "encrypted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnded(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "ended", js.Any.fromFunction2(value))
      
      @scala.inline
      def setError(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocus(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusIn(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "focusIn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "focusOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGotPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "gotPointerCapture", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInput(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvalid(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "invalid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "keyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyPress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "keyPress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "keyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoad(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "loadStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedData(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "loadedData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedMetadata(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "loadedMetadata", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLostPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "lostPointerCapture", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPaste(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPause(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlaying(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "playing", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPopState(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "popState", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRateChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "rateChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReset(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScroll(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeked(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "seeked", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeking(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "seeking", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelect(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStalled(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "stalled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubmit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "submit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuspend(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "suspend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTimeUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "timeUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransitionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVolumeChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "volumeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWaiting(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "waiting", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWheel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "wheel", js.Any.fromFunction2(value))
    }
  }
}
