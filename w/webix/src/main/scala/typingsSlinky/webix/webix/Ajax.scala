package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ajax extends js.Object {
  
  def bind(master: js.Any): Ajax = js.native
  
  def del(url: String): js.Promise[_] = js.native
  def del(url: String, params: js.UndefOr[scala.Nothing], callback: WebixCallback): js.Promise[_] = js.native
  def del(url: String, params: js.Any): js.Promise[_] = js.native
  def del(url: String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  
  def get(url: String): js.Promise[_] = js.native
  def get(url: String, params: js.UndefOr[scala.Nothing], callback: WebixCallback): js.Promise[_] = js.native
  def get(url: String, params: js.Any): js.Promise[_] = js.native
  def get(url: String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  
  def getXHR(): js.Any = js.native
  
  def headers(values: js.Any): Ajax = js.native
  
  var master: js.Any = js.native
  
  def post(url: String): js.Promise[_] = js.native
  def post(url: String, params: js.UndefOr[scala.Nothing], callback: WebixCallback): js.Promise[_] = js.native
  def post(url: String, params: js.Any): js.Promise[_] = js.native
  def post(url: String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  
  def put(url: String): js.Promise[_] = js.native
  def put(url: String, params: js.UndefOr[scala.Nothing], callback: WebixCallback): js.Promise[_] = js.native
  def put(url: String, params: js.Any): js.Promise[_] = js.native
  def put(url: String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  
  def response(`type`: String): Ajax = js.native
  
  def stringify(data: js.Any): String = js.native
  
  def sync(): Ajax = js.native
}
