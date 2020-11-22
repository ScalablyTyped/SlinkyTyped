package typingsSlinky.wixAnimations.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wixAnimations.mod.AnimatorProps
import typingsSlinky.wixAnimations.mod.Delay
import typingsSlinky.wixAnimations.mod.Sequence
import typingsSlinky.wixAnimations.mod.Timing
import typingsSlinky.wixAnimations.mod.Translate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animator {
  
  @JSImport("wix-animations/dist/src", "Animator")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.wixAnimations.mod.Animator] {
    
    @scala.inline
    def childClassName(value: String): this.type = set("childClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Delay): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def heightFunction1(value: /* element */ js.Any => Double): this.type = set("height", js.Any.fromFunction1(value))
    
    @scala.inline
    def height(value: Boolean | Double | (js.Function1[/* element */ js.Any, Double])): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacity(value: Boolean): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: Boolean): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sequence(value: Sequence | Boolean): this.type = set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timing(value: Timing): this.type = set("timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translate(value: Translate | Boolean | String): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widthFunction1(value: /* element */ js.Any => Double): this.type = set("width", js.Any.fromFunction1(value))
    
    @scala.inline
    def width(value: Boolean | Double | (js.Function1[/* element */ js.Any, Double])): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnimatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Animator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
