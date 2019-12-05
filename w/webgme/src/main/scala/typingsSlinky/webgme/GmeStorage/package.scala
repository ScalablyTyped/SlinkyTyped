package typingsSlinky.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GmeStorage {
  type CommitHash = String
  type CommitHashCallback = js.Function2[/* err */ js.Error | Null, /* result */ CommitHash, Unit]
  type ErrorOnlyCallback = js.Function1[/* err */ js.Error | Null, Unit]
}
