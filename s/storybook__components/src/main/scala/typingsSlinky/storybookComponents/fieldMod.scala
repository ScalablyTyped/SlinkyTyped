package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldMod {
  
  @JSImport("@storybook/components/dist/form/field/field", "Field")
  @js.native
  val Field: ReactComponentClass[FieldProps] = js.native
  
  @js.native
  trait FieldProps extends StObject {
    
    var label: js.UndefOr[ReactElement] = js.native
  }
  object FieldProps {
    
    @scala.inline
    def apply(): FieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldProps]
    }
    
    @scala.inline
    implicit class FieldPropsMutableBuilder[Self <: FieldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
