package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeQueryNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("typedoc/dist/lib/converter/types/query", "QueryConverter")
  @js.native
  class QueryConverter protected () extends TypeNodeConverter[Type, TypeQueryNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
}
