package typingsSlinky.tokgen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[/* error */ js.Any, /* token */ java.lang.String, scala.Unit]
  
  type Options = scala.Double | java.lang.String | typingsSlinky.tokgen.mod.OptionsObject
}
