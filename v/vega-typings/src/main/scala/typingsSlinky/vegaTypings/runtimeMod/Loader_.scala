package typingsSlinky.vegaTypings.runtimeMod

import typingsSlinky.vegaTypings.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loader_ extends js.Object {
  
  def file(filename: String): js.Promise[String] = js.native
  
  def http(uri: String, options: js.Any): js.Promise[String] = js.native
  
  def load(uri: String): js.Promise[String] = js.native
  def load(uri: String, options: js.Any): js.Promise[String] = js.native
  
  def sanitize(uri: String, options: js.Any): js.Promise[Href] = js.native
}
