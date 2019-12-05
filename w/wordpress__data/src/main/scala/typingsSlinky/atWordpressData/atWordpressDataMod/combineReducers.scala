package typingsSlinky.atWordpressData.atWordpressDataMod

import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Reducer
import typingsSlinky.redux.reduxMod.ReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "combineReducers")
@js.native
object combineReducers extends js.Object {
  def apply[S](reducers: ReducersMapObject[S, _]): Reducer[S, AnyAction] = js.native
}

