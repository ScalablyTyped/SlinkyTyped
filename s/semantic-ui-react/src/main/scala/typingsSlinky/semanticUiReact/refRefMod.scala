package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refRefMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Ref/Ref", JSImport.Default)
  @js.native
  class default ()
    extends Component[RefProps, js.Object, js.Any]
  object default {
    
    /* was `typeof RefFindNode` */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Ref/Ref", "default.FindNode")
    @js.native
    class FindNode ()
      extends typingsSlinky.semanticUiReact.refFindNodeMod.default
    
    /* was `typeof RefForward` */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Ref/Ref", "default.Forward")
    @js.native
    class Forward ()
      extends typingsSlinky.semanticUiReact.refForwardMod.default
  }
  
  object Ref {
    
    /* was `typeof RefFindNode` */
    type FindNode = typingsSlinky.semanticUiReact.refFindNodeMod.default
    
    /* was `typeof RefForward` */
    type Forward = typingsSlinky.semanticUiReact.refForwardMod.default
  }
  type Ref = ReactComponentClass[RefProps]
  
  @js.native
  trait RefProps
    extends StrictRefProps
       with /* key */ StringDictionary[js.Any]
  object RefProps {
    
    @scala.inline
    def apply(): RefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefProps]
    }
  }
  
  @js.native
  trait StrictRefProps extends StObject {
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /**
      * Called when componentDidMount.
      *
      * @param {HTMLElement} node - Referred node.
      */
    var innerRef: js.UndefOr[typingsSlinky.react.mod.Ref[_]] = js.native
  }
  object StrictRefProps {
    
    @scala.inline
    def apply(): StrictRefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRefProps]
    }
    
    @scala.inline
    implicit class StrictRefPropsMutableBuilder[Self <: StrictRefProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInnerRef(value: typingsSlinky.react.mod.Ref[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
}
