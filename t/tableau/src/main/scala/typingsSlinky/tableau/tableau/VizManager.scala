package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Viz Classes
@js.native
trait VizManager extends js.Object {
  def getVizs(): js.Array[Viz] = js.native
}

object VizManager {
  @scala.inline
  def apply(getVizs: () => js.Array[Viz]): VizManager = {
    val __obj = js.Dynamic.literal(getVizs = js.Any.fromFunction0(getVizs))
    __obj.asInstanceOf[VizManager]
  }
  @scala.inline
  implicit class VizManagerOps[Self <: VizManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetVizs(value: () => js.Array[Viz]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVizs")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

