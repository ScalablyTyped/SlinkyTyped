package typingsSlinky.three

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.three.srcConstantsMod.Mapping
import typingsSlinky.three.srcConstantsMod.PixelFormat
import typingsSlinky.three.srcConstantsMod.TextureDataType
import typingsSlinky.three.srcConstantsMod.TextureFilter
import typingsSlinky.three.srcConstantsMod.Wrapping
import typingsSlinky.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/CanvasTexture", JSImport.Namespace)
@js.native
object srcTexturesCanvasTextureMod extends js.Object {
  @js.native
  class CanvasTexture protected () extends Texture {
    def this(
      canvas: HTMLCanvasElement,
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double]
    ) = this()
    def this(
      canvas: HTMLImageElement,
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double]
    ) = this()
    def this(
      canvas: HTMLVideoElement,
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double]
    ) = this()
  }
  
}

