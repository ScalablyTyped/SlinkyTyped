package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.listMod.NoticeList.Props
import typingsSlinky.wordpressComponents.noticeMod.Notice.Action
import typingsSlinky.wordpressNotices.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/notice/list", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object NoticeList {
    
    /* Inlined parent std.Omit<@wordpress/components.@wordpress/components/notice.default.Props, 'children' | 'onRemove'> */
    @js.native
    trait Notice extends StObject {
      
      var actions: js.UndefOr[js.Array[Action]] = js.native
      
      var className: js.UndefOr[String] = js.native
      
      var content: ReactElement = js.native
      
      var id: String = js.native
      
      var isDismissible: js.UndefOr[Boolean] = js.native
      
      var status: js.UndefOr[Status] = js.native
    }
    object Notice {
      
      @scala.inline
      def apply(id: String): Notice = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[Notice]
      }
      
      @scala.inline
      implicit class NoticeMutableBuilder[Self <: Notice] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
        
        @scala.inline
        def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
        
        @scala.inline
        def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    @js.native
    trait Props extends StObject {
      
      var className: js.UndefOr[String] = js.native
      
      /**
        * Array of notices to render.
        */
      var notices: js.Array[Notice] = js.native
      
      /**
        * Function called when a notice should be removed / dismissed.
        */
      var onRemove: js.UndefOr[js.Function1[/* noticeId */ String, Unit]] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(notices: js.Array[Notice]): Props = {
        val __obj = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value :_*))
        
        @scala.inline
        def setOnRemove(value: /* noticeId */ String => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      }
    }
  }
}
