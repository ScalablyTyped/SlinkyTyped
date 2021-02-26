package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.compileFacetMod.FacetModel
import typingsSlinky.vegaLite.vegaLiteStrings.footer
import typingsSlinky.vegaLite.vegaLiteStrings.header
import typingsSlinky.vegaTypings.axisMod.AxisOrient
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerParseMod {
  
  @JSImport("vega-lite/build/src/compile/header/parse", "getHeaderType")
  @js.native
  def getHeaderType(orient: AxisOrient): footer | header = js.native
  @JSImport("vega-lite/build/src/compile/header/parse", "getHeaderType")
  @js.native
  def getHeaderType(orient: SignalRef): footer | header = js.native
  
  @JSImport("vega-lite/build/src/compile/header/parse", "parseFacetHeaders")
  @js.native
  def parseFacetHeaders(model: FacetModel): Unit = js.native
}
