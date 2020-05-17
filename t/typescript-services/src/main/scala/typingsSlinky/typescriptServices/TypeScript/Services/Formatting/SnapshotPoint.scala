package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotPoint extends js.Object {
  var position: Double = js.native
  var snapshot: ITextSnapshot = js.native
  def add(offset: Double): SnapshotPoint = js.native
  def getContainingLine(): ITextSnapshotLine = js.native
}

object SnapshotPoint {
  @scala.inline
  def apply(
    add: Double => SnapshotPoint,
    getContainingLine: () => ITextSnapshotLine,
    position: Double,
    snapshot: ITextSnapshot
  ): SnapshotPoint = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getContainingLine = js.Any.fromFunction0(getContainingLine), position = position.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotPoint]
  }
  @scala.inline
  implicit class SnapshotPointOps[Self <: SnapshotPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Double => SnapshotPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContainingLine(value: () => ITextSnapshotLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainingLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshot(value: ITextSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

