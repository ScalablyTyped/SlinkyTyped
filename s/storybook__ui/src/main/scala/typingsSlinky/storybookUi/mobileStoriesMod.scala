package typingsSlinky.storybookUi

import org.scalablytyped.runtime.Instantiable1
import slinky.core.facade.ReactElement
import typingsSlinky.storybookUi.anon.PassArgsFirst
import typingsSlinky.storybookUi.anon.PropsMobileProps
import typingsSlinky.storybookUi.mobileMod.Mobile
import typingsSlinky.storybookUi.mobileMod.MobileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "default.component")
    @js.native
    class component protected () extends Mobile {
      def this(props: MobileProps) = this()
    }
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "default.component")
    @js.native
    def component: Instantiable1[/* props */ MobileProps, Mobile] = js.native
    @scala.inline
    def component_=(x: Instantiable1[/* props */ MobileProps, Mobile]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* args */ js.Any, js.Any]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* args */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "default.parameters")
    @js.native
    def parameters: PassArgsFirst = js.native
    @scala.inline
    def parameters_=(x: PassArgsFirst): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "InitialAddons")
  @js.native
  def InitialAddons(hasProps: PropsMobileProps): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "InitialCanvas")
  @js.native
  def InitialCanvas(hasProps: PropsMobileProps): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "InitialSidebar")
  @js.native
  def InitialSidebar(hasProps: PropsMobileProps): ReactElement = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "Page")
  @js.native
  def Page(hasProps: PropsMobileProps): ReactElement = js.native
}
