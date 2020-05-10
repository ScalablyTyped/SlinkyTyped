package typingsSlinky.waypoints

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFindByElement extends js.Object {
  def findByElement(element: HTMLElement): js.UndefOr[WaypointContext] = js.native
}

object AnonFindByElement {
  @scala.inline
  def apply(findByElement: HTMLElement => js.UndefOr[WaypointContext]): AnonFindByElement = {
    val __obj = js.Dynamic.literal(findByElement = js.Any.fromFunction1(findByElement))
    __obj.asInstanceOf[AnonFindByElement]
  }
  @scala.inline
  implicit class AnonFindByElementOps[Self <: AnonFindByElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindByElement(value: HTMLElement => js.UndefOr[WaypointContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findByElement")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

