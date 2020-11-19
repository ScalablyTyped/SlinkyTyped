package typingsSlinky.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object progressPluginMod {
  
  type HandlerFunction = js.Function3[
    /* percentage */ scala.Double, 
    /* msg */ java.lang.String, 
    /* repeated */ java.lang.String, 
    scala.Unit
  ]
  
  type ProgressPluginArgument = typingsSlinky.webpack.progressPluginMod.ProgressPluginOptions | typingsSlinky.webpack.progressPluginMod.HandlerFunction
}
