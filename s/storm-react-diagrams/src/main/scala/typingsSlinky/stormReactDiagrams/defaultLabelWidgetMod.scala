package typingsSlinky.stormReactDiagrams

import typingsSlinky.stormReactDiagrams.baseWidgetMod.BaseWidget
import typingsSlinky.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typingsSlinky.stormReactDiagrams.defaultLabelModelMod.DefaultLabelModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultLabelWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLabelWidget", "DefaultLabelWidget")
  @js.native
  class DefaultLabelWidget protected ()
    extends BaseWidget[DefaultLabelWidgetProps, js.Any] {
    def this(props: js.Any) = this()
  }
  
  @js.native
  trait DefaultLabelWidgetProps extends BaseWidgetProps {
    
    var model: DefaultLabelModel = js.native
  }
  object DefaultLabelWidgetProps {
    
    @scala.inline
    def apply(model: DefaultLabelModel): DefaultLabelWidgetProps = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultLabelWidgetProps]
    }
    
    @scala.inline
    implicit class DefaultLabelWidgetPropsMutableBuilder[Self <: DefaultLabelWidgetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: DefaultLabelModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
}
