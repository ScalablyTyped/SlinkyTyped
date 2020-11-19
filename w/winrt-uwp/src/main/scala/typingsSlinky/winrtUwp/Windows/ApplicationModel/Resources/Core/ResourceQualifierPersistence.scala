package typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResourceQualifierPersistence extends js.Object
/** Possible values for the persistence of a global qualifier value override. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence")
@js.native
object ResourceQualifierPersistence extends js.Object {
  
  /** The override value persists on the local machine. */
  @js.native
  sealed trait localMachine extends ResourceQualifierPersistence
  
  /** The override value is not persistent. */
  @js.native
  sealed trait none extends ResourceQualifierPersistence
}
