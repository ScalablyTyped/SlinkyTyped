package typingsSlinky.wonka

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/dist/types/src/shims/ReasonPervasives.shim", JSImport.Namespace)
@js.native
object reasonPervasivesShimMod extends js.Object {
  
  @js.native
  abstract class Cons[T] () extends list[T] {
    
    var opaque: T = js.native
  }
  
  @js.native
  abstract class EmptyList ()
    extends list[js.Any] {
    
    var opaque: js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wonka.reasonPervasivesShimMod.Cons[T]
    - typingsSlinky.wonka.reasonPervasivesShimMod.EmptyList
  */
  trait list[T] extends js.Object
}
