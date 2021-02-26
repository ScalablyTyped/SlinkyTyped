package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.anon.LengthString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeText extends DataTypeAbstract {
  
  /**
    * Length of the text field.
    *
    * Available lengths: `tiny`, `medium`, `long`
    */
  def apply(): DataTypeText = js.native
  def apply(length: String): DataTypeText = js.native
  def apply(options: LengthString): DataTypeText = js.native
}
