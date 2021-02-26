package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.BindingPattern
import typingsSlinky.typescript.mod.VariableStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variableStatementMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/variable-statement", "VariableStatementConverter")
  @js.native
  class VariableStatementConverter protected () extends ConverterNodeComponent[VariableStatement] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def convertBindingPattern(context: Context, node: BindingPattern): Unit = js.native
  }
}
