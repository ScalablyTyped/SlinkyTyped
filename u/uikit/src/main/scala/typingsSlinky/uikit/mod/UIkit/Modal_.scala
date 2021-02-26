package typingsSlinky.uikit.mod.UIkit

import typingsSlinky.uikit.anon.Cancel
import typingsSlinky.uikit.mod.UIkitElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modal_ extends StObject {
  
  def apply(element: UIkitElement): UIkitModalElement = js.native
  def apply(element: UIkitElement, options: UIkitModalOptions): UIkitModalElement = js.native
  
  def alert(message: String): js.Promise[Unit] = js.native
  def alert(message: String, options: UIkitModalOptions): js.Promise[Unit] = js.native
  
  def confirm(message: String): js.Promise[Unit] = js.native
  def confirm(message: String, options: UIkitModalOptions): js.Promise[Unit] = js.native
  
  def dialog(content: String): js.Promise[Unit] = js.native
  def dialog(content: String, options: UIkitModalOptions): js.Promise[Unit] = js.native
  
  var labels: Cancel = js.native
  
  def prompt(content: String, value: String): js.Promise[String | Null] = js.native
  def prompt(content: String, value: String, options: UIkitModalOptions): js.Promise[String | Null] = js.native
}
