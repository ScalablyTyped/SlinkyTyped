package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookApi.refsMod.ComposedRef
import typingsSlinky.storybookApi.storiesMod.StoriesHash
import typingsSlinky.storybookUi.anon.Id
import typingsSlinky.storybookUi.anon.Layout
import typingsSlinky.storybookUi.refsMod.RefProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refsStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "default.component")
    @js.native
    def component: ReactComponentClass[ComposedRef with RefProps] = js.native
    @scala.inline
    def component_=(x: ReactComponentClass[ComposedRef with RefProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* storyFn */ js.Any, ReactElement]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* storyFn */ js.Any, ReactElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "default.excludeStories")
    @js.native
    def excludeStories: js.RegExp = js.native
    @scala.inline
    def excludeStories_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludeStories")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    @scala.inline
    def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "Auth")
  @js.native
  def Auth(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "Errored")
  @js.native
  def Errored(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "IsEmpty")
  @js.native
  def IsEmpty(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "Long")
  @js.native
  def Long(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "Optimized")
  @js.native
  def Optimized(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "StartInjectedLoading")
  @js.native
  def StartInjectedLoading(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "StartInjectedReady")
  @js.native
  def StartInjectedReady(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "StartInjectedUnknown")
  @js.native
  def StartInjectedUnknown(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "Versions")
  @js.native
  def Versions(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "VersionsMissingCurrent")
  @js.native
  def VersionsMissingCurrent(): ReactElement = js.native
  
  object loadingData {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "loadingData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "loadingData.menu")
    @js.native
    def menu: js.Array[Id] = js.native
    @scala.inline
    def menu_=(x: js.Array[Id]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menu")(x.asInstanceOf[js.Any])
  }
  
  object simpleData {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "simpleData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "simpleData.menu")
    @js.native
    def menu: js.Array[Id] = js.native
    @scala.inline
    def menu_=(x: js.Array[Id]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menu")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "simpleData.stories")
    @js.native
    def stories: StoriesHash = js.native
    @scala.inline
    def stories_=(x: StoriesHash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stories")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "simpleData.storyId")
    @js.native
    def storyId: String = js.native
    @scala.inline
    def storyId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyId")(x.asInstanceOf[js.Any])
  }
}
