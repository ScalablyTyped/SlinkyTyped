package typingsSlinky.storybookComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.anon.Href
import typingsSlinky.storybookComponents.tooltipMessageMod.TooltipMessageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TooltipMessage {
  
  @JSImport("@storybook/components", "TooltipMessage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def desc(value: ReactElement): this.type = set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descReactElement(value: ReactElement): this.type = set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def links(value: js.Array[Href]): this.type = set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linksVarargs(value: Href*): this.type = set("links", js.Array(value :_*))
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TooltipMessage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TooltipMessageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
