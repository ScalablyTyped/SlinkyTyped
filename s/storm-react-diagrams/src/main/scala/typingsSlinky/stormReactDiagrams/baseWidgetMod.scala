package typingsSlinky.stormReactDiagrams

import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/BaseWidget", "BaseWidget")
  @js.native
  class BaseWidget[P /* <: BaseWidgetProps */, S] protected ()
    extends Component[P, S, js.Any] {
    def this(name: String, props: P) = this()
    
    def bem(selector: String): String = js.native
    
    var className: String = js.native
    
    def getClassName(): String = js.native
    
    def getProps(): js.Any = js.native
  }
  
  @js.native
  trait BaseWidgetProps extends StObject {
    
    /**
      * Override the base class name
      */
    var baseClass: js.UndefOr[String] = js.native
    
    /**
      * append additional classes
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Additional props to add
      */
    var extraProps: js.UndefOr[js.Any] = js.native
  }
  object BaseWidgetProps {
    
    @scala.inline
    def apply(): BaseWidgetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseWidgetProps]
    }
    
    @scala.inline
    implicit class BaseWidgetPropsMutableBuilder[Self <: BaseWidgetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExtraProps(value: js.Any): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraPropsUndefined: Self = StObject.set(x, "extraProps", js.undefined)
    }
  }
}
