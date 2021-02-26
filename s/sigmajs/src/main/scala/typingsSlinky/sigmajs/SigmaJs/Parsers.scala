package typingsSlinky.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parsers extends StObject {
  
  def gexf(target: String, sigma: Sigma, callback: js.Function1[/* graph */ Sigma, Unit]): Unit = js.native
  @JSName("gexf")
  var gexf_Original: GexfParser = js.native
  
  def json(target: String, sigma: Sigma, callback: js.Function1[/* graph */ Sigma, Unit]): Unit = js.native
  @JSName("json")
  var json_Original: JsonParser = js.native
}
