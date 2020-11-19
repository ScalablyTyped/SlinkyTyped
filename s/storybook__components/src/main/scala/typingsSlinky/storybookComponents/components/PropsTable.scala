package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.std.Record
import typingsSlinky.storybookComponents.propDefMod.PropDef
import typingsSlinky.storybookComponents.propsTableMod.PropsTableError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PropsTable {
  
  object PropsTableErrorProps {
    
    @JSImport("@storybook/components", "PropsTable")
    @js.native
    object component extends js.Object
    
    def withProps(p: typingsSlinky.storybookComponents.propsTableMod.PropsTableErrorProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(error: PropsTableError): Default[tag.type, js.Object] = {
      val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[typingsSlinky.storybookComponents.propsTableMod.PropsTableErrorProps]))
    }
  }
  
  object PropsTableRowsProps {
    
    @JSImport("@storybook/components", "PropsTable")
    @js.native
    object component extends js.Object
    
    def withProps(p: typingsSlinky.storybookComponents.propsTableMod.PropsTableRowsProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(rows: js.Array[PropDef]): Default[tag.type, js.Object] = {
      val __props = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[typingsSlinky.storybookComponents.propsTableMod.PropsTableRowsProps]))
    }
  }
  
  object PropsTableSectionsProps {
    
    @JSImport("@storybook/components", "PropsTable")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def sections(value: Record[String, js.Array[PropDef]]): this.type = set("sections", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.storybookComponents.propsTableMod.PropsTableSectionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: PropsTableSectionsProps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
}
