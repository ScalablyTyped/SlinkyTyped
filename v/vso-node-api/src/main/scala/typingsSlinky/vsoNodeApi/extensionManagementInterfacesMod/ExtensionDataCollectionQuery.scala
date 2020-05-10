package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionDataCollectionQuery extends js.Object {
  /**
    * A list of collections to query
    */
  var collections: js.Array[ExtensionDataCollection] = js.native
}

object ExtensionDataCollectionQuery {
  @scala.inline
  def apply(collections: js.Array[ExtensionDataCollection]): ExtensionDataCollectionQuery = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDataCollectionQuery]
  }
  @scala.inline
  implicit class ExtensionDataCollectionQueryOps[Self <: ExtensionDataCollectionQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollections(value: js.Array[ExtensionDataCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

