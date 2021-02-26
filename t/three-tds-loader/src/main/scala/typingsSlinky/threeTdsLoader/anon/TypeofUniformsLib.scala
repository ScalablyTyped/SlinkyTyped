package typingsSlinky.threeTdsLoader.anon

import typingsSlinky.three.anon.AlphaMap
import typingsSlinky.three.anon.AmbientLightColor
import typingsSlinky.three.anon.AoMap
import typingsSlinky.three.anon.BumpMap
import typingsSlinky.three.anon.Diffuse
import typingsSlinky.three.anon.DisplacementBias
import typingsSlinky.three.anon.EmissiveMap
import typingsSlinky.three.anon.EnvMap
import typingsSlinky.three.anon.FogColor
import typingsSlinky.three.anon.GradientMap
import typingsSlinky.three.anon.LightMap
import typingsSlinky.three.anon.MetalnessMap
import typingsSlinky.three.anon.NormalMap
import typingsSlinky.three.anon.RoughnessMap
import typingsSlinky.three.anon.SpecularMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofUniformsLib extends StObject {
  
  var aomap: AoMap = js.native
  
  var bumpmap: BumpMap = js.native
  
  var common: AlphaMap = js.native
  
  var displacementmap: DisplacementBias = js.native
  
  var emissivemap: EmissiveMap = js.native
  
  var envmap: EnvMap = js.native
  
  var fog: FogColor = js.native
  
  var gradientmap: GradientMap = js.native
  
  var lightmap: LightMap = js.native
  
  var lights: AmbientLightColor = js.native
  
  var metalnessmap: MetalnessMap = js.native
  
  var normalmap: NormalMap = js.native
  
  var points: Diffuse = js.native
  
  var roughnessmap: RoughnessMap = js.native
  
  var specularmap: SpecularMap = js.native
}
object TypeofUniformsLib {
  
  @scala.inline
  def apply(
    aomap: AoMap,
    bumpmap: BumpMap,
    common: AlphaMap,
    displacementmap: DisplacementBias,
    emissivemap: EmissiveMap,
    envmap: EnvMap,
    fog: FogColor,
    gradientmap: GradientMap,
    lightmap: LightMap,
    lights: AmbientLightColor,
    metalnessmap: MetalnessMap,
    normalmap: NormalMap,
    points: Diffuse,
    roughnessmap: RoughnessMap,
    specularmap: SpecularMap
  ): TypeofUniformsLib = {
    val __obj = js.Dynamic.literal(aomap = aomap.asInstanceOf[js.Any], bumpmap = bumpmap.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], displacementmap = displacementmap.asInstanceOf[js.Any], emissivemap = emissivemap.asInstanceOf[js.Any], envmap = envmap.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], gradientmap = gradientmap.asInstanceOf[js.Any], lightmap = lightmap.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], metalnessmap = metalnessmap.asInstanceOf[js.Any], normalmap = normalmap.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], roughnessmap = roughnessmap.asInstanceOf[js.Any], specularmap = specularmap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUniformsLib]
  }
  
  @scala.inline
  implicit class TypeofUniformsLibMutableBuilder[Self <: TypeofUniformsLib] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAomap(value: AoMap): Self = StObject.set(x, "aomap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBumpmap(value: BumpMap): Self = StObject.set(x, "bumpmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommon(value: AlphaMap): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplacementmap(value: DisplacementBias): Self = StObject.set(x, "displacementmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmissivemap(value: EmissiveMap): Self = StObject.set(x, "emissivemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvmap(value: EnvMap): Self = StObject.set(x, "envmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFog(value: FogColor): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientmap(value: GradientMap): Self = StObject.set(x, "gradientmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightmap(value: LightMap): Self = StObject.set(x, "lightmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLights(value: AmbientLightColor): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetalnessmap(value: MetalnessMap): Self = StObject.set(x, "metalnessmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalmap(value: NormalMap): Self = StObject.set(x, "normalmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: Diffuse): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoughnessmap(value: RoughnessMap): Self = StObject.set(x, "roughnessmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularmap(value: SpecularMap): Self = StObject.set(x, "specularmap", value.asInstanceOf[js.Any])
  }
}
