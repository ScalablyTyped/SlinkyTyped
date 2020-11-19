package typingsSlinky.tinajsTinaRedux.mod

import typingsSlinky.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TinaRedux[S, A /* <: Action[_] */] extends js.Object {
  
  def connect(): HOC = js.native
  def connect(mapState: js.UndefOr[scala.Nothing], mapDispatch: mapDispatchToProps): HOC = js.native
  def connect(mapState: MapStateToProps): HOC = js.native
  def connect(mapState: MapStateToProps, mapDispatch: mapDispatchToProps): HOC = js.native
}
