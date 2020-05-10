package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapSource extends js.Object {
  var fileName: java.lang.String = js.native
  var skipTrivia: js.UndefOr[js.Function1[/* pos */ Double, Double]] = js.native
  var text: java.lang.String = js.native
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter = js.native
}

object SourceMapSource {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    getLineAndCharacterOfPosition: Double => LineAndCharacter,
    text: java.lang.String
  ): SourceMapSource = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapSource]
  }
  @scala.inline
  implicit class SourceMapSourceOps[Self <: SourceMapSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLineAndCharacterOfPosition(value: Double => LineAndCharacter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineAndCharacterOfPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipTrivia(value: /* pos */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTrivia")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSkipTrivia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTrivia")(js.undefined)
        ret
    }
  }
  
}

