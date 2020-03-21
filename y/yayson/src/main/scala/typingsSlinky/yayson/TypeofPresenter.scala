package typingsSlinky.yayson

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.yayson.mod.JsonOptions
import typingsSlinky.yayson.mod.Presenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPresenter extends Instantiable0[Presenter] {
  var adapter: String = js.native
  def render(instanceOrCollection: js.Object): js.Any = js.native
  def render(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
  def render[T](instanceOrCollection: js.Thenable[T]): js.Thenable[T] = js.native
  def render[T](instanceOrCollection: js.Thenable[T], options: JsonOptions): js.Thenable[T] = js.native
  def toJSON(instanceOrCollection: js.Object): js.Any = js.native
  def toJSON(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
}

