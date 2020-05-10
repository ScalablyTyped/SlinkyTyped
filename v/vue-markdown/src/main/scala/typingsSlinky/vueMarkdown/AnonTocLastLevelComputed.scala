package typingsSlinky.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTocLastLevelComputed extends js.Object {
  var tocLastLevelComputed: js.Any = js.native
}

object AnonTocLastLevelComputed {
  @scala.inline
  def apply(tocLastLevelComputed: js.Any): AnonTocLastLevelComputed = {
    val __obj = js.Dynamic.literal(tocLastLevelComputed = tocLastLevelComputed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTocLastLevelComputed]
  }
  @scala.inline
  implicit class AnonTocLastLevelComputedOps[Self <: AnonTocLastLevelComputed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTocLastLevelComputed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tocLastLevelComputed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

