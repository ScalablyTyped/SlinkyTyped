package typingsSlinky.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WEBGLCompressedTextureAtc extends StObject {
  
  val COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL: Double = js.native
  
  val COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL: Double = js.native
  
  val COMPRESSED_RGB_ATC_WEBGL: Double = js.native
}
object WEBGLCompressedTextureAtc {
  
  @scala.inline
  def apply(
    COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL: Double,
    COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL: Double,
    COMPRESSED_RGB_ATC_WEBGL: Double
  ): WEBGLCompressedTextureAtc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL = COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL.asInstanceOf[js.Any], COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL = COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL.asInstanceOf[js.Any], COMPRESSED_RGB_ATC_WEBGL = COMPRESSED_RGB_ATC_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTextureAtc]
  }
  
  @scala.inline
  implicit class WEBGLCompressedTextureAtcMutableBuilder[Self <: WEBGLCompressedTextureAtc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCOMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL(value: Double): Self = StObject.set(x, "COMPRESSED_RGBA_ATC_EXPLICIT_ALPHA_WEBGL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL(value: Double): Self = StObject.set(x, "COMPRESSED_RGBA_ATC_INTERPOLATED_ALPHA_WEBGL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMPRESSED_RGB_ATC_WEBGL(value: Double): Self = StObject.set(x, "COMPRESSED_RGB_ATC_WEBGL", value.asInstanceOf[js.Any])
  }
}
