package typingsSlinky.toDashMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object toDashMarkdownMod {
  import org.scalajs.dom.raw.HTMLElement

  type Filter = String | js.Array[String] | (js.Function1[/* node */ HTMLElement, Boolean])
}
