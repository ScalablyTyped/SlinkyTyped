package typingsSlinky.wordpressEditPost

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.wordpressEditPost.anon.OmitPropsname
import typingsSlinky.wordpressEditPost.pluginPostStatusInfoMod.PluginPostStatusInfo.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginPostStatusInfoMod {
  
  /**
    * Renders a row in the Status & Visibility panel of the Document sidebar.
    * It should be noted that this is named and implemented around the function it serves
    * and not its location, which may change in future iterations.
    *
    * @example
    * ```jsx
    * const { PluginPostStatusInfo } = wp.editPost;
    *
    * const MyPluginPostStatusInfo = () => (
    *     <PluginPostStatusInfo className="my-plugin-post-status-info">
    *         My post status info
    *     </PluginPostStatusInfo>
    * );
    * ```
    */
  object default {
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-post-status-info", JSImport.Default)
    @js.native
    def apply(props: Props): ReactElement = js.native
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-post-status-info", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-post-status-info", "default.Slot")
    @js.native
    def Slot: ReactComponentClass[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: ReactComponentClass[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object PluginPostStatusInfo {
    
    @js.native
    trait Props extends StObject {
      
      var children: ReactElement = js.native
      
      /**
        * An optional class name added to the row.
        */
      var className: js.UndefOr[String] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
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
      }
    }
  }
}
