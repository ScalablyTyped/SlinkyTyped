package typingsSlinky.three

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplacementBias extends js.Object {
  var displacementBias: IUniform = js.native
  var displacementMap: IUniform = js.native
  var displacementScale: IUniform = js.native
}

object AnonDisplacementBias {
  @scala.inline
  def apply(displacementBias: IUniform, displacementMap: IUniform, displacementScale: IUniform): AnonDisplacementBias = {
    val __obj = js.Dynamic.literal(displacementBias = displacementBias.asInstanceOf[js.Any], displacementMap = displacementMap.asInstanceOf[js.Any], displacementScale = displacementScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplacementBias]
  }
  @scala.inline
  implicit class AnonDisplacementBiasOps[Self <: AnonDisplacementBias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplacementBias(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplacementMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplacementScale(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementScale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

