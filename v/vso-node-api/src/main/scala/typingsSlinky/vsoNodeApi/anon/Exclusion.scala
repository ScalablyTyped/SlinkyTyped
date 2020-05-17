package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exclusion extends js.Object {
  var exclusion: scala.Double = js.native
  var inclusion: scala.Double = js.native
}

object Exclusion {
  @scala.inline
  def apply(exclusion: scala.Double, inclusion: scala.Double): Exclusion = {
    val __obj = js.Dynamic.literal(exclusion = exclusion.asInstanceOf[js.Any], inclusion = inclusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclusion]
  }
  @scala.inline
  implicit class ExclusionOps[Self <: Exclusion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusion(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclusion(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

