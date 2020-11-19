package typingsSlinky.tablesorter

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/Omit", JSImport.Namespace)
@js.native
object omitMod extends js.Object {
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}
