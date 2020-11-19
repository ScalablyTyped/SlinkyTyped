package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppInstanceErrorType extends js.Object
@JSGlobal("SP.AppInstanceErrorType")
@js.native
object AppInstanceErrorType extends js.Object {
  
  @js.native
  sealed trait app extends AppInstanceErrorType
  
  @js.native
  sealed trait configuration extends AppInstanceErrorType
  
  @js.native
  sealed trait transient extends AppInstanceErrorType
}
