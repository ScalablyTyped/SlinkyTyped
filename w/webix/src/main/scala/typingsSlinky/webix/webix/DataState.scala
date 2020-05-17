package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataState extends js.Object {
  def getState(): js.Any = js.native
  def setState(state: js.Any): Unit = js.native
}

object DataState {
  @scala.inline
  def apply(getState: () => js.Any, setState: js.Any => Unit): DataState = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[DataState]
  }
  @scala.inline
  implicit class DataStateOps[Self <: DataState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetState(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetState(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

