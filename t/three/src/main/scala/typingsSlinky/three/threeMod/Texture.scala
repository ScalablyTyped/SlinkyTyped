package typingsSlinky.three.threeMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Texture")
@js.native
class Texture protected ()
  extends typingsSlinky.three.srcTexturesTextureMod.Texture {
  def this(
    image: js.UndefOr[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement],
    mapping: js.UndefOr[typingsSlinky.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typingsSlinky.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typingsSlinky.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typingsSlinky.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsSlinky.three.srcConstantsMod.TextureFilter],
    format: js.UndefOr[typingsSlinky.three.srcConstantsMod.PixelFormat],
    `type`: js.UndefOr[typingsSlinky.three.srcConstantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typingsSlinky.three.srcConstantsMod.TextureEncoding]
  ) = this()
}

/* static members */
@JSImport("three", "Texture")
@js.native
object Texture extends js.Object {
  var DEFAULT_IMAGE: js.Any = js.native
  var DEFAULT_MAPPING: js.Any = js.native
}

