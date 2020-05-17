package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientMap extends js.Object {
  var gradientMap: IUniform = js.native
}

object GradientMap {
  @scala.inline
  def apply(gradientMap: IUniform): GradientMap = {
    val __obj = js.Dynamic.literal(gradientMap = gradientMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientMap]
  }
  @scala.inline
  implicit class GradientMapOps[Self <: GradientMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGradientMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

