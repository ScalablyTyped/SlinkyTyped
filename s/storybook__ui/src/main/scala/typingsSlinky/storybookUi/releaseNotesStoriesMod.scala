package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.releaseNotesMod.ReleaseNotesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseNotesStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/settings/release_notes.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/settings/release_notes.stories", "default.component")
    @js.native
    def component: ReactComponentClass[ReleaseNotesProps] = js.native
    @scala.inline
    def component_=(x: ReactComponentClass[ReleaseNotesProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/settings/release_notes.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/settings/release_notes.stories", "DidHitMaxWaitTime")
  @js.native
  def DidHitMaxWaitTime(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/settings/release_notes.stories", "Loading")
  @js.native
  def Loading(): ReactElement = js.native
}
