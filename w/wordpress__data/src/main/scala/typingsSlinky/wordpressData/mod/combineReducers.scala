package typingsSlinky.wordpressData.mod

import typingsSlinky.redux.mod.ActionFromReducersMapObject
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.CombinedState
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.redux.mod.ReducersMapObject
import typingsSlinky.redux.mod.StateFromReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "combineReducers")
@js.native
object combineReducers extends js.Object {
  def apply[M /* <: ReducersMapObject[_, _] */](reducers: M): Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]] = js.native
  def apply[S](reducers: ReducersMapObject[S, _]): Reducer[CombinedState[S], AnyAction] = js.native
}

