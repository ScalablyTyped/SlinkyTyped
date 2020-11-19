package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tcomb", "mixin")
@js.native
object mixin extends js.Object {
  
  def apply[T, S](target: T, source: S): T with S = js.native
  def apply[T, S](target: T, source: S, overwrite: scala.Boolean): T with S = js.native
}
