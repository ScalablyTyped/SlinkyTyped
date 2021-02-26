package typingsSlinky.sodiumjs

import typingsSlinky.sodiumjs.cellMod.Cell
import typingsSlinky.sodiumjs.lazyMod.Lazy
import typingsSlinky.sodiumjs.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyCellMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/LazyCell", "LazyCell")
  @js.native
  class LazyCell[A] protected () extends Cell[A] {
    def this(lazyInitValue: Lazy[A]) = this()
    def this(lazyInitValue: Lazy[A], str: Stream[A]) = this()
  }
}
