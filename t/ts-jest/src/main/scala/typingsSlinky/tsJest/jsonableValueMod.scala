package typingsSlinky.tsJest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-jest/dist/utils/jsonable-value", JSImport.Namespace)
@js.native
object jsonableValueMod extends js.Object {
  
  @js.native
  class JsonableValue[V] protected () extends js.Object {
    def this(value: V) = this()
    
    var _serialized: js.Any = js.native
    
    var _value: js.Any = js.native
    
    def serialized: String = js.native
    
    def value: V = js.native
    def value_=(value: V): Unit = js.native
  }
}
