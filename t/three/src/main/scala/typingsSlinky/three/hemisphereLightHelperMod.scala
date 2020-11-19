package typingsSlinky.three

import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.hemisphereLightMod.HemisphereLight
import typingsSlinky.three.meshBasicMaterialMod.MeshBasicMaterial
import typingsSlinky.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/helpers/HemisphereLightHelper", JSImport.Namespace)
@js.native
object hemisphereLightHelperMod extends js.Object {
  
  @js.native
  class HemisphereLightHelper protected () extends Object3D {
    def this(light: HemisphereLight, size: Double) = this()
    def this(light: HemisphereLight, size: Double, color: String) = this()
    def this(light: HemisphereLight, size: Double, color: Double) = this()
    def this(light: HemisphereLight, size: Double, color: Color) = this()
    
    var color: js.UndefOr[Color | String | Double] = js.native
    
    def dispose(): Unit = js.native
    
    var light: HemisphereLight = js.native
    
    var material: MeshBasicMaterial = js.native
    
    def update(): Unit = js.native
  }
}
