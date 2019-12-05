package typingsSlinky.atStorybookComponents.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookComponents.Anon_StartOpen
import typingsSlinky.atStorybookComponents.distTooltipWithTooltipMod.WithTooltipPureProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object WithToolTipState
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/components/dist/tooltip/WithTooltip", "WithToolTipState")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = WithTooltipPureProps with Anon_StartOpen
}

