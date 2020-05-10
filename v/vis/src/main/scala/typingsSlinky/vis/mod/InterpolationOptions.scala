package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterpolationOptions extends js.Object {
  var parametrization: ParametrizationInterpolationType = js.native
}

object InterpolationOptions {
  @scala.inline
  def apply(parametrization: ParametrizationInterpolationType): InterpolationOptions = {
    val __obj = js.Dynamic.literal(parametrization = parametrization.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationOptions]
  }
  @scala.inline
  implicit class InterpolationOptionsOps[Self <: InterpolationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParametrization(value: ParametrizationInterpolationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parametrization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

