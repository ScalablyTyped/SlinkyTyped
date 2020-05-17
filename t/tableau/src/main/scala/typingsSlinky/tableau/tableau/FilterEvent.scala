package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterEvent extends TableauEvent {
  /** Gets the name of the field. */
  def getFieldName(): String = js.native
  /** Gets the Filter object associated with the event. */
  def getFilterAsync(): js.Promise[ConcreteFilter] = js.native
  /** Gets the Worksheet object associated with the event. */
  def getWorksheet(): Worksheet = js.native
}

object FilterEvent {
  @scala.inline
  def apply(
    getEventName: () => TableauEventName,
    getFieldName: () => String,
    getFilterAsync: () => js.Promise[ConcreteFilter],
    getViz: () => Viz,
    getWorksheet: () => Worksheet
  ): FilterEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getFieldName = js.Any.fromFunction0(getFieldName), getFilterAsync = js.Any.fromFunction0(getFilterAsync), getViz = js.Any.fromFunction0(getViz), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[FilterEvent]
  }
  @scala.inline
  implicit class FilterEventOps[Self <: FilterEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFieldName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFilterAsync(value: () => js.Promise[ConcreteFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWorksheet(value: () => Worksheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorksheet")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

