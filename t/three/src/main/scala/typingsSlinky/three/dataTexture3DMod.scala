package typingsSlinky.three

import typingsSlinky.three.polyfillsMod.TypedArray
import typingsSlinky.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/DataTexture3D", JSImport.Namespace)
@js.native
object dataTexture3DMod extends js.Object {
  @js.native
  class DataTexture3D protected () extends Texture {
    def this(data: TypedArray, width: Double, height: Double, depth: Double) = this()
  }
  
}

