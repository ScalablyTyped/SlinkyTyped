package typingsSlinky.typeFest.basicMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonObject
  extends /* key */ StringDictionary[JsonValue]
     with _JsonValue
object JsonObject {
  
  @scala.inline
  def apply(): JsonObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonObject]
  }
}
