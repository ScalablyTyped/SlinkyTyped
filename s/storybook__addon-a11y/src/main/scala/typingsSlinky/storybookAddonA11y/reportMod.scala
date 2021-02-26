package typingsSlinky.storybookAddonA11y

import slinky.core.ReactComponentClass
import typingsSlinky.axeCore.mod.Result
import typingsSlinky.storybookAddonA11y.a11YPanelMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportMod {
  
  @JSImport("@storybook/addon-a11y/dist/components/Report", "Report")
  @js.native
  val Report: ReactComponentClass[ReportProps] = js.native
  
  @js.native
  trait ReportProps extends StObject {
    
    var empty: String = js.native
    
    var items: js.Array[Result] = js.native
    
    var `type`: RuleType = js.native
  }
  object ReportProps {
    
    @scala.inline
    def apply(empty: String, items: js.Array[Result], `type`: RuleType): ReportProps = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportProps]
    }
    
    @scala.inline
    implicit class ReportPropsMutableBuilder[Self <: ReportProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[Result]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Result*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
