package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VizResizeEvent extends TableauEvent {
  /** Gets the sheetSize record for the current sheet. For more information, see SheetSizeOptions Record. */
  def getVizSize(): Size = js.native
}

object VizResizeEvent {
  @scala.inline
  def apply(getEventName: () => TableauEventName, getViz: () => Viz, getVizSize: () => Size): VizResizeEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getViz = js.Any.fromFunction0(getViz), getVizSize = js.Any.fromFunction0(getVizSize))
    __obj.asInstanceOf[VizResizeEvent]
  }
  @scala.inline
  implicit class VizResizeEventOps[Self <: VizResizeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetVizSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVizSize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

