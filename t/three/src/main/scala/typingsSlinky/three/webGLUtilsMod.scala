package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.std.WebGL2RenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLUtilsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLUtils", "WebGLUtils")
  @js.native
  class WebGLUtils protected () extends StObject {
    def this(gl: WebGLRenderingContext, extensions: js.Any, capabilities: js.Any) = this()
    def this(gl: WebGL2RenderingContext, extensions: js.Any, capabilities: js.Any) = this()
    
    def convert(p: js.Any): Unit = js.native
  }
}
