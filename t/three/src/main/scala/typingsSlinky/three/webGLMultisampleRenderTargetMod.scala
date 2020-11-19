package typingsSlinky.three

import typingsSlinky.three.threeBooleans.`true`
import typingsSlinky.three.webGLRenderTargetMod.WebGLRenderTarget
import typingsSlinky.three.webGLRenderTargetMod.WebGLRenderTargetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/WebGLMultisampleRenderTarget", JSImport.Namespace)
@js.native
object webGLMultisampleRenderTargetMod extends js.Object {
  
  @js.native
  class WebGLMultisampleRenderTarget protected () extends WebGLRenderTarget {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: WebGLRenderTargetOptions) = this()
    
    val isWebGLMultisampleRenderTarget: `true` = js.native
    
    /**
    	 * Specifies the number of samples to be used for the renderbuffer storage.However, the maximum supported size for multisampling is platform dependent and defined via gl.MAX_SAMPLES.
    	 */
    var samples: Double = js.native
  }
}
