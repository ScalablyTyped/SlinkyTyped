package typingsSlinky.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Material")
@js.native
class Material () extends js.Object {
  def this(color: Color) = this()
  def this(color: js.UndefOr[scala.Nothing], options: MaterialOptions) = this()
  def this(color: Color, options: MaterialOptions) = this()
  
  var color: Color = js.native
  
  var defaults: MaterialOptions = js.native
  
  var metallic: Boolean = js.native
  
  def render(): Color = js.native
  def render(lights: js.UndefOr[scala.Nothing], shader: js.UndefOr[scala.Nothing], renderData: RenderModel): Color = js.native
  def render(lights: js.UndefOr[scala.Nothing], shader: Shader): Color = js.native
  def render(lights: js.UndefOr[scala.Nothing], shader: Shader, renderData: RenderModel): Color = js.native
  def render(lights: js.Array[Light]): Color = js.native
  def render(lights: js.Array[Light], shader: js.UndefOr[scala.Nothing], renderData: RenderModel): Color = js.native
  def render(lights: js.Array[Light], shader: Shader): Color = js.native
  def render(lights: js.Array[Light], shader: Shader, renderData: RenderModel): Color = js.native
  
  var shader: Shader = js.native
  
  var specularColor: Color = js.native
  
  var specularExponent: Double = js.native
}
/* static members */
@JSImport("seen", "Material")
@js.native
object Material extends js.Object {
  
  def create(): Material = js.native
  def create(value: String): Material = js.native
  def create(value: Color): Material = js.native
  def create(value: Material): Material = js.native
}
