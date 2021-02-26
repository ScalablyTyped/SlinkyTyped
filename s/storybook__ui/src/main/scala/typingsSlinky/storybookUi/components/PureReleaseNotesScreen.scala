package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.releaseNotesMod.ReleaseNotesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PureReleaseNotesScreen {
  
  @scala.inline
  def apply(didHitMaxWaitTime: Boolean, isLoaded: Boolean, setLoaded: Boolean => Unit, version: String): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(didHitMaxWaitTime = didHitMaxWaitTime.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], setLoaded = js.Any.fromFunction1(setLoaded), version = version.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ReleaseNotesProps]))
  }
  
  @JSImport("@storybook/ui/dist/settings/release_notes", "PureReleaseNotesScreen")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ReleaseNotesProps): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
