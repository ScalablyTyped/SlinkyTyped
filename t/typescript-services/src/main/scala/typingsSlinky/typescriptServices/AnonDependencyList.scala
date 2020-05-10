package typingsSlinky.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDependencyList extends js.Object {
  var dependencyList: String = js.native
  var importList: String = js.native
}

object AnonDependencyList {
  @scala.inline
  def apply(dependencyList: String, importList: String): AnonDependencyList = {
    val __obj = js.Dynamic.literal(dependencyList = dependencyList.asInstanceOf[js.Any], importList = importList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDependencyList]
  }
  @scala.inline
  implicit class AnonDependencyListOps[Self <: AnonDependencyList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencyList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

