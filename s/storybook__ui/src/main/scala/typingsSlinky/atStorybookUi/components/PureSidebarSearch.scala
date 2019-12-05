package typingsSlinky.atStorybookUi.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookUi.distComponentsSidebarSidebarSearchMod.PureSidebarSearchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(atStorybookUi), Name(distComponentsSidebarSidebarSearchMod), Name(PureSidebarSearchProps))) was not a @ScalaJSDefined trait */
object PureSidebarSearch
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/ui/dist/components/sidebar/SidebarSearch", "PureSidebarSearch")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = PureSidebarSearchProps
}

