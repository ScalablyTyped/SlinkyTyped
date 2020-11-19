package typingsSlinky.shelljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExecCallback = js.Function3[
    /* code */ scala.Double, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    js.Any
  ]
  
  type ShellArray = js.Array[java.lang.String] with typingsSlinky.shelljs.mod.ShellReturnValue
  
  type ShellString = java.lang.String with typingsSlinky.shelljs.mod.ShellReturnValue
}
