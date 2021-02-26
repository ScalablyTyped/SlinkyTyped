package typingsSlinky.three

import typingsSlinky.three.constantsMod.Mapping
import typingsSlinky.three.constantsMod.PixelFormat
import typingsSlinky.three.constantsMod.TextureDataType
import typingsSlinky.three.constantsMod.TextureEncoding
import typingsSlinky.three.constantsMod.TextureFilter
import typingsSlinky.three.constantsMod.Wrapping
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cubeTextureMod {
  
  @JSImport("three/src/textures/CubeTexture", "CubeTexture")
  @js.native
  class CubeTexture protected () extends Texture {
    /**
    	 * @param [images=[]]
    	 * @param [mapping=THREE.CubeReflectionMapping]
    	 * @param [wrapS=THREE.ClampToEdgeWrapping]
    	 * @param [wrapT=THREE.ClampToEdgeWrapping]
    	 * @param [magFilter=THREE.LinearFilter]
    	 * @param [minFilter=THREE.LinearMipmapLinearFilter]
    	 * @param [format=THREE.RGBFormat]
    	 * @param [type=THREE.UnsignedByteType]
    	 * @param [anisotropy=1]
    	 * @param [encoding=THREE.LinearEncoding]
    	 */
    def this(
      images: js.UndefOr[js.Array[_]],
      // HTMLImageElement or HTMLCanvasElement
    mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
    
    var images: js.Any = js.native
    
    val isCubeTexture: `true` = js.native
  }
}
