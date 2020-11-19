package typingsSlinky.storybookComponents.components

import typingsSlinky.storybookComponents.anon.WithTooltipPurePropsstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WithToolTipState {
  
  @JSImport("@storybook/components/dist/tooltip/WithTooltip", "WithToolTipState")
  @js.native
  object component extends js.Object
  
  def withProps(p: WithTooltipPurePropsstart): SharedBuilder_WithTooltipPurePropsstart_845239300 = new SharedBuilder_WithTooltipPurePropsstart_845239300(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: WithToolTipState.type): SharedBuilder_WithTooltipPurePropsstart_845239300 = new SharedBuilder_WithTooltipPurePropsstart_845239300(js.Array(this.component, js.Dictionary.empty))()
}
