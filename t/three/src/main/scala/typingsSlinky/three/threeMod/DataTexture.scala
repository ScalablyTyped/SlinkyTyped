package typingsSlinky.three.threeMod

import typingsSlinky.three.srcPolyfillsMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "DataTexture")
@js.native
class DataTexture protected ()
  extends typingsSlinky.three.srcTexturesDataTextureMod.DataTexture {
  def this(
    data: TypedArray,
    width: Double,
    height: Double,
    format: js.UndefOr[typingsSlinky.three.srcConstantsMod.PixelFormat],
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

