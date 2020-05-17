package typingsSlinky.webgme.GmeCommon

import typingsSlinky.webgme.GmeStorage.CommitHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.webgme.GmeStorage.CommitHash
  - js.Array[typingsSlinky.webgme.GmeStorage.CommitHash | java.lang.String]
*/
trait ProjectStart extends js.Object

object ProjectStart {
  @scala.inline
  implicit def apply(value: CommitHash | String): ProjectStart = value.asInstanceOf[ProjectStart]
  @scala.inline
  implicit def apply(value: js.Array[CommitHash | String]): ProjectStart = value.asInstanceOf[ProjectStart]
}

