package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  var _fileName: js.Any = js.native
  var _length: js.Any = js.native
  var _lineMap: js.Any = js.native
  var _start: js.Any = js.native
  def character(): Double = js.native
  def fileName(): String = js.native
  def length(): Double = js.native
  def line(): Double = js.native
  def lineMap(): LineMap = js.native
  def start(): Double = js.native
}

object Location {
  @scala.inline
  def apply(
    _fileName: js.Any,
    _length: js.Any,
    _lineMap: js.Any,
    _start: js.Any,
    character: () => Double,
    fileName: () => String,
    length: () => Double,
    line: () => Double,
    lineMap: () => LineMap,
    start: () => Double
  ): Location = {
    val __obj = js.Dynamic.literal(_fileName = _fileName.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], character = js.Any.fromFunction0(character), fileName = js.Any.fromFunction0(fileName), length = js.Any.fromFunction0(length), line = js.Any.fromFunction0(line), lineMap = js.Any.fromFunction0(lineMap), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_fileName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_length(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_lineMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lineMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_start(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacter(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("character")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFileName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLine(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLineMap(value: () => LineMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

