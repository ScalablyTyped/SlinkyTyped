package typingsSlinky.sha1.mod

import typingsSlinky.sha1.sha1Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sha1.mod.Sha1AsStringOptions
  - typingsSlinky.sha1.mod.Sha1AsBytesOptions
*/
trait Sha1Options extends js.Object

object Sha1Options {
  @scala.inline
  def Sha1AsStringOptions(): Sha1Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sha1Options]
  }
  @scala.inline
  def Sha1AsBytesOptions(asBytes: `true`): Sha1Options = {
    val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha1Options]
  }
}

