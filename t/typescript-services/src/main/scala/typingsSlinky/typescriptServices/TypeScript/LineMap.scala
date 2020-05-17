package typingsSlinky.typescriptServices.TypeScript

import typingsSlinky.typescriptServices.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineMap extends js.Object {
  var _computeLineStarts: js.Any = js.native
  var _lineStarts: js.Any = js.native
  var length: js.Any = js.native
  def equals(other: LineMap): Boolean = js.native
  def fillLineAndCharacterFromPosition(position: Double, lineAndCharacter: ILineAndCharacter): Unit = js.native
  def getLineAndCharacterFromPosition(position: Double): LineAndCharacter = js.native
  def getLineNumberFromPosition(position: Double): Double = js.native
  def getLineStartPosition(lineNumber: Double): Double = js.native
  def getPosition(line: Double, character: Double): Double = js.native
  def lineCount(): Double = js.native
  def lineStarts(): js.Array[Double] = js.native
  def toJSON(key: js.Any): Length = js.native
}

object LineMap {
  @scala.inline
  def apply(
    _computeLineStarts: js.Any,
    _lineStarts: js.Any,
    equals: LineMap => Boolean,
    fillLineAndCharacterFromPosition: (Double, ILineAndCharacter) => Unit,
    getLineAndCharacterFromPosition: Double => LineAndCharacter,
    getLineNumberFromPosition: Double => Double,
    getLineStartPosition: Double => Double,
    getPosition: (Double, Double) => Double,
    length: js.Any,
    lineCount: () => Double,
    lineStarts: () => js.Array[Double],
    toJSON: js.Any => Length
  ): LineMap = {
    val __obj = js.Dynamic.literal(_computeLineStarts = _computeLineStarts.asInstanceOf[js.Any], _lineStarts = _lineStarts.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), fillLineAndCharacterFromPosition = js.Any.fromFunction2(fillLineAndCharacterFromPosition), getLineAndCharacterFromPosition = js.Any.fromFunction1(getLineAndCharacterFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getLineStartPosition = js.Any.fromFunction1(getLineStartPosition), getPosition = js.Any.fromFunction2(getPosition), length = length.asInstanceOf[js.Any], lineCount = js.Any.fromFunction0(lineCount), lineStarts = js.Any.fromFunction0(lineStarts), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[LineMap]
  }
  @scala.inline
  implicit class LineMapOps[Self <: LineMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_computeLineStarts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_computeLineStarts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_lineStarts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lineStarts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEquals(value: LineMap => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFillLineAndCharacterFromPosition(value: (Double, ILineAndCharacter) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillLineAndCharacterFromPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetLineAndCharacterFromPosition(value: Double => LineAndCharacter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineAndCharacterFromPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLineNumberFromPosition(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineNumberFromPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLineStartPosition(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineStartPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLineStarts(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStarts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: js.Any => Length): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

