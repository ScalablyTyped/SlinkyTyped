package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.anon.HighlightedRef
import typingsSlinky.storybookUi.anon.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "default.component")
    @js.native
    def component: ReactComponentClass[HighlightedRef] = js.native
    @scala.inline
    def component_=(x: ReactComponentClass[HighlightedRef]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* storyFn */ js.Any, ReactElement]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* storyFn */ js.Any, ReactElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "default.excludeStories")
    @js.native
    def excludeStories: js.RegExp = js.native
    @scala.inline
    def excludeStories_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludeStories")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    @scala.inline
    def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "Full")
  @js.native
  def Full(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "SingleStoryComponents")
  @js.native
  def SingleStoryComponents(): ReactElement = js.native
}
