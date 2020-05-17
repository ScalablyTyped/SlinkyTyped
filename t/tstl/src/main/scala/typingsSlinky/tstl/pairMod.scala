package typingsSlinky.tstl

import typingsSlinky.tstl.icomparableMod.IComparable
import typingsSlinky.tstl.ipairMod.IPair
import typingsSlinky.tstl.mapContainerMod.MapContainer.InsertRet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/utility/Pair", JSImport.Namespace)
@js.native
object pairMod extends js.Object {
  @js.native
  class Pair[First, Second] protected ()
    extends IPair[First, Second]
       with IComparable[Pair[First, Second]]
       with InsertRet[js.Any, js.Any, js.Any, js.Any, First, js.Any]
       with typingsSlinky.tstl.setContainerMod.SetContainer.InsertRet[js.Any, js.Any, js.Any, First, js.Any] {
    /**
      * Initializer Constructor.
      *
      * @param first The first element.
      * @param second The second element.
      */
    def this(first: First, second: Second) = this()
  }
  
  @JSName("make_pair")
  def makePair[First, Second](first: First, second: Second): Pair[First, Second] = js.native
}

