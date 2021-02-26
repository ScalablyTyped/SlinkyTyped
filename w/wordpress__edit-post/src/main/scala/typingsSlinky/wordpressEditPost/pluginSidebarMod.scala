package typingsSlinky.wordpressEditPost

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressEditPost.pluginSidebarMod.PluginSidebar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginSidebarMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-sidebar", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PluginSidebar {
    
    @js.native
    trait Props extends StObject {
      
      var children: ReactElement = js.native
      
      /**
        * An optional class name added to the sidebar body.
        */
      var className: js.UndefOr[String] = js.native
      
      /**
        * A Dashicon slug or a custom JSX element to be rendered when the sidebar is pinned to
        * toolbar.
        */
      var icon: js.UndefOr[Icon | ReactElement] = js.native
      
      /**
        * Whether to allow to pin sidebar to toolbar.
        * @defaultValue `true`
        */
      var isPinnable: js.UndefOr[Boolean] = js.native
      
      /**
        * A string identifying the sidebar. Must be unique for every sidebar registered within the
        * scope of your plugin.
        */
      var name: String = js.native
      
      /**
        * Title displayed at the top of the sidebar.
        */
      var title: String = js.native
    }
    object Props {
      
      @scala.inline
      def apply(name: String, title: String): Props = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setIcon(value: Icon | ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setIsPinnable(value: Boolean): Self = StObject.set(x, "isPinnable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsPinnableUndefined: Self = StObject.set(x, "isPinnable", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
  }
}
