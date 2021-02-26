package typingsSlinky.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.wordpressEditor.postPublishPanelMod.PostPublishPanel.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postPublishPanelMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-publish-panel", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostPublishPanel {
    
    @js.native
    trait Props extends HTMLProps[HTMLDivElement] {
      
      var PostPublishExtension: js.UndefOr[ReactComponentClass[js.Object]] = js.native
      
      var PrePublishExtension: js.UndefOr[ReactComponentClass[js.Object]] = js.native
      
      @JSName("children")
      var children_Props: js.UndefOr[scala.Nothing] = js.native
      
      var forceIsDirty: js.UndefOr[Boolean] = js.native
      
      var forceIsSaving: js.UndefOr[Boolean] = js.native
      
      def onClose(): Unit = js.native
    }
    object Props {
      
      @scala.inline
      def apply(onClose: () => Unit): Props = {
        val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose))
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setForceIsDirty(value: Boolean): Self = StObject.set(x, "forceIsDirty", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceIsDirtyUndefined: Self = StObject.set(x, "forceIsDirty", js.undefined)
        
        @scala.inline
        def setForceIsSaving(value: Boolean): Self = StObject.set(x, "forceIsSaving", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceIsSavingUndefined: Self = StObject.set(x, "forceIsSaving", js.undefined)
        
        @scala.inline
        def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPostPublishExtension(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "PostPublishExtension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostPublishExtensionComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "PostPublishExtension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostPublishExtensionFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "PostPublishExtension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostPublishExtensionUndefined: Self = StObject.set(x, "PostPublishExtension", js.undefined)
        
        @scala.inline
        def setPrePublishExtension(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "PrePublishExtension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrePublishExtensionComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "PrePublishExtension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrePublishExtensionFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "PrePublishExtension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrePublishExtensionUndefined: Self = StObject.set(x, "PrePublishExtension", js.undefined)
      }
    }
  }
}
