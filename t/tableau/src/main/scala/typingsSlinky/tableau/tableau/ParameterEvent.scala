package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterEvent extends TableauEvent {
  /** Gets the Parameter object that triggered the event. */
  def getParameterAsync(): js.Promise[Parameter] = js.native
  /** Gets the name of the parameter that changed. */
  def getParameterName(): String = js.native
}

object ParameterEvent {
  @scala.inline
  def apply(
    getEventName: () => TableauEventName,
    getParameterAsync: () => js.Promise[Parameter],
    getParameterName: () => String,
    getViz: () => Viz
  ): ParameterEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getParameterAsync = js.Any.fromFunction0(getParameterAsync), getParameterName = js.Any.fromFunction0(getParameterName), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[ParameterEvent]
  }
  @scala.inline
  implicit class ParameterEventOps[Self <: ParameterEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetParameterAsync(value: () => js.Promise[Parameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameterAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParameterName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameterName")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

