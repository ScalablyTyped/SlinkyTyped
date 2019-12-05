package typingsSlinky.threeDashTdsDashLoader

import typingsSlinky.three.Anon_AlphaMap
import typingsSlinky.three.Anon_AmbientLightColor
import typingsSlinky.three.Anon_AoMap
import typingsSlinky.three.Anon_BumpMap
import typingsSlinky.three.Anon_Diffuse
import typingsSlinky.three.Anon_DisplacementBias
import typingsSlinky.three.Anon_EmissiveMap
import typingsSlinky.three.Anon_EnvMap
import typingsSlinky.three.Anon_FogColor
import typingsSlinky.three.Anon_GradientMap
import typingsSlinky.three.Anon_LightMap
import typingsSlinky.three.Anon_MetalnessMap
import typingsSlinky.three.Anon_NormalMap
import typingsSlinky.three.Anon_RoughnessMap
import typingsSlinky.three.Anon_SpecularMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aomap extends js.Object {
  var aomap: Anon_AoMap
  var bumpmap: Anon_BumpMap
  var common: Anon_AlphaMap
  var displacementmap: Anon_DisplacementBias
  var emissivemap: Anon_EmissiveMap
  var envmap: Anon_EnvMap
  var fog: Anon_FogColor
  var gradientmap: Anon_GradientMap
  var lightmap: Anon_LightMap
  var lights: Anon_AmbientLightColor
  var metalnessmap: Anon_MetalnessMap
  var normalmap: Anon_NormalMap
  var points: Anon_Diffuse
  var roughnessmap: Anon_RoughnessMap
  var specularmap: Anon_SpecularMap
}

object Anon_Aomap {
  @scala.inline
  def apply(
    aomap: Anon_AoMap,
    bumpmap: Anon_BumpMap,
    common: Anon_AlphaMap,
    displacementmap: Anon_DisplacementBias,
    emissivemap: Anon_EmissiveMap,
    envmap: Anon_EnvMap,
    fog: Anon_FogColor,
    gradientmap: Anon_GradientMap,
    lightmap: Anon_LightMap,
    lights: Anon_AmbientLightColor,
    metalnessmap: Anon_MetalnessMap,
    normalmap: Anon_NormalMap,
    points: Anon_Diffuse,
    roughnessmap: Anon_RoughnessMap,
    specularmap: Anon_SpecularMap
  ): Anon_Aomap = {
    val __obj = js.Dynamic.literal(aomap = aomap.asInstanceOf[js.Any], bumpmap = bumpmap.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], displacementmap = displacementmap.asInstanceOf[js.Any], emissivemap = emissivemap.asInstanceOf[js.Any], envmap = envmap.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], gradientmap = gradientmap.asInstanceOf[js.Any], lightmap = lightmap.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], metalnessmap = metalnessmap.asInstanceOf[js.Any], normalmap = normalmap.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], roughnessmap = roughnessmap.asInstanceOf[js.Any], specularmap = specularmap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Aomap]
  }
}

