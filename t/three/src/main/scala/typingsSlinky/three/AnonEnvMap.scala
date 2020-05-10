package typingsSlinky.three

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnvMap extends js.Object {
  var envMap: IUniform = js.native
  var flipEnvMap: IUniform = js.native
  var maxMipLevel: IUniform = js.native
  var reflectivity: IUniform = js.native
  var refractionRatio: IUniform = js.native
}

object AnonEnvMap {
  @scala.inline
  def apply(
    envMap: IUniform,
    flipEnvMap: IUniform,
    maxMipLevel: IUniform,
    reflectivity: IUniform,
    refractionRatio: IUniform
  ): AnonEnvMap = {
    val __obj = js.Dynamic.literal(envMap = envMap.asInstanceOf[js.Any], flipEnvMap = flipEnvMap.asInstanceOf[js.Any], maxMipLevel = maxMipLevel.asInstanceOf[js.Any], reflectivity = reflectivity.asInstanceOf[js.Any], refractionRatio = refractionRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnvMap]
  }
  @scala.inline
  implicit class AnonEnvMapOps[Self <: AnonEnvMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlipEnvMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipEnvMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMipLevel(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMipLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReflectivity(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefractionRatio(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refractionRatio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

