package typingsSlinky.three.threeMod

import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "CompressedTexture")
@js.native
class CompressedTexture protected ()
  extends typingsSlinky.three.srcTexturesCompressedTextureMod.CompressedTexture {
  def this(
    mipmaps: js.Array[ImageData],
    width: Double,
    height: Double,
    format: js.UndefOr[typingsSlinky.three.srcConstantsMod.CompressedPixelFormat],
    `type`: js.UndefOr[typingsSlinky.three.srcConstantsMod.TextureDataType],
    mapping: js.UndefOr[typingsSlinky.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typingsSlinky.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typingsSlinky.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typingsSlinky.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsSlinky.three.srcConstantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typingsSlinky.three.srcConstantsMod.TextureEncoding]
  ) = this()
}

