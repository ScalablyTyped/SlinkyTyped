package typingsSlinky.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/utility", JSImport.Namespace)
@js.native
object utilityMod extends js.Object {
  @js.native
  class Entry[Key, T] protected ()
    extends typingsSlinky.tstl.entryMod.Entry[Key, T] {
    /**
      * Intializer Constructor.
      *
      * @param first The first, key element.
      * @param second The second, mapped element.
      */
    def this(first: Key, second: T) = this()
  }
  
  @js.native
  class Pair[First, Second] protected ()
    extends typingsSlinky.tstl.pairMod.Pair[First, Second] {
    /**
      * Initializer Constructor.
      *
      * @param first The first element.
      * @param second The second element.
      */
    def this(first: First, second: Second) = this()
  }
  
  @JSName("is_node")
  def isNode(): Boolean = js.native
  @JSName("make_pair")
  def makePair[First, Second](first: First, second: Second): typingsSlinky.tstl.pairMod.Pair[First, Second] = js.native
}

