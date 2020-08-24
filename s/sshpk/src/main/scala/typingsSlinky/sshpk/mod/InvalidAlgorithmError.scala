package typingsSlinky.sshpk.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "InvalidAlgorithmError")
@js.native
class InvalidAlgorithmError protected () extends Error {
  def this(algo: String) = this()
}

