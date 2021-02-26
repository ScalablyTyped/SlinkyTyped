package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsFooterStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/settings/SettingsFooter.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/settings/SettingsFooter.stories", "default.component")
    @js.native
    def component: ReactComponentClass[js.Any] = js.native
    @scala.inline
    def component_=(x: ReactComponentClass[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/settings/SettingsFooter.stories", "default.decorators")
    @js.native
    def decorators: js.Array[DecoratorFunction[ReactElement]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[DecoratorFunction[ReactElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/settings/SettingsFooter.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/settings/SettingsFooter.stories", "basic")
  @js.native
  def basic(): ReactElement = js.native
}
