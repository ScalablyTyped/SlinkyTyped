package typingsSlinky.tabris.mod

import typingsSlinky.tabris.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabris.mod.ImageLikeObject
  - typingsSlinky.tabris.mod.Image
  - java.lang.String
  - typingsSlinky.tabris.mod.ImageBitmap
  - typingsSlinky.tabris.Blob
  - scala.Null
*/
trait ImageValue extends js.Object

object ImageValue {
  @scala.inline
  implicit def apply(value: Blob): ImageValue = value.asInstanceOf[ImageValue]
  @scala.inline
  implicit def apply(value: Image): ImageValue = value.asInstanceOf[ImageValue]
  @scala.inline
  implicit def apply(value: ImageBitmap): ImageValue = value.asInstanceOf[ImageValue]
  @scala.inline
  implicit def apply(value: ImageLikeObject): ImageValue = value.asInstanceOf[ImageValue]
  @scala.inline
  implicit def apply(value: Null): ImageValue = value.asInstanceOf[ImageValue]
  @scala.inline
  implicit def apply(value: String): ImageValue = value.asInstanceOf[ImageValue]
}

