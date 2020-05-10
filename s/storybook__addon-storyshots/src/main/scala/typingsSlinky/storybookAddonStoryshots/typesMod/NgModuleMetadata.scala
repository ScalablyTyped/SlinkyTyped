package typingsSlinky.storybookAddonStoryshots.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgModuleMetadata extends js.Object {
  var declarations: js.UndefOr[js.Array[_]] = js.native
  var entryComponents: js.UndefOr[js.Array[_]] = js.native
  var imports: js.UndefOr[js.Array[_]] = js.native
  var providers: js.UndefOr[js.Array[_]] = js.native
  var schemas: js.UndefOr[js.Array[_]] = js.native
}

object NgModuleMetadata {
  @scala.inline
  def apply(): NgModuleMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NgModuleMetadata]
  }
  @scala.inline
  implicit class NgModuleMetadataOps[Self <: NgModuleMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclarations(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclarations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryComponents(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withImports(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(js.undefined)
        ret
    }
    @scala.inline
    def withProviders(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemas(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(js.undefined)
        ret
    }
  }
  
}

