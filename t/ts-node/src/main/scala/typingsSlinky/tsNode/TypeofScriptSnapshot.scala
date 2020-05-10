package typingsSlinky.tsNode

import typingsSlinky.typescript.mod.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofScriptSnapshot extends js.Object {
  def fromString(text: String): IScriptSnapshot = js.native
}

object TypeofScriptSnapshot {
  @scala.inline
  def apply(fromString: String => IScriptSnapshot): TypeofScriptSnapshot = {
    val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
    __obj.asInstanceOf[TypeofScriptSnapshot]
  }
  @scala.inline
  implicit class TypeofScriptSnapshotOps[Self <: TypeofScriptSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromString(value: String => IScriptSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

