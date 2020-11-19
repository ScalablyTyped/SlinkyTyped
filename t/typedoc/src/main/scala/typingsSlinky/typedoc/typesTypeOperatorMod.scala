package typingsSlinky.typedoc

import typingsSlinky.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/type-operator", JSImport.Namespace)
@js.native
object typesTypeOperatorMod extends js.Object {
  
  @js.native
  class TypeOperatorType protected () extends Type {
    def this(target: Type) = this()
    
    def equals(`type`: TypeOperatorType): Boolean = js.native
    
    val operator: /* "keyof" */ String = js.native
    
    var target: Type = js.native
  }
}
