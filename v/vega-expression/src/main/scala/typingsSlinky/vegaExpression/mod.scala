package typingsSlinky.vegaExpression

import typingsSlinky.vegaExpression.anon.Blacklist
import typingsSlinky.vegaExpression.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-expression", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def codegen(params: Blacklist): js.Function1[/* ast */ js.Any, Code] = js.native
  
  def parse(expression: String): js.Any = js.native
}
