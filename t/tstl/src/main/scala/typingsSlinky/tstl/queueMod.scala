package typingsSlinky.tstl

import typingsSlinky.tstl.adaptorContainerMod.AdaptorContainer
import typingsSlinky.tstl.listMod.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/container/Queue", JSImport.Namespace)
@js.native
object queueMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  class Queue[T] () extends AdaptorContainer[T, List[T], Queue[T]] {
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: Queue[T]) = this()
    
    /**
      * Get the last element.
      *
      * @return The last element.
      */
    def back(): T = js.native
    
    /**
      * Get the first element.
      *
      * @return The first element.
      */
    def front(): T = js.native
  }
}
