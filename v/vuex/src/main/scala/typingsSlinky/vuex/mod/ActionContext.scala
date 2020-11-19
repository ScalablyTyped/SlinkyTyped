package typingsSlinky.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionContext[S, R] extends js.Object {
  
  def commit(`type`: String): Unit = js.native
  def commit(`type`: String, payload: js.UndefOr[scala.Nothing], options: CommitOptions): Unit = js.native
  def commit(`type`: String, payload: js.Any): Unit = js.native
  def commit(`type`: String, payload: js.Any, options: CommitOptions): Unit = js.native
  def commit[P /* <: Payload */](payloadWithType: P): Unit = js.native
  def commit[P /* <: Payload */](payloadWithType: P, options: CommitOptions): Unit = js.native
  @JSName("commit")
  var commit_Original: Commit = js.native
  
  def dispatch(`type`: String): js.Promise[_] = js.native
  def dispatch(`type`: String, payload: js.UndefOr[scala.Nothing], options: DispatchOptions): js.Promise[_] = js.native
  def dispatch(`type`: String, payload: js.Any): js.Promise[_] = js.native
  def dispatch(`type`: String, payload: js.Any, options: DispatchOptions): js.Promise[_] = js.native
  def dispatch[P /* <: Payload */](payloadWithType: P): js.Promise[_] = js.native
  def dispatch[P /* <: Payload */](payloadWithType: P, options: DispatchOptions): js.Promise[_] = js.native
  @JSName("dispatch")
  var dispatch_Original: Dispatch = js.native
  
  var getters: js.Any = js.native
  
  var rootGetters: js.Any = js.native
  
  var rootState: R = js.native
  
  var state: S = js.native
}
