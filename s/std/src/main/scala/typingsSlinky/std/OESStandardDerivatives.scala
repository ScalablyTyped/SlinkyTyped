package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The OES_standard_derivatives extension is part of the WebGL API and adds the GLSL derivative functions dFdx, dFdy, and fwidth. */
@js.native
trait OESStandardDerivatives extends StObject {
  
  val FRAGMENT_SHADER_DERIVATIVE_HINT_OES: GLenum = js.native
}
object OESStandardDerivatives {
  
  @scala.inline
  def apply(FRAGMENT_SHADER_DERIVATIVE_HINT_OES: GLenum): OESStandardDerivatives = {
    val __obj = js.Dynamic.literal(FRAGMENT_SHADER_DERIVATIVE_HINT_OES = FRAGMENT_SHADER_DERIVATIVE_HINT_OES.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESStandardDerivatives]
  }
  
  @scala.inline
  implicit class OESStandardDerivativesMutableBuilder[Self <: OESStandardDerivatives] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFRAGMENT_SHADER_DERIVATIVE_HINT_OES(value: GLenum): Self = StObject.set(x, "FRAGMENT_SHADER_DERIVATIVE_HINT_OES", value.asInstanceOf[js.Any])
  }
}
