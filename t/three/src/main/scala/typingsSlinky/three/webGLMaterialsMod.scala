package typingsSlinky.three

import typingsSlinky.three.fogMod.IFog
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.webGLPropertiesMod.WebGLProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLMaterialsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLMaterials", "WebGLMaterials")
  @js.native
  class WebGLMaterials protected () extends StObject {
    def this(properties: WebGLProperties) = this()
    
    def refreshFogUniforms(uniforms: js.Object, fog: IFog): Unit = js.native
    
    def refreshMaterialUniforms(uniforms: js.Object, material: Material, pixelRatio: Double, height: Double): Unit = js.native
  }
}
