package typingsSlinky.yallist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yallist", JSImport.Namespace)
@js.native
class ^[T] () extends Yallist[T] {
  def this(items: T*) = this()
  def this(list: ForEachIterable[T]) = this()
}
@JSImport("yallist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def Node[T](value: T): typingsSlinky.yallist.mod.Node[T] = js.native
  def Node[T](value: T, prev: js.UndefOr[scala.Nothing], next: js.UndefOr[scala.Nothing], list: Yallist[T]): typingsSlinky.yallist.mod.Node[T] = js.native
  def Node[T](value: T, prev: js.UndefOr[scala.Nothing], next: typingsSlinky.yallist.mod.Node[T]): typingsSlinky.yallist.mod.Node[T] = js.native
  def Node[T](
    value: T,
    prev: js.UndefOr[scala.Nothing],
    next: typingsSlinky.yallist.mod.Node[T],
    list: Yallist[T]
  ): typingsSlinky.yallist.mod.Node[T] = js.native
  def Node[T](value: T, prev: typingsSlinky.yallist.mod.Node[T]): typingsSlinky.yallist.mod.Node[T] = js.native
  def Node[T](
    value: T,
    prev: typingsSlinky.yallist.mod.Node[T],
    next: js.UndefOr[scala.Nothing],
    list: Yallist[T]
  ): typingsSlinky.yallist.mod.Node[T] = js.native
  def Node[T](value: T, prev: typingsSlinky.yallist.mod.Node[T], next: typingsSlinky.yallist.mod.Node[T]): typingsSlinky.yallist.mod.Node[T] = js.native
  def Node[T](
    value: T,
    prev: typingsSlinky.yallist.mod.Node[T],
    next: typingsSlinky.yallist.mod.Node[T],
    list: Yallist[T]
  ): typingsSlinky.yallist.mod.Node[T] = js.native
  @JSName("Node")
  var Node_Original: NodeConstructor = js.native
  
  def create[T](): Yallist[T] = js.native
  def create[T](items: T*): Yallist[T] = js.native
  def create[T](list: ForEachIterable[T]): Yallist[T] = js.native
}
