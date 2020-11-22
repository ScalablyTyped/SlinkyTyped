package typingsSlinky.textToSvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LoadCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* textToSVG */ typingsSlinky.textToSvg.mod.TextToSVG | scala.Null, 
    scala.Unit
  ]
}
