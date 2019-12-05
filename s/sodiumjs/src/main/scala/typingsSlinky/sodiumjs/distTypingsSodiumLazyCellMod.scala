package typingsSlinky.sodiumjs

import typingsSlinky.sodiumjs.distTypingsSodiumCellMod.Cell
import typingsSlinky.sodiumjs.distTypingsSodiumLazyMod.Lazy
import typingsSlinky.sodiumjs.distTypingsSodiumStreamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/LazyCell", JSImport.Namespace)
@js.native
object distTypingsSodiumLazyCellMod extends js.Object {
  @js.native
  class LazyCell[A] protected () extends Cell[A] {
    def this(lazyInitValue: Lazy[A]) = this()
    def this(lazyInitValue: Lazy[A], str: Stream[A]) = this()
  }
  
}

