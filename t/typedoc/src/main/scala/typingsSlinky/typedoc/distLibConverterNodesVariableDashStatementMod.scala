package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterComponentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typescript.typescriptMod.BindingPattern
import typingsSlinky.typescript.typescriptMod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/variable-statement", JSImport.Namespace)
@js.native
object distLibConverterNodesVariableDashStatementMod extends js.Object {
  @js.native
  class VariableStatementConverter () extends ConverterNodeComponent[VariableStatement] {
    def convertBindingPattern(context: Context, node: BindingPattern): Unit = js.native
  }
  
}

