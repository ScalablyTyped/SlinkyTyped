package typingsSlinky.uifabricUtilities

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object irendercomponentMod {
  
  @js.native
  trait IRenderComponent[TProps] extends StObject {
    
    /**
      * JSX.Element to return in this component's render() function.
      */
    def children(props: TProps): ReactElement = js.native
  }
  object IRenderComponent {
    
    @scala.inline
    def apply[TProps](children: TProps => ReactElement): IRenderComponent[TProps] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[IRenderComponent[TProps]]
    }
    
    @scala.inline
    implicit class IRenderComponentMutableBuilder[Self <: IRenderComponent[_], TProps] (val x: Self with IRenderComponent[TProps]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: TProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
}
