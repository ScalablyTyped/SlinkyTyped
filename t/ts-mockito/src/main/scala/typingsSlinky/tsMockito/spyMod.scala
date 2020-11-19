package typingsSlinky.tsMockito

import typingsSlinky.tsMockito.mockMod.Mocker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-mockito/lib/Spy", JSImport.Namespace)
@js.native
object spyMod extends js.Object {
  
  @js.native
  class Spy protected () extends Mocker {
    def this(instance: js.Any) = this()
    
    var realMethods: js.Any = js.native
  }
}
