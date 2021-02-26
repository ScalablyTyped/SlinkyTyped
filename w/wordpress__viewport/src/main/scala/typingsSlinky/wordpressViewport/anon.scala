package typingsSlinky.wordpressViewport

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofimportedActions extends StObject {
    
    def setIsMatching(values: Record[String, Boolean]): Unit = js.native
  }
  object TypeofimportedActions {
    
    @scala.inline
    def apply(setIsMatching: Record[String, Boolean] => Unit): TypeofimportedActions = {
      val __obj = js.Dynamic.literal(setIsMatching = js.Any.fromFunction1(setIsMatching))
      __obj.asInstanceOf[TypeofimportedActions]
    }
    
    @scala.inline
    implicit class TypeofimportedActionsMutableBuilder[Self <: TypeofimportedActions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetIsMatching(value: Record[String, Boolean] => Unit): Self = StObject.set(x, "setIsMatching", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofimportedSelectors extends StObject {
    
    def isViewportMatch(query: String): Boolean = js.native
  }
  object TypeofimportedSelectors {
    
    @scala.inline
    def apply(isViewportMatch: String => Boolean): TypeofimportedSelectors = {
      val __obj = js.Dynamic.literal(isViewportMatch = js.Any.fromFunction1(isViewportMatch))
      __obj.asInstanceOf[TypeofimportedSelectors]
    }
    
    @scala.inline
    implicit class TypeofimportedSelectorsMutableBuilder[Self <: TypeofimportedSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsViewportMatch(value: String => Boolean): Self = StObject.set(x, "isViewportMatch", js.Any.fromFunction1(value))
    }
  }
}
