package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceFileLike extends js.Object {
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter = js.native
}

object SourceFileLike {
  @scala.inline
  def apply(getLineAndCharacterOfPosition: Double => LineAndCharacter): SourceFileLike = {
    val __obj = js.Dynamic.literal(getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition))
    __obj.asInstanceOf[SourceFileLike]
  }
  @scala.inline
  implicit class SourceFileLikeOps[Self <: SourceFileLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLineAndCharacterOfPosition(value: Double => LineAndCharacter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineAndCharacterOfPosition")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

