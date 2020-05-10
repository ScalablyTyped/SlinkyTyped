package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EXTBlendMinmax extends js.Object {
  val MAX_EXT: GLenum = js.native
  val MIN_EXT: GLenum = js.native
}

object EXTBlendMinmax {
  @scala.inline
  def apply(MAX_EXT: GLenum, MIN_EXT: GLenum): EXTBlendMinmax = {
    val __obj = js.Dynamic.literal(MAX_EXT = MAX_EXT.asInstanceOf[js.Any], MIN_EXT = MIN_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTBlendMinmax]
  }
  @scala.inline
  implicit class EXTBlendMinmaxOps[Self <: EXTBlendMinmax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMAX_EXT(value: GLenum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIN_EXT(value: GLenum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN_EXT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

