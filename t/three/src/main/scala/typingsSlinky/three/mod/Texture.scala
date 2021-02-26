package typingsSlinky.three.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalablytyped.runtime.StObject
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
object Texture {
  
  @JSImport("three", "Texture")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three", "Texture.DEFAULT_IMAGE")
  @js.native
  def DEFAULT_IMAGE: js.Any = js.native
  @scala.inline
  def DEFAULT_IMAGE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_IMAGE")(x.asInstanceOf[js.Any])
  
  @JSImport("three", "Texture.DEFAULT_MAPPING")
  @js.native
  def DEFAULT_MAPPING: js.Any = js.native
  @scala.inline
  def DEFAULT_MAPPING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAPPING")(x.asInstanceOf[js.Any])
}
