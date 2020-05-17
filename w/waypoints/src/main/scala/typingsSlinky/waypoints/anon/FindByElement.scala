package typingsSlinky.waypoints.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.waypoints.WaypointContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindByElement extends js.Object {
  def findByElement(element: HTMLElement): js.UndefOr[WaypointContext] = js.native
}

object FindByElement {
  @scala.inline
  def apply(findByElement: HTMLElement => js.UndefOr[WaypointContext]): FindByElement = {
    val __obj = js.Dynamic.literal(findByElement = js.Any.fromFunction1(findByElement))
    __obj.asInstanceOf[FindByElement]
  }
  @scala.inline
  implicit class FindByElementOps[Self <: FindByElement] (val x: Self) extends AnyVal {
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

