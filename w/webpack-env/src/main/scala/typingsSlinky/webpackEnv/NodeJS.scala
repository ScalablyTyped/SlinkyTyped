package typingsSlinky.webpackEnv

import typingsSlinky.webpackEnv.WebpackModuleApi.NodeProcess
import typingsSlinky.webpackEnv.WebpackModuleApi.RequireFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Declare process variable
*/
@JSGlobal("NodeJS")
@js.native
object NodeJS extends js.Object {
  
  type Module = typingsSlinky.webpackEnv.WebpackModuleApi.Module
  
  type Process = NodeProcess
  
  type Require = RequireFunction
  
  type RequireResolve = typingsSlinky.webpackEnv.WebpackModuleApi.RequireResolve
}
