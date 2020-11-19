package typingsSlinky.usePersistedState.anon

import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = js.native
  def apply[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
  def apply[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
}
