package typingsSlinky.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sketchapp.SketchMSUserPages
  - typingsSlinky.sketchapp.SketchMSUserDocument
*/
trait SketchMSUser extends js.Object

object SketchMSUser {
  @scala.inline
  implicit def apply(value: SketchMSUserDocument): SketchMSUser = value.asInstanceOf[SketchMSUser]
  @scala.inline
  implicit def apply(value: SketchMSUserPages): SketchMSUser = value.asInstanceOf[SketchMSUser]
}

