package typingsSlinky.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "RenderContext")
@js.native
class RenderContext () extends js.Object {
  
  def animate(): RenderAnimator = js.native
  
  def cleanup(): Unit = js.native
  
  def layer(layer: RenderLayerContext): this.type = js.native
  
  var layers: js.Array[RenderLayerContext] = js.native
  
  def render(): this.type = js.native
  
  def reset(): Unit = js.native
  
  def sceneLayer(scene: Scene): this.type = js.native
}
