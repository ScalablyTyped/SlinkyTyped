package typingsSlinky.storybookComponents.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.storybookComponents.storyMod.StoryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Support for combinations of intersection and union types not implemented */
object Story
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/components", "Story")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StoryProps
}

