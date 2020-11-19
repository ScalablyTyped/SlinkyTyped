package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextSnapshotLine extends ITextSnapshotLine {
  
  var _end: js.Any = js.native
  
  var _lineBreak: js.Any = js.native
  
  var _lineNumber: js.Any = js.native
  
  var _snapshot: js.Any = js.native
  
  var _start: js.Any = js.native
}
object TextSnapshotLine {
  
  @scala.inline
  def apply(
    _end: js.Any,
    _lineBreak: js.Any,
    _lineNumber: js.Any,
    _snapshot: js.Any,
    _start: js.Any,
    end: () => SnapshotPoint,
    endIncludingLineBreak: () => SnapshotPoint,
    endIncludingLineBreakPosition: () => Double,
    endPosition: () => Double,
    getText: () => String,
    length: () => Double,
    lineNumber: () => Double,
    snapshot: () => ITextSnapshot,
    start: () => SnapshotPoint,
    startPosition: () => Double
  ): TextSnapshotLine = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _lineBreak = _lineBreak.asInstanceOf[js.Any], _lineNumber = _lineNumber.asInstanceOf[js.Any], _snapshot = _snapshot.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), endIncludingLineBreak = js.Any.fromFunction0(endIncludingLineBreak), endIncludingLineBreakPosition = js.Any.fromFunction0(endIncludingLineBreakPosition), endPosition = js.Any.fromFunction0(endPosition), getText = js.Any.fromFunction0(getText), length = js.Any.fromFunction0(length), lineNumber = js.Any.fromFunction0(lineNumber), snapshot = js.Any.fromFunction0(snapshot), start = js.Any.fromFunction0(start), startPosition = js.Any.fromFunction0(startPosition))
    __obj.asInstanceOf[TextSnapshotLine]
  }
  
  @scala.inline
  implicit class TextSnapshotLineOps[Self <: TextSnapshotLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_end(value: js.Any): Self = this.set("_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lineBreak(value: js.Any): Self = this.set("_lineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lineNumber(value: js.Any): Self = this.set("_lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_snapshot(value: js.Any): Self = this.set("_snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_start(value: js.Any): Self = this.set("_start", value.asInstanceOf[js.Any])
  }
}
