package typingsSlinky.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pluginMod {
  
  type Commands = org.scalablytyped.runtime.StringDictionary[typingsSlinky.serverless.anon.Commands]
  
  type Hooks = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  
  type VariableResolver = js.Function1[/* variableSource */ java.lang.String, js.Promise[js.Any]]
  
  type VariableResolvers = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.serverless.pluginMod.VariableResolver | typingsSlinky.serverless.anon.IsDisabledAtPrepopulation
  ]
}
