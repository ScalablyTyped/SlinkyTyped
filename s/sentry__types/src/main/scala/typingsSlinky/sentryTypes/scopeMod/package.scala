package typingsSlinky.sentryTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object scopeMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sentryTypes.scopeMod.Scope
    - typingsSlinky.sentryTypes.anon.PartialScopeContext
    - js.Function1[
  / * scope * / typingsSlinky.sentryTypes.scopeMod.Scope, 
  typingsSlinky.sentryTypes.scopeMod.Scope]
  */
  type CaptureContext = typingsSlinky.sentryTypes.scopeMod._CaptureContext | (js.Function1[
    /* scope */ typingsSlinky.sentryTypes.scopeMod.Scope, 
    typingsSlinky.sentryTypes.scopeMod.Scope
  ])
}
