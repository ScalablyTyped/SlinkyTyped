package typingsSlinky.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprojectOptions extends ProjectOptions {
  var targetZ: js.UndefOr[Double] = js.native
}

object UnprojectOptions {
  @scala.inline
  def apply(): UnprojectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprojectOptions]
  }
  @scala.inline
  implicit class UnprojectOptionsOps[Self <: UnprojectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetZ")(js.undefined)
        ret
    }
  }
  
}

