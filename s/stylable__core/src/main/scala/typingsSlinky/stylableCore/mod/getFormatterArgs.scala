package typingsSlinky.stylableCore.mod

import typingsSlinky.stylableCore.stylableValueParsersMod.ReportWarning
import typingsSlinky.stylableCore.typesMod.ParsedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "getFormatterArgs")
@js.native
object getFormatterArgs extends js.Object {
  
  def apply(node: ParsedValue): js.Array[String] = js.native
  def apply(
    node: ParsedValue,
    allowComments: js.UndefOr[scala.Nothing],
    _reportWarning: js.UndefOr[scala.Nothing],
    perserveQuotes: Boolean
  ): js.Array[String] = js.native
  def apply(node: ParsedValue, allowComments: js.UndefOr[scala.Nothing], _reportWarning: ReportWarning): js.Array[String] = js.native
  def apply(
    node: ParsedValue,
    allowComments: js.UndefOr[scala.Nothing],
    _reportWarning: ReportWarning,
    perserveQuotes: Boolean
  ): js.Array[String] = js.native
  def apply(node: ParsedValue, allowComments: Boolean): js.Array[String] = js.native
  def apply(
    node: ParsedValue,
    allowComments: Boolean,
    _reportWarning: js.UndefOr[scala.Nothing],
    perserveQuotes: Boolean
  ): js.Array[String] = js.native
  def apply(node: ParsedValue, allowComments: Boolean, _reportWarning: ReportWarning): js.Array[String] = js.native
  def apply(node: ParsedValue, allowComments: Boolean, _reportWarning: ReportWarning, perserveQuotes: Boolean): js.Array[String] = js.native
}
