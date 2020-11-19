package typingsSlinky.sigmajs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SigmaJs {
  
  type GexfParser = js.Function3[
    /* target */ java.lang.String, 
    /* sigma */ typingsSlinky.sigmajs.SigmaJs.Sigma, 
    /* callback */ js.Function1[/* graph */ typingsSlinky.sigmajs.SigmaJs.Sigma, scala.Unit], 
    scala.Unit
  ]
  
  type JsonParser = js.Function3[
    /* target */ java.lang.String, 
    /* sigma */ typingsSlinky.sigmajs.SigmaJs.Sigma, 
    /* callback */ js.Function1[/* graph */ typingsSlinky.sigmajs.SigmaJs.Sigma, scala.Unit], 
    scala.Unit
  ]
  
  type SVGEdgeLabels = org.scalablytyped.runtime.StringDictionary[typingsSlinky.sigmajs.SigmaJs.SVGObject[typingsSlinky.sigmajs.SigmaJs.Edge]]
}
