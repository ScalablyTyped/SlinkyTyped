package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getActiveAttrib() and WebGLRenderingContext.getActiveUniform() methods. */
@js.native
trait WebGLActiveInfo extends StObject {
  
  val name: java.lang.String = js.native
  
  val size: GLint = js.native
  
  val `type`: GLenum = js.native
}
object WebGLActiveInfo {
  
  @scala.inline
  def apply(name: java.lang.String, size: GLint, `type`: GLenum): org.scalajs.dom.raw.WebGLActiveInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.WebGLActiveInfo]
  }
  
  @scala.inline
  implicit class WebGLActiveInfoMutableBuilder[Self <: org.scalajs.dom.raw.WebGLActiveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: GLint): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: GLenum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
