package typingsSlinky.stylableRuntime

import typingsSlinky.stylableRuntime.anon.Css
import typingsSlinky.stylableRuntime.cssRuntimeRendererMod.RuntimeRenderer
import typingsSlinky.stylableRuntime.typesMod.RuntimeStylesheet
import typingsSlinky.stylableRuntime.typesMod.StylableExports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/runtime/cjs/css-runtime-stylesheet", JSImport.Namespace)
@js.native
object cssRuntimeStylesheetMod extends js.Object {
  
  def create(namespace: String, exports: StylableExports, css: String, depth: Double, id: String): RuntimeStylesheet = js.native
  def create(
    namespace: String,
    exports: StylableExports,
    css: String,
    depth: Double,
    id: String,
    renderer: RuntimeRenderer
  ): RuntimeStylesheet = js.native
  def create(namespace: String, exports: StylableExports, css: String, depth: Double, id: Double): RuntimeStylesheet = js.native
  def create(
    namespace: String,
    exports: StylableExports,
    css: String,
    depth: Double,
    id: Double,
    renderer: RuntimeRenderer
  ): RuntimeStylesheet = js.native
  
  def createRenderable(css: String, depth: String, id: String): Css = js.native
  def createRenderable(css: String, depth: String, id: Double): Css = js.native
  def createRenderable(css: String, depth: Double, id: String): Css = js.native
  def createRenderable(css: String, depth: Double, id: Double): Css = js.native
}
