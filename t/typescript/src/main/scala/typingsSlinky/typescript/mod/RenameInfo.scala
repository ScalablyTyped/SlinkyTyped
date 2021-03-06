package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptBooleans.`false`
import typingsSlinky.typescript.typescriptBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.RenameInfoSuccess
  - typingsSlinky.typescript.mod.RenameInfoFailure
*/
trait RenameInfo extends StObject
object RenameInfo {
  
  @scala.inline
  def RenameInfoFailure(canRename: `false`, localizedErrorMessage: java.lang.String): typingsSlinky.typescript.mod.RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.RenameInfoFailure]
  }
  
  @scala.inline
  def RenameInfoSuccess(
    canRename: `true`,
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan
  ): typingsSlinky.typescript.mod.RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typescript.mod.RenameInfoSuccess]
  }
}
