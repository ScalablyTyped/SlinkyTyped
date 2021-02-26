package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.anon.ClearLastViewed
import typingsSlinky.storybookUi.anon.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "default.component")
    @js.native
    def component: ReactComponentClass[ClearLastViewed] = js.native
    @scala.inline
    def component_=(x: ReactComponentClass[ClearLastViewed]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* storyFn */ js.Any, ReactElement]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* storyFn */ js.Any, ReactElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    @scala.inline
    def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "FilledIn")
  @js.native
  def FilledIn(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "LastViewed")
  @js.native
  def LastViewed(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "ShortcutsDisabled")
  @js.native
  def ShortcutsDisabled(): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "Simple")
  @js.native
  def Simple(): ReactElement = js.native
}
