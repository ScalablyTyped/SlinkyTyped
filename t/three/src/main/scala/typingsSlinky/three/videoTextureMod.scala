package typingsSlinky.three

import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.three.constantsMod.Mapping
import typingsSlinky.three.constantsMod.PixelFormat
import typingsSlinky.three.constantsMod.TextureDataType
import typingsSlinky.three.constantsMod.TextureFilter
import typingsSlinky.three.constantsMod.Wrapping
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/textures/VideoTexture", JSImport.Namespace)
@js.native
object videoTextureMod extends js.Object {
  
  @js.native
  class VideoTexture protected () extends Texture {
    /**
    	 * @param video
    	 * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
    	 * @param [wrapS=THREE.ClampToEdgeWrapping]
    	 * @param [wrapT=THREE.ClampToEdgeWrapping]
    	 * @param [magFilter=THREE.LinearFilter]
    	 * @param [minFilter=THREE.LinearFilter]
    	 * @param [format=THREE.RGBFormat]
    	 * @param [type=THREE.UnsignedByteType]
    	 * @param [anisotropy=1]
    	 */
    def this(
      video: HTMLVideoElement,
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double]
    ) = this()
    
    val isVideoTexture: `true` = js.native
  }
}
