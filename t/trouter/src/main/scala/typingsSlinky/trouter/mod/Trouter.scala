package typingsSlinky.trouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trouter[T] extends js.Object {
  
  def add(method: HTTPMethod, pattern: String, handlers: T*): this.type = js.native
  def add(method: HTTPMethod, pattern: js.RegExp, handlers: T*): this.type = js.native
  
  def all(pattern: String, handlers: T*): this.type = js.native
  def all(pattern: js.RegExp, handlers: T*): this.type = js.native
  
  def connect(pattern: String, handlers: T*): this.type = js.native
  def connect(pattern: js.RegExp, handlers: T*): this.type = js.native
  
  def delete(pattern: String, handlers: T*): this.type = js.native
  def delete(pattern: js.RegExp, handlers: T*): this.type = js.native
  
  def find(method: HTTPMethod, url: String): FindResult[T] = js.native
  
  def get(pattern: String, handlers: T*): this.type = js.native
  def get(pattern: js.RegExp, handlers: T*): this.type = js.native
  
  def head(pattern: String, handlers: T*): this.type = js.native
  def head(pattern: js.RegExp, handlers: T*): this.type = js.native
  
  def options(pattern: String, handlers: T*): this.type = js.native
  def options(pattern: js.RegExp, handlers: T*): this.type = js.native
  
  def patch(pattern: String, handlers: T*): this.type = js.native
  def patch(pattern: js.RegExp, handlers: T*): this.type = js.native
  
  def post(pattern: String, handlers: T*): this.type = js.native
  def post(pattern: js.RegExp, handlers: T*): this.type = js.native
  
  def put(pattern: String, handlers: T*): this.type = js.native
  def put(pattern: js.RegExp, handlers: T*): this.type = js.native
  
  def trace(pattern: String, handlers: T*): this.type = js.native
  def trace(pattern: js.RegExp, handlers: T*): this.type = js.native
  
  def use(pattern: String, handlers: T*): this.type = js.native
  def use(pattern: js.RegExp, handlers: T*): this.type = js.native
}
