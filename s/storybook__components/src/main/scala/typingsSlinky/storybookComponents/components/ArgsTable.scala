package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError
import typingsSlinky.storybookComponents.typesMod.ArgTypes
import typingsSlinky.storybookComponents.typesMod.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArgsTable {
  
  object ArgsTableErrorProps {
    
    @scala.inline
    def apply(error: ArgsTableError): Default[tag.type, js.Object] = {
      val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableErrorProps]))
    }
    
    @JSImport("@storybook/components", "ArgsTable")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableErrorProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object ArgsTableRowProps {
    
    @scala.inline
    def apply(rows: ArgTypes): Builder = {
      val __props = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableRowProps]))
    }
    
    @JSImport("@storybook/components", "ArgsTable")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def args(value: Args): this.type = set("args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inAddonPanel(value: Boolean): this.type = set("inAddonPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def initialExpandedArgs(value: Boolean): this.type = set("initialExpandedArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resetArgs(value: /* argNames */ js.UndefOr[js.Array[String]] => Unit): this.type = set("resetArgs", js.Any.fromFunction1(value))
      
      @scala.inline
      def updateArgs(value: /* args */ Args => Unit): this.type = set("updateArgs", js.Any.fromFunction1(value))
    }
    
    def withProps(p: typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableRowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
