package typingsSlinky.storybookApi

import typingsSlinky.react.mod.Context
import typingsSlinky.storybookApi.anon.Api
import typingsSlinky.storybookApi.mod.Combo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/api/dist/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
  def createContext(hasApiState: Combo): Context[Api] = js.native
}
