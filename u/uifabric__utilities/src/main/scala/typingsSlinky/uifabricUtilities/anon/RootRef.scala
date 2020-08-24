package typingsSlinky.uifabricUtilities.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootRef extends js.Object {
  var rootRef: js.UndefOr[ReactRef[HTMLElement]] = js.native
}

object RootRef {
  @scala.inline
  def apply(): RootRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootRef]
  }
  @scala.inline
  implicit class RootRefOps[Self <: RootRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRootRef(value: ReactRef[HTMLElement]): Self = this.set("rootRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootRef: Self = this.set("rootRef", js.undefined)
  }
  
}

