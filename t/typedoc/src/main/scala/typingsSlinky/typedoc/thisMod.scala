package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.ThisTypeNode
import typingsSlinky.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thisMod {
  
  @JSImport("typedoc/dist/lib/converter/types/this", "ThisConverter")
  @js.native
  class ThisConverter protected () extends TypeNodeConverter[Type, ThisTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
