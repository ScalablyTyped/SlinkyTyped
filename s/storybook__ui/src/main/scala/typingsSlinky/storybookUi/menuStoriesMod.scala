package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.menuMod.ListItemIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "default.component")
    @js.native
    def component(hasIconImgSrc: ListItemIconProps): ReactElement = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* StoryFn */ ReactComponentClass[js.Object], ReactElement]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* StoryFn */ ReactComponentClass[js.Object], ReactElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "Expanded")
  @js.native
  def Expanded(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "ExpandedWithoutReleaseNotes")
  @js.native
  def ExpandedWithoutReleaseNotes(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "Items")
  @js.native
  def Items(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "Real")
  @js.native
  def Real(): ReactElement = js.native
}
