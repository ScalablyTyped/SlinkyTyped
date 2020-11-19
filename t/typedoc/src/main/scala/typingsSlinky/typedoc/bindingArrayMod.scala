package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typescript.mod.BindingPattern
import typingsSlinky.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/binding-array", JSImport.Namespace)
@js.native
object bindingArrayMod extends js.Object {
  
  @js.native
  class BindingArrayConverter () extends TypeNodeConverter[Type, BindingPattern]
}
