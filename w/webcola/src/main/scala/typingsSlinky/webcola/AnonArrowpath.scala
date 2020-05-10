package typingsSlinky.webcola

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArrowpath extends js.Object {
  var arrowpath: String = js.native
  var routepath: String = js.native
}

object AnonArrowpath {
  @scala.inline
  def apply(arrowpath: String, routepath: String): AnonArrowpath = {
    val __obj = js.Dynamic.literal(arrowpath = arrowpath.asInstanceOf[js.Any], routepath = routepath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrowpath]
  }
  @scala.inline
  implicit class AnonArrowpathOps[Self <: AnonArrowpath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutepath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routepath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

