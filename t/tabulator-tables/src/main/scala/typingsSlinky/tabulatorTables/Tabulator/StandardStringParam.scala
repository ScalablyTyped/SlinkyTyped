package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.HTMLElement
  - js.Function0[java.lang.String | typingsSlinky.std.HTMLElement]
*/
trait StandardStringParam extends js.Object

object StandardStringParam {
  @scala.inline
  implicit def apply(value: js.Function0[String | HTMLElement]): StandardStringParam = value.asInstanceOf[StandardStringParam]
  @scala.inline
  implicit def apply(value: HTMLElement): StandardStringParam = value.asInstanceOf[StandardStringParam]
  @scala.inline
  implicit def apply(value: String): StandardStringParam = value.asInstanceOf[StandardStringParam]
}

