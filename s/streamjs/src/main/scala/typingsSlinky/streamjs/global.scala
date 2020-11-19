package typingsSlinky.streamjs

import typingsSlinky.streamjs.Stream.Function
import typingsSlinky.streamjs.Stream.Supplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class Stream[T] ()
    extends typingsSlinky.streamjs.Stream[T]
  /* static members */
  @js.native
  object Stream extends js.Object {
    
    def from(str: String): typingsSlinky.streamjs.Stream[String] = js.native
    def from[T](elems: js.Array[T]): typingsSlinky.streamjs.Stream[T] = js.native
    
    def generate[T](supplier: Supplier[T]): typingsSlinky.streamjs.Stream[T] = js.native
    
    def iterate[T](seed: T, fn: Function[T, T]): typingsSlinky.streamjs.Stream[T] = js.native
    
    def of[T](elems: T*): typingsSlinky.streamjs.Stream[T] = js.native
    
    def range(startInclusive: Double, endExclusive: Double): typingsSlinky.streamjs.Stream[Double] = js.native
    
    def rangeClosed(startInclusive: Double, endInclusive: Double): typingsSlinky.streamjs.Stream[Double] = js.native
    
    @js.native
    class Optional[T] ()
      extends typingsSlinky.streamjs.Stream.Optional[T]
    /* static members */
    @js.native
    object Optional extends js.Object {
      
      def of[T](elem: T): typingsSlinky.streamjs.Stream.Optional[T] = js.native
      
      def ofNullable[T](elem: T): typingsSlinky.streamjs.Stream.Optional[T] = js.native
    }
  }
}
