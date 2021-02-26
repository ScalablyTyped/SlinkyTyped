package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.anon.Layout
import typingsSlinky.storybookUi.distMod.RootProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/app.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/app.stories", "default.component")
    @js.native
    def component: ReactComponentClass[RootProps] = js.native
    @scala.inline
    def component_=(x: ReactComponentClass[RootProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/app.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    @scala.inline
    def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/app.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/app.stories", "Default")
  @js.native
  def Default_(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/app.stories", "LoadingState")
  @js.native
  def LoadingState(): ReactElement = js.native
}
