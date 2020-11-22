package typingsSlinky.wonka

import typingsSlinky.wonka.wonkaNumbers.`0`
import typingsSlinky.wonka.wonkaNumbers.`1`
import typingsSlinky.wonka.wonkaNumbers.`2`
import typingsSlinky.wonka.wonkaTypesMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/web/wonka_callbag", JSImport.Namespace)
@js.native
object wonkaCallbagMod extends js.Object {
  
  def fromCallbag[T](callbag: Callbag[Unit, T]): Source[T] = js.native
  
  def toCallbag[T](source: Source[T]): Callbag[Unit, T] = js.native
  
  @js.native
  trait Callbag[I, O] extends js.Object {
    
    def apply(t: `0`, d: Callbag[O, I]): Unit = js.native
    def apply(t: `1`, d: I): Unit = js.native
    def apply(t: `2`): Unit = js.native
    def apply(t: `2`, d: js.Any): Unit = js.native
  }
}
