package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveWageSettingResponse")
@js.native
class RetrieveWageSettingResponse () extends js.Object {
  
  /**
    * The errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The successfully retrieved `WageSetting` object.
    */
  var wage_setting: js.UndefOr[WageSetting] = js.native
}
