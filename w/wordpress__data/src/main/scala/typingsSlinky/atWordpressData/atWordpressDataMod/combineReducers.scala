package typingsSlinky.atWordpressData.atWordpressDataMod

import typingsSlinky.redux.reduxMod.ActionFromReducersMapObject
import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.CombinedState
import typingsSlinky.redux.reduxMod.Reducer
import typingsSlinky.redux.reduxMod.ReducersMapObject
import typingsSlinky.redux.reduxMod.StateFromReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "combineReducers")
@js.native
object combineReducers extends js.Object {
  def apply[M /* <: ReducersMapObject[_, _] */](reducers: M): Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]] = js.native
  def apply[S](reducers: ReducersMapObject[S, _]): Reducer[CombinedState[S], AnyAction] = js.native
}

