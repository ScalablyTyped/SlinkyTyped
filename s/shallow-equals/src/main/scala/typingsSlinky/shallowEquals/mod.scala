package typingsSlinky.shallowEquals

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shallow-equals", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[A, B](): Boolean = js.native
  def apply[A, B](a: A): Boolean = js.native
  def apply[A, B](a: A, b: B): Boolean = js.native
  def apply[A, B](a: A, b: B, compare: js.Function2[/* objA */ A, /* objB */ B, Boolean]): Boolean = js.native
  def apply[A, B](a: A, b: js.UndefOr[scala.Nothing], compare: js.Function2[/* objA */ A, /* objB */ B, Boolean]): Boolean = js.native
  def apply[A, B](a: js.UndefOr[scala.Nothing], b: B): Boolean = js.native
  def apply[A, B](a: js.UndefOr[scala.Nothing], b: B, compare: js.Function2[/* objA */ A, /* objB */ B, Boolean]): Boolean = js.native
  def apply[A, B](
    a: js.UndefOr[scala.Nothing],
    b: js.UndefOr[scala.Nothing],
    compare: js.Function2[/* objA */ A, /* objB */ B, Boolean]
  ): Boolean = js.native
}
