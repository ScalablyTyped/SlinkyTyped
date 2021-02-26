package typingsSlinky.wordpressComponents

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.std.Omit
import typingsSlinky.wordpressComponents.anon.CreateErrorNotice
import typingsSlinky.wordpressComponents.listMod.NoticeList.Notice
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.noticeList
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.noticeOperations
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.noticeUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withNoticesMod {
  
  object default {
    
    // prettier-ignore
    @JSImport("@wordpress/components/higher-order/with-notices", JSImport.Default)
    @js.native
    def apply[T /* <: ReactComponentClass[_] */](wrapped: T): ReactComponentClass[Omit[_, noticeList | noticeOperations | noticeUI]] = js.native
  }
  
  object withNotices {
    
    @js.native
    trait Props extends StObject {
      
      var noticeList: js.Array[Notice] = js.native
      
      var noticeOperations: CreateErrorNotice = js.native
      
      var noticeUI: ReactElement = js.native
    }
    object Props {
      
      @scala.inline
      def apply(noticeList: js.Array[Notice], noticeOperations: CreateErrorNotice): Props = {
        val __obj = js.Dynamic.literal(noticeList = noticeList.asInstanceOf[js.Any], noticeOperations = noticeOperations.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNoticeList(value: js.Array[Notice]): Self = StObject.set(x, "noticeList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoticeListVarargs(value: Notice*): Self = StObject.set(x, "noticeList", js.Array(value :_*))
        
        @scala.inline
        def setNoticeOperations(value: CreateErrorNotice): Self = StObject.set(x, "noticeOperations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoticeUI(value: ReactElement): Self = StObject.set(x, "noticeUI", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoticeUIUndefined: Self = StObject.set(x, "noticeUI", js.undefined)
      }
    }
  }
}
