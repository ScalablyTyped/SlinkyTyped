package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.std.Record
import typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabbedArgsTableMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/TabbedArgsTable", "TabbedArgsTable")
  @js.native
  val TabbedArgsTable: ReactComponentClass[TabbedArgsTableProps] = js.native
  
  @js.native
  trait TabbedArgsTableProps extends StObject {
    
    var tabs: Record[String, ArgsTableProps] = js.native
  }
  object TabbedArgsTableProps {
    
    @scala.inline
    def apply(tabs: Record[String, ArgsTableProps]): TabbedArgsTableProps = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabbedArgsTableProps]
    }
    
    @scala.inline
    implicit class TabbedArgsTablePropsMutableBuilder[Self <: TabbedArgsTableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabs(value: Record[String, ArgsTableProps]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    }
  }
}
