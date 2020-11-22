package typingsSlinky.stylableCore.mod

import typingsSlinky.std.Record
import typingsSlinky.stylableCore.anon.Value
import typingsSlinky.stylableCore.stylableValueParsersMod.ReportWarning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "strategies")
@js.native
object strategies extends js.Object {
  
  def args(node: js.Any): js.Array[Value] = js.native
  def args(node: js.Any, reportWarning: ReportWarning): js.Array[Value] = js.native
  
  def named(node: js.Any): Record[String, String] = js.native
  def named(node: js.Any, reportWarning: ReportWarning): Record[String, String] = js.native
}
