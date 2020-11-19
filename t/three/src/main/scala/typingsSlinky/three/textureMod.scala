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
  
  var TextureIdCount: Double = js.native
  
  @js.native
  class Texture protected () extends EventDispatcher {
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
    
    var anisotropy: Double = js.native
    
    var center: Vector2 = js.native
    
    def copy(source: Texture): this.type = js.native
    
    def dispose(): Unit = js.native
    
    var encoding: TextureEncoding = js.native
    
    var flipY: Boolean = js.native
    
    var format: PixelFormat = js.native
    
    var generateMipmaps: Boolean = js.native
    
    var id: Double = js.native
    
    var image: js.Any = js.native
    
    var internalFormat: PixelFormatGPU | Null = js.native
    
    val isTexture: `true` = js.native
    
    var magFilter: TextureFilter = js.native
    
     // ImageData[] for 2D textures and CubeTexture[] for cube textures;
    var mapping: Mapping = js.native
    
    var matrix: Matrix3 = js.native
    
    var matrixAutoUpdate: Boolean = js.native
    
    var minFilter: TextureFilter = js.native
    
     // HTMLImageElement or ImageData or { width: number, height: number } in some children;
    var mipmaps: js.Array[_] = js.native
    
    var name: String = js.native
    
    var needsUpdate: Boolean = js.native
    
    var offset: Vector2 = js.native
    
    def onUpdate(): Unit = js.native
    
    var premultiplyAlpha: Boolean = js.native
    
    var repeat: Vector2 = js.native
    
    var rotation: Double = js.native
    
    var sourceFile: String = js.native
    
    def toJSON(meta: js.Any): js.Any = js.native
    
    def transformUv(uv: Vector2): Vector2 = js.native
    
    var `type`: TextureDataType = js.native
    
    var unpackAlignment: Double = js.native
    
    def updateMatrix(): Unit = js.native
    
    var uuid: String = js.native
    
    var version: Double = js.native
    
    var wrapS: Wrapping = js.native
    
    var wrapT: Wrapping = js.native
  }
  /* static members */
  @js.native
  object Texture extends js.Object {
    
    var DEFAULT_IMAGE: js.Any = js.native
    
    var DEFAULT_MAPPING: js.Any = js.native
  }
}
