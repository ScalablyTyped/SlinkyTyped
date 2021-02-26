package typingsSlinky.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Location")
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
object Location {
  
  /* static member */
  @JSImport("typescript-services", "Location.equals")
  @js.native
  def equals_(
    location1: typingsSlinky.typescriptServices.TypeScript.Location,
    location2: typingsSlinky.typescriptServices.TypeScript.Location
  ): Boolean = js.native
}
