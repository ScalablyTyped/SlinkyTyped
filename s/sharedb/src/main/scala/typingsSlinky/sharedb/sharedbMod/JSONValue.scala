package typingsSlinky.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - scala.Null
  - typingsSlinky.sharedb.sharedbMod.JSONObject
  - typingsSlinky.sharedb.sharedbMod.JSONArray
*/
trait JSONValue extends js.Object

object JSONValue {
  @scala.inline
  implicit def apply(value: Boolean): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: Double): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: JSONArray): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: JSONObject): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: Null): JSONValue = value.asInstanceOf[JSONValue]
  @scala.inline
  implicit def apply(value: String): JSONValue = value.asInstanceOf[JSONValue]
}

