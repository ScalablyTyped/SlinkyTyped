package typingsSlinky.tabrisPluginFirebase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearAll extends js.Object {
  def clearAll(): Unit = js.native
  def getAll(): js.Array[js.Object] = js.native
}

object ClearAll {
  @scala.inline
  def apply(clearAll: () => Unit, getAll: () => js.Array[js.Object]): ClearAll = {
    val __obj = js.Dynamic.literal(clearAll = js.Any.fromFunction0(clearAll), getAll = js.Any.fromFunction0(getAll))
    __obj.asInstanceOf[ClearAll]
  }
  @scala.inline
  implicit class ClearAllOps[Self <: ClearAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAll(value: () => js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

