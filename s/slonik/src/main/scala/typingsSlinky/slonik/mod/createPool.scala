package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("slonik", "createPool")
@js.native
object createPool extends js.Object {
  
  def apply(connectionConfiguration: DatabaseConfigurationType): DatabasePoolType = js.native
  def apply(
    connectionConfiguration: DatabaseConfigurationType,
    clientUserConfiguration: ClientConfigurationInputType
  ): DatabasePoolType = js.native
}
