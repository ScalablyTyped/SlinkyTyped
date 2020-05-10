package typingsSlinky.tableau.tableau

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Error Classes
@JSGlobal("tableau.TableauException")
@js.native
class TableauException () extends Error {
  var tableauSoftwareErrorCode: ErrorCode = js.native
}

