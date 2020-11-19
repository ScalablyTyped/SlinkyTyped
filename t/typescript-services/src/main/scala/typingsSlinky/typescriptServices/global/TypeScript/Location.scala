package typingsSlinky.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Location")
@js.native
class Location protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Location {
  def this(
    fileName: String,
    lineMap: typingsSlinky.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.Location")
@js.native
object Location extends js.Object {
  
  def equals(
    location1: typingsSlinky.typescriptServices.TypeScript.Location,
    location2: typingsSlinky.typescriptServices.TypeScript.Location
  ): Boolean = js.native
}
