package typingsSlinky.typedoc

import typingsSlinky.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/conditional", JSImport.Namespace)
@js.native
object typesConditionalMod extends js.Object {
  
  @js.native
  class ConditionalType protected () extends Type {
    def this(checkType: Type, extendsType: Type, trueType: Type, falseType: Type) = this()
    
    var checkType: Type = js.native
    
    def equals(`type`: js.Any): Boolean = js.native
    
    var extendsType: Type = js.native
    
    var falseType: Type = js.native
    
    var trueType: Type = js.native
  }
}
