package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullContainerSymbol extends PullTypeSymbol {
  
  var assignedContainer: js.Any = js.native
  
  var assignedType: js.Any = js.native
  
  var assignedValue: js.Any = js.native
  
  def getExportAssignedContainerSymbol(): PullContainerSymbol = js.native
  
  def getExportAssignedTypeSymbol(): PullTypeSymbol = js.native
  
  def getExportAssignedValueSymbol(): PullSymbol = js.native
  
  def getInstanceSymbol(): PullSymbol = js.native
  
  def getInstanceType(): PullTypeSymbol = js.native
  
  def hasExportAssignment(): Boolean = js.native
  
  var instanceSymbol: PullSymbol = js.native
  
  def setExportAssignedContainerSymbol(container: PullContainerSymbol): Unit = js.native
  
  def setExportAssignedTypeSymbol(`type`: PullTypeSymbol): Unit = js.native
  
  def setExportAssignedValueSymbol(symbol: PullSymbol): Unit = js.native
  
  def setInstanceSymbol(symbol: PullSymbol): Unit = js.native
}
