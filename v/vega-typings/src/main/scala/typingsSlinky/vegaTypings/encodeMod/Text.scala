package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait Text extends js.Object

object Text {
  @scala.inline
  implicit def apply(value: js.Array[String]): Text = value.asInstanceOf[Text]
  @scala.inline
  implicit def apply(value: String): Text = value.asInstanceOf[Text]
}

