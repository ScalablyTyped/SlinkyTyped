package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterTypeComponent
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typedoc.modelsTypesMod.PredicateType
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.TypePredicateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicateMod {
  
  @JSImport("typedoc/dist/lib/converter/types/predicate", "PredicateConverter")
  @js.native
  class PredicateConverter protected () extends ConverterTypeComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def convertNode(context: Context, node: TypePredicateNode): PredicateType = js.native
    
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
}
