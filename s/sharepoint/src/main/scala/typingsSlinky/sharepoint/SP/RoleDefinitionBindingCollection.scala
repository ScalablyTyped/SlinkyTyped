package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleDefinitionBindingCollection extends ClientObjectCollection[RoleDefinition] {
  
  def add(roleDefinition: RoleDefinition): Unit = js.native
  
  def get_item(index: Double): RoleDefinition = js.native
  
  def itemAt(index: Double): RoleDefinition = js.native
  
  def remove(roleDefinition: RoleDefinition): Unit = js.native
  
  def removeAll(): Unit = js.native
}
