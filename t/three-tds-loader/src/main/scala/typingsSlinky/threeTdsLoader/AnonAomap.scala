package typingsSlinky.threeTdsLoader

import typingsSlinky.three.AnonAlphaMap
import typingsSlinky.three.AnonAmbientLightColor
import typingsSlinky.three.AnonAoMap
import typingsSlinky.three.AnonBumpMap
import typingsSlinky.three.AnonDiffuse
import typingsSlinky.three.AnonDisplacementBias
import typingsSlinky.three.AnonEmissiveMap
import typingsSlinky.three.AnonEnvMap
import typingsSlinky.three.AnonFogColor
import typingsSlinky.three.AnonGradientMap
import typingsSlinky.three.AnonLightMap
import typingsSlinky.three.AnonMetalnessMap
import typingsSlinky.three.AnonNormalMap
import typingsSlinky.three.AnonRoughnessMap
import typingsSlinky.three.AnonSpecularMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAomap extends js.Object {
  var aomap: AnonAoMap = js.native
  var bumpmap: AnonBumpMap = js.native
  var common: AnonAlphaMap = js.native
  var displacementmap: AnonDisplacementBias = js.native
  var emissivemap: AnonEmissiveMap = js.native
  var envmap: AnonEnvMap = js.native
  var fog: AnonFogColor = js.native
  var gradientmap: AnonGradientMap = js.native
  var lightmap: AnonLightMap = js.native
  var lights: AnonAmbientLightColor = js.native
  var metalnessmap: AnonMetalnessMap = js.native
  var normalmap: AnonNormalMap = js.native
  var points: AnonDiffuse = js.native
  var roughnessmap: AnonRoughnessMap = js.native
  var specularmap: AnonSpecularMap = js.native
}

object AnonAomap {
  @scala.inline
  def apply(
    aomap: AnonAoMap,
    bumpmap: AnonBumpMap,
    common: AnonAlphaMap,
    displacementmap: AnonDisplacementBias,
    emissivemap: AnonEmissiveMap,
    envmap: AnonEnvMap,
    fog: AnonFogColor,
    gradientmap: AnonGradientMap,
    lightmap: AnonLightMap,
    lights: AnonAmbientLightColor,
    metalnessmap: AnonMetalnessMap,
    normalmap: AnonNormalMap,
    points: AnonDiffuse,
    roughnessmap: AnonRoughnessMap,
    specularmap: AnonSpecularMap
  ): AnonAomap = {
    val __obj = js.Dynamic.literal(aomap = aomap.asInstanceOf[js.Any], bumpmap = bumpmap.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], displacementmap = displacementmap.asInstanceOf[js.Any], emissivemap = emissivemap.asInstanceOf[js.Any], envmap = envmap.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], gradientmap = gradientmap.asInstanceOf[js.Any], lightmap = lightmap.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], metalnessmap = metalnessmap.asInstanceOf[js.Any], normalmap = normalmap.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], roughnessmap = roughnessmap.asInstanceOf[js.Any], specularmap = specularmap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAomap]
  }
  @scala.inline
  implicit class AnonAomapOps[Self <: AnonAomap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAomap(value: AnonAoMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aomap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBumpmap(value: AnonBumpMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommon(value: AnonAlphaMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplacementmap(value: AnonDisplacementBias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displacementmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmissivemap(value: AnonEmissiveMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissivemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvmap(value: AnonEnvMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFog(value: AnonFogColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientmap(value: AnonGradientMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightmap(value: AnonLightMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLights(value: AnonAmbientLightColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetalnessmap(value: AnonMetalnessMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalnessmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalmap(value: AnonNormalMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: AnonDiffuse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoughnessmap(value: AnonRoughnessMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roughnessmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecularmap(value: AnonSpecularMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularmap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

