package typingsSlinky.streamjs

import typingsSlinky.streamjs.Stream.Supplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Stream")
  @js.native
  class Stream[T] ()
    extends typingsSlinky.streamjs.Stream[T]
  object Stream {
    
    @JSGlobal("Stream.Optional")
    @js.native
    class Optional[T] ()
      extends typingsSlinky.streamjs.Stream.Optional[T]
    /* static members */
    object Optional {
      
      @JSGlobal("Stream.Optional.of")
      @js.native
      def of[T](elem: T): typingsSlinky.streamjs.Stream.Optional[T] = js.native
      
      @JSGlobal("Stream.Optional.ofNullable")
      @js.native
      def ofNullable[T](elem: T): typingsSlinky.streamjs.Stream.Optional[T] = js.native
    }
    
    /* static member */
    @JSGlobal("Stream.from")
    @js.native
    def from(str: String): typingsSlinky.streamjs.Stream[String] = js.native
    /* static member */
    @JSGlobal("Stream.from")
    @js.native
    def from[T](elems: js.Array[T]): typingsSlinky.streamjs.Stream[T] = js.native
    
    /* static member */
    @JSGlobal("Stream.generate")
    @js.native
    def generate[T](supplier: Supplier[T]): typingsSlinky.streamjs.Stream[T] = js.native
    
    /* static member */
    @JSGlobal("Stream.iterate")
    @js.native
    def iterate[T](seed: T, fn: js.Function): typingsSlinky.streamjs.Stream[T] = js.native
    
    /* static member */
    @JSGlobal("Stream.of")
    @js.native
    def of[T](elems: T*): typingsSlinky.streamjs.Stream[T] = js.native
    
    /* static member */
    @JSGlobal("Stream.range")
    @js.native
    def range(startInclusive: Double, endExclusive: Double): typingsSlinky.streamjs.Stream[Double] = js.native
    
    /* static member */
    @JSGlobal("Stream.rangeClosed")
    @js.native
    def rangeClosed(startInclusive: Double, endInclusive: Double): typingsSlinky.streamjs.Stream[Double] = js.native
  }
}
