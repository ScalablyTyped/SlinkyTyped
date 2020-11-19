package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typescript.mod.BindingPattern
import typingsSlinky.typescript.mod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/variable-statement", JSImport.Namespace)
@js.native
object variableStatementMod extends js.Object {
  
  @js.native
  class VariableStatementConverter () extends ConverterNodeComponent[VariableStatement] {
    
    def convertBindingPattern(context: Context, node: BindingPattern): Unit = js.native
  }
}
