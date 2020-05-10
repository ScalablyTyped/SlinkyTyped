package typingsSlinky.themeUi.components

import typingsSlinky.themeUi.mod.ColorModeCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorMode {
  @JSImport("theme-ui", "ColorMode")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): SharedBuilder_Object_159303587[ColorModeCls] = new SharedBuilder_Object_159303587[ColorModeCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ColorMode.type): SharedBuilder_Object_159303587[ColorModeCls] = new SharedBuilder_Object_159303587[ColorModeCls](js.Array(this.component, js.Dictionary.empty))()
}

