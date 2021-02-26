package typingsSlinky.textBuffer.mod.global.TextBuffer

import typingsSlinky.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The structures that are passed to the user by Atom following specific API calls. */
object Structures {
  
  @js.native
  trait BufferScanResult extends StObject {
    
    var buffer: typingsSlinky.textBuffer.mod.global.TextBuffer.TextBuffer = js.native
    
    var lineText: String = js.native
    
    var `match`: RegExpExecArray = js.native
    
    var matchText: String = js.native
    
    var range: Range = js.native
    
    def replace(replacementText: String): Unit = js.native
    
    def stop(): Unit = js.native
    
    var stopped: Boolean = js.native
  }
  object BufferScanResult {
    
    @scala.inline
    def apply(
      buffer: typingsSlinky.textBuffer.mod.global.TextBuffer.TextBuffer,
      lineText: String,
      `match`: RegExpExecArray,
      matchText: String,
      range: Range,
      replace: String => Unit,
      stop: () => Unit,
      stopped: Boolean
    ): BufferScanResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], replace = js.Any.fromFunction1(replace), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferScanResult]
    }
    
    @scala.inline
    implicit class BufferScanResultMutableBuilder[Self <: BufferScanResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: typingsSlinky.textBuffer.mod.global.TextBuffer.TextBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineText(value: String): Self = StObject.set(x, "lineText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(value: RegExpExecArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchText(value: String): Self = StObject.set(x, "matchText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplace(value: String => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContextualBufferScanResult extends BufferScanResult {
    
    var leadingContextLines: js.Array[String] = js.native
    
    var trailingContextLines: js.Array[String] = js.native
  }
  object ContextualBufferScanResult {
    
    @scala.inline
    def apply(
      buffer: typingsSlinky.textBuffer.mod.global.TextBuffer.TextBuffer,
      leadingContextLines: js.Array[String],
      lineText: String,
      `match`: RegExpExecArray,
      matchText: String,
      range: Range,
      replace: String => Unit,
      stop: () => Unit,
      stopped: Boolean,
      trailingContextLines: js.Array[String]
    ): ContextualBufferScanResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], leadingContextLines = leadingContextLines.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], replace = js.Any.fromFunction1(replace), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any], trailingContextLines = trailingContextLines.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextualBufferScanResult]
    }
    
    @scala.inline
    implicit class ContextualBufferScanResultMutableBuilder[Self <: ContextualBufferScanResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeadingContextLines(value: js.Array[String]): Self = StObject.set(x, "leadingContextLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingContextLinesVarargs(value: String*): Self = StObject.set(x, "leadingContextLines", js.Array(value :_*))
      
      @scala.inline
      def setTrailingContextLines(value: js.Array[String]): Self = StObject.set(x, "trailingContextLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingContextLinesVarargs(value: String*): Self = StObject.set(x, "trailingContextLines", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TextChange extends StObject {
    
    var newExtent: Point = js.native
    
    var newRange: Range = js.native
    
    var newText: String = js.native
    
    var oldExtent: Point = js.native
    
    var oldRange: Range = js.native
    
    var oldText: String = js.native
    
    var start: Point = js.native
  }
  object TextChange {
    
    @scala.inline
    def apply(
      newExtent: Point,
      newRange: Range,
      newText: String,
      oldExtent: Point,
      oldRange: Range,
      oldText: String,
      start: Point
    ): TextChange = {
      val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextChange]
    }
    
    @scala.inline
    implicit class TextChangeMutableBuilder[Self <: TextChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewExtent(value: Point): Self = StObject.set(x, "newExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewRange(value: Range): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldExtent(value: Point): Self = StObject.set(x, "oldExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldRange(value: Range): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
