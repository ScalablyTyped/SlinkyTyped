package typingsSlinky.textBuffer.mod.global.TextBuffer.Structures

import typingsSlinky.std.RegExpExecArray
import typingsSlinky.textBuffer.mod.global.TextBuffer.Range
import typingsSlinky.textBuffer.mod.global.TextBuffer.TextBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferScanResult extends js.Object {
  var buffer: TextBuffer = js.native
  var lineText: String = js.native
  var `match`: RegExpExecArray = js.native
  var matchText: String = js.native
  var range: Range = js.native
  var stopped: Boolean = js.native
  def replace(replacementText: String): Unit = js.native
  def stop(): Unit = js.native
}

object BufferScanResult {
  @scala.inline
  def apply(
    buffer: TextBuffer,
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
  implicit class BufferScanResultOps[Self <: BufferScanResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: TextBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: RegExpExecArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplace(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

