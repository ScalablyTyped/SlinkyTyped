package typingsSlinky.webicon.urlConfigMod

import typingsSlinky.webicon.dynamicUrlDeclarationMod.DynamicUrlDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.webicon.dynamicUrlDeclarationMod.DynamicUrlDeclaration[T]
*/
trait UrlConfig[T] extends js.Object

object UrlConfig {
  @scala.inline
  implicit def apply[T](value: DynamicUrlDeclaration[T]): UrlConfig[T] = value.asInstanceOf[UrlConfig[T]]
  @scala.inline
  implicit def apply[T](value: String): UrlConfig[T] = value.asInstanceOf[UrlConfig[T]]
}

