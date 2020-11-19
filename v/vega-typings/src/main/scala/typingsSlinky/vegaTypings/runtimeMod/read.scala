package typingsSlinky.vegaTypings.runtimeMod

import typingsSlinky.vegaTypings.dataMod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-typings/types/runtime", "read")
@js.native
object read extends js.Object {
  
  def apply(data: String, schema: Format): js.Array[js.Object] = js.native
  def apply(data: String, schema: Format, dateParse: js.Function1[/* dateString */ String, js.Date]): js.Array[js.Object] = js.native
}
