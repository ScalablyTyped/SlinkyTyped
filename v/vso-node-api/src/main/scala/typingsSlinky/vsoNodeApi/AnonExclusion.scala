package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExclusion extends js.Object {
  var exclusion: Double = js.native
  var inclusion: Double = js.native
}

object AnonExclusion {
  @scala.inline
  def apply(exclusion: Double, inclusion: Double): AnonExclusion = {
    val __obj = js.Dynamic.literal(exclusion = exclusion.asInstanceOf[js.Any], inclusion = inclusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExclusion]
  }
  @scala.inline
  implicit class AnonExclusionOps[Self <: AnonExclusion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclusion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

