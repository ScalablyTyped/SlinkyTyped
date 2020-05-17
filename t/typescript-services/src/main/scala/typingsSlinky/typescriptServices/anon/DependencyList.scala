package typingsSlinky.typescriptServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyList extends js.Object {
  var dependencyList: String = js.native
  var importList: String = js.native
}

object DependencyList {
  @scala.inline
  def apply(dependencyList: String, importList: String): DependencyList = {
    val __obj = js.Dynamic.literal(dependencyList = dependencyList.asInstanceOf[js.Any], importList = importList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyList]
  }
  @scala.inline
  implicit class DependencyListOps[Self <: DependencyList] (val x: Self) extends AnyVal {
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

