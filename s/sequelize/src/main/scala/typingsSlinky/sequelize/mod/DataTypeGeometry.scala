package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeGeometry extends DataTypeAbstract {
  
  /**
    * Geometry field for Postgres
    */
  def apply(`type`: String): DataTypeGeometry = js.native
  def apply(`type`: String, srid: Double): DataTypeGeometry = js.native
}
