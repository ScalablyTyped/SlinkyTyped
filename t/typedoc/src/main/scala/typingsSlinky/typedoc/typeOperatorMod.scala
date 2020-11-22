package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeOperatorNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/type-operator", JSImport.Namespace)
@js.native
object typeOperatorMod extends js.Object {
  
  @js.native
  class TypeOperatorConverter () extends TypeNodeConverter[Type, TypeOperatorNode] {
    
    val supportedOperatorNames: js.Any = js.native
  }
}
