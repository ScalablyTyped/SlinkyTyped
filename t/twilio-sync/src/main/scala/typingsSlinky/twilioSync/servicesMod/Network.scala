package typingsSlinky.twilioSync.servicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Network extends js.Object {
  
  def delete(uri: String): js.Any = js.native
  
  def get(uri: String): js.Any = js.native
  
  def post(uri: String, body: js.Object): js.Any = js.native
  def post(uri: String, body: js.Object, revision: js.UndefOr[scala.Nothing], retryWhenThrottled: Boolean): js.Any = js.native
  def post(uri: String, body: js.Object, revision: String): js.Any = js.native
  def post(uri: String, body: js.Object, revision: String, retryWhenThrottled: Boolean): js.Any = js.native
  
  def put(uri: String, body: js.Object, revision: String): js.Any = js.native
}
