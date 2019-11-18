package typingsSlinky.three

import org.scalajs.dom.raw.ImageData
import typingsSlinky.three.srcConstantsMod.CompressedPixelFormat
import typingsSlinky.three.srcConstantsMod.Mapping
import typingsSlinky.three.srcConstantsMod.TextureDataType
import typingsSlinky.three.srcConstantsMod.TextureEncoding
import typingsSlinky.three.srcConstantsMod.TextureFilter
import typingsSlinky.three.srcConstantsMod.Wrapping
import typingsSlinky.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/CompressedTexture", JSImport.Namespace)
@js.native
object srcTexturesCompressedTextureMod extends js.Object {
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
    var image_CompressedTexture: Anon_HeightWidth = js.native
  }
  
}

