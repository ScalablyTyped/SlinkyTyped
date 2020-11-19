package typingsSlinky.storybookApi.storeMod

import typingsSlinky.storybookApi.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store extends js.Object {
  
  def getInitialState(base: State): js.Any = js.native
  
  def getState(): State = js.native
  
  def setState(inputPatch: InputPatch): js.Promise[State] = js.native
  def setState(inputPatch: InputPatch, callback: js.UndefOr[scala.Nothing], options: Options): js.Promise[State] = js.native
  def setState(inputPatch: InputPatch, callback: CallBack): js.Promise[State] = js.native
  def setState(inputPatch: InputPatch, callback: CallBack, options: Options): js.Promise[State] = js.native
  def setState(inputPatch: InputPatch, options: Options): js.Promise[State] = js.native
  
  var upstreamGetState: GetState = js.native
  
  var upstreamSetState: SetState = js.native
}
