package typingsSlinky.three

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGradientMap extends js.Object {
  var gradientMap: IUniform = js.native
}

object AnonGradientMap {
  @scala.inline
  def apply(gradientMap: IUniform): AnonGradientMap = {
    val __obj = js.Dynamic.literal(gradientMap = gradientMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGradientMap]
  }
  @scala.inline
  implicit class AnonGradientMapOps[Self <: AnonGradientMap] (val x: Self) extends AnyVal {
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

