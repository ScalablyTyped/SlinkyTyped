package typingsSlinky.three

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.three.constantsMod.Mapping
import typingsSlinky.three.constantsMod.PixelFormat
import typingsSlinky.three.constantsMod.PixelFormatGPU
import typingsSlinky.three.constantsMod.TextureDataType
import typingsSlinky.three.constantsMod.TextureEncoding
import typingsSlinky.three.constantsMod.TextureFilter
import typingsSlinky.three.constantsMod.Wrapping
import typingsSlinky.three.eventDispatcherMod.EventDispatcher
import typingsSlinky.three.matrix3Mod.Matrix3
import typingsSlinky.three.threeBooleans.`true`
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/textures/Texture", JSImport.Namespace)
@js.native
object textureMod extends js.Object {
  
  @js.native
  class Texture protected () extends EventDispatcher {
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
    
    /**
    	 * @default 1
    	 */
    var anisotropy: Double = js.native
    
    /**
    	 * @default new THREE.Vector2( 0, 0 )
    	 */
    var center: Vector2 = js.native
    
    def copy(source: Texture): this.type = js.native
    
    def dispose(): Unit = js.native
    
    /**
    	 * @default THREE.LinearEncoding
    	 */
    var encoding: TextureEncoding = js.native
    
    /**
    	 * @default true
    	 */
    var flipY: Boolean = js.native
    
    /**
    	 * @default THREE.RGBAFormat
    	 */
    var format: PixelFormat = js.native
    
    /**
    	 * @default true
    	 */
    var generateMipmaps: Boolean = js.native
    
    var id: Double = js.native
    
    /**
    	 * @default THREE.Texture.DEFAULT_IMAGE
    	 */
    var image: js.Any = js.native
    
    var internalFormat: PixelFormatGPU | Null = js.native
    
    val isTexture: `true` = js.native
    
    /**
    	 * @default THREE.LinearFilter
    	 */
    var magFilter: TextureFilter = js.native
    
     // ImageData[] for 2D textures and CubeTexture[] for cube textures;
    /**
    	 * @default THREE.Texture.DEFAULT_MAPPING
    	 */
    var mapping: Mapping = js.native
    
    /**
    	 * @default new THREE.Matrix3()
    	 */
    var matrix: Matrix3 = js.native
    
    /**
    	 * @default true
    	 */
    var matrixAutoUpdate: Boolean = js.native
    
    /**
    	 * @default THREE.LinearMipmapLinearFilter
    	 */
    var minFilter: TextureFilter = js.native
    
     // HTMLImageElement or ImageData or { width: number, height: number } in some children;
    /**
    	 * @default []
    	 */
    var mipmaps: js.Array[_] = js.native
    
    /**
    	 * @default ''
    	 */
    var name: String = js.native
    
    var needsUpdate: Boolean = js.native
    
    /**
    	 * @default new THREE.Vector2( 0, 0 )
    	 */
    var offset: Vector2 = js.native
    
    def onUpdate(): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var premultiplyAlpha: Boolean = js.native
    
    /**
    	 * @default new THREE.Vector2( 1, 1 )
    	 */
    var repeat: Vector2 = js.native
    
    /**
    	 * @default 0
    	 */
    var rotation: Double = js.native
    
    var sourceFile: String = js.native
    
    def toJSON(meta: js.Any): js.Any = js.native
    
    def transformUv(uv: Vector2): Vector2 = js.native
    
    /**
    	 * @default THREE.UnsignedByteType
    	 */
    var `type`: TextureDataType = js.native
    
    /**
    	 * @default 4
    	 */
    var unpackAlignment: Double = js.native
    
    def updateMatrix(): Unit = js.native
    
    var uuid: String = js.native
    
    /**
    	 * @default 0
    	 */
    var version: Double = js.native
    
    /**
    	 * @default THREE.ClampToEdgeWrapping
    	 */
    var wrapS: Wrapping = js.native
    
    /**
    	 * @default THREE.ClampToEdgeWrapping
    	 */
    var wrapT: Wrapping = js.native
  }
  /* static members */
  @js.native
  object Texture extends js.Object {
    
    var DEFAULT_IMAGE: js.Any = js.native
    
    var DEFAULT_MAPPING: js.Any = js.native
  }
}
