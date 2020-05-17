package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightMap extends js.Object {
  var lightMap: IUniform = js.native
  var lightMapIntensity: IUniform = js.native
}

object LightMap {
  @scala.inline
  def apply(lightMap: IUniform, lightMapIntensity: IUniform): LightMap = {
    val __obj = js.Dynamic.literal(lightMap = lightMap.asInstanceOf[js.Any], lightMapIntensity = lightMapIntensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightMap]
  }
  @scala.inline
  implicit class LightMapOps[Self <: LightMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLightMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightMapIntensity(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightMapIntensity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

