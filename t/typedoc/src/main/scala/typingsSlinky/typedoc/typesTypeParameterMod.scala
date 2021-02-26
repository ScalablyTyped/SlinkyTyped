package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeReferenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypeParameterMod {
  
  @JSImport("typedoc/dist/lib/converter/types/type-parameter", "TypeParameterConverter")
  @js.native
  class TypeParameterConverter protected () extends TypeNodeConverter[Type, TypeReferenceNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
