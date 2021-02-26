package typingsSlinky.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// WebGL 1 Extensions
@js.native
trait EXTColorBufferHalfFloat extends StObject {
  
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Double = js.native
  
  val RGB16F_EXT: Double = js.native
  
  val RGBA16F_EXT: Double = js.native
  
  val UNSIGNED_NORMALIZED_EXT: Double = js.native
}
object EXTColorBufferHalfFloat {
  
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Double,
    RGB16F_EXT: Double,
    RGBA16F_EXT: Double,
    UNSIGNED_NORMALIZED_EXT: Double
  ): EXTColorBufferHalfFloat = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT.asInstanceOf[js.Any], RGB16F_EXT = RGB16F_EXT.asInstanceOf[js.Any], RGBA16F_EXT = RGBA16F_EXT.asInstanceOf[js.Any], UNSIGNED_NORMALIZED_EXT = UNSIGNED_NORMALIZED_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTColorBufferHalfFloat]
  }
  
  @scala.inline
  implicit class EXTColorBufferHalfFloatMutableBuilder[Self <: EXTColorBufferHalfFloat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT(value: Double): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGB16F_EXT(value: Double): Self = StObject.set(x, "RGB16F_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGBA16F_EXT(value: Double): Self = StObject.set(x, "RGBA16F_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNSIGNED_NORMALIZED_EXT(value: Double): Self = StObject.set(x, "UNSIGNED_NORMALIZED_EXT", value.asInstanceOf[js.Any])
  }
}
