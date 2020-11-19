package typingsSlinky.sodiumjs

import typingsSlinky.sodiumjs.cellMod.Cell
import typingsSlinky.sodiumjs.lazyMod.Lazy
import typingsSlinky.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/LazyCell", JSImport.Namespace)
@js.native
object lazyCellMod extends js.Object {
  
  @js.native
  class LazyCell[A] protected () extends Cell[A] {
    def this(lazyInitValue: Lazy[A]) = this()
    def this(lazyInitValue: Lazy[A], str: Stream[A]) = this()
  }
}
