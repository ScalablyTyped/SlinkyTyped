package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.anon.Source
import typingsSlinky.vegaTypings.anon.Type
import typingsSlinky.vegaTypings.exprMod.Expr
import typingsSlinky.vegaTypings.marktypeMod.MarkType
import typingsSlinky.vegaTypings.onEventsMod._EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @js.native
  trait DerivedStream
    extends _Stream
       with StreamParameters {
    
    var stream: Stream = js.native
  }
  object DerivedStream {
    
    @scala.inline
    def apply(stream: Stream): DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[DerivedStream]
    }
    
    @scala.inline
    implicit class DerivedStreamMutableBuilder[Self <: DerivedStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  type EventSource = (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/stream.EventStream['source'] */ js.Any) with js.Object
  
  type EventStream = StreamParameters with (Source | Type)
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.vegaTypingsStrings.click
    - typingsSlinky.vegaTypings.vegaTypingsStrings.dblclick
    - typingsSlinky.vegaTypings.vegaTypingsStrings.dragenter
    - typingsSlinky.vegaTypings.vegaTypingsStrings.dragleave
    - typingsSlinky.vegaTypings.vegaTypingsStrings.dragover
    - typingsSlinky.vegaTypings.vegaTypingsStrings.keydown
    - typingsSlinky.vegaTypings.vegaTypingsStrings.keypress
    - typingsSlinky.vegaTypings.vegaTypingsStrings.keyup
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mousedown
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mousemove
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mouseout
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mouseover
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mouseup
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mousewheel
    - typingsSlinky.vegaTypings.vegaTypingsStrings.timer
    - typingsSlinky.vegaTypings.vegaTypingsStrings.touchend
    - typingsSlinky.vegaTypings.vegaTypingsStrings.touchmove
    - typingsSlinky.vegaTypings.vegaTypingsStrings.touchstart
    - typingsSlinky.vegaTypings.vegaTypingsStrings.wheel
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def click: typingsSlinky.vegaTypings.vegaTypingsStrings.click = "click".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.click]
    
    @scala.inline
    def dblclick: typingsSlinky.vegaTypings.vegaTypingsStrings.dblclick = "dblclick".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.dblclick]
    
    @scala.inline
    def dragenter: typingsSlinky.vegaTypings.vegaTypingsStrings.dragenter = "dragenter".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.dragenter]
    
    @scala.inline
    def dragleave: typingsSlinky.vegaTypings.vegaTypingsStrings.dragleave = "dragleave".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.dragleave]
    
    @scala.inline
    def dragover: typingsSlinky.vegaTypings.vegaTypingsStrings.dragover = "dragover".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.dragover]
    
    @scala.inline
    def keydown: typingsSlinky.vegaTypings.vegaTypingsStrings.keydown = "keydown".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.keydown]
    
    @scala.inline
    def keypress: typingsSlinky.vegaTypings.vegaTypingsStrings.keypress = "keypress".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.keypress]
    
    @scala.inline
    def keyup: typingsSlinky.vegaTypings.vegaTypingsStrings.keyup = "keyup".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.keyup]
    
    @scala.inline
    def mousedown: typingsSlinky.vegaTypings.vegaTypingsStrings.mousedown = "mousedown".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mousedown]
    
    @scala.inline
    def mousemove: typingsSlinky.vegaTypings.vegaTypingsStrings.mousemove = "mousemove".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mousemove]
    
    @scala.inline
    def mouseout: typingsSlinky.vegaTypings.vegaTypingsStrings.mouseout = "mouseout".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mouseout]
    
    @scala.inline
    def mouseover: typingsSlinky.vegaTypings.vegaTypingsStrings.mouseover = "mouseover".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mouseover]
    
    @scala.inline
    def mouseup: typingsSlinky.vegaTypings.vegaTypingsStrings.mouseup = "mouseup".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mouseup]
    
    @scala.inline
    def mousewheel: typingsSlinky.vegaTypings.vegaTypingsStrings.mousewheel = "mousewheel".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mousewheel]
    
    @scala.inline
    def timer: typingsSlinky.vegaTypings.vegaTypingsStrings.timer = "timer".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.timer]
    
    @scala.inline
    def touchend: typingsSlinky.vegaTypings.vegaTypingsStrings.touchend = "touchend".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.touchend]
    
    @scala.inline
    def touchmove: typingsSlinky.vegaTypings.vegaTypingsStrings.touchmove = "touchmove".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.touchmove]
    
    @scala.inline
    def touchstart: typingsSlinky.vegaTypings.vegaTypingsStrings.touchstart = "touchstart".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.touchstart]
    
    @scala.inline
    def wheel: typingsSlinky.vegaTypings.vegaTypingsStrings.wheel = "wheel".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.wheel]
  }
  
  @js.native
  trait MergedStream
    extends _Stream
       with StreamParameters {
    
    var merge: js.Array[Stream] = js.native
  }
  object MergedStream {
    
    @scala.inline
    def apply(merge: js.Array[Stream]): MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergedStream]
    }
    
    @scala.inline
    implicit class MergedStreamMutableBuilder[Self <: MergedStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMerge(value: js.Array[Stream]): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeVarargs(value: Stream*): Self = StObject.set(x, "merge", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.streamMod.EventStream
    - typingsSlinky.vegaTypings.streamMod.DerivedStream
    - typingsSlinky.vegaTypings.streamMod.MergedStream
  */
  type Stream = _Stream | EventStream
  
  @js.native
  trait StreamParameters extends StObject {
    
    var between: js.UndefOr[js.Array[Stream]] = js.native
    
    var consume: js.UndefOr[Boolean] = js.native
    
    var debounce: js.UndefOr[Double] = js.native
    
    var filter: js.UndefOr[Expr | js.Array[Expr]] = js.native
    
    var markname: js.UndefOr[String] = js.native
    
    var marktype: js.UndefOr[MarkType] = js.native
    
    var throttle: js.UndefOr[Double] = js.native
  }
  object StreamParameters {
    
    @scala.inline
    def apply(): StreamParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamParameters]
    }
    
    @scala.inline
    implicit class StreamParametersMutableBuilder[Self <: StreamParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBetween(value: js.Array[Stream]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      @scala.inline
      def setBetweenVarargs(value: Stream*): Self = StObject.set(x, "between", js.Array(value :_*))
      
      @scala.inline
      def setConsume(value: Boolean): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
      
      @scala.inline
      def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      @scala.inline
      def setFilter(value: Expr | js.Array[Expr]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterVarargs(value: Expr*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setMarkname(value: String): Self = StObject.set(x, "markname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarknameUndefined: Self = StObject.set(x, "markname", js.undefined)
      
      @scala.inline
      def setMarktype(value: MarkType): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarktypeUndefined: Self = StObject.set(x, "marktype", js.undefined)
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  type WindowEventType = EventType | String
  
  trait _Stream extends _EventListener
  object _Stream {
    
    @scala.inline
    def DerivedStream(stream: Stream): typingsSlinky.vegaTypings.streamMod.DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.streamMod.DerivedStream]
    }
    
    @scala.inline
    def MergedStream(merge: js.Array[Stream]): typingsSlinky.vegaTypings.streamMod.MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.streamMod.MergedStream]
    }
  }
}
