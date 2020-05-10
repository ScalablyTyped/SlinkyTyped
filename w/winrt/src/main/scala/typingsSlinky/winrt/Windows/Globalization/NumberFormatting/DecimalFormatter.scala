package typingsSlinky.winrt.Windows.Globalization.NumberFormatting

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.NumberFormatting.DecimalFormatter")
@js.native
class DecimalFormatter ()
  extends INumberFormatterOptions
     with INumberFormatter
     with INumberFormatter2
     with INumberParser {
  def this(languages: IIterable[String], geographicRegion: String) = this()
}

