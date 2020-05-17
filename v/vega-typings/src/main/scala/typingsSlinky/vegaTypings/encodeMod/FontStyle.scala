package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.valuesMod.FontStyleValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.vegaTypingsStrings.normal
  - typingsSlinky.vegaTypings.vegaTypingsStrings.italic
  - typingsSlinky.vegaTypings.vegaTypingsStrings.oblique
  - java.lang.String
*/
trait FontStyle extends FontStyleValue

object FontStyle {
  @scala.inline
  def normal: typingsSlinky.vegaTypings.vegaTypingsStrings.normal = "normal".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.normal]
  @scala.inline
  def italic: typingsSlinky.vegaTypings.vegaTypingsStrings.italic = "italic".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.italic]
  @scala.inline
  def oblique: typingsSlinky.vegaTypings.vegaTypingsStrings.oblique = "oblique".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.oblique]
  @scala.inline
  implicit def apply(value: String): FontStyle = value.asInstanceOf[FontStyle]
}

