package typingsSlinky.storybookUi

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.storybookUi.anon.InitialActive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileMod {
  
  @JSImport("@storybook/ui/dist/components/layout/mobile", "Mobile")
  @js.native
  class Mobile protected ()
    extends Component[MobileProps, MobileState, js.Any] {
    def this(props: MobileProps) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookUi.storybookUiStrings.sidebar
    - typingsSlinky.storybookUi.storybookUiStrings.canvas
    - typingsSlinky.storybookUi.storybookUiStrings.addons
  */
  trait ActiveTabsType extends StObject
  object ActiveTabsType {
    
    @scala.inline
    def addons: typingsSlinky.storybookUi.storybookUiStrings.addons = "addons".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.addons]
    
    @scala.inline
    def canvas: typingsSlinky.storybookUi.storybookUiStrings.canvas = "canvas".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.canvas]
    
    @scala.inline
    def sidebar: typingsSlinky.storybookUi.storybookUiStrings.sidebar = "sidebar".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.sidebar]
  }
  
  @js.native
  trait MobileProps extends StObject {
    
    var Notifications: ReactComponentClass[_] = js.native
    
    var Panel: ReactComponentClass[_] = js.native
    
    var Preview: ReactComponentClass[_] = js.native
    
    var Sidebar: ReactComponentClass[_] = js.native
    
    var options: InitialActive = js.native
    
    var pages: js.Array[Page] = js.native
    
    var viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any = js.native
  }
  object MobileProps {
    
    @scala.inline
    def apply(
      Notifications: ReactComponentClass[_],
      Panel: ReactComponentClass[_],
      Preview: ReactComponentClass[_],
      Sidebar: ReactComponentClass[_],
      options: InitialActive,
      pages: js.Array[Page],
      viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
    ): MobileProps = {
      val __obj = js.Dynamic.literal(Notifications = Notifications.asInstanceOf[js.Any], Panel = Panel.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[MobileProps]
    }
    
    @scala.inline
    implicit class MobilePropsMutableBuilder[Self <: MobileProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifications(value: ReactComponentClass[_]): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: InitialActive): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value :_*))
      
      @scala.inline
      def setPanel(value: ReactComponentClass[_]): Self = StObject.set(x, "Panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview(value: ReactComponentClass[_]): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidebar(value: ReactComponentClass[_]): Self = StObject.set(x, "Sidebar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
      ): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MobileState extends StObject {
    
    var active: ActiveTabsType = js.native
  }
  object MobileState {
    
    @scala.inline
    def apply(active: ActiveTabsType): MobileState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[MobileState]
    }
    
    @scala.inline
    implicit class MobileStateMutableBuilder[Self <: MobileState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: ActiveTabsType): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Page extends StObject {
    
    var key: String = js.native
    
    var render: ReactComponentClass[js.Object] = js.native
    
    var route: ReactComponentClass[js.Object] = js.native
  }
  object Page {
    
    @scala.inline
    def apply(key: String, render: ReactComponentClass[js.Object], route: ReactComponentClass[js.Object]): Page = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    @scala.inline
    implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
