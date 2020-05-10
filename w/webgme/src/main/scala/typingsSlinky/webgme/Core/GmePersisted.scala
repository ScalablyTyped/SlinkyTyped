package typingsSlinky.webgme.Core

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmePersisted extends js.Object {
  var objects: StringDictionary[DataObject] = js.native
  var rootHash: ObjectHash = js.native
}

object GmePersisted {
  @scala.inline
  def apply(objects: StringDictionary[DataObject], rootHash: ObjectHash): GmePersisted = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], rootHash = rootHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[GmePersisted]
  }
  @scala.inline
  implicit class GmePersistedOps[Self <: GmePersisted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjects(value: StringDictionary[DataObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootHash(value: ObjectHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootHash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

