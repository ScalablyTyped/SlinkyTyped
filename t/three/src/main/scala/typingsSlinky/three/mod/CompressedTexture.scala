package typingsSlinky.three.mod

import org.scalajs.dom.raw.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "CompressedTexture")
@js.native
class CompressedTexture protected ()
  extends typingsSlinky.three.compressedTextureMod.CompressedTexture {
  /**
  	 * @param mipmaps
  	 * @param width
  	 * @param height
  	 * @param [format=THREE.RGBAFormat]
  	 * @param [type=THREE.UnsignedByteType]
  	 * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
  	 * @param [wrapS=THREE.ClampToEdgeWrapping]
  	 * @param [wrapT=THREE.ClampToEdgeWrapping]
  	 * @param [magFilter=THREE.LinearFilter]
  	 * @param [minFilter=THREE.LinearMipmapLinearFilter]
  	 * @param [anisotropy=1]
  	 * @param [encoding=THREE.LinearEncoding]
  	 */
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
