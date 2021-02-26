package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typedoc.converterConverterMod.Converter
import typingsSlinky.typescript.mod.BindingPattern
import typingsSlinky.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingObjectMod {
  
  @JSImport("typedoc/dist/lib/converter/types/binding-object", "BindingObjectConverter")
  @js.native
  class BindingObjectConverter protected () extends TypeNodeConverter[Type, BindingPattern] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
