package typingsSlinky.svgJs.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.svgJs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends Shape {
  
  def error(cb: js.Function1[/* event */ Event, Unit]): this.type = js.native
  
  def load(): this.type = js.native
  def load(url: String): this.type = js.native
  
  def loaded(cb: js.Function1[/* info */ Height, Unit]): this.type = js.native
}
