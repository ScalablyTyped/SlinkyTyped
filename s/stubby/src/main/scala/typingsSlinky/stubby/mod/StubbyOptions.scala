package typingsSlinky.stubby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stubby.mod.StubbyWithKeyCertOptions
  - typingsSlinky.stubby.mod.StubbyWithPfxOptions
*/
trait StubbyOptions extends js.Object

object StubbyOptions {
  @scala.inline
  implicit def apply(value: StubbyWithKeyCertOptions): StubbyOptions = value.asInstanceOf[StubbyOptions]
  @scala.inline
  implicit def apply(value: StubbyWithPfxOptions): StubbyOptions = value.asInstanceOf[StubbyOptions]
}

