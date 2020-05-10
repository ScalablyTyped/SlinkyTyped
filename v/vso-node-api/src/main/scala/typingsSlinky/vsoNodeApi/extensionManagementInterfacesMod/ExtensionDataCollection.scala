package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionDataCollection extends js.Object {
  /**
    * The name of the collection
    */
  var collectionName: String = js.native
  /**
    * A list of documents belonging to the collection
    */
  var documents: js.Array[_] = js.native
  /**
    * The type of the collection's scope, such as Default or User
    */
  var scopeType: String = js.native
  /**
    * The value of the collection's scope, such as Current or Me
    */
  var scopeValue: String = js.native
}

object ExtensionDataCollection {
  @scala.inline
  def apply(collectionName: String, documents: js.Array[_], scopeType: String, scopeValue: String): ExtensionDataCollection = {
    val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any], scopeValue = scopeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDataCollection]
  }
  @scala.inline
  implicit class ExtensionDataCollectionOps[Self <: ExtensionDataCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocuments(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

