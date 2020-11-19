package typingsSlinky.tern.mod

import typingsSlinky.tern.ternMod.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tern", "registerPlugin")
@js.native
object registerPlugin extends js.Object {
  
  def apply(
    name: String,
    init: js.Function2[
      /* server */ typingsSlinky.tern.ternMod.Server, 
      /* options */ js.UndefOr[ConstructorOptions], 
      Unit
    ]
  ): Unit = js.native
}
