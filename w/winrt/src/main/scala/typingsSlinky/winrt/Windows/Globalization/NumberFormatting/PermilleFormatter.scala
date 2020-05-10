package typingsSlinky.winrt.Windows.Globalization.NumberFormatting

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.NumberFormatting.PermilleFormatter")
@js.native
class PermilleFormatter ()
  extends INumberFormatterOptions
     with INumberFormatter
     with INumberFormatter2
     with INumberParser {
  def this(languages: IIterable[String], geographicRegion: String) = this()
}

