package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScriptSnapshotShim extends js.Object {
  def getLength(): Double = js.native
  def getLineStartPositions(): String = js.native
  def getText(start: Double, end: Double): String = js.native
  def getTextChangeRangeSinceVersion(scriptVersion: Double): String = js.native
}

object IScriptSnapshotShim {
  @scala.inline
  def apply(
    getLength: () => Double,
    getLineStartPositions: () => String,
    getText: (Double, Double) => String,
    getTextChangeRangeSinceVersion: Double => String
  ): IScriptSnapshotShim = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getLineStartPositions = js.Any.fromFunction0(getLineStartPositions), getText = js.Any.fromFunction2(getText), getTextChangeRangeSinceVersion = js.Any.fromFunction1(getTextChangeRangeSinceVersion))
    __obj.asInstanceOf[IScriptSnapshotShim]
  }
  @scala.inline
  implicit class IScriptSnapshotShimOps[Self <: IScriptSnapshotShim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLineStartPositions(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineStartPositions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: (Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetTextChangeRangeSinceVersion(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextChangeRangeSinceVersion")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

