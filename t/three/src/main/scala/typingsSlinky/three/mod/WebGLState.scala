package typingsSlinky.three.mod

import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "WebGLState")
@js.native
class WebGLState protected ()
  extends typingsSlinky.three.webGLStateMod.WebGLState {
  def this(
    gl: WebGLRenderingContext,
    extensions: typingsSlinky.three.webGLExtensionsMod.WebGLExtensions,
    capabilities: typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
  ) = this()
}
