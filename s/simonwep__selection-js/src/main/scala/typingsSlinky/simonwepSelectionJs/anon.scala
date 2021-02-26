package typingsSlinky.simonwepSelectionJs

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Added extends StObject {
    
    var added: js.Array[Element] = js.native
    
    var removed: js.Array[Element] = js.native
  }
  object Added {
    
    @scala.inline
    def apply(added: js.Array[Element], removed: js.Array[Element]): Added = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Added]
    }
    
    @scala.inline
    implicit class AddedMutableBuilder[Self <: Added] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: js.Array[Element]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddedVarargs(value: Element*): Self = StObject.set(x, "added", js.Array(value :_*))
      
      @scala.inline
      def setRemoved(value: js.Array[Element]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedVarargs(value: Element*): Self = StObject.set(x, "removed", js.Array(value :_*))
    }
  }
}
