package typingsSlinky.swig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateLoader extends js.Object {
  
  def load(identifier: String): js.Any = js.native
  def load(identifier: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  @JSName("load")
  def load_Unit(identifier: String): Unit = js.native
  
  def resolve(to: String, from: String): String = js.native
}
