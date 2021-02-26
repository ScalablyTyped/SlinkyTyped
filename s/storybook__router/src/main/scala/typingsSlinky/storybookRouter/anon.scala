package typingsSlinky.storybookRouter

import slinky.core.facade.ReactElement
import typingsSlinky.reachRouter.mod.History
import typingsSlinky.reachRouter.mod.LocationContext
import typingsSlinky.reachRouter.mod.LocationProviderRenderFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Path extends StObject {
    
    var path: String = js.native
  }
  object Path {
    
    @scala.inline
    def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@reach/router.@reach/router.LocationProviderProps> */
  @js.native
  trait ReadonlyLocationProviderP extends StObject {
    
    val children: js.UndefOr[ReactElement | LocationProviderRenderFn] = js.native
    
    val history: js.UndefOr[History] = js.native
  }
  object ReadonlyLocationProviderP {
    
    @scala.inline
    def apply(): ReadonlyLocationProviderP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyLocationProviderP]
    }
    
    @scala.inline
    implicit class ReadonlyLocationProviderPMutableBuilder[Self <: ReadonlyLocationProviderP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement | LocationProviderRenderFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* context */ LocationContext => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    }
  }
  
  @js.native
  trait Search extends StObject {
    
    var search: String = js.native
  }
  object Search {
    
    @scala.inline
    def apply(search: String): Search = {
      val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Search]
    }
    
    @scala.inline
    implicit class SearchMutableBuilder[Self <: Search] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
