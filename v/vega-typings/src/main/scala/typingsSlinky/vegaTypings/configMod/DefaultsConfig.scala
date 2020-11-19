package typingsSlinky.vegaTypings.configMod

import typingsSlinky.vegaTypings.streamMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.anon.RecordpreventbooleanArray
  - typingsSlinky.vegaTypings.anon.RecordallowbooleanArrayEv
*/
trait DefaultsConfig extends js.Object
object DefaultsConfig {
  
  @scala.inline
  def RecordpreventbooleanArray(prevent: Boolean | js.Array[EventType]): DefaultsConfig = {
    val __obj = js.Dynamic.literal(prevent = prevent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsConfig]
  }
  
  @scala.inline
  def RecordallowbooleanArrayEv(allow: Boolean | js.Array[EventType]): DefaultsConfig = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsConfig]
  }
}
