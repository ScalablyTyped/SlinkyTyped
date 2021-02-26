package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeConverter
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.ArrayTypeNode
import typingsSlinky.typescript.mod.TypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("typedoc/dist/lib/converter/types/array", "ArrayConverter")
  @js.native
  class ArrayConverter protected () extends TypeConverter[TypeReference, ArrayTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
