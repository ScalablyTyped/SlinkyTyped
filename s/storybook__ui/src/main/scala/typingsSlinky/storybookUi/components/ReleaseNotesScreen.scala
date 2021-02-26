package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.OmitReleaseNotesPropsisLo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReleaseNotesScreen {
  
  @scala.inline
  def apply(version: String): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[OmitReleaseNotesPropsisLo]))
  }
  
  @JSImport("@storybook/ui/dist/settings/release_notes", "ReleaseNotesScreen")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OmitReleaseNotesPropsisLo): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
