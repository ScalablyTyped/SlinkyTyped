package typingsSlinky.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskOptionsCore extends js.Object {
  def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
}

object IPrintTaskOptionsCore {
  @scala.inline
  def apply(getPageDescription: Double => PrintPageDescription): IPrintTaskOptionsCore = {
    val __obj = js.Dynamic.literal(getPageDescription = js.Any.fromFunction1(getPageDescription))
    __obj.asInstanceOf[IPrintTaskOptionsCore]
  }
  @scala.inline
  implicit class IPrintTaskOptionsCoreOps[Self <: IPrintTaskOptionsCore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPageDescription(value: Double => PrintPageDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageDescription")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

