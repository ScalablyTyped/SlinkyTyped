package typingsSlinky.wordpressComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.baseControlMod.BaseControl.Props
import typingsSlinky.wordpressComponents.baseControlMod.BaseControl.VisualLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseControl {
  
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  object VisualLabel {
    
    @JSImport("@wordpress/components", "BaseControl.VisualLabel")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: VisualLabel.type): typingsSlinky.wordpressComponents.components.BaseControl.VisualLabel.Builder = new typingsSlinky.wordpressComponents.components.BaseControl.VisualLabel.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: VisualLabelProps): typingsSlinky.wordpressComponents.components.BaseControl.VisualLabel.Builder = new typingsSlinky.wordpressComponents.components.BaseControl.VisualLabel.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@wordpress/components", "BaseControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def help(value: ReactElement): this.type = set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def helpReactElement(value: ReactElement): this.type = set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideLabelFromVision(value: Boolean): this.type = set("hideLabelFromVision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
