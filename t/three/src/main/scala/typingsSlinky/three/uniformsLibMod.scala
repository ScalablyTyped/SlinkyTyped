package typingsSlinky.three

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

object uniformsLibMod {
  
  object UniformsLib {
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.aomap")
    @js.native
    def aomap: AoMap = js.native
    @scala.inline
    def aomap_=(x: AoMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aomap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.bumpmap")
    @js.native
    def bumpmap: BumpMap = js.native
    @scala.inline
    def bumpmap_=(x: BumpMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bumpmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.common")
    @js.native
    def common: AlphaMap = js.native
    @scala.inline
    def common_=(x: AlphaMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("common")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.displacementmap")
    @js.native
    def displacementmap: DisplacementBias = js.native
    @scala.inline
    def displacementmap_=(x: DisplacementBias): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displacementmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.emissivemap")
    @js.native
    def emissivemap: EmissiveMap = js.native
    @scala.inline
    def emissivemap_=(x: EmissiveMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emissivemap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.envmap")
    @js.native
    def envmap: EnvMap = js.native
    @scala.inline
    def envmap_=(x: EnvMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("envmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.fog")
    @js.native
    def fog: FogColor = js.native
    @scala.inline
    def fog_=(x: FogColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fog")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.gradientmap")
    @js.native
    def gradientmap: GradientMap = js.native
    @scala.inline
    def gradientmap_=(x: GradientMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gradientmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.lightmap")
    @js.native
    def lightmap: LightMap = js.native
    @scala.inline
    def lightmap_=(x: LightMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.lights")
    @js.native
    def lights: AmbientLightColor = js.native
    @scala.inline
    def lights_=(x: AmbientLightColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lights")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.metalnessmap")
    @js.native
    def metalnessmap: MetalnessMap = js.native
    @scala.inline
    def metalnessmap_=(x: MetalnessMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metalnessmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.normalmap")
    @js.native
    def normalmap: NormalMap = js.native
    @scala.inline
    def normalmap_=(x: NormalMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.points")
    @js.native
    def points: Diffuse = js.native
    @scala.inline
    def points_=(x: Diffuse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("points")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.roughnessmap")
    @js.native
    def roughnessmap: RoughnessMap = js.native
    @scala.inline
    def roughnessmap_=(x: RoughnessMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roughnessmap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/UniformsLib", "UniformsLib.specularmap")
    @js.native
    def specularmap: SpecularMap = js.native
    @scala.inline
    def specularmap_=(x: SpecularMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specularmap")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IUniform extends StObject {
    
    var value: js.Any = js.native
  }
  object IUniform {
    
    @scala.inline
    def apply(value: js.Any): IUniform = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUniform]
    }
    
    @scala.inline
    implicit class IUniformMutableBuilder[Self <: IUniform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
