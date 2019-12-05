package typingsSlinky.atTinajsTinaDashRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atTinajsTinaDashReduxMod {
  import typingsSlinky.redux.reduxMod.AnyAction
  import typingsSlinky.redux.reduxMod.Dispatch

  type MapStateToProps = js.Function1[/* state */ js.Any, js.Any]
  type mapDispatchToProps = js.Function1[/* dispatch */ Dispatch[AnyAction], js.Any]
}
