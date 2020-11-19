package typingsSlinky.winrt.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExportOption extends js.Object
@JSGlobal("Windows.Security.Cryptography.Certificates.ExportOption")
@js.native
object ExportOption extends js.Object {
  
  @js.native
  sealed trait exportable extends ExportOption
  
  @js.native
  sealed trait notExportable extends ExportOption
}
