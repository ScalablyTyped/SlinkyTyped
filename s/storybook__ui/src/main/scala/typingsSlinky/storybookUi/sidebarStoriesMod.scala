package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookApi.storiesMod.StoriesHash
import typingsSlinky.storybookUi.anon.Id
import typingsSlinky.storybookUi.anon.Layout
import typingsSlinky.storybookUi.sidebarMod.SidebarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "default.component")
    @js.native
    def component: ReactComponentClass[SidebarProps] = js.native
    @scala.inline
    def component_=(x: ReactComponentClass[SidebarProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* storyFn */ js.Any, ReactElement]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* storyFn */ js.Any, ReactElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "default.excludeStories")
    @js.native
    def excludeStories: js.RegExp = js.native
    @scala.inline
    def excludeStories_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludeStories")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    @scala.inline
    def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "Empty")
  @js.native
  def Empty(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "Loading")
  @js.native
  def Loading(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "LoadingWithRefs")
  @js.native
  def LoadingWithRefs(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "Simple")
  @js.native
  def Simple(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "WithRefs")
  @js.native
  def WithRefs(): ReactElement = js.native
  
  object loadingData {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "loadingData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "loadingData.menu")
    @js.native
    def menu: js.Array[Id] = js.native
    @scala.inline
    def menu_=(x: js.Array[Id]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menu")(x.asInstanceOf[js.Any])
  }
  
  object simpleData {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "simpleData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "simpleData.menu")
    @js.native
    def menu: js.Array[Id] = js.native
    @scala.inline
    def menu_=(x: js.Array[Id]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menu")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "simpleData.stories")
    @js.native
    def stories: StoriesHash = js.native
    @scala.inline
    def stories_=(x: StoriesHash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stories")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", "simpleData.storyId")
    @js.native
    def storyId: String = js.native
    @scala.inline
    def storyId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyId")(x.asInstanceOf[js.Any])
  }
}
