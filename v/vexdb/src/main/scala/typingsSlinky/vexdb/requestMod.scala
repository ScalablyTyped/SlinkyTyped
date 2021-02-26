package typingsSlinky.vexdb

import typingsSlinky.pQueue.optionsMod.DefaultAddOptions
import typingsSlinky.pQueue.priorityQueueMod.default
import typingsSlinky.vexdb.cacheMod.APIResponse
import typingsSlinky.vexdb.responseObjectsMod.ResponseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("vexdb/out/methods/request", JSImport.Default)
  @js.native
  def default[T /* <: ResponseObject */](endpoint: js.Any, params: js.Any): js.Promise[APIResponse[T]] = js.native
  
  @JSImport("vexdb/out/methods/request", "queue")
  @js.native
  val queue: typingsSlinky.pQueue.mod.default[default, DefaultAddOptions] = js.native
  
  @JSImport("vexdb/out/methods/request", "request")
  @js.native
  def request[T /* <: ResponseObject */](endpoint: js.Any): js.Promise[APIResponse[T]] = js.native
  @JSImport("vexdb/out/methods/request", "request")
  @js.native
  def request[T /* <: ResponseObject */](endpoint: js.Any, params: js.Object): js.Promise[APIResponse[T]] = js.native
  
  @JSImport("vexdb/out/methods/request", "requestSize")
  @js.native
  def requestSize[T /* <: ResponseObject */](endpoint: js.Any, params: js.Any): js.Promise[Double] = js.native
  
  @JSImport("vexdb/out/methods/request", "serialize")
  @js.native
  def serialize(params: js.Object): String = js.native
}
