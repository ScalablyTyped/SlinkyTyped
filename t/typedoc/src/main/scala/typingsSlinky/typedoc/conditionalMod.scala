package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeConverter
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.ConditionalType
import typingsSlinky.typescript.mod.ConditionalTypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalMod {
  
  @JSImport("typedoc/dist/lib/converter/types/conditional", "ConditionalConverter")
  @js.native
  class ConditionalConverter protected () extends TypeConverter[ConditionalType, ConditionalTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
