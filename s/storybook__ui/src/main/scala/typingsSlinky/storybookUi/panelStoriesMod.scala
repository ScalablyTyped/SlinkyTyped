package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.anon.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/panel/panel.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/panel/panel.stories", "default.component")
    @js.native
    def component: ReactComponentClass[Actions] = js.native
    @scala.inline
    def component_=(x: ReactComponentClass[Actions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/panel/panel.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/panel/panel.stories", "Default")
  @js.native
  def Default_(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/panel/panel.stories", "NoPanels")
  @js.native
  def NoPanels(): ReactElement = js.native
}
