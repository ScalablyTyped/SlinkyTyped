package typingsSlinky.storybookComponents.components

import typingsSlinky.storybookComponents.WithTooltipPurePropsstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WithTooltip {
  @JSImport("@storybook/components/dist/tooltip/WithTooltip", "WithTooltip")
  @js.native
  object component extends js.Object
  
  def withProps(p: WithTooltipPurePropsstart): SharedBuilder_WithTooltipPurePropsstart1769123314 = new SharedBuilder_WithTooltipPurePropsstart1769123314(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: WithTooltip.type): SharedBuilder_WithTooltipPurePropsstart1769123314 = new SharedBuilder_WithTooltipPurePropsstart1769123314(js.Array(this.component, js.Dictionary.empty))()
}

