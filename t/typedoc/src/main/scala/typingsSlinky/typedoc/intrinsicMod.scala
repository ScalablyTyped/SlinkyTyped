package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeTypeConverter
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intrinsicMod {
  
  @JSImport("typedoc/dist/lib/converter/types/intrinsic", "IntrinsicConverter")
  @js.native
  class IntrinsicConverter protected () extends TypeTypeConverter[Type] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
