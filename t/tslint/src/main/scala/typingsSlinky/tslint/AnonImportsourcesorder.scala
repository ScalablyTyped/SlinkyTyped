package typingsSlinky.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImportsourcesorder extends js.Object {
  var `import-sources-order`: String = js.native
  var `module-source-path`: String = js.native
  var `named-imports-order`: String = js.native
}

object AnonImportsourcesorder {
  @scala.inline
  def apply(`import-sources-order`: String, `module-source-path`: String, `named-imports-order`: String): AnonImportsourcesorder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import-sources-order")(`import-sources-order`.asInstanceOf[js.Any])
    __obj.updateDynamic("module-source-path")(`module-source-path`.asInstanceOf[js.Any])
    __obj.updateDynamic("named-imports-order")(`named-imports-order`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImportsourcesorder]
  }
  @scala.inline
  implicit class AnonImportsourcesorderOps[Self <: AnonImportsourcesorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withImport-sources-order`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import-sources-order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withModule-source-path`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module-source-path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withNamed-imports-order`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("named-imports-order")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

