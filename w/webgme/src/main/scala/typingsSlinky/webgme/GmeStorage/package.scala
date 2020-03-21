package typingsSlinky.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GmeStorage {
  type CommitHash = java.lang.String
  type CommitHashCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ typingsSlinky.webgme.GmeStorage.CommitHash, 
    scala.Unit
  ]
  type ErrorOnlyCallback = js.Function1[/* err */ js.Error | scala.Null, scala.Unit]
}
