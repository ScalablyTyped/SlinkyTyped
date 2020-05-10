package typingsSlinky.three

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFogColor extends js.Object {
  var fogColor: IUniform = js.native
  var fogDensity: IUniform = js.native
  var fogFar: IUniform = js.native
  var fogNear: IUniform = js.native
}

object AnonFogColor {
  @scala.inline
  def apply(fogColor: IUniform, fogDensity: IUniform, fogFar: IUniform, fogNear: IUniform): AnonFogColor = {
    val __obj = js.Dynamic.literal(fogColor = fogColor.asInstanceOf[js.Any], fogDensity = fogDensity.asInstanceOf[js.Any], fogFar = fogFar.asInstanceOf[js.Any], fogNear = fogNear.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFogColor]
  }
  @scala.inline
  implicit class AnonFogColorOps[Self <: AnonFogColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFogColor(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fogColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFogDensity(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fogDensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFogFar(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fogFar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFogNear(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fogNear")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

