package typingsSlinky.transducersJs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.transducersJs.transducersJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reduced[T] extends js.Object {
  
  @JSName("@@transducer/reduced")
  var `@@transducerSlashreduced`: `true` = js.native
  
  @JSName("@@transducer/value")
  var `@@transducerSlashvalue`: T = js.native
}
@JSImport("transducers.js", "Reduced")
@js.native
object Reduced extends TopLevel[ReducedConstructor]
