package typingsSlinky.three

import org.scalajs.dom.raw.ImageData
import typingsSlinky.three.anon.HeightWidth
import typingsSlinky.three.constantsMod.CompressedPixelFormat
import typingsSlinky.three.constantsMod.Mapping
import typingsSlinky.three.constantsMod.TextureDataType
import typingsSlinky.three.constantsMod.TextureEncoding
import typingsSlinky.three.constantsMod.TextureFilter
import typingsSlinky.three.constantsMod.Wrapping
import typingsSlinky.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/CompressedTexture", JSImport.Namespace)
@js.native
object compressedTextureMod extends js.Object {
  @js.native
  class CompressedTexture protected () extends Texture {
    def this(
      mipmaps: js.Array[ImageData],
      width: Double,
      height: Double,
      format: js.UndefOr[CompressedPixelFormat],
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
    @JSName("image")
    var image_CompressedTexture: HeightWidth = js.native
  }
  
}

