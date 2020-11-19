package typingsSlinky.three

import typingsSlinky.three.constantsMod.Mapping
import typingsSlinky.three.constantsMod.PixelFormat
import typingsSlinky.three.constantsMod.TextureDataType
import typingsSlinky.three.constantsMod.TextureEncoding
import typingsSlinky.three.constantsMod.TextureFilter
import typingsSlinky.three.constantsMod.Wrapping
import typingsSlinky.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/textures/CubeTexture", JSImport.Namespace)
@js.native
object cubeTextureMod extends js.Object {
  
  @js.native
  class CubeTexture protected () extends Texture {
    def this(
       // HTMLImageElement or HTMLCanvasElement
    images: js.UndefOr[js.Array[_]],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
    
    var images: js.Any = js.native
  }
}
