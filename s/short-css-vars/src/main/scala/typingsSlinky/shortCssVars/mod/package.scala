package typingsSlinky.shortCssVars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CustomFormatter = js.Function1[/* name */ java.lang.String, java.lang.String]
  
  type CustomIgnore = js.Function1[/* name */ java.lang.String, scala.Boolean]
  
  type IgnoreType = js.RegExp | java.lang.String | typingsSlinky.shortCssVars.mod.CustomIgnore
}
