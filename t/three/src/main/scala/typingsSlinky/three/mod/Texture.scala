package typingsSlinky.three.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Texture")
@js.native
class Texture protected ()
  extends typingsSlinky.three.textureMod.Texture {
  /**
  	 * @param [image]
  	 * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
  	 * @param [wrapS=THREE.ClampToEdgeWrapping]
  	 * @param [wrapT=THREE.ClampToEdgeWrapping]
  	 * @param [magFilter=THREE.LinearFilter]
  	 * @param [minFilter=THREE.LinearMipmapLinearFilter]
  	 * @param [format=THREE.RGBAFormat]
  	 * @param [type=THREE.UnsignedByteType]
  	 * @param [anisotropy=1]
  	 * @param [encoding=THREE.LinearEncoding]
  	 */
  def this(
    image: js.UndefOr[HTMLImageElement | HTMLCanvasElement | HTMLVideoElement],
    mapping: js.UndefOr[typingsSlinky.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typingsSlinky.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typingsSlinky.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typingsSlinky.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsSlinky.three.constantsMod.TextureFilter],
    format: js.UndefOr[typingsSlinky.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typingsSlinky.three.constantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typingsSlinky.three.constantsMod.TextureEncoding]
  ) = this()
}
/* static members */
@JSImport("three", "Texture")
@js.native
object Texture extends js.Object {
  
  var DEFAULT_IMAGE: js.Any = js.native
  
  var DEFAULT_MAPPING: js.Any = js.native
}
