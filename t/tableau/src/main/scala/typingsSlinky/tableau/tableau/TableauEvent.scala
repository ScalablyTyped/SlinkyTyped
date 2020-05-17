package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableauEvent extends js.Object {
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  def getEventName(): TableauEventName = js.native
  /** Gets the Viz object associated with the event. */
  def getViz(): Viz = js.native
}

object TableauEvent {
  @scala.inline
  def apply(getEventName: () => TableauEventName, getViz: () => Viz): TableauEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[TableauEvent]
  }
  @scala.inline
  implicit class TableauEventOps[Self <: TableauEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEventName(value: () => TableauEventName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViz(value: () => Viz): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViz")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

