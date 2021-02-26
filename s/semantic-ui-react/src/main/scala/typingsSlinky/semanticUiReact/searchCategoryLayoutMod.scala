package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchCategoryLayoutMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchCategoryLayout", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SearchCategoryLayoutProps] = js.native
  
  @js.native
  trait SearchCategoryLayoutProps
    extends StrictSearchCategoryLayoutProps
       with /* key */ StringDictionary[js.Any]
  object SearchCategoryLayoutProps {
    
    @scala.inline
    def apply(categoryContent: ReactElement, resultsContent: ReactElement): SearchCategoryLayoutProps = {
      val __obj = js.Dynamic.literal(categoryContent = categoryContent.asInstanceOf[js.Any], resultsContent = resultsContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchCategoryLayoutProps]
    }
  }
  
  @js.native
  trait StrictSearchCategoryLayoutProps extends StObject {
    
    /** The rendered category content */
    var categoryContent: ReactElement = js.native
    
    /** The rendered results content */
    var resultsContent: ReactElement = js.native
  }
  object StrictSearchCategoryLayoutProps {
    
    @scala.inline
    def apply(categoryContent: ReactElement, resultsContent: ReactElement): StrictSearchCategoryLayoutProps = {
      val __obj = js.Dynamic.literal(categoryContent = categoryContent.asInstanceOf[js.Any], resultsContent = resultsContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictSearchCategoryLayoutProps]
    }
    
    @scala.inline
    implicit class StrictSearchCategoryLayoutPropsMutableBuilder[Self <: StrictSearchCategoryLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategoryContent(value: ReactElement): Self = StObject.set(x, "categoryContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsContent(value: ReactElement): Self = StObject.set(x, "resultsContent", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[SearchCategoryLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `searchCategoryLayoutMod.foo` */
  override def _to: ReactComponentClass[SearchCategoryLayoutProps] = default
}
