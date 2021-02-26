package typingsSlinky.wordpressComponents.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.iconMod.Icon.IconType
import typingsSlinky.wordpressComponents.panelBodyMod.PanelBody.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelBody {
  
  @JSImport("@wordpress/components", "PanelBody")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: js.Any): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: IconType[js.Object]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconComponentClass(value: ReactComponentClass[js.Object]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialOpen(value: Boolean): this.type = set("initialOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onToggle(value: () => Unit): this.type = set("onToggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def opened(value: Boolean): this.type = set("opened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PanelBody.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
