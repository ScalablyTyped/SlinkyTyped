package typingsSlinky.three

import typingsSlinky.three.lightMod.Light
import typingsSlinky.three.webGLLightsMod.WebGLLights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLights extends js.Object {
  var lights: WebGLLights = js.native
  var lightsArray: js.Array[Light] = js.native
  var shadowsArray: js.Array[Light] = js.native
}

object AnonLights {
  @scala.inline
  def apply(lights: WebGLLights, lightsArray: js.Array[Light], shadowsArray: js.Array[Light]): AnonLights = {
    val __obj = js.Dynamic.literal(lights = lights.asInstanceOf[js.Any], lightsArray = lightsArray.asInstanceOf[js.Any], shadowsArray = shadowsArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLights]
  }
  @scala.inline
  implicit class AnonLightsOps[Self <: AnonLights] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLights(value: WebGLLights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightsArray(value: js.Array[Light]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightsArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowsArray(value: js.Array[Light]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowsArray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

