package typingsSlinky.urbanDictionary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("urban-dictionary", "defid")
@js.native
object defid extends js.Object {
  
  def apply(id: Double): js.Promise[WordDefinition] = js.native
  def apply(id: Double, callback: js.Function2[/* error */ js.Error, /* object */ WordDefinition, _]): js.Promise[WordDefinition] = js.native
}
