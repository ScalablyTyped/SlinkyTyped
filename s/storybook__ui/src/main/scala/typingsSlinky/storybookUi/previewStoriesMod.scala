package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookUi.typesMod.PreviewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/preview/preview.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/preview/preview.stories", "default.component")
    @js.native
    def component: ReactComponentClass[PreviewProps] = js.native
    @scala.inline
    def component_=(x: ReactComponentClass[PreviewProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/preview/preview.stories", "default.decorators")
    @js.native
    def decorators: js.Array[DecoratorFunction[ReactElement]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[DecoratorFunction[ReactElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/preview/preview.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/preview/preview.stories", "noTabs")
  @js.native
  def noTabs(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/preview.stories", "withTabs")
  @js.native
  def withTabs(): ReactElement = js.native
}
