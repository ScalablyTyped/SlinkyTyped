package typingsSlinky.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EXTFragDepth extends js.Object {
  val __EXT_frag_depth: Unit = js.native
}

object EXTFragDepth {
  @scala.inline
  def apply(__EXT_frag_depth: Unit): EXTFragDepth = {
    val __obj = js.Dynamic.literal(__EXT_frag_depth = __EXT_frag_depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTFragDepth]
  }
  @scala.inline
  implicit class EXTFragDepthOps[Self <: EXTFragDepth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__EXT_frag_depth(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__EXT_frag_depth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

