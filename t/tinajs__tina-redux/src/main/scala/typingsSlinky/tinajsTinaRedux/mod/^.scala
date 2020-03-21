package typingsSlinky.tinajsTinaRedux.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tinajs/tina-redux", JSImport.Namespace)
@js.native
class ^[S, A /* <: Action[_] */] protected () extends TinaRedux[S, A] {
  def this(reduxStore: Store[S, A]) = this()
}

