package typingsSlinky.storybookComponents.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.AnonHref
import typingsSlinky.storybookComponents.tooltipMessageMod.TooltipMessageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TooltipMessage {
  @JSImport("@storybook/components", "TooltipMessage")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def descReactElement(value: ReactElement): this.type = set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def desc(value: TagMod[Any]): this.type = set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def links(value: js.Array[AnonHref]): this.type = set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipMessageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TooltipMessage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

