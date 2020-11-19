package typingsSlinky.stampit.mod

import typingsSlinky.stampit.mod.stampit.Composer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stampit", "composers")
@js.native
object composers extends js.Object {
  
  def apply[Obj](functions: Composer[StampType[Obj]]*): StampType[Obj] = js.native
  def apply[Obj](functions: js.Array[Composer[StampType[Obj]]]): StampType[Obj] = js.native
}
