package typingsSlinky.seen.mod

import typingsSlinky.seen.seenStrings.ambient
import typingsSlinky.seen.seenStrings.directional
import typingsSlinky.seen.seenStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Light")
@js.native
class Light protected () extends Transformable {
  def this(`type`: ambient) = this()
  def this(`type`: directional) = this()
  def this(`type`: point) = this()
  def this(`type`: ambient, options: LightOptions) = this()
  def this(`type`: directional, options: LightOptions) = this()
  def this(`type`: point, options: LightOptions) = this()
  
  var color: Color = js.native
  
  var defaults: LightOptions = js.native
  
  var enabled: Boolean = js.native
  
  var id: String = js.native
  
  var intensity: Double = js.native
  
  var normal: Point = js.native
  
  var point: Point = js.native
  
  def render(): Unit = js.native
  
  var `type`: String = js.native
}
