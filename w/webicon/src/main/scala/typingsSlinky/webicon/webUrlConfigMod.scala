package typingsSlinky.webicon

import typingsSlinky.webicon.webDynamicUrlDeclarationMod.DynamicUrlDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webicon/Web/UrlConfig", JSImport.Namespace)
@js.native
object webUrlConfigMod extends js.Object {
  type UrlConfig[T] = String | DynamicUrlDeclaration[T]
}

