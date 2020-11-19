package typingsSlinky.three.mod

import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "CompressedTexture")
@js.native
class CompressedTexture protected ()
  extends typingsSlinky.three.compressedTextureMod.CompressedTexture {
  def this(
    mipmaps: js.Array[ImageData],
    width: Double,
    height: Double,
    format: js.UndefOr[typingsSlinky.three.constantsMod.CompressedPixelFormat],
    `type`: js.UndefOr[typingsSlinky.three.constantsMod.TextureDataType],
    mapping: js.UndefOr[typingsSlinky.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typingsSlinky.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typingsSlinky.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typingsSlinky.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsSlinky.three.constantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typingsSlinky.three.constantsMod.TextureEncoding]
  ) = this()
}
