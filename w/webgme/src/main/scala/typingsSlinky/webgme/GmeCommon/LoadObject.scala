package typingsSlinky.webgme.GmeCommon

import typingsSlinky.webgme.GmeStorage.CommitObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Callback for loadObject.
  *
  * @callback ProjectInterface~loadObjectCallback
  * @param {Error} err - If error occurred.
  * @param {module:Storage~CommitObject|module:Core~ObjectData} object - Object loaded from database, e.g. a commit object.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webgme.GmeStorage.CommitObject
  - typingsSlinky.webgme.Core.DataObject
*/
trait LoadObject extends js.Object

object LoadObject {
  @scala.inline
  implicit def apply(value: CommitObject): LoadObject = value.asInstanceOf[LoadObject]
  @scala.inline
  implicit def apply(value: typingsSlinky.webgme.Core.DataObject): LoadObject = value.asInstanceOf[LoadObject]
}

