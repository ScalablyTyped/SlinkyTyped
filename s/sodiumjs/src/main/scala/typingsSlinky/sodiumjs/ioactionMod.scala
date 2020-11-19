package typingsSlinky.sodiumjs

import typingsSlinky.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/IOAction", JSImport.Namespace)
@js.native
object ioactionMod extends js.Object {
  
  @js.native
  class IOAction () extends js.Object
  /* static members */
  @js.native
  object IOAction extends js.Object {
    
    /*!
      * Convert a function that performs asynchronous I/O taking input A
      * and returning a value of type B into an I/O action of type
      * (sa : Stream<A>) => Stream<B>
      */
    def fromAsync[A, B](performIO: js.Function2[/* a */ A, /* result */ js.Function1[/* b */ B, Unit], Unit]): js.Function1[/* sa */ Stream[A], Stream[B]] = js.native
  }
}
