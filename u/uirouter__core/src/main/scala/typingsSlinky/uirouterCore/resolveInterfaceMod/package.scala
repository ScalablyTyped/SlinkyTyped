package typingsSlinky.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object resolveInterfaceMod {
  
  type CustomAsyncPolicy = js.Function1[/* data */ js.Any, js.Promise[js.Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.uirouterCore.uirouterCoreStrings.WAIT
    - typingsSlinky.uirouterCore.uirouterCoreStrings.NOWAIT
    - typingsSlinky.uirouterCore.resolveInterfaceMod.CustomAsyncPolicy
  */
  type PolicyAsync = typingsSlinky.uirouterCore.resolveInterfaceMod._PolicyAsync | typingsSlinky.uirouterCore.resolveInterfaceMod.CustomAsyncPolicy
}
