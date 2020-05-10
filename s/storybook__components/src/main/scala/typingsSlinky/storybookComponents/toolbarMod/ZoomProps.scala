package typingsSlinky.storybookComponents.toolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomProps extends js.Object {
  def resetZoom(): Unit = js.native
  def zoom(`val`: Double): Unit = js.native
}

object ZoomProps {
  @scala.inline
  def apply(resetZoom: () => Unit, zoom: Double => Unit): ZoomProps = {
    val __obj = js.Dynamic.literal(resetZoom = js.Any.fromFunction0(resetZoom), zoom = js.Any.fromFunction1(zoom))
    __obj.asInstanceOf[ZoomProps]
  }
  @scala.inline
  implicit class ZoomPropsOps[Self <: ZoomProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResetZoom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withZoom(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

